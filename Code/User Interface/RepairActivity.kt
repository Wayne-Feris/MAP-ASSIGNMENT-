package com.example.valentinesgarage.userinterface

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.valentinesgarage.data.RepairTask
import com.example.valentinesgarage.databinding.ActivityRepairBinding
import com.example.valentinesgarage.viewmodel.GarageViewModel

class RepairActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRepairBinding

    private val viewModel: GarageViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRepairBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSaveTask.setOnClickListener {

            val task = RepairTask(
                truckId = binding.etTruckId.text.toString().toInt(),
                employeeId = binding.etEmployeeId.text.toString().toInt(),
                taskName = binding.etTaskName.text.toString(),
                notes = binding.etNotes.text.toString(),
                status = binding.etStatus.text.toString()
            )

            viewModel.insertTask(task)

            Toast.makeText(
                this,
                "Task Saved",
                Toast.LENGTH_SHORT
            ).show()

            finish()
        }
    }
}
