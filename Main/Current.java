package Main;

import javax.swing.*;

import static Main.Main.clients;
import static Main.Main.transactions;

public class Current extends  Transactions {



    public void Withdrawl(Client cc , JTextField t1, double MIN_BALANCE , double FEE ){




        boolean is = false;
        for (Client c : clients) {
            String str = Integer.toString(c.getClient_id());

            if (str.equals(ClientLogin.logedID())) {
                cc = c;
                double amount = Double.parseDouble(t1.getText());
                if (amount > c.getBalance()) {

                    JOptionPane.showMessageDialog(null, "NO ENOUGH MONEY" + "\n your balance = " + c.getBalance(), "INFO ", JOptionPane.PLAIN_MESSAGE);
                    t1.setText("");
                } else {


                    if (c.getBalance() > MIN_BALANCE) {

                        c.setBalance(c.getBalance() - amount);
                        Transactions s = new Transactions(cc.getClient_id(), amount, cc.getBalance(), "WITHDRAWL");
                        transactions.add(s);

                        t1.setText("");
                    } else {
if(((c.getBalance() - amount) - FEE)>0) {
    c.setBalance((c.getBalance() - amount) - FEE);
    Transactions s = new Transactions(cc.getClient_id(), amount, cc.getBalance(), "WITHDRAWL");
    transactions.add(s);
    JOptionPane.showMessageDialog(null, "WITHDRAWL CONFIRMED", "INFO ", JOptionPane.INFORMATION_MESSAGE);
    t1.setText("");
}
else{
    JOptionPane.showMessageDialog(null, "LOW BALANCE"+"\n YOUR CURRENT BALANCE IS NOT ENOUGH TO PROCESS THIS TRANSACTIONS", "INFO ", JOptionPane.ERROR_MESSAGE);

}
                    }

                }
            }


        }



    }












}
