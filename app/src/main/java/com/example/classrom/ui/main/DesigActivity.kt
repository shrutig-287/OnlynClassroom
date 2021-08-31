package com.example.classrom.ui.main

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.classrom.R
import com.example.classrom.R.array
import kotlinx.android.synthetic.main.activity_desig.*

class DesigActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desig)

        btnContinue.setOnClickListener {
            val intent = Intent (this, Main2Activity::class.java)
            startActivity(intent)
        }

        // Create an ArrayAdapter
        val adapter = ArrayAdapter.createFromResource(
            this,
            array.designations, android.R.layout.simple_spinner_item
        )
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Apply the adapter to the spinner
        designation_spinner.adapter = adapter
    }
    }

