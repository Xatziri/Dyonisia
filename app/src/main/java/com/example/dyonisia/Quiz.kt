package com.example.dyonisia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.dyonisia.databinding.ActivityMainBinding
import com.example.dyonisia.databinding.ActivityQuizBinding

class Quiz : AppCompatActivity() {

    private lateinit var fragmentManager: FragmentManager
    private lateinit var binding: ActivityQuizBinding
    private lateinit var originalButton: Button
    private lateinit var originalButton2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.question.text = "Do you worry you will be “found out” ?"

        originalButton = binding.fr1Btn
        originalButton2 = binding.fr2Btn

        binding.saveBtn.setOnClickListener {

        }
        val exitButton = findViewById<ImageButton>(R.id.exit_btn)
        exitButton.setOnClickListener{
            val Intent = Intent(this,StartQuiz::class.java)
            startActivity(Intent)
        }

        binding.fr1Btn.setOnClickListener {
            // Change the text when fr1Btn is pressed
            binding.question.text = "Do you feel your colleagues are more mature than you?"

            // Replace the original button with a new one
            val newButton = Button(this)
            newButton.id = originalButton.id
            newButton.text = "YES"

            // Copy layout parameters
            newButton.layoutParams = originalButton.layoutParams

            // Copy other attributes as needed (e.g., padding, background, textColor)
            newButton.background = originalButton.background
            newButton.setTextColor(originalButton.currentTextColor)
            newButton.setTextSize(originalButton.textSize / resources.displayMetrics.density)
            newButton.setPadding(
                originalButton.paddingLeft,
                originalButton.paddingTop,
                originalButton.paddingRight,
                originalButton.paddingBottom
            )
            newButton.width = originalButton.width
            newButton.width = originalButton.height


            // Replace the original button in the layout
            val parent = originalButton.parent as? LinearLayout
            parent?.let {
                val index = it.indexOfChild(originalButton)
                 it.removeView(originalButton)
                 it.addView(newButton, index)
            }

            // Update the reference to the original button
            originalButton = newButton

        }
        binding.fr2Btn.setOnClickListener {
            // Change the text when fr1Btn is pressed
            binding.question.text = "Do you feel uncomfortable when someone praises you at work?"
        }



//        binding.fr1Btn.setOnClickListener{
//            goToFragment(Fragment1())
//        }
//        binding.fr2Btn.setOnClickListener{
//            goToFragment(Fragment2())
//        }
    }
//    private fun goToFragment(fragment: Fragment)
//    {
//        fragmentManager = supportFragmentManager
//        fragmentManager.beginTransaction().replace(R.id.frameLayout, fragment).commit()
//    }

    }



