package restaurant;

import java.util.*;

public class RestaurantApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<MenuItem> menu = List.of(
            new MenuItem(1, "Pizza Margherita", 8.5),
            new MenuItem(2, "Lasagne", 9.0),
            new MenuItem(3, "Spaghetti Bolognese", 8.0),
            new MenuItem(4, "Salat", 5.5),
            new MenuItem(5, "Tiramisu", 4.5)
        );

        System.out.println("📋 Willkommen beim Java-Restaurant!");
        for (MenuItem item : menu) {
            System.out.println(item);
        }

        System.out.print("Geben Sie Ihren Namen ein: ");
        String name = scanner.nextLine();
        Order order = new Order(name);

        boolean ordering = true;
        while (ordering) {
            System.out.print("Geben Sie die ID des gewünschten Gerichts ein: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Enter entfernen

            menu.stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .ifPresent(order::addItem);

            System.out.print("Möchten Sie ein weiteres Gericht bestellen? (ja/nein): ");
            String response = scanner.nextLine();
            ordering = response.equalsIgnoreCase("ja");
        }

        order.printReceipt();
        scanner.close();
    }
}