package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Main.Main.clients;

public class SearchClient extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    JLabel j1, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12;
    Client cc  = new Client();
    Client cc1  = new Client();


    public SearchClient() {

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

        this.setResizable(false);
        this.setSize(700, 500);
        this.setTitle("BANK");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(225, 100);
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
        j5 = new JLabel("Balance");
        j6 = new JLabel("State");
        j7 = new JLabel("Type");

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
        j6.setForeground(Color.BLACK);
        j6.setFont(new Font("osward", Font.BOLD, 18));
        j6.setBounds(10, 350, 400, 40);
        this.add(j6);
        j7.setForeground(Color.BLACK);
        j7.setFont(new Font("osward", Font.BOLD, 18));
        j7.setBounds(10, 400, 400, 40);
        this.add(j7);
        //   j8.setForeground(Color.BLACK);
        //   j8.setFont(new Font("osward",Font.BOLD,18));
        // j8.setBounds(10,450,400,40);
        //   this.add(j8);

        t1.setBounds(100, 100, 300, 30);
        t2.setBounds(100, 150, 300, 30);
        t3.setBounds(100, 200, 300, 30);
        t4.setBounds(100, 250, 300, 30);
        t5.setBounds(100, 300, 300, 30);
        t6.setBounds(100, 350, 300, 30);
        t7.setBounds(100, 400, 300, 30);
        t8.setBounds(100, 450, 300, 30);

        t10 = new JTextField();
        t11 = new JTextField();
        // this.add(t1);
        // this.add(t2);
        // this.add(t3);
        // this.add(t4);
        // this.add(t5);
        // this.add(t6);
        // this.add(t7);
        //this.add(t8);
        this.add(t9);

        b1.addActionListener(this);
        b2.addActionListener(this);
        j1.setVisible(false);
        j2.setVisible(false);
        j3.setVisible(false);
        j4.setVisible(false);
        j5.setVisible(false);
        j6.setVisible(false);
        j7.setVisible(false);
        this.add(t9);

        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

     boolean is = false;
        if (e.getSource() == b1) {
cc1= Employee.SearchClient(cc,t9);
            if ( cc1.getClient_id()!=0) {
                t1.setText(cc1.FirstName);
                t2.setText(cc1.LastName);
                t3.setText(cc1.Email);
                t4.setText(cc1.phoneNumber);
                String balance = Double.toString(cc1.getBalance());
                t5.setText(balance);
                t6.setText(cc1.getAcc_state());
                t7.setText(cc1.getAcc_Type());
                // t8.setText("");
                System.out.println(cc1.FirstName);

                this.add(t1);
                this.add(t2);
                this.add(t3);
                this.add(t4);
                this.add(t5);
                this.add(t6);
                this.add(t7);
                j1.setVisible(true);
                j2.setVisible(true);
                j3.setVisible(true);
                j4.setVisible(true);
                j5.setVisible(true);
                j6.setVisible(true);
                j7.setVisible(true);

                //  this.add(j8);
            } else {
                JOptionPane.showMessageDialog(this, "ACCOUNT NOT FOUND", "INFO ", JOptionPane.ERROR_MESSAGE);
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                t7.setText("");
                t8.setText("");

            }

        }
        if (e.getSource() == b2) {

            EmployeeMenu s = new EmployeeMenu();
            this.setVisible(false);
        }

    }

}
