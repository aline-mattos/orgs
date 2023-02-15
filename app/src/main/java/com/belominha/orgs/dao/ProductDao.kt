package com.belominha.orgs.dao

import com.belominha.orgs.model.Product

class ProductDao {

    fun addProduct(product: Product) {
        products.add(product)
    }

    fun getAll() : List<Product> {
        return products.toList()
    }

    companion object {
        private val products = mutableListOf<Product>()
    }

}