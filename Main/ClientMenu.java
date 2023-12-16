package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientMenu extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6;
    JLabel l1 = new JLabel("WELCOME  " + "\n" + "Mr/Mrs: " + ClientLogin.LogedName);

    public ClientMenu() {

        this.setResizable(false);
        this.setSize(800, 600);
        this.setTitle("BANK");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLocation(225, 70);
        this.setLayout(null);
        l1.setFont(new Font("osward", Font.BOLD, 20));
        l1.setBounds(10, 20, 400, 40);
        this.add(l1);

        b1 = new JButton("EDIT PERSONAL INFO");
        b1.setBounds(300, 30, 200, 50);
        b1.setForeground(Color.red);

        b2 = new JButton("DISPLAY DETAILS OF ACC");
        b2.setBounds(300, 120, 200, 50);
        b2.setForeground(Color.red);

        b3 = new JButton("MAKE TRANSICTION ");
        b3.setBounds(300, 220, 200, 50);
        b3.setForeground(Color.red);

        b4 = new JButton("SHOW TRANSICTION HIS ");
        b4.setBounds(300, 320, 200, 50);
        b4.setForeground(Color.red);

        b5 = new JButton("<<BACK ");
        b5.setBounds(300, 420, 200, 50);
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

        if (e.getSource() == b3) {
            TransactionMenu L = new TransactionMenu();
            this.setVisible(false);
        }

        if (e.getSource() == b1) {
            ClientEdit s = new ClientEdit();
            this.setVisible(false);
        }

        if (e.getSource() == b4) {
            ClientTransactions s = new ClientTransactions();
            this.setVisible(false);
        }

        if (e.getSource() == b2) {
            DisplayAccountDetails d = new DisplayAccountDetails();
            this.setVisible(false);
        }
    }
}
