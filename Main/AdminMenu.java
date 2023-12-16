package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Main.Main.clients;
import static Main.Main.employees;

public class AdminMenu extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5;
    JLabel l1 = new JLabel("WELCOME ADMIN");

    public AdminMenu() {

        this.setResizable(false);
        this.setSize(800, 525);
        this.setTitle("BANK");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(225, 100);
        this.setLayout(null);
        l1.setFont(new Font("osward", Font.BOLD, 20));
        l1.setBounds(20, 10, 450, 50);
        this.add(l1);

        b1 = new JButton("SIGN UP  Employee");
        b1.setBounds(300, 10, 200, 50);
        b1.setForeground(Color.red);
        b2 = new JButton("DISPLAY ALL EMPlOYees");
        b2.setBounds(300, 100, 200, 50);
        b2.setForeground(Color.red);

        b3 = new JButton("DISPLAY ALL CLIENTS");
        b3.setBounds(300, 200, 200, 50);
        b3.setForeground(Color.red);

        b4 = new JButton("SHOW ALL TRANSICTIONS");
        b4.setBounds(300, 300, 200, 50);
        b4.setForeground(Color.red);

        b5 = new JButton("<< BACK ");
        b5.setBounds(300, 400, 200, 50);
        b5.setForeground(Color.red);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b5) {
            Menu m = new Menu();
            this.setVisible(false);
        }
        if (e.getSource() == b1) {
            EmployeeSignUp k = new EmployeeSignUp();
            this.setVisible(false);
        }
        if (e.getSource() == b2) {
            DisplayAllEmployees f = new DisplayAllEmployees(employees);
            this.setVisible(false);
        }
        if (e.getSource() == b3) {
            DisplayAllClients d = new DisplayAllClients(clients);
            this.setVisible(false);
        }
        if (e.getSource() == b4) {
            ShowAllTransactions a = new ShowAllTransactions();
            this.setVisible(false);
        }
    }
}
