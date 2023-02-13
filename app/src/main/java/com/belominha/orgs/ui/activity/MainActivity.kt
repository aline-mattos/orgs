package com.belominha.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.belominha.orgs.R
import com.belominha.orgs.model.Product
import com.belominha.orgs.ui.recyclerview.adapter.ProductListAdapter
import java.math.BigDecimal

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ProductListAdapter(this, listOf(
            Product("test","test desc", BigDecimal("19.99")),
            Product("test1","test desc1", BigDecimal("29.99"))
        ))



        //recyclerView.layoutManager = LinearLayoutManager(this)

        /*val title = findViewById<TextView>(R.id.title)
        title.text = "Cesta de Frutas"
        val description = findViewById<TextView>(R.id.description)
        description.text = "Laranja, manga e maçã"
        val value = findViewById<TextView>(R.id.value)
        value.text = "19.99"*/
    }

}