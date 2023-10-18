package com.example.ejercicio12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun onSubmitButtonClick(view: View) {
        Toast.makeText(this, "Registro completado", Toast.LENGTH_SHORT).show()
    }
}