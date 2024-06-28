package app.aplicacion.retoprogramacin_03.data.modelvideojuegos

import androidx.room.Entity
import androidx.room.PrimaryKey
import app.aplicacion.retoprogramacin_03.data.AtributosComunes

@Entity(tableName = "tableVideoJuego")
class VideoJuegos(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    title: String,
    numberOfCopies: Int,
    itIsRented: Boolean,
    itIsOriginal: Boolean,
    val editionYear: Int,
    val system: String,
    val description: String,

    ) : AtributosComunes(id, title, numberOfCopies, itIsRented, itIsOriginal)

