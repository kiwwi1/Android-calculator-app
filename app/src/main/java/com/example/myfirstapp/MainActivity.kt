package com.example.myfirstapp

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp.R

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var textReuslt: TextView

    var state: Int = 1
    var op: Int = 0
    var op1: Int = 0
    var op2: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textReuslt = findViewById(R.id.text_result)
        findViewById<Button>(R.id.btn0).setOnClickListener(this)
        findViewById<Button>(R.id.btn1).setOnClickListener(this)
        findViewById<Button>(R.id.btn2).setOnClickListener(this)
        findViewById<Button>(R.id.btn3).setOnClickListener(this)
        findViewById<Button>(R.id.btn4).setOnClickListener(this)
        findViewById<Button>(R.id.btn5).setOnClickListener(this)
        findViewById<Button>(R.id.btn6).setOnClickListener(this)
        findViewById<Button>(R.id.btn7).setOnClickListener(this)
        findViewById<Button>(R.id.btn8).setOnClickListener(this)
        findViewById<Button>(R.id.btn9).setOnClickListener(this)
        findViewById<Button>(R.id.btnminus).setOnClickListener(this)
        findViewById<Button>(R.id.btndivide).setOnClickListener(this)
        findViewById<Button>(R.id.btnmutiple).setOnClickListener(this)
        findViewById<Button>(R.id.btnc).setOnClickListener(this)
        findViewById<Button>(R.id.btnce).setOnClickListener(this)
        findViewById<Button>(R.id.btnplus).setOnClickListener(this)
        findViewById<Button>(R.id.btnEqual).setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val id = p0?.id
        if (id == R.id.btn0) {
            addDigit(0)
        } else if (id == R.id.btn1) {
            addDigit(1)
        } else if (id == R.id.btn2) {
            addDigit(2)
        } else if (id == R.id.btn3) {
            addDigit(3)
        } else if (id == R.id.btn4) {
            addDigit(4)
        } else if (id == R.id.btn5) {
            addDigit(5)
        } else if (id == R.id.btn6) {
            addDigit(6)
        } else if (id == R.id.btn7) {
            addDigit(7)
        } else if (id == R.id.btn8) {
            addDigit(8)
        } else if (id == R.id.btn9) {
            addDigit(9)
        } else if (id == R.id.btnminus) {
            op = 2
            state = 2
        } else if (id == R.id.btnplus) {
            op = 1
            state = 2
        } else if (id == R.id.btnmutiple) {
            op = 3
            state = 2
        } else if (id == R.id.btndivide) {
            op = 4
            state = 2
        } else if (id == R.id.btnc) {
            textReuslt.text=""
            state = 1
            op1 = 0
            op2 = 0
            op = 0
        } else if (id == R.id.btnce) {
            if (state == 1) {
                op1 = op1 / 10
                textReuslt.text = if (op1 == 0) "" else "$op1"
            } else {
                op2 = op2 / 10
                textReuslt.text = if (op2 == 0) "" else "$op2"
            }
        }
        else if (id == R.id.btnEqual) {
            var result = 0
            if (op == 1) {
                result = op1 + op2
            }
            else if (op == 2){
                result = op1 - op2
            }
            else if (op == 3){
                result = op1 * op2
            }
            else if (op == 4){
                result = op1 / op2
            }
            textReuslt.text = "$result"
            state = 1
            op1 = 0
            op2 = 0
            op = 0
        }

    }
    fun addDigit(c: Int) {
        if (state == 1) {
            op1 = op1 * 10 + c
            textReuslt.text = "$op1"
        } else {
            op2 = op2 * 10 + c
            textReuslt.text = "$op2"
        }
    }
}