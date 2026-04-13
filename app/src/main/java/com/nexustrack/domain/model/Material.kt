package com.nexustrack.domain.model

data class Material(
    val id: String,
    val name: String,
    val sku: String,
    val currentStock: Int,
    val safetyStock: Int
)