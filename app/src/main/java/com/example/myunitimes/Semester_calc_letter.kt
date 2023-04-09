package com.example.myunitimes

import android.content.DialogInterface
import android.os.Bundle
import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.myunitimes.databinding.ActivitySemesterLetterBinding
class Semester_calc_letter : AppCompatActivity() {
    private var mbinding: ActivitySemesterLetterBinding? = null
    private val binding get() = mbinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivitySemesterLetterBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        /*
        binding.numGrades.onItemSelectedListener = object:AdapterView.OnItemSelectedListener{

            override fun onItemSelected(p0: AdapterView<*>?, view: View?, position: Int, id: Long) {
                when(position0 {

                0 -> {

                }

                1 -> {

                }
                ...

                else -> {

                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
        */
    }
}