import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "What is the capital of India?",
            "Which planet is known as the Red Planet?",
            "How many days are there in a leap year?",
            "How many days are there in a week"
        };

        String[] answers = {
            "Delhi",
            "Mars",
            "366",
            "7"
        };
        int score=0;
        System.out.println("=========QUIZ APPLICATION===========");
        for(int i=0;i<questions.length;i++)
        {
            System.out.println("\nQuestion 1: "+(i+1)+" "+questions[i]);
            System.out.println("Your Answer");
            String useranswer=sc.nextLine();
            if(useranswer.equalsIgnoreCase(answers[i]))
            {
                System.out.println("Correct Answer");
                score++;
            }
            else{
                System.out.println("Incorrect Answers");
                System.out.println("Correct Answer "+answers[i]);
            }
        }
        System.out.println("=====RESULT=====");
        if(score==questions.length)
            System.out.println("Excellent");
        else if (score >= 2) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Practicing!");
        }
        System.out.println("The Score is "+score+"/"+questions.length);
        sc.close();
    }}
