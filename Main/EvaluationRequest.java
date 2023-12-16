package Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Main.Main.clients;

public class EvaluationRequest extends JFrame implements ActionListener {

    private final double interestRate = 0.025;
    JButton b1, b2;
    JLabel j1;
    JTextField t1;
    Client s = new Client();

    public EvaluationRequest() {
        this.setResizable(false);
        this.setSize(700, 350);
        this.setTitle("BANK");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(225, 200);
        this.setLayout(null);

        b1 = new JButton("REQUEST EVALUATION");
        b2 = new JButton("<<BACK");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b1.setBounds(250, 70, 200, 60);
        b2.setBounds(250, 160, 200, 60);

        this.add(b1);
        this.add(b2);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
          Saving.EvaluationRequest(s,interestRate);

        }

        if (e.getSource() == b2) {
            TransactionMenu y = new TransactionMenu();
            this.setVisible(false);

        }

    }
}
