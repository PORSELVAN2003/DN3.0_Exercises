import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        
        Product[] products = {
            new Product("P001", "Television", "Electronics"),
            new Product("P002", "Laptop", "Electronics"),
            new Product("P003", "Headphone", "Accessories")
        };

        String productId="P002";
        System.out.println("Product to be search : Product ID = "+productId);

        Product foundProductLinear = LinearSearch.search(products, productId);
        System.out.println("[Linear Search] " + (foundProductLinear != null ? foundProductLinear : "Product not found"));

        Arrays.sort(products, (a, b) -> a.getProductId().compareTo(b.getProductId()));

        Product foundProductBinary = BinarySearch.search(products, productId);
        System.out.println("[Binary Search] " + (foundProductBinary != null ? foundProductBinary : "Product not found"));
    }
}
