package Main;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Main.Main.transactions;

public class ShowAllTransactions extends JFrame implements ActionListener {

    JTable T;
    JButton b1;

    public ShowAllTransactions() {

        this.setResizable(false);
        this.setSize(800, 600);
        this.setTitle("BANK");

        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(200, 65);
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Col1");
        model.addColumn("Col2");
        model.addColumn("Col3");
        model.addColumn("Col4");
        model.addColumn("Col5");

        b1 = new JButton("<<BACK");
        b1.setBounds(650, 15, 100, 40);
        b1.addActionListener(this);
        this.add(b1);

        model.addRow(new Object[]{" ID", " TYPE", " AMOUNT", " BALANCE", " DATE"});
        T = new JTable(model);
        T.setFont(new Font("Serif", Font.BOLD, 15));
        T.setBounds(0, 0, 600, 1000);
        T.setRowHeight(0, 40);
        this.add(T);

       ADMIN.ShowAllTransaction(model);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            AdminMenu D = new AdminMenu();
            this.setVisible(false);
        }
    }
}
