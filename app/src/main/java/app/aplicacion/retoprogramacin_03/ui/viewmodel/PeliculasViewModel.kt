package app.aplicacion.retoprogramacin_03.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import app.aplicacion.retoprogramacin_03.data.model.Peliculas
import app.aplicacion.retoprogramacin_03.data.database.VideoClub
import app.aplicacion.retoprogramacin_03.data.repository.PeliculaRepository
import kotlinx.coroutines.launch

class PeliculasViewModel(application: Application):AndroidViewModel(application) {

    private val repository:PeliculaRepository
    val lista:LiveData<List<Peliculas>>

    init {
        val dao=VideoClub.invoke(application).getDaoPeliculas()
        repository=PeliculaRepository(dao)
        lista=repository.getAllPeliculas()
    }
    fun insertPelicula(peliculas: Peliculas){
        viewModelScope.launch {
            repository.insertPelicula(peliculas)
        }
    }

    fun deletePelicula(peliculas: Peliculas){
        viewModelScope.launch {
            repository.deletePelicula(peliculas)
        }
    }

}