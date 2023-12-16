package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Main.Main.clients;

public class ClientEdit extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    JLabel j1, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12;
    Client s = new Client();

    public ClientEdit() {

        b1 = new JButton("EDIT");
        b2 = new JButton("<<BACK");
        b1.setBounds(500, 10, 100, 40);
        b2.setBounds(500, 60, 100, 40);

        this.add(b1);
        this.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        this.setResizable(false);
        this.setSize(700, 500);

        this.setTitle("BANK");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(225, 70);
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
        j4 = new JLabel("Password");
        j5 = new JLabel("Phone");

        j1.setFont(new Font("osward", Font.BOLD, 18));
        j1.setForeground(Color.BLACK);
        j1.setBounds(10, 7, 400, 40);
        this.add(j1);

        j2.setFont(new Font("osward", Font.BOLD, 18));
        j2.setForeground(Color.BLACK);
        j2.setBounds(10, 53, 400, 40);
        this.add(j2);

        j3.setForeground(Color.BLACK);
        j3.setFont(new Font("osward", Font.BOLD, 18));
        j3.setBounds(10, 103, 400, 40);
        this.add(j3);

        j4.setForeground(Color.BLACK);
        j4.setFont(new Font("osward", Font.BOLD, 18));
        j4.setBounds(10, 153, 400, 40);
        this.add(j4);

        j5.setForeground(Color.BLACK);
        j5.setFont(new Font("osward", Font.BOLD, 18));
        j5.setBounds(10, 203, 400, 40);
        this.add(j5);

        t1.setBounds(100, 10, 300, 30);
        t2.setBounds(100, 60, 300, 30);
        t3.setBounds(100, 110, 300, 30);
        t4.setBounds(100, 160, 300, 30);
        t5.setBounds(100, 210, 300, 30);

        for (Client c : clients) {
            String str = Integer.toString(c.getClient_id());
            if (ClientLogin.logedID().equals(str)) {
                s = c;
            }
        }

        t1.setText(s.getFirstName());
        t2.setText(s.getLastName());
        t3.setText(s.Email);
        t4.setText(s.getPassword());
        t5.setText(s.phoneNumber);

        this.add(t1);
        this.add(t2);
        this.add(t3);
        this.add(t4);
        this.add(t5);

        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            Client.ClientEdit(s,t1,t2,t3,t4,t5);
            ClientMenu s = new ClientMenu();
            this.setVisible(false);
        }
        if (e.getSource() == b2) {
            ClientMenu s = new ClientMenu();
            this.setVisible(false);
        }
    }
}
