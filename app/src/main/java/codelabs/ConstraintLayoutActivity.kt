package com.tuempresa.codelabs

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.codelabs.R

class ConstraintLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout)

        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val ageEditText: EditText = findViewById(R.id.ageEditText)
        val submitButton: Button = findViewById(R.id.submitButton)
        val clearButton: Button = findViewById(R.id.clearButton)
        val resultTextView: TextView = findViewById(R.id.resultTextView)

        submitButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val ageString = ageEditText.text.toString()

            if (name.isEmpty() || ageString.isEmpty()) {
                resultTextView.text = "Por favor, completa todos los campos."
                return@setOnClickListener
            }

            val age = ageString.toIntOrNull()
            if (age == null) {
                resultTextView.text = "La edad debe ser un número válido."
                return@setOnClickListener
            }

            val message = if (age > 18) {
                "Hola $name, sos mayor de edad, ya aguantas."
            } else {
                "Hola $name, sos menor de edad, chiva caer preso."
            }

            resultTextView.text = message
        }

        clearButton.setOnClickListener {
            nameEditText.text.clear()
            ageEditText.text.clear()
            resultTextView.text = ""
        }
    }
}