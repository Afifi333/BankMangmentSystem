package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeMenu extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6;
    JLabel l1 = new JLabel("WELCOME  " + "\n" + "Mr/Mrs: " + EmployeeLogin.LogedName);

    public EmployeeMenu() {

        this.setResizable(false);
        this.setSize(800, 500);
        this.setTitle("BANK");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(225, 100);
        this.setLayout(null);

        l1.setFont(new Font("osward", Font.BOLD, 20));
        l1.setBounds(10, 20, 400, 40);
        this.add(l1);

        b1 = new JButton("CREATE CLIENT ACC");
        b1.setBounds(300, 10, 200, 50);
        b1.setForeground(Color.red);

        b2 = new JButton("EDIT CLIENT ACC");
        b2.setBounds(300, 100, 200, 50);
        b2.setForeground(Color.red);

        b3 = new JButton("SEARCH FOR CLIENT ");
        b3.setBounds(300, 200, 200, 50);
        b3.setForeground(Color.red);

        b4 = new JButton("EDIT PERSONAL INFO ");
        b4.setBounds(300, 300, 200, 50);
        b4.setForeground(Color.red);

        b5 = new JButton("DELETE CLIENT ACC ");
        b5.setBounds(300, 400, 200, 50);
        b5.setForeground(Color.red);

        b6 = new JButton("<< BACK");
        b6.setBounds(30, 400, 200, 50);
        b6.setForeground(Color.red);

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
            Menu s = new Menu();
            this.setVisible(false);
        }
        if (e.getSource() == b1) {
            ClientSignUp f = new ClientSignUp();
            this.setVisible(false);
        }
        if (e.getSource() == b3) {
            SearchClient f = new SearchClient();
            this.setVisible(false);
        }
        if (e.getSource() == b4) {
            EmployeeEdit S = new EmployeeEdit();
            this.setVisible(false);
        }
        if (e.getSource() == b2) {
            EmployeeEditClient s = new EmployeeEditClient();
            this.setVisible(false);
        }
        if (e.getSource() == b5) {
            DeleteClient S = new DeleteClient();
            this.setVisible(false);
        }

    }
}
