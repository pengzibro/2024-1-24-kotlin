package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.Activity2
import com.example.myapplication.ui.theme.MyApplicationTheme


class MainActivity : ComponentActivity() {
    private lateinit var button: Button
    private val tag = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(
            R.layout.activity_my
        )
        button = findViewById(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }
        Log.i(tag, "MainActivity is created")

    }

    override fun onStart() {
        super.onStart()
        Log.i(tag, "MainActivity is Start")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag, "MainActivity is Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(tag, "MainActivity is Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(tag, "MainActivity is Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag, "MainActivity is Destroy")
    }
}