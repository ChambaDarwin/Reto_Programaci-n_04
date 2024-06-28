package app.aplicacion.retoprogramacin_03.data.modelvideojuegos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import app.aplicacion.retoprogramacin_03.data.model.Peliculas
import app.aplicacion.retoprogramacin_03.data.modelvideojuegos.VideoJuegos
import app.aplicacion.retoprogramacin_03.util.CategoryM

@Dao
interface VideoJuegosDao {
    @Insert (onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertVideoJuego(juego: VideoJuegos)

    @Delete
    suspend fun deleteVideoJuego(juego: VideoJuegos)

    @Query("select * from tableVideoJuego")
    fun getAllVideoJuego():LiveData<List<VideoJuegos>>

}