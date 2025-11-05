//Convert Celsius to Fahrenheit temparature without any  logical checks.

package lab;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + "C is equal to " + fahrenheit + "F");

        input.close(); 
    }
}
