package com.example.valentinesgarage.userinterface

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.valentinesgarage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCheckIn.setOnClickListener {
            startActivity(
                Intent(this, CheckInActivity::class.java)
            )
        }

        binding.btnRepairs.setOnClickListener {
            startActivity(
                Intent(this, RepairActivity::class.java)
            )
        }

        binding.btnReports.setOnClickListener {
            startActivity(
                Intent(this, ReportActivity::class.java)
            )
        }
    }
}
