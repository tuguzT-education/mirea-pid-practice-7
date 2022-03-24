package ru.samsung.itacademy.mdev.simplecalctemplate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.samsung.itacademy.mdev.simplecalctemplate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val etNum1 = binding.etNum1
        val etNum2 = binding.etNum2

        val btnAdd = binding.btnAdd
        val btnSub = binding.btnSub
        val btnMul = binding.btnMult
        val btnDiv = binding.btnDiv

        val tvResult = binding.tvResult

        val calculator = Calculator()

        btnAdd.setOnClickListener {
            try {
                val a: Int = etNum1.text.toString().toInt()
                val b: Int = etNum2.text.toString().toInt()
                tvResult.text = calculator.add(a, b).toString()
            } catch (e: Exception){
                e.printStackTrace()
            }
        }

        btnSub.setOnClickListener {
            try {
                val a: Int = etNum1.text.toString().toInt()
                val b: Int = etNum2.text.toString().toInt()
                tvResult.text = calculator.subtract(a, b).toString()
            } catch (e: Exception){
                e.printStackTrace()
            }
        }

        btnDiv.setOnClickListener {
            try {
                val a: Int = etNum1.text.toString().toInt()
                val b: Int = etNum2.text.toString().toInt()
                tvResult.text = calculator.divide(a, b).toString()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        btnMul.setOnClickListener {
            try {
                val a: Int = etNum1.text.toString().toInt()
                val b: Int = etNum2.text.toString().toInt()
                tvResult.text = calculator.multiply(a, b).toString()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
