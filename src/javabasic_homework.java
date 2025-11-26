import java.util.Scanner;

public class javabasic_homework {
    public static void main(String[] args) {
        String studentName ;
        int score;
        int age;

        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter your name : ");
        studentName = userInput.nextLine();

        System.out.print("Please enter your score (0-100) : ");
        score = userInput.nextInt();

        System.out.print("Please enter your age : ");
        age = userInput.nextInt();


        //Show Title
        System.out.println("-----------Student Result-----------");

        //Show student name
        System.out.println("Name: " + studentName);

        //Show score
        System.out.println("Score: " + score);

        //Check score grade and show grade
        if(score >= 90){
            System.out.println("Grade: A");
        }else if(score >= 80){
            System.out.println("Grade: B");
        }else if (score >= 70){
            System.out.println("Grade: C");
        }else if (score >= 60){
            System.out.println("Grade: D");
        }else{
            System.out.println("Grade: E");
        }

        //Check age and show age
        if(age < 18){
            System.out.println("Status: Minor Student");
        }
        else{
            System.out.println("Status: Adult Student");
        }



    }
}
