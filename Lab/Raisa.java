
        package lab;
        public class Raisa {
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
