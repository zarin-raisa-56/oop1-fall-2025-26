//Generate a product code by joining the product name and ID.
package lab;
public class ProductCodeGenerator {
    public static void main(String[] args) {
        String productName = "Misti";
        int productID = 1025;

        String productCode = productName + "-" + productID;

        System.out.println("Product Code: " + productCode);
    }
}
