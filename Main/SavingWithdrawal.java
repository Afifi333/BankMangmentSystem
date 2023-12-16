package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Main.Main.clients;
import static Main.Main.transactions;

public class SavingWithdrawal extends JFrame implements ActionListener {

    JButton b1, b2;
    JLabel j1, j2;
    JTextField t1;
    Client s = new Client();

    public SavingWithdrawal() {
        this.setResizable(false);
        this.setSize(700, 300);
        this.setTitle("BANK");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(225, 200);
        this.setLayout(null);

        j1 = new JLabel("ENTER AMOUNT : ");
        j1.setFont(new Font("osward", Font.BOLD, 18));
        j1.setForeground(Color.BLACK);
        j1.setBounds(10, 10, 400, 40);

        j2 = new JLabel(" Saving");
        j2.setFont(new Font("osward", Font.BOLD, 18));
        j2.setForeground(Color.BLACK);
        j2.setBounds(500, 10, 400, 40);

        b1 = new JButton("CONFIRM");
        b1.addActionListener(this);
        b1.setBounds(200, 150, 100, 50);

        b2 = new JButton("<<BACK");
        b2.addActionListener(this);
        b2.setBounds(360, 150, 100, 50);

        t1 = new JTextField();
        t1.setBounds(150, 60, 200, 40);

        this.add(j1);
        this.add(j2);
        this.add(t1);
        this.add(b1);
        this.add(b2);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
           Saving a=new Saving();
           a.Withdrawl(s,t1);
        }

        if (e.getSource() == b2) {
            TransactionMenu s = new TransactionMenu();
            this.setVisible(false);
        }

    }
}
