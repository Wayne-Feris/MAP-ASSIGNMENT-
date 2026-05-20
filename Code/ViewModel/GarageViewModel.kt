package com.example.valentinesgarage.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.valentinesgarage.data.*
import com.example.valentinesgarage.repository.GarageRepository
import kotlinx.coroutines.launch

class GarageViewModel(application: Application) :
    AndroidViewModel(application) {

    private val repository: GarageRepository

    val allTrucks: LiveData<List<Truck>>
    val allTasks: LiveData<List<RepairTask>>

    init {

        val dao = AppDatabase.getDatabase(application).garageDao()

        repository = GarageRepository(dao)

        allTrucks = repository.allTrucks
        allTasks = repository.allTasks
    }

    fun insertTruck(truck: Truck) =
        viewModelScope.launch {
            repository.insertTruck(truck)
        }

    fun insertTask(task: RepairTask) =
        viewModelScope.launch {
            repository.insertTask(task)
        }
    }
