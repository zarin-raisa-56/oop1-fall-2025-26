package Project;

import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Mortgage Calculator (USD) ===");

        // Input: Principal
        System.out.print("Enter loan amount (Principal in USD): ");
        double principal = scanner.nextDouble();

        // Input: Annual Interest Rate
        System.out.print("Enter annual interest rate (e.g., 6.5 for 6.5%): ");
        double annualRate = scanner.nextDouble();

        // Input: Loan Term in Years
        System.out.print("Enter loan period (in years): ");
        int years = scanner.nextInt();

        // Convert annual rate to monthly rate
        double monthlyRate = annualRate / 100 / 12;

        // Total number of payments
        int numberOfPayments = years * 12;

        // Mortgage formula
        double monthlyPayment = principal * 
            (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) /
            (Math.pow(1 + monthlyRate, numberOfPayments) - 1);

        // Total payment and interest
        double totalPayment = monthlyPayment * numberOfPayments;
        double totalInterest = totalPayment - principal;

        // Output
        System.out.println("\n--- Mortgage Summary ---");
        System.out.printf("Loan Amount: USD%,.2f%n", principal);
        System.out.printf("Monthly Payment: USD%,.2f%n", monthlyPayment);
        System.out.printf("Total Payment: USD%,.2f%n", totalPayment);
        System.out.printf("Total Interest: USD%,.2f%n", totalInterest);

        scanner.close();
    }
}
