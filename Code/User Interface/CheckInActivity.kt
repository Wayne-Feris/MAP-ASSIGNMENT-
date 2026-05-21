package com.example.valentinesgarage.userinterface

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.valentinesgarage.data.Truck
import com.example.valentinesgarage.databinding.ActivityCheckInBinding
import com.example.valentinesgarage.viewmodel.GarageViewModel

class CheckInActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCheckInBinding

    private val viewModel: GarageViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCheckInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSaveTruck.setOnClickListener {

            val truck = Truck(
                registrationNumber = binding.etRegistration.text.toString(),
                ownerName = binding.etOwner.text.toString(),
                driverName = binding.etDriver.text.toString(),
                kilometers = binding.etKilometers.text.toString().toInt(),
                condition = binding.etCondition.text.toString(),
                fuelLevel = binding.etFuel.text.toString(),
                checkInDate = binding.etDate.text.toString()
            )

            viewModel.insertTruck(truck)

            Toast.makeText(
                this,
                "Truck Checked In",
                Toast.LENGTH_SHORT
            ).show()

            finish()
        }
    }
}
