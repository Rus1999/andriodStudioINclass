package com.example.a63410154application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(baseContext, "Hello onCreate", Toast.LENGTH_SHORT).show()
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(baseContext, "Hello onStart", Toast.LENGTH_SHORT).show()
    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(baseContext, "Hello onResume", Toast.LENGTH_SHORT).show()
    }
    override fun onPause() {
        super.onPause()
        Toast.makeText(baseContext, "Hello onPause", Toast.LENGTH_SHORT).show()
    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(baseContext, "Hello onStop", Toast.LENGTH_SHORT).show()
    }
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(baseContext, "Hello onRestart", Toast.LENGTH_SHORT).show()
    }
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(baseContext, "Hello onDestroy", Toast.LENGTH_SHORT).show()
    }
}