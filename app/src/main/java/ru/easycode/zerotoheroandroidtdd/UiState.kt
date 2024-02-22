package ru.easycode.zerotoheroandroidtdd

import android.widget.Button
import android.widget.TextView
import java.io.Serializable

interface UiState : Serializable {

    fun apply(textView: TextView, btnIncrement: Button, btnDecrement: Button)

//    abstract class Abstract(private val text: String) : UiState {
//        override fun apply(textView: TextView, btnIncrement: Button, btnDecrement: Button) {
//            textView.text = text
//        }
//    }

    data class Base(private val text: String) : UiState {
        override fun apply(textView: TextView, btnIncrement: Button, btnDecrement: Button) {
            textView.text = text
            btnIncrement.isEnabled = true
            btnDecrement.isEnabled = true
        }

    }

    data class Max(private val text: String) : UiState {
        override fun apply(textView: TextView, btnIncrement: Button, btnDecrement: Button) {
            textView.text = text
            btnIncrement.isEnabled = false
            btnDecrement.isEnabled = true
        }

    }

    data class Min(private val text: String) : UiState {
        override fun apply(textView: TextView, btnIncrement: Button, btnDecrement: Button) {
            textView.text = text
            btnIncrement.isEnabled = true
            btnDecrement.isEnabled = false
        }

    }
}