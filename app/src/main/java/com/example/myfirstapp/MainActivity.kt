package com.example.myfirstapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() , View.OnClickListener {
    lateinit var btnAdd : Button
    lateinit var btnSub : Button
    lateinit var btnMutilple : Button
    lateinit var btnDivide : Button
    lateinit var etA : EditText
    lateinit var etB : EditText
    lateinit var resultTv : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd=findViewById(R.id.bt_1)
        btnSub=findViewById(R.id.bt_2)
        btnMutilple=findViewById(R.id.bt_3)
        btnDivide=findViewById(R.id.bt_4)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        resultTv = findViewById(R.id.result)

        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnDivide.setOnClickListener(this)
        btnMutilple .setOnClickListener(this)
        }

    override fun onClick(v: View?) {
        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.bt_1->{
               result = a + b
            }
            R.id.bt_2->{
                result= a - b
            }
            R.id.bt_3->{
                result = a * b
            }
            R.id.bt_4->{
                result = a / b
            }
    }
        resultTv.text = "Result is $result"
}
}