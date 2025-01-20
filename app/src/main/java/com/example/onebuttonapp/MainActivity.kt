package com.example.onebuttonapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText: EditText = findViewById<EditText?>(R.id.etEnterText)
        findViewById<Button?>(R.id.bClickToast).apply {
            setOnClickListener {
                Toast.makeText(this@MainActivity, editText.text, Toast.LENGTH_SHORT).show()
            }
        }
    }
}