package Main;

import javax.swing.*;

import static Main.Main.clients;
import static Main.Main.transactions;

public class Saving extends  Transactions {

@Override
    public   void Withdrawl(Client s, JTextField t1) {
        boolean is = false;
        double amount = Double.parseDouble(t1.getText());
        for (Client c : clients) {
            String str = Integer.toString(c.getClient_id());

            if (str.equals(ClientLogin.logedID())) {
                s = c;
            }
        }
        if (amount > s.getBalance()) {

            JOptionPane.showMessageDialog(null, "NO ENOUGH MONEY" + "\n your balance = " + s.getBalance(), "INFO ", JOptionPane.PLAIN_MESSAGE);
            t1.setText("");
        } else {
            s.setBalance(s.getBalance() - amount);
            JOptionPane.showMessageDialog(null, "Withdrawal Confirmed", "INFO ", JOptionPane.INFORMATION_MESSAGE);

            Transactions r = new Transactions(s.getClient_id(), amount, s.getBalance(), "WITHDRAWL");
            transactions.add(r);

            t1.setText("");


        }


    }
    public static void  EvaluationRequest(Client s ,double interestRate){
        for (Client c : clients) {
            String str = Integer.toString(c.getClient_id());
            if (str.equals(ClientLogin.logedID())) {

                s = c;

            }
        }

        if (s.interestEvaluated == false) {
            JOptionPane.showMessageDialog(null, "INTEREST EVALUATION CONFIRMED", "INFO ", JOptionPane.INFORMATION_MESSAGE);
            s.interestEvaluated = true;
            double interest = s.getBalance() * interestRate;
            s.setBalance(s.getBalance() + interest);
        } else {
            JOptionPane.showMessageDialog(null, "Interest for the year has already been evaluated", "INFO ", JOptionPane.ERROR_MESSAGE);

        }
    }
}