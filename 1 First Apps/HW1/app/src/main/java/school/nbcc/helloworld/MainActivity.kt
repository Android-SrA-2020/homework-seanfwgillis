package school.nbcc.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.NumberFormatException
import kotlin.random.Random
import java.lang.Integer.parseInt


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}

        val countUp: Button = findViewById(R.id.count_up)
        countUp.setOnClickListener{countUp()}

        val reset: Button = findViewById(R.id.reset)
        reset.setOnClickListener{reset()}

    }

    private fun rollDice(){
        val randomInt = Random.nextInt(6) + 1
        // Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()

    }

    private fun countUp(){
        val view: TextView = findViewById(R.id.result_text)
        val text: String = view.text.toString()
        var isNumber = true
        var number: Int


        try {
            number = parseInt(text)
        } catch (e: NumberFormatException){
            isNumber = false;
        }

        if (isNumber){
            number = parseInt(text)
            if (number == 6){

            }
            else {
                number ++;
            }
            view.text = number.toString()
        }
        else
        {
            number = 1;
            view.text = number.toString()
        }
    }

    private fun reset(){
        val view: TextView = findViewById(R.id.result_text)
        view.text = "0"
    }
}
