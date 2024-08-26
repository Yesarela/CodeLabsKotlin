package com.tuempresa.codelabs

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.codelabs.R

class ExtensionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extensions)

        val numbersEditText: EditText = findViewById(R.id.numbersEditText)
        val calculateButton: Button = findViewById(R.id.calculateButton)
        val resultTextView: TextView = findViewById(R.id.resultTextView)

        calculateButton.setOnClickListener {
            val input = numbersEditText.text.toString()
            val numbers = parseNumbers(input)

            if (numbers.isNotEmpty()) {
                val sum = numbers.sum()
                resultTextView.text = "Sumatoria de la lista: $sum"
            } else {
                resultTextView.text = "Por favor, ingresa números válidos separados por coma (,)."
            }
        }
    }

    private fun parseNumbers(input: String): List<Int> {
        return input.split(",")
            .mapNotNull { it.trim().toIntOrNull() }
    }

    private fun List<Int>.sum(): Int {
        var total = 0
        for (number in this) {
            total += number
        }
        return total
    }
}