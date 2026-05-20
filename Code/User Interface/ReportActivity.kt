package com.example.valentinesgarage.userinterface

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.valentinesgarage.databinding.ActivityReportBinding
import com.example.valentinesgarage.viewmodel.GarageViewModel

class ReportActivity : AppCompatActivity() {

    private lateinit var binding: ActivityReportBinding

    private val viewModel: GarageViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityReportBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.allTrucks.observe(this) { trucks ->

            binding.tvReport.text = "Report Loaded"
                trucks.joinToString("\n") {

                    "${it.registrationNumber} - ${it.condition}"
                }
        }
    }
}
