package app.aplicacion.retoprogramacin_03.data.repository

import app.aplicacion.retoprogramacin_03.data.model.Peliculas
import app.aplicacion.retoprogramacin_03.data.database.PeliculaDao

class PeliculaRepository(val dao:PeliculaDao) {

    suspend fun insertPelicula(peliculas: Peliculas){
        dao.insertPelicula(peliculas)
    }

    suspend fun deletePelicula(peliculas: Peliculas){
        dao.deltePelicula(peliculas)
    }

   fun getAllPeliculas()=dao.getAllPelicula()

}