package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Main.Main.clients;

public class TransactionMenu extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7;
    Client s = new Client();
    JLabel l1 = new JLabel("WELCOME  " + "\n" + "Mr/Mrs: " + ClientLogin.LogedName);

    public TransactionMenu() {

        this.setResizable(false);
        this.setSize(800, 600);
        this.setTitle("BANK");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(225, 70);
        this.setLayout(null);
        l1.setFont(new Font("osward", Font.BOLD, 20));
        l1.setBounds(10, 20, 400, 40);
        this.add(l1);

        b1 = new JButton("DIPOSIT");
        b1.setBounds(300, 10, 200, 50);
        b1.setForeground(Color.red);

        b2 = new JButton("WITHDRAWAL");
        b2.setBounds(300, 100, 200, 50);
        b2.setForeground(Color.red);

        b3 = new JButton("TRANSFER");
        b3.setBounds(300, 200, 200, 50);
        b3.setForeground(Color.red);

        b4 = new JButton("LOANS");
        b4.setBounds(300, 300, 200, 50);
        b4.setForeground(Color.red);

        b6 = new JButton("<< BACK");
        b6.setBounds(300, 500, 200, 50);
        b6.setForeground(Color.red);

        b5 = new JButton("Request Evaluation ");
        b5.setBounds(300, 400, 200, 50);
        b5.setForeground(Color.red);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);

        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b6) {
            ClientMenu m = new ClientMenu();
            this.setVisible(false);
        }

        if (e.getSource() == b1) {
            Deposit m = new Deposit();
            this.setVisible(false);
        }

        if (e.getSource() == b2) {
            for (Client c : clients) {
                String str = Integer.toString(c.getClient_id());
                if (str.equals(ClientLogin.logedID())) {

                    s = c;
                }
            }

            if (s.getAcc_Type().equals("S")) {
                SavingWithdrawal S = new SavingWithdrawal();
                this.setVisible(false);
            }

            if (s.getAcc_Type().equals("C")) {
                CurrentWithdrawal s = new CurrentWithdrawal();
                this.setVisible(false);
            }

        }
        if (e.getSource() == b3) {
            Transfer S = new Transfer();
            this.setVisible(false);
        }

        if (e.getSource() == b5) {

            for (Client c : clients) {

                String str = Integer.toString(c.getClient_id());
                if (str.equals(ClientLogin.logedID())) {
                    s = c;
                }
            }
            if (s.getAcc_Type().equals("S")) {

                EvaluationRequest s = new EvaluationRequest();
                this.setVisible(false);
            }
            if (s.getAcc_Type().equals("C")) {
                JOptionPane.showMessageDialog(this, "YOU DONT HAVE ACCSESS (SAVIN ACC ONLY)", "INFO ", JOptionPane.ERROR_MESSAGE);
            }

        }
        if (e.getSource() == b4) {
            LoansGui q = new LoansGui();
            this.setVisible(false);
        }

    }

}
