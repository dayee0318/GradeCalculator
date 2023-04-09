package com.example.myunitimes

import android.content.DialogInterface
import android.os.Bundle
import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.myunitimes.databinding.ActivitySemesterNumberBinding

class Semester_calc_number : AppCompatActivity() {
    private var mbinding: ActivitySemesterNumberBinding? = null
    private val binding get() = mbinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivitySemesterNumberBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}