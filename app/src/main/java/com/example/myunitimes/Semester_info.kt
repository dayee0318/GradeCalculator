package com.example.myunitimes

import android.content.DialogInterface
import android.os.Bundle
import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
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

            if(binding.numCourses.length() == 0){
                val builder = AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("You must put number in the input text box")
                    .setPositiveButton("OK",
                        DialogInterface.OnClickListener { dialog, which ->
                            Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show()
                        })
                builder.show()
            }

            // Button toggle read
            binding.switchSem.setOnClickListener {
                // Calc with letter grades
                if (!binding.switchSem.isChecked) {
                    val intent = Intent(this, Semester_calc_letter::class.java)
                    //intent.putExtra("numCourses", Integer.parseInt(binding.numTask.toString()))
                    startActivity(intent)
                }
                else {
                    val intent = Intent(this, Semester_calc_number::class.java)
                    //intent.putExtra("numCourses", Integer.parseInt(binding.numTask.toString()))
                    startActivity(intent)
                }

            }

            // Move to next with entered value

        }
    }
}