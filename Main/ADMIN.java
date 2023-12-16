package Main;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import static Main.Main.*;

public class ADMIN {
    final  String username= "";
    final  String password= "";

    public static  void  EmployeeSignUp(JTextField t1,JTextField t2,JTextField t3,JTextField t4,JTextField t5,JTextField t6,JTextField t7,JTextField t8,JTextField t9,JTextField t10,JTextField t11){
        String fname = t1.getText();
        String lname = t2.getText();
        String email = t3.getText();
        String password = t4.getText();
        String phone = t5.getText();
        String address = t6.getText();
        String college = t7.getText();
        String year = t8.getText();
        String total_grade = t9.getText();
        String position = t10.getText();
        String salary = t11.getText();

        int Employee_id = 20;
        for (Employee emp : employees) {
            Employee_id = emp.getEmployee_id();
        }

        Employee_id++;
        Employee e1 = new Employee(fname, lname,Employee_id, email, password, phone, address, college, year, total_grade, position, salary);
        employees.add(e1);

        //  System.out.println(Employee_id);
        JOptionPane.showMessageDialog(null, "CREATE SUCCESS "+"\n YOUR ID = "+Employee_id, "INFO ", JOptionPane.INFORMATION_MESSAGE);
    }
    public static  void ShowAllTransaction(DefaultTableModel model){
        for (Transactions t : transactions) {

            model.addRow(new Object[]{t.getAccid(), t.getType(), t.getAmount(), t.getBalance(), t.getDate()});

        }

    }

    public static void ShowAllEmployees(DefaultTableModel model){
        for (Employee e : employees) {

            model.addRow(new Object[]{e.FirstName, e.LastName, e.getEmployee_id(), e.Email, e.Password, e.phoneNumber, e.getAddress(), e.getGraduated_college(), e.getYear_of_graduation(), e.getTotal_grade(), e.getPosition(), e.getSalary()});

        }

    }

public static void ShowAllClients(DefaultTableModel model){
    for (Client c : clients) {

        model.addRow(new Object[]{c.FirstName, c.LastName, c.getClient_id(), c.Email, c.Password, c.phoneNumber, c.getBalance(), c.getAcc_state(), c.getAcc_Type()});

    }



}



}
