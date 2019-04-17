package com.kotasprojects.android.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textRoll : TextView = findViewById(R.id.textView)
        textRoll.text = "Let's Roll"

        val button : Button = findViewById(R.id.button)
        button.setOnClickListener {
            rollDice()

        }
    }

    private fun rollDice() {
        val resultText : TextView = findViewById(R.id.rollResult)
        val randomInt = Random().nextInt(6) + 1
        resultText.text = "Dice Rolled! " + randomInt.toString()
        val imageView : ImageView = findViewById(R.id.imageView)
        val imageResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imageView.setImageResource(imageResource)


        }

    }



