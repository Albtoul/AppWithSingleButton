package com.example.appwithsinglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var edtxt:EditText
    lateinit var bt   :Button
    lateinit var tv   :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtxt=findViewById(R.id.editTextTextPersonName)
        bt=findViewById(R.id.button)
        tv=findViewById(R.id.textView)
        
        bt.setOnClickListener { tv.text="${edtxt.text}"}

    }
}