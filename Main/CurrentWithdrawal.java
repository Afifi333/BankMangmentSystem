package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Main.Main.clients;
import static Main.Main.transactions;

public class CurrentWithdrawal extends JFrame implements ActionListener {

    private static final double MIN_BALANCE = 3000;
    private static final double FEE = 50;
    JButton b1, b2;
    JLabel j1, j2;
    JTextField t1;
    Client cc = new Client();

    public CurrentWithdrawal() {

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
        b1 = new JButton("CONFIRM");
        b2 = new JButton("<<BACK");
        t1 = new JTextField();
        j2 = new JLabel("current");
        j2.setFont(new Font("osward", Font.BOLD, 18));
        j2.setForeground(Color.BLACK);
        j2.setBounds(500, 10, 400, 40);
        this.add(j2);

        t1.setBounds(150, 60, 200, 40);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b1.setBounds(200, 150, 100, 50);
        b2.setBounds(360, 150, 100, 50);

        this.add(j1);
        this.add(t1);
        this.add(b1);
        this.add(b2);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
       Current q= new Current();
            q.Withdrawl(cc,t1,MIN_BALANCE,FEE);

        }
        if (e.getSource() == b2) {
            TransactionMenu s = new TransactionMenu();
            this.setVisible(false);
        }

    }

}
