
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton login, signup, clear;
    JTextField CardTextField;
    JPasswordField PinTextField;
    
    Login() {
       setTitle("AUTOMATED TELLER MACHINE");
       
       setLayout(null);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
       Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel label = new JLabel(i3);
       label.setBounds(70,10,100,100);
       add(label);
       
       JLabel text =  new JLabel("WELCOME TO ATM");
       text.setFont(new Font("Osward", Font.BOLD,38));
       text.setBounds(200,40,400,40);
       add(text);
       
        JLabel CardNo =  new JLabel("Card No :");
        CardNo.setFont(new Font("Railway", Font.BOLD,32));
        CardNo.setBounds(100,150,200,30);
        add(CardNo);
        
        CardTextField = new JTextField();
        CardTextField.setBounds(300,150,280,34);
        CardTextField.setFont(new Font("Arial", Font.BOLD, 16));
        add(CardTextField);
       
        
       JLabel PinNo =  new JLabel("Pin No :");
       PinNo.setFont(new Font("Railway", Font.BOLD,32));
       PinNo.setBounds(100,220,200,30);
       add(PinNo);
  
       PinTextField = new JPasswordField();
       PinTextField.setBounds(300,220,280,34);
       PinTextField.setFont(new Font("Arial", Font.BOLD, 16));
       add(PinTextField);
       
       login = new JButton("SIGN IN");
       login.setBounds(300,300,130,30);
       login.setBackground(Color.BLACK);
       login.setForeground(Color.WHITE);
       login.addActionListener(this);
       add(login);
       
      
       clear = new JButton("CLEAR");
       clear.setBounds(440,300,130,30);
       clear.setBackground(Color.BLACK);
       clear.setForeground(Color.WHITE);
       clear.addActionListener(this);
       add(clear);
       
       signup = new JButton("SIGN UP");
       signup.setBounds(300,350,270,30);
       signup.setBackground(Color.BLACK);
       signup.setForeground(Color.WHITE);
       signup.addActionListener(this);
       add(signup);
       
       getContentPane().setBackground(Color.WHITE);
        
        setSize(700,500);
        setVisible(true);
        setLocation(350,200);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()== clear) {
            CardTextField.setText("");
            PinTextField.setText("");
             }else if(ae.getSource()== login){
                 Conn conn = new Conn();
                 String cardnumber = CardTextField.getText();
                 String pinnumber = PinTextField.getText();
                 String query = "Select*from login where Card_Number ='"+cardnumber+"'and Pin_Number ='"+pinnumber+"'";
                 try {
                    ResultSet rs = conn.s.executeQuery(query);
                    if(rs.next()) {
                        setVisible(false);
                        new Transactions(pinnumber).setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
                    }
                 }catch (Exception e) {
                     System.out.println(e);
                 }
                 
             }else if(ae.getSource()== signup){
                 setVisible(false);
                 new SignUpOne().setVisible(true);
             }
    }
        
    
    public static void main(String args[])  {
      new Login();
  }
}
