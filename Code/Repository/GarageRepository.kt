package com.example.valentinesgarage.repository

import androidx.lifecycle.LiveData
import com.example.valentinesgarage.data.*

class GarageRepository(private val dao: GarageDao) {

    val allTrucks: LiveData<List<Truck>> = dao.getAllTrucks()
    val allTasks: LiveData<List<RepairTask>> = dao.getAllTasks()

    suspend fun insertTruck(truck: Truck) {
        dao.insertTruck(truck)
    }

    suspend fun insertTask(task: RepairTask) {
        dao.insertRepairTask(task)
    }
}
