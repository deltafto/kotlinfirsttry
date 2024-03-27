package com.example.myapplication

import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.mybutton)
        val backgound = findViewById<ConstraintLayout>(R.id.background)
        var buttoncolor = resources.getColor(R.color.blue)
        var btcolor = "blue"

        button.setOnClickListener{
            when(btcolor){
                "blue" -> {
                    backgound.setBackgroundColor(buttoncolor)
                    btcolor = "black"
                    button.setTextColor(buttoncolor)
                    buttoncolor = resources.getColor(R.color.black)
                    button.setBackgroundColor(buttoncolor)
                }
                "black" -> {
                    backgound.setBackgroundColor(buttoncolor)
                    btcolor = "white"
                    button.setTextColor(buttoncolor)
                    buttoncolor = resources.getColor(R.color.white)
                    button.setBackgroundColor(buttoncolor)
                }
                "white" -> {
                    backgound.setBackgroundColor(buttoncolor)
                    btcolor = "red"
                    button.setTextColor(buttoncolor)
                    buttoncolor = resources.getColor(R.color.red)
                    button.setBackgroundColor(buttoncolor)
                }
                "red" -> {
                    backgound.setBackgroundColor(buttoncolor)
                    btcolor = "green"
                    button.setTextColor(buttoncolor)
                    buttoncolor = resources.getColor(R.color.green)
                    button.setBackgroundColor(buttoncolor)
                }
                "green" -> {
                    backgound.setBackgroundColor(buttoncolor)
                    btcolor = "blue"
                    button.setTextColor(buttoncolor)
                    buttoncolor = resources.getColor(R.color.blue)
                    button.setBackgroundColor(buttoncolor)
                }
                else -> {
                    backgound.setBackgroundColor(resources.getColor(R.color.black))
                    btcolor = "black"
                    button.setBackgroundColor(resources.getColor(R.color.black))
                }
            }
        }
    }
}
