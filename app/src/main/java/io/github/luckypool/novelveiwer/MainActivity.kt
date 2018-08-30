package io.github.luckypool.novelveiwer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        android.util.Log.d(TAG, "This is a log!")

        val button: Button = findViewById(R.id.this_is_button) as Button

        val text: TextView = findViewById<TextView>(R.id.text_second)

        button.setOnClickListener { view ->
            android.util.Log.d(TAG, "aaaaa")
            text.text = "aaa"
        }
    }
}
