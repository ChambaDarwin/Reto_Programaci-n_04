package app.aplicacion.retoprogramacin_03.ui.adapterCategory

import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import app.aplicacion.retoprogramacin_03.R
import app.aplicacion.retoprogramacin_03.databinding.ItemCategoryBinding
import app.aplicacion.retoprogramacin_03.util.CategoryM

class CategoryViewHolder(view:View) :RecyclerView.ViewHolder(view){

    private val binding=ItemCategoryBinding.bind(view)

    fun renderCategory(category: CategoryM){
      val color = when(category){

          CategoryM.Accion -> {
              binding.tvCategory.setText("Acciòn")
              ContextCompat.getColor(binding.view.context, R.color.accion)
          }
          CategoryM.Comedia -> {

              binding.tvCategory.setText("Comedia")
              ContextCompat.getColor(binding.view.context, R.color.comedia)
          }
          CategoryM.Drama -> {
              binding.tvCategory.setText("Drama")
              ContextCompat.getColor(binding.view.context, R.color.drama)
          }
          CategoryM.Fantasia -> {
              binding.tvCategory.setText("Fantasia")
              ContextCompat.getColor(binding.view.context, R.color.fantasia)
          }
          CategoryM.Suspenso -> {
              binding.tvCategory.setText("Suspenso")
              ContextCompat.getColor(binding.view.context, R.color.suspenso)
          }
          CategoryM.Terror -> {
              binding.tvCategory.setText("Terror")
              ContextCompat.getColor(binding.view.context, R.color.terror)
          }
      }
        binding.view.setBackgroundColor(color)
    }
}