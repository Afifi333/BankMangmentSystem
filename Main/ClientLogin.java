package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Main.Main.clients;

public class ClientLogin extends JFrame implements ActionListener {

    JLabel text = new JLabel("WELCOME TO BANK");
    static JTextField t1;
    JTextField t2;
    JButton b1, b2, b3, b4;
    JLabel jj = new JLabel("success");
    JOptionPane G;

    public ClientLogin() {

        this.setResizable(false);
        this.setSize(800, 500);
        this.setTitle("BANK");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(225, 100);

        JLabel f = new JLabel();
        f.setIcon(new ImageIcon("D:\\banking.png"));
        this.setLayout(null);

        text.setFont(new Font("osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        this.add(text);

        f.setBounds(70, 10, 100, 100);

        JLabel mail = new JLabel("ID:");
        mail.setFont(new Font("Raleway", Font.BOLD, 28));
        mail.setBounds(250, 142, 500, 40);
        this.add(mail);

        JLabel pass = new JLabel("PASSWORD:");
        pass.setFont(new Font("Raleway", Font.BOLD, 28));
        pass.setBounds(120, 212, 400, 40);
        this.add(pass);

        t1 = new JTextField();
        t2 = new JPasswordField();
        t1.setBounds(300, 150, 250, 30);
        t2.setBounds(300, 220, 250, 30);
        this.add(t1);
        this.add(t2);

        b1 = new JButton("SIGN IN");
        b1.setBackground(Color.white);
        b1.setForeground(Color.BLUE);
        b1.setBounds(300, 300, 100, 30);
        b1.addActionListener(this);
        this.add(b1);

//
        b2 = new JButton("CLEAR");
        b2.setBackground(Color.white);
        b2.setForeground(Color.BLUE);
        b2.setBounds(430, 300, 100, 30);
        b2.addActionListener(this);
        this.add(b2);

        b4 = new JButton("BACK ");
        b4.setBackground(Color.white);
        b4.setForeground(Color.BLUE);
        b4.setBounds(560, 300, 100, 30);
        b4.addActionListener(this);
        this.add(b4);

        jj.setBounds(540, 200, 100, 30);
        jj.setBackground(Color.red);
        jj.setFont(new Font("Raleway", Font.BOLD, 28));
        jj.setBounds(600, 50, 500, 40);
        jj.setForeground(Color.green);
        this.add(jj);
        jj.setVisible(false);

        G = new JOptionPane();
        this.setVisible(true);

    }

    static String LogedName;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            boolean is = false;
            for (Client c : clients) {

                String str = Integer.toString(c.getClient_id());

                if (t2.getText().equals(c.Password) && t1.getText().equals(str)) {
                    LogedName = c.getFirstName();
                    is = true;
                }
            }
            if (is == true) {
                JOptionPane.showMessageDialog(this, "  log in SUCCESS", "INFO ", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("trueeeee");
                this.setVisible(false);
                ClientMenu D = new ClientMenu();
            } else {
                JOptionPane.showMessageDialog(this, "  log in FAILED", "INFO ", JOptionPane.INFORMATION_MESSAGE);

            }

        }
        if (e.getSource() == b4) {
            Menu m = new Menu();
            this.setVisible(false);

        }
        if (e.getSource() == b2) {
            t1.setText("");
            t2.setText("");

        }

    }

    public static String logedID() {

        return t1.getText();

    }

    public static String Logedname() {

        return LogedName;
    }
}
