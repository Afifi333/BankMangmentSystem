package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Main.Main.clients;

public class EmployeeEditClient extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    JLabel j1, j2, j3, j4, j5, j9;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12;
    Client cc = new Client();
    boolean is = false;
    int id;
    public EmployeeEditClient() {

        j9 = new JLabel("ENTER ID");
        j9.setFont(new Font("osward", Font.BOLD, 23));
        j9.setBounds(10, 10, 300, 20);
        this.add(j9);
        t9 = new JTextField();
        t9.setBounds(130, 10, 300, 30);
        b1 = new JButton("SEARCH");
        b2 = new JButton("<<BACK");
        b1.setBounds(500, 10, 100, 40);
        b2.setBounds(500, 60, 100, 40);
        this.add(b1);
        this.add(b2);
        b3 = new JButton("EDIT");
        b3.setBounds(500, 400, 100, 40);
        this.add(b3);
        b3.addActionListener(this);
        b2.addActionListener(this);
        b1.addActionListener(this);
        this.setResizable(false);
        this.setSize(700, 600);
        this.setTitle("BANK");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(225, 65);
        this.setLayout(null);
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();
        t7 = new JTextField();
        t8 = new JTextField();

        j1 = new JLabel("Fname");
        j2 = new JLabel("Lname");
        j3 = new JLabel("Email");
        j4 = new JLabel("Phone");
        j5 = new JLabel("State");

        j1.setFont(new Font("osward", Font.BOLD, 18));
        j1.setForeground(Color.BLACK);
        j1.setBounds(10, 100, 400, 40);
        this.add(j1);
        j2.setFont(new Font("osward", Font.BOLD, 18));
        j2.setForeground(Color.BLACK);
        j2.setBounds(10, 150, 400, 40);
        this.add(j2);
        j3.setForeground(Color.BLACK);
        j3.setFont(new Font("osward", Font.BOLD, 18));
        j3.setBounds(10, 200, 400, 40);
        this.add(j3);
        j4.setForeground(Color.BLACK);
        j4.setFont(new Font("osward", Font.BOLD, 18));
        j4.setBounds(10, 250, 400, 40);
        this.add(j4);
        j5.setForeground(Color.BLACK);
        j5.setFont(new Font("osward", Font.BOLD, 18));
        j5.setBounds(10, 300, 400, 40);
        this.add(j5);

        t1.setBounds(100, 100, 300, 30);
        t2.setBounds(100, 150, 300, 30);
        t3.setBounds(100, 200, 300, 30);
        t4.setBounds(100, 250, 300, 30);
        t5.setBounds(100, 300, 300, 30);
        j1.setVisible(false);
        j2.setVisible(false);
        j3.setVisible(false);
        j4.setVisible(false);
        j5.setVisible(false);
        this.add(t9);

        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

            if (e.getSource() == b1) {
                for (Client c : clients) {
                    id = Integer.parseInt(t9.getText());
                    if (id == c.getClient_id()) {
                        cc = c;
                        is = true;
                    }

                }
                if (is) {
                    t1.setText(cc.FirstName);
                    t2.setText(cc.LastName);
                    t3.setText(cc.Email);
                    t4.setText(cc.phoneNumber);
                    t5.setText(cc.getAcc_state());

                    // t8.setText("");
                    this.add(t1);
                    this.add(t2);
                    this.add(t3);
                    this.add(t4);
                    this.add(t5);

                    j1.setVisible(true);
                    j2.setVisible(true);
                    j3.setVisible(true);
                    j4.setVisible(true);
                    j5.setVisible(true);

                    //  this.add(j8);
                } else {
                    JOptionPane.showMessageDialog(this, "ACCOUNT NOT FOUND", "INFO ", JOptionPane.ERROR_MESSAGE);
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                }

            }


        if (e.getSource() == b3) {
           Employee.EmployeeEditClient(cc,t1,t2,t3,t4,t5);

            EmployeeMenu s = new EmployeeMenu();
            this.setVisible(false);
        }
        if (e.getSource() == b2) {
            EmployeeMenu s = new EmployeeMenu();
            this.setVisible(false);
        }

    }
}
