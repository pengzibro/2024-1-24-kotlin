package com.example.myapplication.ui.theme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.myapplication.R

class Activity2 : AppCompatActivity() {
    private lateinit var button2: Button
    private val tag = "MainActivity2"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        button2 = findViewById(R.id.button2)

        button2.setOnClickListener{
            val intent = Intent(this, Activity3::class.java)
            startActivity(intent)
            finish()
        }
        Log.i(tag, "Activity2 is created")
    }

    override fun onStart() {
        super.onStart()
        Log.i(tag, "Activity2 is Start")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag, "Activity2 is Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(tag, "Activity2 is Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(tag, "Activity2 is Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag, "Activity2 is Destroy")
    }
}