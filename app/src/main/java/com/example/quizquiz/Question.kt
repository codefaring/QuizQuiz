package com.example.quizquiz

data class Question(
    val id: Int,
    val question: String,
    val answer_one: String,
    val answer_two: String,
    val answer_three: String,
    val answer_four: String,
    val correct_answer: Int
)

object QuizData {
    fun getQuestion(): ArrayList<Question>{
        val quizList: ArrayList<Question> = arrayListOf()

        val quiz1 = Question(
            id = 1,
            question = "이순신 장군이 만든 배는?",
            answer_one = "자라선",
            answer_two = "상어선",
            answer_three = "거북선",
            answer_four = "토끼선",
            correct_answer = 3
        )

        val quiz2 = Question(
            id = 2,
            question = "한글은 만든 사람은?",
            answer_one = "세종대왕",
            answer_two = "고종대왕",
            answer_three = "세조대왕",
            answer_four = "선조대왕",
            correct_answer = 1
        )

        val quiz3 = Question(
            id = 3,
            question = "대한민국의 국화는?",
            answer_one = "개나리",
            answer_two = "무궁화",
            answer_three = "국화",
            answer_four = "진달래",
            correct_answer = 2
        )

        val quiz4 = Question(
            id = 4,
            question = "대한민국의 애국가는 총 몇절인가?",
            answer_one = "1",
            answer_two = "2",
            answer_three = "3",
            answer_four = "4",
            correct_answer = 4
        )

        quizList.add(quiz1)
        quizList.add(quiz2)
        quizList.add(quiz3)
        quizList.add(quiz4)

        return quizList
    }
}
