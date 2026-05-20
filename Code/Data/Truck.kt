package com.example.valentinesgarage.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "trucks")
data class Truck(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val registrationNumber: String,
    val ownerName: String,
    val driverName: String,
    val kilometers: Int,
    val condition: String,
    val fuelLevel: String,
    val checkInDate: String
)
