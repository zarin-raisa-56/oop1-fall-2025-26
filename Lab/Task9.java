//Convert a user-entered sentence to both uppercase and lowercase.

import java.util.Scanner;

public class Task9 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ইউজার থেকে বাক্য ইনপুট নেওয়া
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Uppercase এবং Lowercase রূপান্তর
        String upper = sentence.toUpperCase();
        String lower = sentence.toLowerCase();

        // ফলাফল দেখানো
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}

    
