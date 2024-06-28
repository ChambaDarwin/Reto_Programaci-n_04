package app.aplicacion.retoprogramacin_03.ui.fragment

import android.app.Activity
import android.content.ContentResolver
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.os.FileUtils
import android.provider.MediaStore
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.lifecycle.ViewModelProvider
import app.aplicacion.retoprogramacin_03.R
import app.aplicacion.retoprogramacin_03.core.toas
import app.aplicacion.retoprogramacin_03.databinding.FragmentAddBinding
import app.aplicacion.retoprogramacin_03.databinding.FragmentPeliculasBinding
import app.aplicacion.retoprogramacin_03.ui.adapterCategory.CategoryAdapter
import app.aplicacion.retoprogramacin_03.ui.adapterpeliculas.PeliculaAdapter
import app.aplicacion.retoprogramacin_03.ui.viewmodel.PeliculasViewModel
import app.aplicacion.retoprogramacin_03.util.ListCategory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream


class AddFragment : Fragment() {
    private lateinit var binding: FragmentAddBinding
    private lateinit var model: PeliculasViewModel
    private lateinit var cadapter: PeliculaAdapter
    private lateinit var category: CategoryAdapter
    private val imagesSelected= mutableListOf<Uri>()
    private val byteArray= mutableListOf<ByteArray>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddBinding.inflate(inflater, container, false)
        model = ViewModelProvider(requireActivity()).get(PeliculasViewModel::class.java)
        val adapterr = ArrayAdapter(
            requireActivity(),
            android.R.layout.simple_list_item_1,
            ListCategory.listCategory
        )
        binding.spinner.adapter = adapterr
        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val item=ListCategory.listCategory[position]
                toas(item)

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}

        }

        return binding.root
    }




}