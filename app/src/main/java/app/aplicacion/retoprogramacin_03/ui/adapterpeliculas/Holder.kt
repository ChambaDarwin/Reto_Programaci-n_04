package app.aplicacion.retoprogramacin_03.ui.adapterpeliculas

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import app.aplicacion.retoprogramacin_03.data.model.Peliculas
import app.aplicacion.retoprogramacin_03.databinding.ItemPeliculasBinding

class Holder(view:View):RecyclerView.ViewHolder(view) {
    private val binding=ItemPeliculasBinding.bind(view)

    fun renderPeliculas(peliculas: Peliculas) {
        binding.title.text = peliculas.title
        binding.clase.text = peliculas.clase
        binding.tvItIsRented.isChecked = peliculas.itIsRented
        binding.paisProduccion.text = peliculas.paisProduction
    }
}