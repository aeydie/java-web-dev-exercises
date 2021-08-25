package Studios.FunWithQuizzesStudio7;

public class MultipleChoiceQuestion extends Question {

    public MultipleChoiceQuestion(String question, String answer) {
        super(question, answer);
    }
    //want to annotate
    //for multiple choice questions going to have answer options a and b
    @Override
    public boolean checkAnswer(String answer) {

        String userAnswer = this.getAnswer();
        if (answer.toLowerCase().equals(userAnswer.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
//IntelliJ suggestion - return answer.toLowerCase().equals(userAnswer.toLowerCase()); - IntelliJ wants me to do a simpification but want to wrap my head around this

}
