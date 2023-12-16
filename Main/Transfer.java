package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Main.Main.clients;
import static Main.Main.transactions;

public class Transfer extends JFrame implements ActionListener {

    JButton b1, b2;
    JLabel j1, j2;
    JTextField t1, t2;

    public Transfer() {
        this.setResizable(false);
        this.setSize(700, 300);
        this.setTitle("BANK");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(225, 200);
        this.setLayout(null);
        j1 = new JLabel("ENTER RECIEVER ID : ");
        b1 = new JButton("CONFIRM");
        b2 = new JButton("<<BACK");
        t1 = new JTextField();
        j1.setFont(new Font("osward", Font.BOLD, 18));
        j1.setForeground(Color.BLACK);
        j1.setBounds(10, 10, 400, 40);

        j2 = new JLabel("ENTER AMOUNT : ");
        j2.setFont(new Font("osward", Font.BOLD, 18));
        j2.setForeground(Color.BLACK);
        j2.setBounds(10, 60, 400, 40);

        t2 = new JTextField();
        t2.setBounds(210, 70, 200, 30);

        t1.setBounds(250, 20, 200, 30);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b1.setBounds(200, 150, 100, 50);
        b2.setBounds(360, 150, 100, 50);

        this.add(j1);
        this.add(t1);
        this.add(b1);
        this.add(b2);
        this.add(t2);
        this.add(j2);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
           Transactions.Transfer(t1,t2);

        }
        if (e.getSource() == b2) {
            TransactionMenu s = new TransactionMenu();
            this.setVisible(false);
        }

    }

}
