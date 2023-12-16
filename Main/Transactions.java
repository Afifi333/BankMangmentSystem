package Main;

import javax.swing.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import static Main.Main.clients;
import static Main.Main.transactions;

public  class  Transactions implements Serializable {
    public Transactions() {
    }

    private String Type;
    private double amount;
    private double balance;

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getAccid() {
        return accid;
    }

    public void setAccid(int accid) {
        this.accid = accid;
    }

    private LocalDate date;
    private int accid;

    public Transactions(Scanner input, Client LogedClient, ArrayList<Client> clients) {
        //  ShowtTransactionsMenu(input, LogedClient, clients);
    }

    public Transactions(int id, double amount, double balance, String Type) {
        this.accid = id;
        this.Type = Type;
        this.amount = amount;
        this.balance = balance;
        this.date = LocalDate.now();
    }


    public static void Deposit(Client cc, double amount, JTextField t1) {
        for (Client c : clients) {
            String str = Integer.toString(c.getClient_id());
            if (str.equals(ClientLogin.logedID())) {
                cc = c;
                amount = Double.parseDouble(t1.getText());
                c.setBalance(amount + c.getBalance());
            }
        }
        JOptionPane.showMessageDialog(null, "DIPOSITE CONFIRMED", "INFO ", JOptionPane.INFORMATION_MESSAGE);
        Transactions r = new Transactions(cc.getClient_id(), amount, cc.getBalance(), "DIPOSITE");
        transactions.add(r);

    }

    public static void Transfer(JTextField t1, JTextField t2) {
        boolean is = false;
        Client logedc = new Client();
        Client recent = new Client();
        for (Client c : clients) {
            String str = Integer.toString(c.getClient_id());
            if (str.equals(t1.getText())) {
                logedc = c;

                is = true;
            }
        }

        for (Client c : clients) {
            String str = Integer.toString(c.getClient_id());
            if (str.equals(ClientLogin.logedID())) {

                recent = c;
            }
        }
        if (is == false) {
            JOptionPane.showMessageDialog(null, "ID NOT FOUND", "INFO ", JOptionPane.INFORMATION_MESSAGE);
            t1.setText("");
        }
        if (is) {
            double amount = Double.parseDouble(t2.getText());

            if (recent.getBalance() >= amount) {

                logedc.setBalance(logedc.getBalance() + amount);
                recent.setBalance(recent.getBalance() - amount);

                JOptionPane.showMessageDialog(null, "TRANSFER CONFIRMED", "INFO ", JOptionPane.INFORMATION_MESSAGE);
                Transactions r = new Transactions(recent.getClient_id(), amount, recent.getBalance(), "TRANSFER SENDER");
                transactions.add(r);

                Transactions Q = new Transactions(logedc.getClient_id(), amount, logedc.getBalance(), "TRANSFER RECEIVER");
                transactions.add(Q);

                t1.setText("");
                t2.setText("");
            } else {

                JOptionPane.showMessageDialog(null, "NO ENOUGH MONEY" + "\n your balance = " + recent.getBalance(), "INFO ", JOptionPane.PLAIN_MESSAGE);

                t2.setText("");

            }

        }
    }




    public   void  Withdrawl(Client s , JTextField t1 ){
        boolean is = false;
        double amount = Double.parseDouble(t1.getText());
        for (Client c : clients) {
            String str = Integer.toString(c.getClient_id());

            if (str.equals(ClientLogin.logedID())) {
                s = c;
                is=true;
            }
        }
if(is){
    s.setBalance(s.getBalance()-amount);
}
    }
}














