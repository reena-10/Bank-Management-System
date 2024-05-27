
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

 public class SignUpOne extends JFrame  implements ActionListener{
     
     long random;
     JTextField nameTextField, fnameTextField, dobTextField, emailTextField, cityTextField, stateTextField ,pincodeTextField ,addressTextField;
     JRadioButton male, female, other, married, unmarried, Other;
     JButton next,back;
     SignUpOne() {
         
         setTitle("Page no.1");
         setLayout(null);
         
         Random ran = new Random();
         random = Math.abs((ran.nextLong()  % 9000L) + 1000L);
         
         JLabel formno = new JLabel("APPLICATION FORM NO."+ random);
         formno.setFont(new Font("Raleway", Font.BOLD, 36));
         formno.setBounds(160,20,600,40);
         add(formno);
         
         JLabel personDetails = new JLabel("Personal Details");
         personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
         personDetails.setBounds(300,80,400,30);
         add(personDetails);
         
         JLabel name = new JLabel("Name :");
         name.setFont(new Font("Raleway", Font.BOLD, 20));
         name.setBounds(100,140,100,30);
         add(name);
         
        nameTextField = new JTextField();
        nameTextField.setBounds(290,140,400,30);
        nameTextField.setFont(new Font("Arial", Font.BOLD, 16));
        add(nameTextField);
         
         JLabel fname = new JLabel("FatherName :");
         fname.setFont(new Font("Raleway", Font.BOLD, 20));
         fname.setBounds(100,190,150,30);
         add(fname);
         
         fnameTextField = new JTextField();
        fnameTextField.setBounds(290,190,400,30);
        fnameTextField.setFont(new Font("Arial", Font.BOLD, 16));
        add(fnameTextField);
        
         JLabel dob = new JLabel("Date Of Birth:");
         dob.setFont(new Font("Raleway",Font.BOLD, 20));
         dob.setBounds(100,240,150,30);
         add(dob);
         
        dobTextField = new JTextField();
        dobTextField.setBounds(290,240,400,30);
        dobTextField.setFont(new Font("Arial", Font.BOLD, 16));
        add(dobTextField);
         
         JLabel gender = new JLabel("Gender:");
         gender.setFont(new Font("Raleway", Font.BOLD,20));
         gender.setBounds(100,290,200,30);
         add(gender);
         
         male = new JRadioButton("Male");
         male.setBounds(300,290,60,30);
         male.setBackground(Color.WHITE);
         add(male);
         
         female= new JRadioButton("Female");
         female.setBounds(390,290,120,30);
         female.setBackground(Color.WHITE);
         add(female);
         
         other= new JRadioButton("Other");
         other.setBounds(510,290,180,30);
         other.setBackground(Color.WHITE);
         add(other);
         
         ButtonGroup gendergroup = new ButtonGroup();
         gendergroup.add(male);
         gendergroup.add(female);
         gendergroup.add(other);
         
         JLabel email = new JLabel("Email Address:");
         email.setFont(new Font("Raleway", Font.BOLD,20));
         email.setBounds(100,340,150,30);
         add(email);
         
         emailTextField = new JTextField();
        emailTextField.setBounds(290,340,400,30);
        emailTextField.setFont(new Font("Arial", Font.BOLD, 16));
        add(emailTextField);
         
         
         JLabel status = new JLabel("Marital status:");
         status.setFont(new Font("Railway", Font.BOLD,20));
         status.setBounds(100,390,150,30);
         add(status);
         
         married = new JRadioButton("Married");
         married.setBounds(300,390,100,30);
         married.setBackground(Color.WHITE);
         add(married);
         
         unmarried = new JRadioButton("UnMarried");
         unmarried.setBounds(420,390,120,30);
         unmarried.setBackground(Color.WHITE);
         add(unmarried);
         
         Other = new JRadioButton("Other");
         Other.setBounds(550,390,120,30);
         Other.setBackground(Color.WHITE);
         add(Other);
         
         ButtonGroup statusgroup = new ButtonGroup();
         statusgroup.add(married);
         statusgroup.add(unmarried);
         statusgroup.add(Other);
         
         JLabel address = new JLabel("Address");
         address.setFont(new Font("Railway",Font.BOLD,20));
         address.setBounds(100,440,100,30);
         add(address);
         
        addressTextField = new JTextField();
        addressTextField.setBounds(290,440,400,30);
        addressTextField.setFont(new Font("Arial", Font.BOLD, 16));
        add(addressTextField);
         
         JLabel city = new JLabel("City:");
         city.setFont(new Font("Railway", Font.BOLD,20));
         city.setBounds(100,490,100,30);
         add(city);
         
         cityTextField = new JTextField();
        cityTextField.setBounds(290,490,400,30);
        cityTextField.setFont(new Font("Arial", Font.BOLD, 16));
        add(cityTextField);
         
         JLabel pincode = new JLabel("Pin Code:");
         pincode.setFont(new Font("Railway", Font.BOLD,20));
         pincode.setBounds(100,540,100,30);
         add(pincode);
         
        pincodeTextField = new JTextField();
        pincodeTextField.setBounds(290,540,400,30);
        pincodeTextField.setFont(new Font("Arial", Font.BOLD, 16));
        add(pincodeTextField);
         
         
         JLabel state = new JLabel("State:");
         state.setFont(new Font("Railway", Font.BOLD,20));
         state.setBounds(100,590,100,30);
         add(state);
         
        stateTextField = new JTextField();
        stateTextField.setBounds(290,590,400,30);
        stateTextField.setFont(new Font("Arial", Font.BOLD, 16));
        add(stateTextField);
        
        next = new JButton(" Next ");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Arial", Font.BOLD,20));
        next.setBounds(550,670,150,35);
        next.addActionListener(this);
        add(next);
        
        back = new JButton(" Back ");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Arial", Font.BOLD,20));
        back.setBounds(100,670,150,35);
        back.addActionListener(this);
        add(back);
         
         getContentPane().setBackground(Color.WHITE);
         
         setSize(800,800);
         setLocation(350,10);
         setVisible(true);
     }
     
         public void actionPerformed(ActionEvent ae) {
            
           String formno = "" + random; 
           String name = nameTextField.getText();//setText
           String fname = fnameTextField.getText();
           String dob = dobTextField.getText();
           if (ae.getSource()== next) {
           String gender = null;
            if (male.isSelected()) {
                gender = "Male";
            }else if(female.isSelected()) {
                gender= "Female";
            }else if(other.isSelected()){
                gender="Other";
            }
   
            String email =emailTextField.getText();
            String status = null;
            if(married.isSelected())  {
                status = "Married";
            }else if (unmarried.isSelected()) {
                status="UnMarried";
            }else if (Other.isSelected()) {
                status="Other";
            }
            String address =addressTextField.getText();
            String state = stateTextField.getText();
            String city = cityTextField.getText();
            String pincode = pincodeTextField.getText();
            
            try {
               if (name.equals("")) {
                   JOptionPane.showMessageDialog(null,"not completed");
               }else {
                   Conn c= new Conn();
                   String query ="insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"','"+status+"','"+gender+"','"+pincode+"','"+state+"','"+city+"','"+address+"','"+email+"')";
                   c.s.executeUpdate(query);
                   
                   setVisible(false);
                   new SignUpTwo(formno).setVisible(true);
               } 
            } catch (Exception e) {
                System.out.println(e);
            }
           } else if(ae.getSource() == back) {
             setVisible(false);
             new Login().setVisible(true);
            

        }
}
         
     public static void main(String args[]) {
         new SignUpOne();
     }
}
