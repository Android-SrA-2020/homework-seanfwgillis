package school.nbcc.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import school.nbcc.helloworld.R.id.dice_image1
import school.nbcc.helloworld.R.id.dice_image2
import java.lang.NumberFormatException
import kotlin.random.Random
import java.lang.Integer.parseInt


class MainActivity : AppCompatActivity() {

    lateinit var diceImage1: ImageView
    lateinit var diceImage2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage1 = findViewById(dice_image1)
        diceImage2 = findViewById(dice_image2)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}


    }

    private fun rollDice(){
        val randomInt1 = Random.nextInt(6) + 1
        val randomInt2 = Random.nextInt(6) + 1

        check(randomInt1,randomInt2)

    }

    private fun check(first: Int, second: Int){
        if (first != second){
            val drawableResource1 = when (first){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

            val drawableResource2 = when (second){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

            diceImage1.setImageResource(drawableResource1)
            diceImage2.setImageResource(drawableResource2)
        }
        else {
            rollDice();
        }
    }


}
