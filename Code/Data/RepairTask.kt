package com.example.valentinesgarage.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "repair_tasks")
data class RepairTask(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val truckId: Int,
    val employeeId: Int,
    val taskName: String,
    val notes: String,
    val status: String
)
