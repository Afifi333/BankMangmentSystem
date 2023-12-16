package Main;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Main.Main.transactions;

public class ClientTransactions extends JFrame implements ActionListener {

    JTable T;
    JButton b1;
    Client cc = new Client();

    public ClientTransactions() {

        this.setResizable(false);
        this.setSize(1000, 500);
        this.setTitle("BANK");

        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(55, 65);
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Col1");
        model.addColumn("Col2");
        model.addColumn("Col3");
        model.addColumn("Col4");

        b1 = new JButton("<<BACK");
        b1.setBounds(850, 20, 100, 40);
        b1.addActionListener(this);
        this.add(b1);

        model.addRow(new Object[]{"  TYPE", "  AMOUNT", "  BALANCE", "  DATE"});
        T = new JTable(model);
        T.setFont(new Font("Serif", Font.BOLD, 15));
        T.setBounds(0, 0, 800, 1000);
        T.setRowHeight(0, 40);
        //T.setROW(0, 55);
        this.add(T);

        Client.ShowTransactions(model);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            ClientMenu s = new ClientMenu();
            this.setVisible(false);
        }
    }
}
