public class LinearSearch {
    public static Product search(Product[] products, String targetProductId) {
        for (Product product : products) {
            if (product.getProductId().equals(targetProductId)) {
                return product;
            }
        }
        return null;
    }
}
