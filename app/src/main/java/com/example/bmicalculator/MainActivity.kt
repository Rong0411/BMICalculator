package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    btnCalculate.setOnClickListener(){
        //todo:calculate BMI
        val weight:Double = editTextWeight.text.toString().toDouble()
        val height:Double = editTextHeigh.text.toString().toDouble()

        val bmi:Double = weight/(height*height)

        //todo:display Image & BMI result
        val result:String

        if(bmi<18.5) {
            result = "UNDER"
//            textViewBMI.text = "%.2f (UNDER)".format(bmi)
            imageViewProfile.setImageResource(R.drawable.under)
        }
        else if(bmi<24.9){
            result = "NORMAL"
//            textViewBMI.text = "%.2f (NORMAL)".format(bmi)
            imageViewProfile.setImageResource(R.drawable.normal)
        }
        else{
            result = "OVER"
//            textViewBMI.text = "%.2f( OVER)".format(bmi)
            imageViewProfile.setImageResource(R.drawable.over)
        }
        textViewBMI.text = "BMI: %.2f (%s)".format(bmi, result)

    }

        btnReset.setOnClickListener(){
            //todo: clear inputs & results
            editTextHeigh.setText("")
            editTextWeight.setText("")
            textViewBMI.setText("")



            //todo: clear image
            imageViewProfile.setImageResource(R.drawable.empty)

            editTextWeight.requestFocus()

        }
    }
}
