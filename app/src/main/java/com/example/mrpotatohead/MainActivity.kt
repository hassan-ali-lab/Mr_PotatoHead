package com.example.mrpotatohead

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun handleHat(view: View) {
        var v :ImageView=  findViewById<ImageView>(R.id.imageView11)
        if ((view as CheckBox).isChecked) {
           v.visibility = View.VISIBLE;
        } else {
            v.visibility  = View.INVISIBLE;
        }
    }

    fun handleEyes(view: View) {
        var v :ImageView=  findViewById<ImageView>(R.id.imageView2)
        if ((view as CheckBox).isChecked) {
           v.visibility = View.VISIBLE;
        } else {
            v.visibility  = View.INVISIBLE;
        }
    }

}