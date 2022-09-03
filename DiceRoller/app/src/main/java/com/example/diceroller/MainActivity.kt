package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var Iamge:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Roll:Button=findViewById(R.id.Roll_button)
        Roll.setOnClickListener {
            DiceRoll()
        }
        Iamge=findViewById(R.id.DicesREsult)
    }
    private fun DiceRoll(){
    val rand=(1..6).random()
    val imageres=when(rand){
    1->R.drawable.dice_1
    2->R.drawable.dice_2
    3->R.drawable.dice_3
    4->R.drawable.dice_4
    5->R.drawable.dice_5
   else->R.drawable.dice_6
    }
     Iamge.setImageResource(imageres)
    }

}