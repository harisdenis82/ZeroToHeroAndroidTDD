package ru.easycode.zerotoheroandroidtdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var btnChange: Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnChange = findViewById(R.id.changeButton)
        textView = findViewById(R.id.titleTextView)

        btnChange.setOnClickListener {
            textView.text = "I am an Android Developer!"
        }
    }
}