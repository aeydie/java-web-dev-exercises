package Studios.FunWithQuizzesStudio7;

public class TrueFalseQuestion extends Question {



    public TrueFalseQuestion(String question, String answer) {
//        calling from abstract class
        super(question, answer);
    }


    public boolean checkAnswer(String answer) {
//        answer will be true or false
        if (answer.toLowerCase().equals(this.getAnswer().toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}

