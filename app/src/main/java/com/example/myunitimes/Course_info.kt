package com.example.myunitimes

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.myunitimes.databinding.ActivityCourseCalcInfoBinding
import com.example.myunitimes.databinding.ActivityMainBinding

class Course_info : AppCompatActivity(){
    private var mbinding : ActivityCourseCalcInfoBinding? = null
    private val binding get() = mbinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivityCourseCalcInfoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Back to home
        binding.btnBackCourseInfo.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        // Move to Calculate
        binding.btnCalcCourse.setOnClickListener{
            // Get input from above editText

            // Move to next page
            val intent = Intent(this, Course_calc::class.java)
            intent.putExtra("numTask", Integer.parseInt(binding.numTask.toString()))
            startActivity(intent)


        }
    }
}