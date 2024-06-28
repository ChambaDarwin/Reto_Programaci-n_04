package app.aplicacion.retoprogramacin_03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import app.aplicacion.retoprogramacin_03.core.toasT
import app.aplicacion.retoprogramacin_03.data.model.Peliculas
import app.aplicacion.retoprogramacin_03.databinding.ActivityMainBinding
import app.aplicacion.retoprogramacin_03.ui.adapterCategory.CategoryAdapter
import app.aplicacion.retoprogramacin_03.ui.adapterpeliculas.PeliculaAdapter
import app.aplicacion.retoprogramacin_03.ui.viewmodel.PeliculasViewModel
import app.aplicacion.retoprogramacin_03.ui.viewmodel.VideoJuegoViewModel
import app.aplicacion.retoprogramacin_03.util.ListCategory

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var peliculasModel:PeliculasViewModel
    private lateinit var juegoModel:VideoJuegoViewModel
    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        peliculasModel=ViewModelProvider(this).get(PeliculasViewModel::class.java)
        juegoModel=ViewModelProvider(this).get(VideoJuegoViewModel::class.java)


    }

    override fun onStart() {
        super.onStart()
        navController=findNavController(R.id.fragmentContainer)
        NavigationUI.setupWithNavController(binding.bottonNavigation, navController)
    }
    /*
    private fun recupearPeliculas(){
        peliculasModel.lista.observe(this, Observer {
            aPeliccula.diffPeliculas.submitList(it)
            it.forEach {
                println(it)
            }
        })
    }
    private fun initRecyclerPelicula(){
        aPeliccula= PeliculaAdapter()
        binding.recyclerPeliculas.apply {
            layoutManager=LinearLayoutManager(this@MainActivity)
            //adapter=aPeliccula
            setHasFixedSize(true)
        }
    }

    private fun initRecyclerVideo(){
        aPeliccula= PeliculaAdapter()
        binding.recyclerVideo.apply {
            layoutManager=LinearLayoutManager(this@MainActivity)
            adapter=aPeliccula
            setHasFixedSize(true)

        }
    }

    private fun initRecyclerCategory(){
        cAdapter= CategoryAdapter(ListCategory.lista)
        binding.recyclerCategory.apply {
            layoutManager=LinearLayoutManager(this@MainActivity,LinearLayoutManager.HORIZONTAL,false)
            adapter=cAdapter
            setHasFixedSize(true)
        }
    }

    private fun addVideoClub(){
            // Crear un diálogo de alerta
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Seleccionar opción")
            builder.setMessage("¿Desea insertar películas o videojuegos?")

            // Agregar botón para películas
            builder.setPositiveButton("Películas") { dialog, which ->
              val mpelicula=Peliculas(0,"Title 1",
                  20,true,true,"Drama","Ecuador")
                peliculasModel.insertPelicula(mpelicula)
                toasT("registro realizado con exito")

            }

            // Agregar botón para videojuegos
            builder.setNegativeButton("Videojuegos") { dialog, which ->
                // Lógica para insertar videojuegos
            }

            // Mostrar el diálogo
            val dialog = builder.create()
            dialog.show()


    }

     */


}