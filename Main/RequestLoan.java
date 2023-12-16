package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Main.Main.clients;

public class RequestLoan extends JFrame implements ActionListener {

    private final double interestRate = 0.025;
    JLabel l1;
    JTextField t;

    JButton b1, b2;
    Client cc = new Client();

    public RequestLoan() {
        this.setResizable(false);
        this.setSize(700, 350);
        this.setTitle("BANK");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(225, 200);
        this.setLayout(null);

        l1 = new JLabel("ENTER LOAN AMOUNT");
        t = new JTextField();
        b1 = new JButton("CONFIRM");
        b2 = new JButton("<<BACK");
        l1.setFont(new Font("osward", Font.BOLD, 20));
        l1.setBounds(10, 20, 300, 40);
        t.setBounds(250, 20, 200, 40);
        this.add(t);
        this.add(l1);
        b1.setBounds(200, 80, 100, 40);
        b2.setBounds(400, 80, 100, 40);
        b1.addActionListener(this);
        b2.addActionListener(this);
        this.add(b1);
        this.add(b2);
        this.setVisible(true);

    }

    static double amount1;
    static double getAMOUNT1() {
        return amount1;

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            Loan.RequestLoan(cc,cc.getInstalmment(),interestRate,t);

            TransactionMenu s = new TransactionMenu();
            this.setVisible(false);

        }

        if (e.getSource() == b2) {
            LoansGui s = new LoansGui();
            this.setVisible(false);

        }

    }



}
