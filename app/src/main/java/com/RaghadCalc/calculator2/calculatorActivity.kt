package com.RaghadCalc.calculator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.RaghadCalc.calculator2.databinding.ActivityCalculatorBinding

class calculatorActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCalculatorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAddition.setOnClickListener {
            if (binding.etFisrNum.text.isNotEmpty() && binding.etSecondNum.text.isNotEmpty()){

                val FirstNumber = binding.etFisrNum.text.toString().toInt()
                val SecondNumber = binding.etSecondNum.text.toString().toInt()
                var result = FirstNumber + SecondNumber
                binding.textView.text= result.toString()

            }
            else
            {

                Toast.makeText(this, "the field is empty", Toast.LENGTH_LONG).show()

            }

        }
        binding.btnSubt.setOnClickListener {
            if (binding.etFisrNum.text.isNotEmpty() && binding.etSecondNum.text.isNotEmpty()){

                val FirstNumber = binding.etFisrNum.text.toString().toInt()
                val SecondNumber = binding.etSecondNum.text.toString().toInt()
                var result = FirstNumber - SecondNumber
                binding.textView.text= result.toString()

            }
            else
            {

                Toast.makeText(this, "the field is empty", Toast.LENGTH_LONG).show()

            }

        }
        binding.btnMultiply.setOnClickListener {
            if (binding.etFisrNum.text.isNotEmpty() && binding.etSecondNum.text.isNotEmpty()){

                val FirstNumber = binding.etFisrNum.text.toString().toInt()
                val SecondNumber = binding.etSecondNum.text.toString().toInt()
                var result = FirstNumber * SecondNumber
                binding.textView.text= result.toString()

            }
            else
            {

                Toast.makeText(this, "the field is empty", Toast.LENGTH_LONG).show()

            }

        }
        binding.btnDevide.setOnClickListener {
            if (binding.etFisrNum.text.isNotEmpty() && binding.etSecondNum.text.isNotEmpty()){

                val FirstNumber = binding.etFisrNum.text.toString().toInt()
                val SecondNumber = binding.etSecondNum.text.toString().toInt()
                if (FirstNumber==0 || SecondNumber==0){
                    Toast.makeText(this, "cann't devide by 0", Toast.LENGTH_LONG).show()
                }
                else {
                    var result = FirstNumber / SecondNumber
                    binding.textView.text = result.toString()
                }

            }
            else
            {

                Toast.makeText(this, "the field is empty", Toast.LENGTH_LONG).show()

            }

        }

        binding.btnResult.setOnClickListener {
            binding.etFisrNum.text.clear()
            binding.etSecondNum.text.clear()
            binding.textView.setText("Result Here:")
            Toast.makeText(this, "value Reseted", Toast.LENGTH_LONG).show()
        }
    }
}