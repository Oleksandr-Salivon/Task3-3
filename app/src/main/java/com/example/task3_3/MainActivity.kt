package com.example.task3_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var randomNumber = Random.nextInt(0, 1000)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val inputText =findViewById<TextInputLayout>(R.id.number)
        val button = findViewById<TextView>(R.id.button)
        val showResult = findViewById<TextView>(R.id.resultText)
        showResult.text = "$randomNumber"
        button.setOnClickListener {
            val getNumber = inputText.editText?.text
            if(getNumber.isNullOrEmpty()) showResult.text = "No, my number is bigger"
            else if(getNumber.toString().toInt() > randomNumber)
            showResult.text = "No, my number is smaller"
            else if(getNumber.toString().toInt() < randomNumber)
                showResult.text = "No, my number is bigger"
            else showResult.text = "Yes, you are right!"
        }
    }
}