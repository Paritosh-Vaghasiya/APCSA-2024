package QuizGame;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        ArrayList<Question> list = new ArrayList<>();
        Question q1 = new Question("What Country is this? (Abbreviation, Caps)", "USA");
        list.add(q1);
        Question q2 = new Question("What is 2+4?", "8");
        list.add(q2);
        Question q3 = new Question("What is the Schools name? (Abbreviation, Caps)", "SHS");
        list.add(q3);
        Question q4 = new Question("What is 2*6?", "12");
        list.add(q4);
        Question q5 = new Question("What is 5*10", "50");
        list.add(q5);
        int score = 0;

        Collections.shuffle(list);

        for (Question question : list) {
            Scanner scan = new Scanner(System.in);
            System.out.println(question.getQuestion());
            String answer = scan.nextLine();
            if (answer.equals(question.getAnswer())) {
                System.out.println("Correct");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("Your score: " + score+"/5");
    }
}
