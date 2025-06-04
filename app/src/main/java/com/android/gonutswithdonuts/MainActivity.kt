package com.android.gonutswithdonuts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.android.gonutswithdonuts.screens.DonutsDetails
import com.android.gonutswithdonuts.screens.Home
import com.android.gonutswithdonuts.screens.Starter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Starter()
            //DonutsDetails()
            //Home()
        }
    }
}