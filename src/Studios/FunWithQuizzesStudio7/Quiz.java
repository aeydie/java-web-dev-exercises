package Studios.FunWithQuizzesStudio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz{

    private static ArrayList<Question> questions = new ArrayList<>();

    public Quiz() {
        this.questions = questions;
    }

    public ArrayList<Question> getQuestions() {
        return this.questions;
    }

    public static void addQuestion(Question question){questions.add(question);}

    public static void runQuiz() {

        Scanner userinput = new Scanner(System.in);
        double points = 0;

        for (Question question: questions) {
            System.out.println(question.getQuestion());
            String answer = userinput.nextLine();
          question.checkAnswer(answer);
            if(question.checkAnswer(answer)) {
                points ++;
            }
        }
        double finalScore = points / questions.size() * 100;
        System.out.println("Grade: " + finalScore + "%. ");
    }







}
