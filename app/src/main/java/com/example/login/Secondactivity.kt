package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Secondactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)

        var name=intent.getStringExtra("msg")
        val textmsg= findViewById<TextView>(R.id.textmsg) as TextView
        textmsg.text= name

    }
}