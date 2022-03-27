package com.example.gof

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.designpatterns.Operation
import com.example.designpatterns.OperationAdd

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //客户端调用
        val operation = OperationAdd()
        operation._numberA = 1 ;
        operation._numberB = 2 ;
        val result = operation.GetResult()
        Log.i(TAG, "result:"+result.toString())
    }
}