package com.example.repasoplayjuegos

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import android.widget.ListView
import android.widget.Toast
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class Ajustes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ajustes)

        val array = arrayOf("Neblina","Relámpago","Horizonte","Trébol","Cobalto","Murmullo","Destello","Ráfaga","Linterna","Azar","Eclipse","Bruma","Cristal","Marea","Horizonte")

        val listView = findViewById<ListView>(R.id.lista)

        val adaptador = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            array
        )

        listView.adapter = adaptador

        listView.setOnItemClickListener { _, _, position, _ ->
            val genero = array[position]
            Toast.makeText(this, genero, Toast.LENGTH_SHORT).show()
        }

        val grupo = findViewById<ChipGroup>(R.id.chipGroup)
        grupo.setOnCheckedChangeListener { group, checkedId ->
            val chip: Chip = findViewById(checkedId)
            Toast.makeText(this, chip.text, Toast.LENGTH_SHORT).show()

        }
    }
}
