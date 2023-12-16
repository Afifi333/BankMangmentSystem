package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Main.Main.clients;

public class ClientSignUp extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    JLabel j1, j2, j3, j4, j5, j6, j7, j8, j9, j10;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9;

    public ClientSignUp() {

        j10 = new JLabel("SIGN UP");
        j10.setFont(new Font("osward", Font.BOLD, 28));
        j10.setBounds(310, 10, 300, 27);
        this.add(j10);

        b1 = new JButton("CREATE");
        b2 = new JButton("BACK");
        b1.setBounds(200, 470, 100, 40);
        b2.setBounds(400, 470, 100, 40);
        this.add(b1);
        this.add(b2);

        this.setResizable(false);
        this.setSize(700, 600);
        this.setTitle("BANK");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(225, 20);
        this.setLayout(null);

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();
        t7 = new JTextField();
        t8 = new JTextField();
        t9 = new JTextField();

        j1 = new JLabel("Fname");
        j2 = new JLabel("Lname");
        j3 = new JLabel("Email");
        j4 = new JLabel("Password");
        j5 = new JLabel("Phone");
        j6 = new JLabel("Balance");
        j7 = new JLabel("State");
        j8 = new JLabel("Type");

        j1.setFont(new Font("osward", Font.BOLD, 18));
        j1.setForeground(Color.BLACK);
        j1.setBounds(10, 46, 400, 40);
        this.add(j1);

        j2.setFont(new Font("osward", Font.BOLD, 18));
        j2.setForeground(Color.BLACK);
        j2.setBounds(10, 96, 400, 40);
        this.add(j2);

        j3.setForeground(Color.BLACK);
        j3.setFont(new Font("osward", Font.BOLD, 18));
        j3.setBounds(10, 146, 400, 40);
        this.add(j3);

        j4.setForeground(Color.BLACK);
        j4.setFont(new Font("osward", Font.BOLD, 18));
        j4.setBounds(10, 196, 400, 40);
        this.add(j4);

        j5.setForeground(Color.BLACK);
        j5.setFont(new Font("osward", Font.BOLD, 18));
        j5.setBounds(10, 246, 400, 40);
        this.add(j5);

        j6.setForeground(Color.BLACK);
        j6.setFont(new Font("osward", Font.BOLD, 18));
        j6.setBounds(10, 296, 400, 40);
        this.add(j6);

        j7.setForeground(Color.BLACK);
        j7.setFont(new Font("osward", Font.BOLD, 18));
        j7.setBounds(10, 346, 400, 40);
        this.add(j7);

        j8.setForeground(Color.BLACK);
        j8.setFont(new Font("osward", Font.BOLD, 18));
        j8.setBounds(10, 396, 400, 40);
        this.add(j8);

        t1.setBounds(100, 50, 300, 30);
        t2.setBounds(100, 100, 300, 30);
        t3.setBounds(100, 150, 300, 30);
        t4.setBounds(100, 200, 300, 30);
        t5.setBounds(100, 250, 300, 30);
        t6.setBounds(100, 300, 300, 30);
        t7.setBounds(100, 350, 300, 30);
        t8.setBounds(100, 400, 300, 30);

        this.add(t1);
        this.add(t2);
        this.add(t3);
        this.add(t4);
        this.add(t5);
        this.add(t6);
        this.add(t7);
        this.add(t8);

        b1.addActionListener(this);
        b2.addActionListener(this);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {

          Employee.ClientSignUp(t1,t2,t3,t4,t5,t6,t7,t8);
            EmployeeMenu s = new EmployeeMenu();
            this.setVisible(false);

        }
        if (e.getSource() == b2) {
            EmployeeMenu s = new EmployeeMenu();
            this.setVisible(false);

        }
    }
}
