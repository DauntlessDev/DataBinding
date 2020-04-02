package com.example.practiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.practiceapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private var myName : MyName = MyName("Brave")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.myName = myName

        binding.button.setOnClickListener{
            showToast(it)

        }
    }

    fun showToast(view: View){
        binding.apply {
            binding.textView.text = "Button Clicked"
            myName?.name = "Braveheart"
            myName?.nickname = "Pogi bb"
            invalidateAll()
        }
        Toast.makeText(this,"You clicked me!", Toast.LENGTH_SHORT).show()
    }
}
