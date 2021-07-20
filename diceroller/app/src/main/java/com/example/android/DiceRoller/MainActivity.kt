package com.example.android.DiceRoller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.view.View

import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text: String = "rolling"
        button.setOnClickListener {
            rolldice()
            Toast.makeText(this,"rolling", Toast.LENGTH_SHORT).show() }
    }


        fun rolldice() {
            var diceimage = image_view_dice
            var num = (1..6).random()
            var roll = when (num) {
                1 -> R.drawable.dice1
                2 -> R.drawable.dice2
                3 -> R.drawable.dice3
                4 -> R.drawable.dice4
                5 -> R.drawable.dice5
                else -> R.drawable.dice6
            }
            diceimage.setImageResource(roll)
        }
}

