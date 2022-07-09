package jj.appproject.quizapp

import java.util.*

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "다음은 어느 나라일까요?",
            R.drawable.ic_flag_of_germany,
            "영국", "독일",
            "폴란드", "북아일랜드",
            2

        )
        questionsList.add(que1)

        val que2 = Question(
            2, "다음은 누구일까요?",
            R.drawable.ic_actor_hwangjungmin,
            "이정재", "황정민",
            "최민식", "송강호",
            2

        )
        questionsList.add(que2)

        val que3 = Question(
            3, "다음은 누구일까요?",
            R.drawable.ic_actress_leeyumi,
            "정호연", "박지후",
            "이유미", "이지은",
            3

        )
        questionsList.add(que3)

        val que4 = Question(
            4, "다음은 어느 나라일까요?",
            R.drawable.ic_flag_of_southkorea,
            "대한민국", "호주",
            "프랑스", "오스트리아",
            1

        )
        questionsList.add(que4)

        val que5 = Question(
            5, "다음은 어느 나라일까요?",
            R.drawable.ic_flag_of_belgium,
            "루마니아", "벨기에",
            "독일", "에콰도르",
            2

        )
        questionsList.add(que5)

        val que6 = Question(
            6, "다음은 누구일까요?",
            R.drawable.ic_player_parkjisung,
            "박지성", "유해진",
            "손흥민", "조원희",
            1

        )
        questionsList.add(que6)

        val que7 = Question(
            7, "다음은 어느 나라일까요?",
            R.drawable.ic_flag_of_fiji,
            "영국", "호주",
            "남수단", "피지",
            4

        )
        questionsList.add(que7)

        val que8 = Question(
            8, "다음은 누구일까요?",
            R.drawable.ic_player_parkyongtaek,
            "정근우", "이재우",
            "박용택", "이병규",
            3

        )
        questionsList.add(que8)

        val que9 = Question(
            9, "다음은 누구일까요?",
            R.drawable.ic_actor_yuain,
            "윤찬영", "김선호",
            "이동욱", "유아인",
            4

        )
        questionsList.add(que9)

        val que10 = Question(
            10, "다음은 누구일까요?",
            R.drawable.ic_player_leedaeho,
            "이대호", "최지만",
            "최준석", "김태균",
            1

        )
        questionsList.add(que10)



        return questionsList
    }
}