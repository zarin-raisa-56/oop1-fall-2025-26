package Project;
import java.util.Scanner;

public class MortgageCalculatorUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input: Loan amount, interest rate, loan term
        System.out.print("Enter loan amount (USD): ");
        double loanAmount = input.nextDouble();

        System.out.print("Enter annual interest rate (e.g. 6.5 for 6.5%): ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter loan term (in years): ");
        int loanTermYears = input.nextInt();

        // Convert annual interest rate to monthly and calculate number of payments
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int numberOfPayments = loanTermYears * 12;

        // Monthly payment formula
        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        // Total payment and interest
        double totalPayment = monthlyPayment * numberOfPayments;
        double totalInterest = totalPayment - loanAmount;

        // Output summary
        System.out.println("\n== Mortgage Summary ==");
        System.out.printf("Loan Amount: USD%.2f\n", loanAmount);
        System.out.printf("Monthly Payment: USD%.2f\n", monthlyPayment);
        System.out.printf("Total Payment: USD%.2f\n", totalPayment);
        System.out.printf("Total Interest: USD%.2f\n", totalInterest);
    }
}
