package com.example.cmo_crear_una_app_interactiva_de_dice_roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

/*
* Esta actividad permite al usuario tirar un dado y ver el resultado
* en la pantalla.
*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button2)
        rollButton.setOnClickListener {
            rollDice()
            //val resultTextView: TextView = findViewById(R.id.textView)
            //resultTextView.text = "6"
        }


        //val rollButton: Button = findViewById(R.id.button2)
        /*rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()
        }*/
    }
/*
* Tira los dados y actualiza la pantalla con el resultado.
* */
    class Dice(val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }

    private fun rollDice() {
        // Crea un nuevo objeto Dado con 6 lados y tíralo.
        val dice = Dice(6)
        val diceRoll = dice.roll()

        //Actualiza la pantalla con la tirada de dados.
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}