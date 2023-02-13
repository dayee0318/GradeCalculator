package com.example.myunitimes

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myunitimes.databinding.ActivitySemesterCalcBinding
import com.example.myunitimes.databinding.ActivityMainBinding

class Semester_calc : AppCompatActivity(){
    private var mbinding : ActivitySemesterCalcBinding? = null
    private val binding get() = mbinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivitySemesterCalcBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


       // Back to home
        binding.btnHomeSem.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}
