package com.example.qrcodesranerjetpack.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class Product(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val name: String,
    val numberQR: String,
    val isChecked: Boolean = false
)