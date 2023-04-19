package com.example.quizquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizquiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var quizList: ArrayList<Question>

    private var quizCount = 1
    private var selectAnswer = 0
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        quizList = QuizData.getQuestion()

        getShowUp()
    }

    private fun getShowUp() {
        val question = quizList

        binding.progressBar.progress = quizCount
        binding.progressBar.max = quizList.size
    }
}