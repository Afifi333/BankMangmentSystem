package Main;

import javax.swing.*;

import static Main.Main.clients;
import static Main.Main.transactions;

public class Loan extends Client {


    public static void RequestLoan(Client cc, double amount1, double interestRate, JTextField t) {
        for (Client c : clients) {
            String str = Integer.toString(c.getClient_id());

            if (str.equals(ClientLogin.logedID())) {
                cc = c;
            }
        }

        double amount = Double.parseDouble(t.getText());
        cc.setLoans(amount);
        amount1 = ((amount / 6) * interestRate) + (amount / 6);
        cc.setInstalmment(amount1);
        cc.setDebt((interestRate * amount) + amount);
        JOptionPane.showMessageDialog(null, "LOAN CONFIRMED "
                + " \n YOU HAVE TO PAY " + amount1 + "\n AT 6 INSTALLMENT", "INFO ", JOptionPane.INFORMATION_MESSAGE);
        Transactions r = new Transactions(cc.getClient_id(), amount, cc.getDebt(), "LOAN");
        transactions.add(r);
    }

    public static void PayLoan(Client cc) {
        if (cc.getNum_of_Installment() > 1 && cc.getDebt() != 0) {
            cc.setNum_of_Installment(cc.getNum_of_Installment() - 1);
            cc.setDebt(cc.getDebt() - cc.getInstalmment());
            JOptionPane.showMessageDialog(null, "REMAIN INSTALLMENTS IS " + cc.getNum_of_Installment() + "\n AND YOUR DEBT NOW IS " + cc.getDebt(), "INFO ", JOptionPane.INFORMATION_MESSAGE);
            Transactions r = new Transactions(cc.getClient_id(), cc.getLoans(), cc.getDebt(), "LOAN");
            System.out.println(cc.getDebt());

            transactions.add(r);
        } else {
            if (cc.getDebt() == 0 && cc.getNum_of_Installment() == 6) {
                JOptionPane.showMessageDialog(null, "YOU DONT HAVE ANY LOANS", "INFO ", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (cc.getNum_of_Installment() == 1) {
                    cc.setDebt(0);
                    Transactions r = new Transactions(cc.getClient_id(), cc.getLoans(), cc.getDebt(), "LOAN");
                    transactions.add(r);
                }
                JOptionPane.showMessageDialog(null, "YOU HAVE PAID ALL YOUR INSTALLMENTS", "INFO ", JOptionPane.INFORMATION_MESSAGE);
                cc.setDebt(0);
                cc.setNum_of_Installment(6);
                System.out.println(cc.getDebt());


            }

        }


    }

}
