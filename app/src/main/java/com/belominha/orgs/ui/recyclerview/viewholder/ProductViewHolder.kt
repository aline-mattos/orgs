package com.belominha.orgs.ui.recyclerview.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.belominha.orgs.R
import com.belominha.orgs.model.Product

class ProductViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(product: Product) {
        val title = itemView.findViewById<TextView>(R.id.title)
        title.text = product.title
        val description = itemView.findViewById<TextView>(R.id.description)
        description.text = product.description
        val value = itemView.findViewById<TextView>(R.id.value)
        value.text = product.price.toPlainString()
    }
}