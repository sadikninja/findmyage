package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buGetAge.setOnClickListener {
            // add code run when button click

            val userDOB = Integer.parseInt(etDOB.text.toString())
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val userAgeInYear = currentYear - userDOB
            tvShowAge.text = "your Age is $userAgeInYear Years"

        }

        fun buUserAgeClick(view: android.view.View) {}



    }
}