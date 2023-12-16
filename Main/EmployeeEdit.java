package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Main.Main.employees;

public class EmployeeEdit extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    JLabel j1, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12;
    Employee s = new Employee();

    public EmployeeEdit() {

        b1 = new JButton("EDIT");
        b2 = new JButton("<<BACK");
        b1.setBounds(500, 10, 100, 40);
        b2.setBounds(500, 60, 100, 40);
        this.add(b1);
        this.add(b2);

        this.setResizable(false);
        this.setSize(700, 340);
        this.setTitle("BANK");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(300, 200);
        this.setLayout(null);
        t1 = new JTextField();
        t2 = new JTextField();

        j1 = new JLabel("ADDRESS");
        j2 = new JLabel("POSTION");

        j1.setFont(new Font("osward", Font.BOLD, 18));
        j1.setForeground(Color.BLACK);
        j1.setBounds(10, 10, 400, 40);
        this.add(j1);
        j2.setFont(new Font("osward", Font.BOLD, 18));
        j2.setForeground(Color.BLACK);
        j2.setBounds(10, 60, 400, 40);
        this.add(j2);

        t1.setBounds(120, 10, 300, 30);
        t2.setBounds(120, 60, 300, 30);

        for (Employee e : employees) {
            String str = Integer.toString(e.getEmployee_id());
            if (EmployeeLogin.EMlogedID().equals(str)) {
                s = e;
            }
        }
        t1.setText(s.getAddress());
        t2.setText(s.getPosition());

        this.add(t1);
        this.add(t2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
        Employee.EDITpersonal(s,t1,t2);
            EmployeeMenu n = new EmployeeMenu();
            this.setVisible(false);
        }
        if (e.getSource() == b2) {
            EmployeeMenu S = new EmployeeMenu();
            this.setVisible(false);
        }
    }
}
