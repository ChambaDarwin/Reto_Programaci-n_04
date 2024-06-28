package app.aplicacion.retoprogramacin_03.data

import app.aplicacion.retoprogramacin_03.data.model.Peliculas
import app.aplicacion.retoprogramacin_03.data.modelvideojuegos.VideoJuegos

open class AtributosComunes(
      id: Int,
     val title: String,
     var numberOfCopies: Int = 1,
     var itIsRented: Boolean = false,
     var itIsOriginal: Boolean = true

)