import java.util.Arrays;

public class BinarySearch {
    public static Product search(Product[] products, String targetProductId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].getProductId().equals(targetProductId)) {
                return products[mid];
            }
            if (products[mid].getProductId().compareTo(targetProductId) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
