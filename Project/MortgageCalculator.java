package Project;
import java.util.Scanner;
public class MortgageCalculator {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Mortgage Calculator (USD) ===");

        // Input
        System.out.print("Enter loan amount (Principal in USD): ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter annual interest rate (e.g., 5.5 for 5.5%): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter loan period (in years): ");
        int years = scanner.nextInt();

        // Calculations
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int numberOfPayments = years * 12;

        // Correct mortgage formula
        double monthlyPayment = loanAmount *
                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) /
                (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        double totalPayment = monthlyPayment * numberOfPayments;
        double totalInterest = totalPayment - loanAmount;

        // Styled Output
        System.out.println("\n--- Mortgage Summary ---");
        System.out.printf("Loan Amount: USD%,.2f%n", loanAmount);
        System.out.printf("Monthly Payment: USD%,.2f%n", monthlyPayment);
        System.out.printf("Total Payment: USD%,.2f%n", totalPayment);
        System.out.printf("Total Interest: USD%,.2f%n", totalInterest);

        scanner.close();
    } 
}
