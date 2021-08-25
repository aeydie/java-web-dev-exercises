package Studios.FunWithQuizzesStudio7;

public class CheckBoxQuestion extends Question {

    public CheckBoxQuestion(String question, String answer) {
//        calling from abstract class
        super(question, answer);
    }

//    public boolean checkAnswer(String answer) {
//        answers can be a,b,c
        @Override
        public boolean checkAnswer(String answer) {

            String userinput = this.getAnswer();
            if (answer.toLowerCase().equals(userinput.toLowerCase())) {
                return true;
            } else {
                return false;
            }
        }


}

