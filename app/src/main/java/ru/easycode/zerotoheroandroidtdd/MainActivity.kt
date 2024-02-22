package ru.easycode.zerotoheroandroidtdd

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var progressBar: ProgressBar
    private lateinit var textView: TextView
    private lateinit var actionButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progressBar = findViewById(R.id.progressBar)
        textView = findViewById(R.id.titleTextView)
        actionButton = findViewById(R.id.actionButton)

        actionButton.setOnClickListener {
            actionButton.isEnabled = false
            progressBar.visibility = View.VISIBLE

//            val timer = Timer()
//            timer.schedule(object : TimerTask() {
//                override fun run() {
//                    runOnUiThread {
//                        textView.visibility = View.VISIBLE
//                        progressBar.visibility = View.GONE
//                        actionButton.isEnabled = true
//                    }
//                }
//            }, 3500)

//            actionButton.postDelayed({
//                textView.visibility = View.VISIBLE
//                progressBar.visibility = View.GONE
//                actionButton.isEnabled = true
//            }, 3500)

            Handler(Looper.getMainLooper()).postDelayed({
                textView.visibility = View.VISIBLE
                progressBar.visibility = View.GONE
                actionButton.isEnabled = true
            }, 3500)

        }

    }
}