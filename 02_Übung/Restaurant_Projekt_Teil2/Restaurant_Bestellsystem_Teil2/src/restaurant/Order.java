package restaurant;

import java.util.ArrayList;
import java.util.List;

/**
 * Verwaltung der Kundenbestellung.
 */
public class Order {
    private String customerName;
    private List<MenuItem> items;

    public Order(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(MenuItem::getPrice).sum();
    }

    public void printReceipt() {
        System.out.println("Quittung für: " + customerName);
        for (MenuItem item : items) {
            System.out.println("- " + item.getName() + ": €" + item.getPrice());
        }
        System.out.println("Gesamtsumme: €" + calculateTotal());
    }
}