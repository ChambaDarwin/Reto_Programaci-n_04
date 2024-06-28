package app.aplicacion.retoprogramacin_03.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import app.aplicacion.retoprogramacin_03.R
import app.aplicacion.retoprogramacin_03.databinding.FragmentPeliculasBinding
import app.aplicacion.retoprogramacin_03.ui.adapterCategory.CategoryAdapter
import app.aplicacion.retoprogramacin_03.ui.adapterpeliculas.PeliculaAdapter
import app.aplicacion.retoprogramacin_03.ui.viewmodel.PeliculasViewModel
import app.aplicacion.retoprogramacin_03.util.ListCategory


class PeliculasFragment : Fragment() {
    private lateinit var binding: FragmentPeliculasBinding
    private lateinit var model: PeliculasViewModel
    private lateinit var cadapter: PeliculaAdapter
    private lateinit var category:CategoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding= FragmentPeliculasBinding.inflate(inflater,container,false)
        model=ViewModelProvider(requireActivity()).get(PeliculasViewModel::class.java)
        initRecycler()
        inirRecyclerCategory()
        recuperarDatos()
        return binding.root
    }
    private fun recuperarDatos(){
        model.lista.observe(viewLifecycleOwner, Observer {
            cadapter.diffPeliculas.submitList(it)
        })
    }

   private  fun initRecycler(){
       cadapter= PeliculaAdapter()
       binding.recyclerPeliculas.apply {
           layoutManager=LinearLayoutManager(requireContext())
           adapter=cadapter
           setHasFixedSize(true)
       }
   }
    private fun inirRecyclerCategory(){
        category= CategoryAdapter(ListCategory.lista)
        binding.recyclerCategory.apply {
            layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
            setHasFixedSize(true)
            adapter=category
        }
    }


}