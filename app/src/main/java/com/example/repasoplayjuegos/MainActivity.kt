package com.example.repasoplayjuegos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jugador = findViewById<Button>(R.id.button2)
        jugador.setOnClickListener { lanzarNuevoJugador() }
        }

    fun lanzarNuevoJugador(){
        val i = Intent(this, NewPlayer::class.java)
        startActivity(i)
    }
}