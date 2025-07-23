package restaurant.gui;

import
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainWindow extends JFrame {
    private JTextField customerField;
    private JList<MenuItem> menuList;
    private DefaultListModel<MenuItem> menuModel;
    private JTextArea receiptArea;
    private JLabel totalLabel;
    private List<MenuItem> selectedItems = new ArrayList<>();

    public MainWindow() {
        setTitle("Restaurant Bestellung");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 400);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new GridLayout(2, 1));
        customerField = new JTextField();
        topPanel.add(new JLabel("Kundenname:"));
        topPanel.add(customerField);

        menuModel = new DefaultListModel<>();
        menuModel.addElement(new MenuItem(1, "Pizza", 8.5));
        menuModel.addElement(new MenuItem(2, "Burger", 6.0));
        menuModel.addElement(new MenuItem(3, "Pasta", 7.5));
        menuModel.addElement(new MenuItem(4, "Salat", 5.0));
        menuModel.addElement(new MenuItem(5, "Suppe", 4.5));

        menuList = new JList<>(menuModel);
        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(menuList), BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        JButton addButton = new JButton("Hinzufügen");
        receiptArea = new JTextArea(8, 30);
        receiptArea.setEditable(false);
        totalLabel = new JLabel("Gesamt: 0.0 €");

        addButton.addActionListener(this::addToOrder);
        bottomPanel.add(addButton);
        bottomPanel.add(new JScrollPane(receiptArea));
        bottomPanel.add(totalLabel);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    private void addToOrder(ActionEvent e) {
        MenuItem selected = menuList.getSelectedValue();
        if (selected != null) {
            selectedItems.add(selected);
            updateReceipt();
        }
    }

    private void updateReceipt() {
        String customer = customerField.getText().trim();
        String receipt = "Quittung für " + customer + "\n";
        receipt += selectedItems.stream().map(MenuItem::toString).collect(Collectors.joining("\n"));
        double total = selectedItems.stream().mapToDouble(MenuItem::getPrice).sum();
        receipt += "\nGesamt: " + total + " €";
        receiptArea.setText(receipt);
        totalLabel.setText("Gesamt: " + total + " €");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainWindow().setVisible(true));
    }
}
