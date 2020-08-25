import java.util.Scanner;
// Debugging exercise. Java Boot Camp.
//Gil Silva

public class Conditional {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //added new
        int testScore;  //added int data type and camelCase name
        char grade;

        System.out.println("Enter your test score: ");
        testScore = input.nextInt();

        if (testScore >= 90) {
            grade = 'A';
        } else if (testScore >= 80) {
            grade = 'B';
        } else if (testScore >= 70) {
            grade = 'C';
        } else if (testScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}

