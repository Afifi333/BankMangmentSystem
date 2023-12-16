package Main;

import javax.swing.*;
import java.io.Serializable;

import static Main.Main.clients;

public class Employee extends User implements Serializable {

    private String address;
    private String Graduated_college;
    private String year_of_graduation;
    private String total_grade;
    private String position;
    private String salary;
    private int Employee_id = 20;

    public Employee() {
    }

    public Employee(String FirstName, String LastName, int id, String Email, String Password, String phoneNumber, String address, String Graduated_college, String year_of_graduation, String total_grade, String position, String salary) {
        super(FirstName, LastName, Email, Password, phoneNumber);
        this.address = address;
        this.Graduated_college = Graduated_college;
        this.year_of_graduation = year_of_graduation;
        this.total_grade = total_grade;
        this.position = position;
        this.salary = salary;
        this.Employee_id = id;
    }

    public int getEmployee_id() {
        return Employee_id;
    }

    public void setEmployee_id(int employee_id) {
        Employee_id = employee_id;
    }

    public String getPassword() {
        return Password;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGraduated_college(String graduated_college) {
        Graduated_college = graduated_college;
    }

    public void setYear_of_graduation(String year_of_graduation) {
        this.year_of_graduation = year_of_graduation;
    }

    public void setTotal_grade(String total_grade) {
        this.total_grade = total_grade;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getLastName() {
        return LastName;
    }

    public String getAddress() {
        return address;
    }

    public String getGraduated_college() {
        return Graduated_college;
    }

    public String getYear_of_graduation() {
        return year_of_graduation;
    }

    public String getTotal_grade() {
        return total_grade;
    }

    public String getPosition() {
        return position;
    }

    public String getSalary() {
        return salary;
    }



    public static void EDITpersonal(Employee e , JTextField t1 , JTextField t2) {
        JOptionPane.showMessageDialog(null , "EDIT CONFIRMED", "INFO ", JOptionPane.INFORMATION_MESSAGE);
        e.setAddress(t1.getText());
        e.setPosition(t2.getText());
    }
 public  static  void EmployeeEditClient(Client cc ,JTextField t1, JTextField t2,JTextField t3,JTextField t4,JTextField t5){
     JOptionPane.showMessageDialog( null , "EDIT CONFIRMED", "INFO ", JOptionPane.INFORMATION_MESSAGE);
     cc.setFirstName(t1.getText());
     cc.setLastName(t2.getText());
     cc.setEmail(t3.getText());
     cc.setPhoneNumber(t4.getText());
     cc.setAcc_state(t5.getText());

 }

    public static Client SearchClient ( Client  cc ,JTextField t9) {

        for (Client c : clients) {
            int id = Integer.parseInt(t9.getText());
            if (id == c.getClient_id()) {
                cc = c;
               // System.out.println(cc.FirstName);

                 return cc;
            }
        }
      cc.setClient_id(0);
         return  cc ;
    }
     public static void  DeleteClient (Client cc , JTextField t1){
         boolean is = false;
         for (Client c : clients) {
             int id = Integer.parseInt(t1.getText());
             if (id == c.getClient_id()) {
                 cc = c;
                 is = true;
             }

         }
         if (is == false) {

             JOptionPane.showMessageDialog(null, "CLIENT NOT FOUND", "INFO ", JOptionPane.ERROR_MESSAGE);

         } else {
             clients.remove(cc);
             JOptionPane.showMessageDialog(null, "DELETE CONFIRMED", "INFO ", JOptionPane.INFORMATION_MESSAGE);
        t1.setText("");
         }









     }
      public static void ClientSignUp( JTextField t1 ,JTextField t2 ,JTextField t3 ,JTextField t4 ,JTextField t5 ,JTextField t6 ,JTextField t7 ,JTextField t8 ){
          String fname = t1.getText();
          String lname = t2.getText();
          String email = t3.getText();
          String password = t4.getText();
          String phone = t5.getText();
          String balance0 = t6.getText();
          String state = t7.getText();
          String type = t8.getText();

          double balance = Double.parseDouble(t6.getText());
          int Client_id = 0;
          for (Client c1 : clients) {
              Client_id = c1.getClient_id();
          }

          Client_id++;
          Client c1 = new Client(fname, lname,Client_id, email, password, phone, balance, state, type);
          clients.add(c1);

          //System.out.println(Client_id);
          JOptionPane.showMessageDialog(null, "CREATE SUCCESS "+ "\n YOUR ID = " +Client_id  , "INFO ", JOptionPane.INFORMATION_MESSAGE);







      }




}
