package com.belominha.orgs.ui.activity

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.belominha.orgs.R
import com.belominha.orgs.model.Product
import java.math.BigDecimal

class ProductFormActivity : AppCompatActivity(R.layout.activity_product_form) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val buttonSave = findViewById<Button>(R.id.button_save)
        buttonSave.setOnClickListener {
            val titleField = findViewById<EditText>(R.id.product_title)
            val title = titleField.text.toString()
            val descriptionField = findViewById<EditText>(R.id.product_description)
            val description = descriptionField.text.toString()
            val priceField = findViewById<EditText>(R.id.product_price)
            val priceText = priceField.text.toString()
            val price = if (priceText.isBlank()) {
                BigDecimal.ZERO
            } else {
                BigDecimal(priceText)
            }

            val newProduct = Product(
                title = title,
                description = description,
                price = price
            )

            Log.i("ProductFormActivity", "onCretate: $newProduct")
        }
    }
}