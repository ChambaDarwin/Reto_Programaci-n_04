package app.aplicacion.retoprogramacin_03.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import app.aplicacion.retoprogramacin_03.data.model.Peliculas
@Dao
interface PeliculaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPelicula(peliculas: Peliculas)

    @Delete
    suspend fun deltePelicula(peliculas: Peliculas)

    @Query("select * from tablePelicula")
    fun getAllPelicula(): LiveData<List<Peliculas>>

}