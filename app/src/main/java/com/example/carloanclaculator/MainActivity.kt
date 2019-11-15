package com.example.loancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.carloanclaculator.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        buttonCalculate.setOnClickListener(){
            val car_price = editTextCarPrice.text.toString()
            val downPayment = editTextDownPayment.text.toString()
            val loan_period = editTextLoanPeriod.text.toString()
            val interest_rate = editTextInterestRate.text.toString()

            val carloan:Double = car_price.toDouble() - downPayment.toDouble()
            val interest:Double = carloan * (interest_rate.toDouble()/100) * loan_period.toDouble()
            val monthly:Double = (carloan+interest)/loan_period.toDouble()/12

            textViewLoan.text = "Loan = %.2f".format(carloan)
            textViewInterest.text = "Interest = %.2f".format(interest)
            textViewMonthlyRepayment.text = "Monthly repayment = %.2f".format(monthly)
        }
        buttonReset.setOnClickListener(){
            editTextCarPrice.setText("")
            editTextDownPayment.setText("")
            editTextLoanPeriod.setText("")
            editTextInterestRate.setText("")
            //
            //
            //
        }
    }
}
