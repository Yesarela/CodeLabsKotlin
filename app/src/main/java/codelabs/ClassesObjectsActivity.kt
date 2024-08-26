package com.tuempresa.codelabs

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.codelabs.R

class ClassesObjectsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_classes_objects)

        val makeEditText: EditText = findViewById(R.id.makeEditText)
        val modelEditText: EditText = findViewById(R.id.modelEditText)
        val driveButton: Button = findViewById(R.id.driveButton)
        val resultTextView: TextView = findViewById(R.id.resultTextView)

        driveButton.setOnClickListener {
            val make = makeEditText.text.toString()
            val model = modelEditText.text.toString()

            if (make.isNotEmpty() && model.isNotEmpty()) {
                val car = Car(make, model)
                resultTextView.text = car.drive()
            } else {
                resultTextView.text = "Por favor ingresa la marca y el modelo."
            }
        }
    }

    class Car(val make: String, val model: String) {
        fun drive(): String {
            return "Chocho, andas manejando un $make $model, clase nave chatel."
        }
    }
}