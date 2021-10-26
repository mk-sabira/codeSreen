package com.example.codescreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.codescreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        numbers()

    }

    private fun numbers() {
        val one = binding.btnOne
        val two = binding.btnTwo
        val three = binding.btnThree
        val four = binding.btnFour
        val five = binding.btnFive
        val six = binding.btnSix
        val seven = binding.btnSeven
        val eight = binding.btnEight
        val nine = binding.btnNine
        val zero = binding.btnZero

        one.setOnClickListener { appendOnClick("1") }
        two.setOnClickListener { appendOnClick("2") }
        three.setOnClickListener { appendOnClick("3") }
        four.setOnClickListener { appendOnClick("4") }
        five.setOnClickListener { appendOnClick("5") }
        six.setOnClickListener { appendOnClick("6") }
        seven.setOnClickListener { appendOnClick("7") }
        eight.setOnClickListener { appendOnClick("8") }
        nine.setOnClickListener { appendOnClick("9") }
        zero.setOnClickListener { appendOnClick("0") }

        val back = binding.btnClear
        back.setOnClickListener {
            Toast.makeText(this, "image button work", Toast.LENGTH_LONG).show()
            clear()
        }

    }
    private fun appendOnClick(string: String){
        val input = binding.etCode
        input.append(string)
    }

    private fun clear(){
        val etCode = binding.etCode.text
        if (etCode.isNotEmpty()) etCode.text = etCode.substring(0, etCode.length -1 )
    }
}