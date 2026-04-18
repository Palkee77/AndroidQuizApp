package com.example.quizapp.data.db.dao

import androidx.room.*
import com.example.quizapp.data.db.entities.Question

@Dao
interface QuestionDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertQuestion(question: Question)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllQuestions(questions: List<Question>)

    @Query("SELECT * FROM questions WHERE quizId = :quizId")
    suspend fun getQuestionsByQuizId(quizId: Int): List<Question>

    @Query("SELECT * FROM questions")
    suspend fun getAllQuestions(): List<Question>

    @Delete
    suspend fun deleteQuestion(question: Question)

    @Query("DELETE FROM questions WHERE quizId = :quizId")
    suspend fun deleteQuestionsByQuizId(quizId: Int)
}