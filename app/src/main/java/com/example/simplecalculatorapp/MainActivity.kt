package com.example.simplecalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
interface view {

}
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //---Tap the button
fun buttonTapped(view: TextView:) {
///grab the text from the textbox
        val firstVal: string = First_value.text.toString()
        val secondVal: string = second_value.text.toString()
        add.setOnClickListener(){
            val First_Value.text.tostring()
            val second_value.text.tostring()
            val result:Int = add(
                firstVal,
                secondVal
            )
            answer.settext("Answer = "+result)
        }
        subtract.setOnClickListener(){
            val First_Value.text.tostring()
            val second_value.text.tostring()
            val result:Int = subtract (firstVal,secondVal)
            answer.setText("Answer = "+result)
        }
        Multiply.setOnClickListener(){
            val First_Value.text.tostring()
            val second_value.text.tostring()
            val result:Int = multiply (firstVal,secondVal)
            answer.setText("Answer = "+result)
        }
        Divide.setOnClickListener(){
            val First_Value.text.tostring()
            val second_value.text.tostring()
            val result:Int = divide (firstVal,secondVal)
            answer.setText("Answer = "+result)
        }
        private fun add(firstVal: String, secondVal: String):Int {
            val a:Int = Interger.parseInt(firstVal)
            val b:Int = Interger.parseInt(secondVal)

            val sum:Int = a+b;

            return sum
        }
        private fun subtract(firstVal: String, secondVal: String):Int {

            val a:Int = Interger.parseInt(firstVal)
            val b:Int = Interger.parseInt(secondVal)

            val sub:Int = a-b;
            return sub
        }
        private fun multiply(firstVal: String, secondVal: String):Int {

            val a: Int = Interger.parseInt(firstVal)
            val b: Int = Interger.parseInt(secondVal)

            val multiply: Int = a*b;
            return multiply
        }
        private fun divide(firstVal: String, secondVal: String):Int {

            val a:Int = Interger.parseInt(firstVal)
            val b:Int = Interger.parseInt(secondVal)

            val divide:Int = a/b;
            return divide
            }

        //display the answer on the textvi
}

    class Interger {

    }
}


