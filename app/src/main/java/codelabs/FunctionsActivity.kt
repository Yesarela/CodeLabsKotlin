package com.tuempresa.codelabs

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.codelabs.R

class FunctionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_functions)

        val number1EditText: EditText = findViewById(R.id.number1EditText)
        val number2EditText: EditText = findViewById(R.id.number2EditText)
        val calculateButton: Button = findViewById(R.id.calculateButton)
        val resultTextView: TextView = findViewById(R.id.resultTextView)

        calculateButton.setOnClickListener {
            val number1String = number1EditText.text.toString()
            val number2String = number2EditText.text.toString()

            val number1 = number1String.toIntOrNull()
            val number2 = number2String.toIntOrNull()

            if (number1 != null && number2 != null) {
                val resultSum = sum(number1, number2)
                val resultProduct = product(number1, number2)
                resultTextView.text = "Sum: $resultSum\nProduct: $resultProduct"
            } else {
                resultTextView.text = "Por favor, ingresa numeros válidos."
            }
        }
    }

    private fun sum(a: Int, b: Int): Int {
        return a + b
    }

    private fun product(a: Int, b: Int): Int {
        return a * b
    }
}
