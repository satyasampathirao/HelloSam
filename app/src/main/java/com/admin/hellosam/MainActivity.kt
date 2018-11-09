package com.admin.hellosam

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //master branch
        Log.d("branch","master ");


        //dev1 branch
        Log.d("branch","dev1 ");


    }
}
