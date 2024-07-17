import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CustomerInfoApp extends JFrame {

    private JTable table;
    private JTextField nameField, phoneField;
    private JButton addButton, deleteButton;

    public CustomerInfoApp() {
        super("Customer Information");

        // Create table data
        Object[][] data = {
                {1, "Chenda", "Sovisal", "092888999"},
                {2, "Lina", "092808999"},
                {3, "Chan", "Seyha", "092777666"},
        };
        String[] columnNames = {"ID", "Last Name", "First Name", "Phone Number"};

        // Create table
        table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        // Create input fields
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        nameField = new JTextField(15);
        phoneField = new JTextField(15);
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Phone:"));
        inputPanel.add(phoneField);
        add(inputPanel, BorderLayout.NORTH);

        // Create buttons
        JPanel buttonPanel = new JPanel();
        addButton = new JButton("Add");
        deleteButton = new JButton("Delete");
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Add action listeners
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String phone = phoneField.getText();

                // Add new customer to the table
                // ...
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Delete selected customer from the table
                // ...
            }
        });

        // Set frame properties
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new CustomerInfoApp();
    }
}