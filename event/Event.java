package event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Event extends JFrame {
    // ១. ប្រកាស Variable នៅខាងក្រៅ Method ដើម្បីឱ្យ UI មើលឃើញ
    JTextField txtNum1, txtNum2;
    JButton btnAdd;

    public Event() {
        // ២. រៀបចំ UI (Setup Window)
        setTitle("Calculator");
        setSize(1700, 930);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ៣. បង្កើត Object ពិតប្រាកដ (New Objects)
        txtNum1 = new JTextField(10);
        txtNum2 = new JTextField(10);
        btnAdd = new JButton("Add");

        // ៤. ដាក់ចូលទៅក្នុង Window
        add(new JLabel("Number 1:"));
        add(txtNum1);
        add(new JLabel("Number 2:"));
        add(txtNum2);
        add(btnAdd);

        // ៥. បង្កើត Event ពេលចុចប៊ូតុង
        btnAdd.addActionListener(e -> {
            processAddition(); // ហៅទៅកាន់ការបូកលេខ
        });
    }

    private void processAddition() {
        try {
            // ទាញយកអត្ថបទពី TextField ប្តូរជាលេខ
            int num1 = Integer.parseInt(txtNum1.getText());
            int num2 = Integer.parseInt(txtNum2.getText());
            int sum = num1 + num2;

            JOptionPane.showMessageDialog(this, "Sum: " + sum);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "សូមបញ្ចូលតែលេខប៉ុណ្ណោះ!");
        }
    }

    public static void main(String[] args) {
        new Event().setVisible(true); // បង្ហាញ Window
    }
}
