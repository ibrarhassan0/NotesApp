package com.example.login

import android.annotation.SuppressLint
import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.login.R.id
import kotlinx.coroutines.newFixedThreadPoolContext
import org.w3c.dom.Text
import java.util.Objects

class MainActivity : AppCompatActivity()
{
var TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var edittext=findViewById<EditText>(R.id.edittext)
        var button=findViewById<Button>(R.id.button)
        var textView=findViewById<TextView>(R.id.textView)
        textView.text=""
        edittext.setText("")
        textView.movementMethod=ScrollingMovementMethod()
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {


                textView.append(edittext.text)
                textView.append("\n")
                edittext.setText("")

            }

        })


    }

    override fun onStart() {
        Log.d(TAG,"onStart: called")
        super.onStart()
    }

    override fun onPause() {
        Log.d(TAG,"onPause: called")
        super.onPause()
    }

    override fun onResume() {
        Log.d(TAG,"onResume: called")
        super.onResume()
    }

    override fun onStop() {
        Log.d(TAG,"onStop: called")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG,"onDestroy: called")
        super.onDestroy()
    }

}


