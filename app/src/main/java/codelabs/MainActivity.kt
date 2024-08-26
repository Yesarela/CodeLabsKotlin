package com.tuempresa.codelabs

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.codelabs.KotlinBasicsActivity
import com.example.codelabs.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.kotlinBasicsButton).setOnClickListener {
            startActivity(Intent(this, KotlinBasicsActivity::class.java))
        }

        findViewById<Button>(R.id.functionsButton).setOnClickListener {
            startActivity(Intent(this, FunctionsActivity::class.java))
        }

        findViewById<Button>(R.id.classesObjectsButton).setOnClickListener {
            startActivity(Intent(this, ClassesObjectsActivity::class.java))
        }

        findViewById<Button>(R.id.extensionsButton).setOnClickListener {
            startActivity(Intent(this, ExtensionsActivity::class.java))
        }

        findViewById<Button>(R.id.constraintLayoutButton).setOnClickListener {
            startActivity(Intent(this, ConstraintLayoutActivity::class.java))
        }
    }
}
