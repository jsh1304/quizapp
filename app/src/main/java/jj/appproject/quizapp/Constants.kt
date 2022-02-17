package jj.appproject.quizapp

object Constants {

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "다음은 어느 나라일까요?",
            R.drawable.ic_flag_of_southkorea,
            "대한민국", "호주",
            "프랑스", "오스트리아",
            1

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

        return questionsList
    }
}