package com.example.myunitimes

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myunitimes.databinding.ActivityCourseCalcBinding
import com.example.myunitimes.databinding.ActivityMainBinding

class Course_calc : AppCompatActivity() {
    private var mbinding : ActivityCourseCalcBinding? = null
    private val binding get() = mbinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivityCourseCalcBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Receive numTask
        if (intent.hasExtra("numTask")){
            // 더 만들기..?
        }
        // Back to home
        binding.btnHomeCourse.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }



}

