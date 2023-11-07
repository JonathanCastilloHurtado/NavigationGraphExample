package com.example.navigationexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //is used just to storage the @FragmentContainerView to star the nav graph
        setContentView(R.layout.activity_main)
    }
}