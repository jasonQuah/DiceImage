package com.example.practical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.IntegerRes
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image1)
/*        val sumButton: Button = findViewById(R.id.add_button)
        sumButton.setOnClickListener { addButton() }

        val total1button: Button = findViewById(R.id.total_button)
        total1button.setOnClickListener { totalButton() }*/
    }

    private fun rollDice() {
        Toast.makeText(
            this, "Button Clicked",
            Toast.LENGTH_SHORT
        ).show()

        val randomInt = Random.nextInt(6) + 1
/*        val randomNum = Random.nextInt(6) + 1
        val randomNum2 = Random.nextInt(6) + 1
        val randomNum3 = Random.nextInt(6) + 1*/

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
        diceImage2.setImageResource(drawableResource)

/*        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result2_text)
        val resultText3: TextView = findViewById(R.id.result3_text)*/

/*        resultText.text = randomNum.toString()
        resultText2.text = randomNum2.toString()
        resultText3.text = randomNum3.toString()*/
    }

/*    private fun addButton() {
        Toast.makeText(
            this, "Number Added",
            Toast.LENGTH_SHORT
        ).show()

        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result2_text)
        val resultText3: TextView = findViewById(R.id.result3_text)

        if (resultText.text == "DiceRoller"){
            resultText.text = "1"
            resultText2.text = "1"
            resultText3.text = "1"
        } else {
            val number1 = Integer.parseInt(resultText.text.toString())
            val number2 = Integer.parseInt(resultText2.text.toString())
            val number3 = Integer.parseInt(resultText3.text.toString())

            if (number1 < 6) {
                val number1 = number1 + 1
                resultText.text = number1.toString()
            } else {
                resultText.text = number1.toString()
            }
            if (number2 < 6) {
                val number2 = number2 + 1
                resultText2.text = number2.toString()
            } else {
                resultText2.text = number2.toString()
            }
            if (number3 < 6) {
                val number3 = number3 + 1
                resultText3.text = number3.toString()
            } else {
                resultText3.text = number3.toString()
            }
        }
    }*/

/*    private fun totalButton(){
        Toast.makeText(
            this, "Button Clicked",
            Toast.LENGTH_SHORT
        ).show()

        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result2_text)
        val resultText3: TextView = findViewById(R.id.result3_text)

        val totalText: TextView = findViewById(R.id.total_text)
        val num1 = Integer.parseInt(resultText.text.toString())
        val num = num1 + Integer.parseInt(resultText2.text.toString()) + Integer.parseInt(resultText3.text.toString())
        totalText.text = num.toString()
    }*/

/*    private fun function(){
        val randomInt = Random.nextInt(6) + 1

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
    }*/
}
