
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{
    
 JButton deposit, withdrawl, mini,pinchange,fastcash,balance,exit;
 String pinnumber;
 
   Transactions(String pinnumber) {
       this.pinnumber =pinnumber;
          
        setLayout(null);
       
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ATM.jpg"));
         Image i2 = i1.getImage().getScaledInstance(800,900, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image =  new JLabel(i3);
         image.setBounds( 0, 0, 900, 900);
         add(image);
         
        JLabel text = new JLabel("Please Select Your Transcation");
        text.setBounds(225,310,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("system", Font.BOLD,16));
        image.add(text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(195,415,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl = new JButton("Cash Withdraw");
        withdrawl.setBounds(350,415,150,30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
         fastcash = new JButton("Fast Cash");
        fastcash.setBounds(195,455,150,30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        mini = new JButton("Mini Statement");
        mini.setBounds(350,455,150,30);
        mini.addActionListener(this);
        image.add(mini);
        
        pinchange = new JButton("PIN Change");
        pinchange.setBounds(195,495,150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balance = new JButton(" Balance Enquriry");
        balance.setBounds(350,495,150,30);
        balance.addActionListener(this);
        image.add(balance);
        
        exit = new JButton("Exit");
        exit.setBounds(270,535,150,30);
        exit.addActionListener(this);
        image.add(exit);
                
         setSize(900,900);
         setLocation(350,0);
         setUndecorated(true);
         setVisible(true);
         
   }
   
   public void actionPerformed(ActionEvent ae){
           if(ae.getSource() == exit)  {
               System.exit(0);
           } else if (ae.getSource() == deposit) {
               setVisible(false);
               new Deposit(pinnumber).setVisible(true);
           } else if (ae.getSource() == withdrawl) {
               setVisible(false);
               new Withdrawl(pinnumber).setVisible(true);
           } else if (ae.getSource()== fastcash) {
               setVisible(false);
               new Fastcash(pinnumber).setVisible(true);
           } else if(ae.getSource()== pinchange) {
               setVisible(false);
               new PinChange(pinnumber).setVisible(true);
           } else if(ae.getSource()== balance) {
               setVisible(false);
               new BalanceEnquiry(pinnumber).setVisible(true);
           } else if(ae.getSource()== mini) {
               new MiniStatement(pinnumber).setVisible(true);
           }
   }
    public static void main(String args[]) {
        new Transactions("");
    }
}