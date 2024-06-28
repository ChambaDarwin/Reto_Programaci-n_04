package app.aplicacion.retoprogramacin_03.data.repository

import app.aplicacion.retoprogramacin_03.data.modelvideojuegos.VideoJuegosDao
import app.aplicacion.retoprogramacin_03.data.modelvideojuegos.VideoJuegos

class VideoJuegoRepository(val dao: VideoJuegosDao) {

    suspend fun insertVideoJuego(juego: VideoJuegos){
        dao.insertVideoJuego(juego)
    }

    suspend fun deleteVideoJuego(juego: VideoJuegos){
        dao.deleteVideoJuego(juego)
    }

    fun getVideoJuego()=dao.getAllVideoJuego()

}