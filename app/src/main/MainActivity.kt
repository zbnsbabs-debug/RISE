package com.rise.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this).apply {
            text = "RISE"
            textSize = 32f
            setTextColor(Color.WHITE)
            setBackgroundColor(Color.BLACK)
            gravity = android.view.Gravity.CENTER
        }

        setContentView(text)
    }
}
