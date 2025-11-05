//Combine a customer's first and last name into a single formatted full name.
package lab;

public class Task5 {
    public static void main(String[] args) {
        String firstName = "Ayesha";
        String lastName = "Rahman";

        String fullName = formatFullName(firstName, lastName);

        System.out.println("Full Name: " + fullName);
    }

    public static String formatFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
