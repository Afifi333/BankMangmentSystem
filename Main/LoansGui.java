package Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Main.Main.clients;

public class LoansGui extends JFrame implements ActionListener {

    JButton b1, b2, b3;
    Client cc = new Client();

    public LoansGui() {

        this.setResizable(false);
        this.setSize(700, 350);
        this.setTitle("BANK");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(225, 200);
        this.setLayout(null);
        b1 = new JButton("REQUEST LOAN");
        b2 = new JButton("PAY LOAN");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3 = new JButton("<<BACK ");
        b3.addActionListener(this);
        b1.setBounds(250, 30, 200, 60);
        b2.setBounds(250, 115, 200, 60);
        b3.setBounds(250, 210, 200, 60);

        this.add(b1);
        this.add(b2);
        this.add(b3);

        for (Client c : clients) {
            String str = Integer.toString(c.getClient_id());

            if (str.equals(ClientLogin.logedID())) {
                cc = c;
            }
        }
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            if (cc.getDebt() == 0) {
                RequestLoan s = new RequestLoan();
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "YOU HAVE TO PAY YOUR INSTALLMENTS FIRST", "INFO ", JOptionPane.ERROR_MESSAGE);

            }
        }
        if (e.getSource() == b2) {
            Loan.PayLoan(cc);
        }

        if (e.getSource() == b3) {
            TransactionMenu s = new TransactionMenu();
            this.setVisible(false);

        }

    }
}
