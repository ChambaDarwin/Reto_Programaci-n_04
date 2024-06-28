package app.aplicacion.retoprogramacin_03.ui.adapterCategory

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import app.aplicacion.retoprogramacin_03.R
import app.aplicacion.retoprogramacin_03.util.CategoryM

class CategoryAdapter(private val listCategory:List<CategoryM>):RecyclerView.Adapter<CategoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_category,parent,false)
        )
    }

    override fun getItemCount()=listCategory.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.renderCategory(listCategory[position])
    }


}