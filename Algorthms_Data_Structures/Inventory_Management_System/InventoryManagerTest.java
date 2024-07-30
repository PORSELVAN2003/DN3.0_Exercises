public class InventoryManagerTest {
    public static void main(String[] args) {

        InventoryManager inventoryManager = new InventoryManager();

        Product product1 = new Product("P01", "Television", 5, 9999.99);
        Product product2 = new Product("P02", "Laptop", 2, 49999.99);
 
        inventoryManager.addProduct(product1);
        inventoryManager.addProduct(product2);
        
        System.out.println("Inventory after adding products:");
        inventoryManager.displayAllProducts();

        Product updatedProduct1 = new Product("P02", "Laptop", 3, 54999.99);
        inventoryManager.updateProduct(updatedProduct1);

        System.out.println("\nInventory after updating product:");
        inventoryManager.displayAllProducts();

        inventoryManager.deleteProduct("P02");

        System.out.println("\nInventory after deleting a product:");
        inventoryManager.displayAllProducts();
    }
}
