package com.example.dicerolle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    fun main() {
        val myFirstDice = Dice(6)
        //val diceRoll = myFirstDice.roll()
        println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}!")

        val mySecondDice = Dice(20)
        println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")
        //myFirstDice.sides = 20
        //println("Your ${myFirstDice.sides} sided dice rolled ${myFirstDice.roll()}!")
        //val randomNumber = diceRange.random()
        //println("Random number: ${randomNumber}")
        //println(myFirstDice.sides)
        //myFirstDice.roll()
    }

    class Dice (val numSides: Int) {
        //var sides = 6
        fun roll(): Int {
            return (1..numSides).random()
            //val randomNumber = (1..numSides).random()
            //return randomNumber
        }
    }
}


