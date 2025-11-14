package Project;
import java.util.Scanner;
public class MortgageCalculator2 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salary = 0;
        while (true) {
            System.out.print("Enter your monthly salary (USD): ");
            if (scanner.hasNextDouble()) {
                salary = scanner.nextDouble();
                if (salary > 0) break;
            } else {
                scanner.next(); // clear invalid input
            }
            System.out.println("Invalid input! Please enter a numeric value.");
        }

        int creditScore = 0;
        while (true) {
            System.out.print("Enter your credit score (300-500): ");
            if (scanner.hasNextInt()) {
                creditScore = scanner.nextInt();
                if (creditScore >= 300 && creditScore <= 500) {
                    break;
                } else {
                    System.out.println("Credit score must be between 300 and 500.");
                }
            } else {
                scanner.next();
                System.out.println("Invalid input! Please enter a numeric value.");
            }
        }

        System.out.print("Do you have a criminal record (true/false): ");
        boolean criminalRecord = scanner.nextBoolean();
        if (criminalRecord) {
            System.out.println("Loan denied due to criminal record.");
            return;
        }

        System.out.print("Enter your desired loan amount (USD): ");
        double loanAmount = scanner.nextDouble();
        if (loanAmount > salary * 2) {
            System.out.println("Loan amount must be under 2 times your salary.");
            return;
        }

        System.out.print("Enter annual interest rate (in %): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter loan period in years: ");
        int loanPeriodYears = scanner.nextInt();

        // Monthly mortgage calculation
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int numberOfPayments = loanPeriodYears * 12;
        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        System.out.printf("Monthly Mortgage payment: USD %.2f\n", monthlyPayment);
    }
} 

