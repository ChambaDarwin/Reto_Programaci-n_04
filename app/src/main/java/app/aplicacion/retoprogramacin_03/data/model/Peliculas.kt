package app.aplicacion.retoprogramacin_03.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import app.aplicacion.retoprogramacin_03.data.AtributosComunes


@Entity(tableName = "tablePelicula")

class Peliculas(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    title: String,
    numberOfCopies: Int,
    itIsRented: Boolean,
    itIsOriginal: Boolean,
    val clase:String,
    val paisProduction:String

    ) : AtributosComunes(id, title, numberOfCopies, itIsRented, itIsOriginal)