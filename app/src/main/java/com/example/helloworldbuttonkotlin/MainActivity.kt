package com.example.helloworldbuttonkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloWorldButton: Button = findViewById(R.id.button)

        helloWorldButton.setOnClickListener {
            val viewGroup: ViewGroup = helloWorldButton.parent as ViewGroup
            viewGroup.removeView(helloWorldButton)
        }
    }

}
