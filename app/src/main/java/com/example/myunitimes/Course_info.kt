package com.example.myunitimes

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
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

//---TOP---------------------------------------------------------------------------------------

        // Back to home
        binding.btnBackCourseInfo.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


        // Move to Calculate
        binding.btnCalcCourse.setOnClickListener{
            // If input is empty set alert message
            if(binding.numTask.length() == 0){
                val builder = AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("You must put number in the input text box")
                    .setPositiveButton("OK",
                    DialogInterface.OnClickListener { dialog, which ->
                        Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show()
                    })
                builder.show()
            }
            // Move to next page with entered value
            else {
                val intent = Intent(this, Course_calc::class.java)
                //intent.putExtra("numTask", Integer.parseInt(binding.numTask.toString()))
                startActivity(intent)
            }


        }
    }
}