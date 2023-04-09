package com.example.myunitimes

import android.os.Bundle
import android.content.Intent
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.myunitimes.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private var mbinding : ActivityMainBinding? = null
    private val binding get() = mbinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*
        val grades:Array<String> = resources.getStringArray(R.array.grades)
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, grades)
        //binding.numGrades.adapter = adapter
         */

        binding.courseButton.setOnClickListener{
            val intent = Intent(this, Course_info::class.java)
            startActivity(intent)
        }

        binding.semesterButton.setOnClickListener{
            val intent = Intent(this, Semester_info::class.java)
            startActivity(intent)
        }

    }
}