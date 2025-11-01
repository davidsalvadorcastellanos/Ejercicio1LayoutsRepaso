package com.example.repasoplayjuegos

import android.os.Bundle
import android.view.Menu
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Games : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.games)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton2)

        val cajas = listOf(
            findViewById<CheckBox>(R.id.checkBox),
            findViewById<CheckBox>(R.id.checkBox2),
            findViewById<CheckBox>(R.id.checkBox3),
            findViewById<CheckBox>(R.id.checkBox4),
            findViewById<CheckBox>(R.id.checkBox5),
            findViewById<CheckBox>(R.id.checkBox6)
        )

        fab.setOnClickListener {
            val prueba = cajas
                        .filter { it.isChecked }
                        .joinToString (",") { it.text.toString() }
            Toast.makeText(this,"Juegos: $prueba",Toast.LENGTH_LONG).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
}
