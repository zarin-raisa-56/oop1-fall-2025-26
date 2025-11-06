//a teacher enters the score of three students..write a program to calculate and display the average score with two decimal places.
import java.util.Scanner;
public class Task1 {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter score of Student 1: ");
        double score1 = input.nextDouble();

        System.out.print("Enter score of Student 2: ");
        double score2 = input.nextDouble();

        System.out.print("Enter score of Student 3: ");
        double score3 = input.nextDouble();

        
      double average = (score1 + score2 + score3) / 3;

        
        System.out.printf("Average score: %.2f\n", average);

        input.close();
    }  
}