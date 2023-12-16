package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Main.Main.employees;

public class EmployeeSignUp extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    JLabel j1, j2, j3, j4, j5, j6, j7, j8, j9, j10, J11, J12;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11;

    public EmployeeSignUp() {
        j10 = new JLabel("SIGN UP");
        j10.setFont(new Font("osward", Font.BOLD, 28));
        j10.setBounds(300, 5, 300, 25);
        this.add(j10);

        b1 = new JButton("CREATE");
        b2 = new JButton("BACK");
        b1.setBounds(200, 600, 100, 40);
        b2.setBounds(400, 600, 100, 40);
        this.add(b1);
        this.add(b2);

        this.setResizable(false);
        this.setSize(700, 750);
        this.setTitle("BANK");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(225, 0);
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
        j4 = new JLabel("PassWord");
        j5 = new JLabel("Phone");
        j6 = new JLabel("Address");
        j7 = new JLabel("College");
        j8 = new JLabel("YearOfG");
        j9 = new JLabel("Grade");
        J11 = new JLabel("POSTION");
        J12 = new JLabel("SALARY");

        j1.setFont(new Font("osward", Font.BOLD, 18));
        j1.setForeground(Color.BLACK);
        j1.setBounds(10, 43, 400, 40);
        this.add(j1);

        j2.setFont(new Font("osward", Font.BOLD, 18));
        j2.setForeground(Color.BLACK);
        j2.setBounds(10, 95, 400, 40);
        this.add(j2);

        j3.setForeground(Color.BLACK);
        j3.setFont(new Font("osward", Font.BOLD, 18));
        j3.setBounds(10, 145, 400, 40);
        this.add(j3);

        j4.setForeground(Color.BLACK);
        j4.setFont(new Font("osward", Font.BOLD, 18));
        j4.setBounds(5, 195, 400, 40);
        this.add(j4);

        j5.setForeground(Color.BLACK);
        j5.setFont(new Font("osward", Font.BOLD, 18));
        j5.setBounds(10, 245, 400, 40);
        this.add(j5);

        j6.setForeground(Color.BLACK);
        j6.setFont(new Font("osward", Font.BOLD, 18));
        j6.setBounds(10, 295, 400, 40);
        this.add(j6);

        j7.setForeground(Color.BLACK);
        j7.setFont(new Font("osward", Font.BOLD, 18));
        j7.setBounds(10, 345, 400, 40);
        this.add(j7);

        j8.setForeground(Color.BLACK);
        j8.setFont(new Font("osward", Font.BOLD, 18));
        j8.setBounds(10, 395, 400, 40);
        this.add(j8);

        j9.setForeground(Color.BLACK);
        j9.setFont(new Font("osward", Font.BOLD, 18));
        j9.setBounds(10, 445, 400, 40);
        this.add(j9);

        J11.setFont(new Font("osward", Font.BOLD, 18));
        J11.setForeground(Color.BLACK);
        J11.setBounds(10, 495, 400, 40);

        J12.setFont(new Font("osward", Font.BOLD, 18));
        J12.setForeground(Color.BLACK);
        J12.setBounds(10, 545, 400, 40);

        t1.setBounds(100, 50, 300, 30);
        t2.setBounds(100, 100, 300, 30);
        t3.setBounds(100, 150, 300, 30);
        t4.setBounds(100, 200, 300, 30);
        t5.setBounds(100, 250, 300, 30);
        t6.setBounds(100, 300, 300, 30);
        t7.setBounds(100, 350, 300, 30);
        t8.setBounds(100, 400, 300, 30);
        t9.setBounds(100, 450, 300, 30);

        t10 = new JTextField();
        t11 = new JTextField();
        t10.setBounds(100, 500, 300, 30);
        t11.setBounds(100, 550, 300, 30);

        this.add(J11);
        this.add(J12);
        this.add(t1);
        this.add(t2);
        this.add(t3);
        this.add(t4);
        this.add(t5);
        this.add(t6);
        this.add(t7);
        this.add(t8);
        this.add(t9);
        this.add(t10);
        this.add(t11);

        this.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {

            ADMIN.EmployeeSignUp(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11);
            AdminMenu J = new AdminMenu();
            this.setVisible(false);

        }
        if (e.getSource() == b2) {
            AdminMenu K = new AdminMenu();
            this.setVisible(false);

        }
    }
}
