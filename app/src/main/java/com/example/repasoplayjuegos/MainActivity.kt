package com.example.repasoplayjuegos

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val jugador = findViewById<Button>(R.id.button2)
        jugador.setOnClickListener { lanzarNuevoJugador() }

        val preferences = findViewById<Button>(R.id.button3)
        preferences.setOnClickListener { lanzarPreferences() }

        val games = findViewById<Button>(R.id.button1)
        games.setOnClickListener { lanzarGames() }

        }

//    Funciones botones

    fun lanzarNuevoJugador(){
        val i = Intent(this, NewPlayer::class.java)
        startActivity(i)
    }

    fun lanzarPreferences(){
        val i = Intent(this,Preferences::class.java)
        startActivity(i)
    }

    fun lanzarGames(){
        val i = Intent (this, Games::class.java)
        startActivity(i)
    }

    fun lanzarAbout(){
        val i = Intent (this, Ajustes::class.java)
        startActivity(i)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_buscar -> {
                lanzarAbout()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
