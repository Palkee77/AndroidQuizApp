package com.example.androidquizapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuizViewModel : ViewModel() {
    private val _quizState = MutableLiveData<QuizState>()
    val quizState: LiveData<QuizState> get() = _quizState

    // Method to load quizzes, this is a suspend function for database operation
    suspend fun loadQuizzes() {
        // Logic to load quizzes from the database
        // Update _quizState with the result
    }

    // Additional methods to manage quiz state
}