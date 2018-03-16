package com.example.workshop.quizapp;

/**
 * Created by workshop on 10/14/2017.
 */

public class Questions {
    public String mQuestions[]={
            "which is the first planet in the solar sytem?",
            "which is the Second planet in the solar sytem?",
            "which is the Third planet in the solar sytem?",
            "which is the Fourth planet in the solar sytem?",
            "which is the Fifth planet in the solar sytem?",
            "which is the Sixth planet in the solar sytem?",
            "which is the Seventh planet in the solar sytem?",
            "which is the Eighth planet in the solar sytem?",
            "which is the Nineth planet in the solar sytem?"



    };

    private String mChoices[][]={
            {"mercury","venus","mars","saturn"},
            {"mercury","venus","mars","saturn"},
            {"mercury","venus","earth","saturn"},
            {"mercury","venus","mars","saturn"},
            {"mercury","venus","mars","jupiter"},
            {"mercury","venus","mars","saturn"},
            {"mercury","venus","mars","uranus"},
            {"mercury","venus","mars","neptune"},
            {"mercury","venus","mars","pluto"}



    };

    private String mCorrectAnswers[]={"mercury","venus","earth","mars","jupiter","saturn","uranus","neptune","pluto"};

    public String getQuestion(int a)
    {
        String Question=mQuestions[a];
        return Question;
    }
    public String getChoice1(int a)
    {
        String choice = mChoices[a][0];
        return choice;
    }
    public String getChoice2(int a)
    {
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a)
    {
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a)
    {
        String choice = mChoices[a][3];
        return choice;
    }
    public String getCorrectAnswer (int a)
    {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
