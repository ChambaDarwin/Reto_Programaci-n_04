package app.aplicacion.retoprogramacin_03.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import app.aplicacion.retoprogramacin_03.data.model.Peliculas
import app.aplicacion.retoprogramacin_03.data.modelvideojuegos.VideoJuegos
import app.aplicacion.retoprogramacin_03.data.modelvideojuegos.VideoJuegosDao

@Database(entities = [Peliculas::class, VideoJuegos::class], version = 2, exportSchema = false)
abstract class VideoClub:RoomDatabase() {

    abstract fun getDaoPeliculas():PeliculaDao
    abstract fun getDaoVideoJuegos(): VideoJuegosDao
    companion object{
        @Volatile
        private var instance:VideoClub ?=null
        private val Lock = Any()

        operator fun invoke(context:Context)= instance ?: synchronized(Lock){
            instance ?: createInstanceVideo(context).also{ instance=it}
        }
        private fun createInstanceVideo(context: Context)= Room.databaseBuilder(context.applicationContext,
            VideoClub::class.java,
            "dataVideoClub").fallbackToDestructiveMigration().build()


    }
}