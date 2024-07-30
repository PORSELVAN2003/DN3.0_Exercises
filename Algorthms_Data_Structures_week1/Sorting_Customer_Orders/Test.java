public class Test {
    public static void main(String[] args) {

        Order[] orders = {
            new Order("O001", "Arnab", 2050.50),
            new Order("O002", "Rohit", 1500.75),
            new Order("O003", "Virat", 3000.00),
            new Order("O004", "Dhoni", 2000.25)
        };

        System.out.println("Original Orders:");
        for (Order order : orders) {
            System.out.println(order);
        }

        BubbleSort.sort(orders);
        System.out.println("\nBubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        orders = new Order[]{
            new Order("O001", "Arnab", 2050.50),
            new Order("O002", "Rohit", 1500.75),
            new Order("O003", "Virat", 3000.00),
            new Order("O004", "Dhoni", 2000.25)
        };

        QuickSort.sort(orders, 0, orders.length - 1);
        System.out.println("\nQuick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
