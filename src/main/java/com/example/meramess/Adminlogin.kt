package com.example.meramess

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button

class Adminlogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.admin)


        val studentbutton = findViewById<Button>(R.id.textView2)
        studentbutton.setOnClickListener {
            val iintent = Intent(this,MainActivity::class.java)
            startActivity(iintent)
        }
    }
//    fun onStudentButtonClick(view: View) {
//        val intent = Intent(this, studentlogin::class.java)
//        startActivity(intent)
//    }
}