package com.example.codelabs

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class KotlinBasicsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_basics)

        val textView: TextView = findViewById(R.id.textView)
        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val ageEditText: EditText = findViewById(R.id.ageEditText)
        val button: Button = findViewById(R.id.button)

        val message = "CodeLab - Kotlin Basics"
        textView.text = message

        button.setOnClickListener {
            val name = nameEditText.text.toString()
            val ageString = ageEditText.text.toString()

            if (name.isNotEmpty() && ageString.isNotEmpty()) {
                val age = ageString.toIntOrNull()
                if (age != null) {
                    val greetingMessage = if (age > 15) {
                        "Hola, $name! Estas viejo prix!"
                    } else {
                        "Hola, $name! Estás chatel!"
                    }
                    textView.text = greetingMessage
                } else {
                    textView.text = "Dime tu edad."
                }
            } else {
                textView.text = "Ingresa tu nombre y tu edad."
            }
        }
    }
}