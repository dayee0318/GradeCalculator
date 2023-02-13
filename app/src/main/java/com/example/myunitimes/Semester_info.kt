package com.example.myunitimes

import android.os.Bundle
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.myunitimes.databinding.ActivityCourseCalcInfoBinding
import com.example.myunitimes.databinding.ActivitySemesterCalcInfoBinding

class Semester_info : AppCompatActivity() {
    private var mbinding : ActivitySemesterCalcInfoBinding? = null
    private val binding get() = mbinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivitySemesterCalcInfoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnBackSemesterInfo.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Enter number 받기

        // Toggle switch : Letter grade / number


        // Move to Calculate
        binding.btnCalcSem.setOnClickListener{
            val intent = Intent(this, Semester_calc::class.java)
            startActivity(intent)
        }
    }
}