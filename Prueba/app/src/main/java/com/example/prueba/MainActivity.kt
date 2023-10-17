package com.example.prueba
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "onCreate: La actividad ha entrado en el método onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart: La actividad ha entrado en el método onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume: La actividad ha entrado en el método onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause: La actividad ha entrado en el método onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop: La actividad ha entrado en el método onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy: La actividad ha entrado en el método onDestroy")
    }
}
