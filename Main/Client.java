package Main;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.Serializable;

import static Main.Main.clients;
import static Main.Main.transactions;

public class Client extends User implements Serializable {

    private double balance;
    private int Client_id = 1000;
    private String acc_state;
    private String acc_Type;
    private double loans;
    private double debt;
    private double Instalmment;
    public boolean interestEvaluated = false;

    public double getInstalmment() {
        return Instalmment;
    }

    public void setInstalmment(double instalmment) {
        Instalmment = instalmment;
    }

    public double getLoans() {
        return loans;
    }

    public void setLoans(double loans) {
        this.loans = loans;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public Client() {
    }

    public Client(String FirstName, String LastName, int id, String Email, String Password, String phoneNumber, double balance, String acc_state, String acc_Type) {
        super(FirstName, LastName, Email, Password, phoneNumber);
        this.balance = balance;
        this.acc_state = acc_state;
        this.acc_Type = acc_Type;
        this.Client_id = id;
    }



    public int getClient_id() {
        return Client_id;
    }

    public void setClient_id(int client_id) {
        Client_id = client_id;
    }



    private int num_of_Installment = 6;

    public boolean isInterestEvaluated() {
        return interestEvaluated;
    }

    public void setInterestEvaluated(boolean interestEvaluated) {
        this.interestEvaluated = interestEvaluated;
    }




    public int getNum_of_Installment() {
        return num_of_Installment;
    }

    public void setNum_of_Installment(int num_of_Installment) {
        this.num_of_Installment = num_of_Installment;
    }

    public String getPassword() {
        return Password;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAcc_state(String acc_state) {
        this.acc_state = acc_state;
    }

    public void setAcc_Type(String acc_Type) {
        this.acc_Type = acc_Type;
    }

    public String getLastName() {
        return LastName;
    }

    public double getBalance() {
        return balance;
    }

    public String getAcc_state() {
        return acc_state;
    }

    public String getAcc_Type() {
        return acc_Type;
    }


    public static void ClientEdit(Client s, JTextField t1, JTextField t2, JTextField t3, JTextField t4, JTextField t5) {

        JOptionPane.showMessageDialog(null, "EDIT CONFIRMED", "INFO ", JOptionPane.INFORMATION_MESSAGE);
        s.setFirstName(t1.getText());
        s.setLastName(t2.getText());
        s.setEmail(t3.getText());
        s.setPassword(t4.getText());
        s.setPhoneNumber(t5.getText());

    }

    public static void DisplayAccountDetails(JTextField t1, JTextField t2, JTextField t3, JTextField t4, JTextField t5, JTextField t6, JTextField t7, JTextField t8) {

        Client cc = new Client();
        boolean is = false;
        int id = Integer.parseInt(ClientLogin.logedID());

        for (Client c : clients) {

            if (id == c.getClient_id()) {
                cc = c;
                is = true;
            }

        }
        if (is) {

            String idd = Integer.toString(cc.getClient_id());
            t8.setText(idd);
            t1.setText(cc.getFirstName());
            t2.setText(cc.getLastName());
            t3.setText(cc.getEmail());
            t4.setText(cc.getPhoneNumber());
            String balance = Double.toString(cc.getBalance());
            t5.setText(balance);
            t6.setText(cc.getAcc_state());
            t7.setText(cc.getAcc_Type());


        }


    }

public static  void ShowTransactions(DefaultTableModel model ){

    for (Transactions t : transactions) {
        String str = Integer.toString(t.getAccid());
        if (str.equals(ClientLogin.logedID())) {
            model.addRow(new Object[]{t.getType(), t.getAmount(), t.getBalance(), t.getDate()});
        }
    }


}

}

