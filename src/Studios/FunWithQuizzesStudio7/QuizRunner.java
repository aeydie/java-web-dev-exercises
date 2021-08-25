package Studios.FunWithQuizzesStudio7;

public class QuizRunner {

    public static void main(String[] args) {

        Quiz rainbowQuiz = new Quiz();

        TrueFalseQuestion q1 = new TrueFalseQuestion("True or False: Does a rainbow have the color red in it?", "true");

        MultipleChoiceQuestion q2 = new MultipleChoiceQuestion("Pick which colors are in a rainbow.  A. Grey B. Indigo  C. Magenta", "B. Indigo");

        CheckBoxQuestion q3 = new CheckBoxQuestion("When do you see a rainbow usually? A. After it rains and the sun is out.  B. At nighttime.  C. During a storm.", "A. After it rains and the sun comes out.");

        rainbowQuiz.addQuestion(q1);
        rainbowQuiz.addQuestion(q2);
        rainbowQuiz.addQuestion(q3);

        rainbowQuiz.runQuiz();

    }
}

