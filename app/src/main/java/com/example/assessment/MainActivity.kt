package com.example.assessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assessment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun getNumbers(){
        binding.btnSubtract.setOnClickListener{
            binding.etNumberOne.text
            var number1=.text.toString().toInt()
            var number2=num2.text.toString().toInt()
            var result=number1-number2

            etresult.text="Result:$result"

        }
        binding.btnAdd.setOnClickListener {

        }
        binding.btnDivide.setOnClickListener {

        }
        binding.btnMultiply.setOnClickListener {

        }
    }
}