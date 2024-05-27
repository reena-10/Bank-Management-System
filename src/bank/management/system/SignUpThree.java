
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class SignUpThree extends JFrame implements ActionListener{
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;   
    JButton submit,cancel;
    String formno;
    
    SignUpThree( String formno) {
        this.formno = formno;
        
        setTitle("Account Details form-Page No.3");
        setLayout(null);
        
        JLabel l1 = new JLabel("Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 40));
        l1.setBounds(260,40,400,40);
        add(l1);
        
        JLabel accounttype = new JLabel("Account Type");
        accounttype.setFont(new Font("Raleway", Font.BOLD, 22));
        accounttype.setBounds(100,140,150,30);
        add(accounttype);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1. setBounds(100,200,250,20);
        add(r1);
        
        r2 = new JRadioButton("Current Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,200,400,20);
        add(r2);
        
        r3 = new JRadioButton("Fixed Deposite Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3. setBounds(100,230,250,20);
        add(r3);
        
        r4 = new JRadioButton("Reccuring Deposite Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4. setBounds(350,230,400,20);
        add(r4);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        JLabel card = new JLabel("Card Number ");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,290,200,30);
        add(card);
        
        JLabel cardDetails = new JLabel("XXXX-XXXX-XXXX-4391");
        cardDetails.setFont(new Font("Raleway",Font.BOLD,22));
        cardDetails.setBounds(330,290,300,30);
        add(cardDetails);
        
        JLabel number = new JLabel("(Your 16-digit card number)");
        number.setFont(new Font("Raleway",Font.BOLD,12));
        number.setBounds(100,320,300,20);
        add(number);
        
        JLabel Pin = new JLabel("PIN ");
        Pin.setFont(new Font("Raleway",Font.BOLD,22));
        Pin.setBounds(100,370,200,30);
        add(Pin);
        
        JLabel PinDetails = new JLabel("(Your 4- digit number)");
        PinDetails.setFont(new Font("Raleway",Font.BOLD,12));
        PinDetails.setBounds(100,390,300,20);
        add(PinDetails);
       
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);
        
        JLabel services = new JLabel("Services Requried");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,430,250,30);
        add(services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBackground(Color.WHITE);
        c1.setBounds(100,480,200,30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBackground(Color.WHITE);
        c2.setBounds(300,480,200,30);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBackground(Color.WHITE);
        c3.setBounds(100,520,200,30);
        add(c3);
        
        c4 = new JCheckBox("Email & SMS Alert");
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBackground(Color.WHITE);
        c4.setBounds(300,520,200,30);
        add(c4);
        
        c5 = new JCheckBox("Check Book");
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBackground(Color.WHITE);
        c5.setBounds(100,560,200,30);
        add(c5);
        
        c6 = new JCheckBox("E Statement");
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBackground(Color.WHITE);
        c6.setBounds(300,560,200,30);
        add(c6);
        
        c7 = new JCheckBox(" I hereby declares that above entered details are correct to the best of my Knowledge.");
        c7.setFont(new Font("Raleway", Font.BOLD, 15));
        c7.setBackground(Color.WHITE);
        c7.setBounds(80,650,700,20);
        add(c7);
        
        
        submit = new JButton("SUBMIT");
       submit.setBounds(580,700,130,30);
       submit.setBackground(Color.BLACK);
       submit.setForeground(Color.WHITE);
       submit.addActionListener(this);
       add(submit);
       
      
       cancel= new JButton("CANCEL");
       cancel.setBounds(100,700,130,30);
       cancel.setBackground(Color.BLACK);
       cancel.setForeground(Color.WHITE);
       cancel.addActionListener(this);
       add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
                
        setSize(800,800);
        setLocation(350,10);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()== submit) {
            String accountType = null;
            if (r1.isSelected()) {
                accountType="Saving Account";
            }else if(r2.isSelected()) {
                 accountType="Current Account";
           }else if(r3.isSelected()) {
                  accountType="Fixed Deposit Account";
            }else if(r4.isSelected()) {
                  accountType="Recurring Deposite Account";
            }
              Random random = new Random();
              String cardnumber ="" +Math.abs((random.nextLong() % 90000000L)) + 000004321L;
              
              String pinnumber = "" +Math.abs((random.nextLong() % 9000L + 1000L));
              
              String facility = "";
              if(c1.isSelected()) {
                  facility = facility +"ATM Card";
              }else if(c2.isSelected()) {
                  facility = facility +"Internet Banking";
              }else if(c3.isSelected()) {
                  facility = facility +"Mobile Banking";
              }else if(c4.isSelected()) {
                  facility = facility +"Email & SMS Alert";
              }else if(c5.isSelected()) {
                  facility = facility +"Check Book";
              }else if(c6.isSelected())  {
                  facility = facility +"E Statement";
              }
              
              try {
                  if (accountType.equals("")) {
                      JOptionPane.showMessageDialog(null,"Account Type is Required");
                  }else {
                      Conn conn = new Conn();
                      String query="insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                      String query2 ="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                      conn.s.executeUpdate(query);
                      conn.s.executeUpdate(query2);
                      
                      JOptionPane.showMessageDialog(null,"Card Number:" +cardnumber+ "\nPin:" +pinnumber);
                      
                      setVisible(false);
                      new Deposit(pinnumber).setVisible(true);
                  }
                
              }catch (Exception e) {
                  System.out.println(e);
              }
                      
        }else if(ae.getSource() == cancel) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }
        
    public static void main(String args[]) {
        new SignUpThree(" ");
    }
    
}
