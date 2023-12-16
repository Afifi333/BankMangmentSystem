package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {

    JButton b1, b2, b3;
    JLabel text1 = new JLabel("WELCOME TO BANK");

    public Menu() {

        this.setResizable(false);
        this.setSize(800, 450);
        this.setTitle("MENU");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(225, 100);

        text1.setFont(new Font("osward", Font.BOLD, 38));
        text1.setBounds(200, 40, 400, 40);

        this.add(text1);
        this.setLayout(null);
        this.add(text1);

        b1 = new JButton("ADMIN");
        b2 = new JButton("EMPLOYEE");
        b3 = new JButton("CLIENT");

        b1.setBounds(200, 100, 400, 40);
        b2.setBounds(200, 150, 400, 40);
        b3.setBounds(200, 200, 400, 40);

        this.add(b1);
        this.add(b2);
        this.add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {

            adminLogin ss = new adminLogin();
            this.setVisible(false);
        }

        if (e.getSource() == b2) {

            EmployeeLogin sc = new EmployeeLogin();
            this.setVisible(false);
        }

        if (e.getSource() == b3) {

            ClientLogin k = new ClientLogin();
            this.setVisible(false);
        }
    }
}
