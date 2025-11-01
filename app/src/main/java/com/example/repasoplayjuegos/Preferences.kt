package com.example.repasoplayjuegos

import android.os.Bundle
import android.view.Menu
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.RatingBar
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Preferences : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.preferences)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)

        val groupButton = findViewById<RadioGroup>(R.id.radioGroup)

        var radioButton: RadioButton? = null
        var numEstrellas: Float = 0F
        var progresoSek: Int = 0

        ratingBar.setOnRatingBarChangeListener(object : RatingBar.OnRatingBarChangeListener {
            override fun onRatingChanged(ratingBar: RatingBar?, rating: Float, fromUser: Boolean) {
                numEstrellas = rating;
            }
        })

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                progresoSek = progress;
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        groupButton.setOnCheckedChangeListener { group, checkedId ->
            radioButton = findViewById<RadioButton>(checkedId)
        }

        fab.setOnClickListener {
            if (radioButton != null) {
                Toast.makeText(
                    this,
                    "Juego: ${radioButton?.text} Estrellas: $numEstrellas Progreso: $progresoSek",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(this, "Ninguna opción seleccionada: ", Toast.LENGTH_SHORT).show()
            }
        }
    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
}
