import java.util.*;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Subjects;
        int totalScore = 0;
        int averageScore;

        System.out.print("Enter the number of subjects: ");
        Subjects = sc.nextInt();

        // Ask user for scores in each subject
        for (int i = 1; i <= Subjects; i++) {
            System.out.print("Enter the score for Subject " + i + ": ");
            totalScore += sc.nextInt();
        }

        averageScore = totalScore / Subjects;

        System.out.println("Average Score: " + averageScore);
        if (averageScore >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

    }
}