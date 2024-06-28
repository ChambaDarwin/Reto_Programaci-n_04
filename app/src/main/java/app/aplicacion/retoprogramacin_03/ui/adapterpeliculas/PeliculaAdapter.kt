package app.aplicacion.retoprogramacin_03.ui.adapterpeliculas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncDifferConfig
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import app.aplicacion.retoprogramacin_03.R
import app.aplicacion.retoprogramacin_03.data.model.Peliculas
import app.aplicacion.retoprogramacin_03.databinding.ItemPeliculasBinding

class PeliculaAdapter : RecyclerView.Adapter<Holder>() {

    private val userItem = object : DiffUtil.ItemCallback<Peliculas>() {
        override fun areItemsTheSame(oldItem: Peliculas, newItem: Peliculas): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Peliculas, newItem: Peliculas): Boolean {
            return oldItem.equals(newItem)
        }

    }
    val diffPeliculas = AsyncListDiffer(this, userItem)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_peliculas,parent,false)
        return Holder(layout)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.renderPeliculas(diffPeliculas.currentList[position])
    }

    override fun getItemCount() = diffPeliculas.currentList.size

}


