package app.aplicacion.retoprogramacin_03.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import app.aplicacion.retoprogramacin_03.data.database.VideoClub
import app.aplicacion.retoprogramacin_03.data.modelvideojuegos.VideoJuegos
import app.aplicacion.retoprogramacin_03.data.repository.VideoJuegoRepository
import kotlinx.coroutines.launch

class VideoJuegoViewModel(application: Application): AndroidViewModel(application) {

    private val repository: VideoJuegoRepository
    val lista: LiveData<List<VideoJuegos>>

    init {
        val dao= VideoClub.invoke(application).getDaoVideoJuegos()
        repository= VideoJuegoRepository(dao)
        lista=repository.getVideoJuego()
    }
    fun insertVideoJuego(juego: VideoJuegos){
        viewModelScope.launch {
            repository.insertVideoJuego(juego)
        }
    }

    fun deletePelicula(juego: VideoJuegos){
        viewModelScope.launch {
            repository.deleteVideoJuego(juego)
        }
    }

}