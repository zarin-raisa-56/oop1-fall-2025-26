//A store gives a 15% discount  on an item that costs  $250.Find the final price after discount .

public class Task2 {
    public static void main(String[] args) {
        double originalPrice = 250.0;
        double discountRate = 15.0;

        double discountAmount = (discountRate / 100) * originalPrice;
        double finalPrice = originalPrice - discountAmount;

        System.out.println("Original Price: $" + originalPrice);
        System.out.println("Discount: $" + discountAmount);
        System.out.println("Final Price after Discount: $" + finalPrice);
    }
}
