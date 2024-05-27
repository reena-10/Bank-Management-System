
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener{
    
    JPasswordField pin, repin;
    JButton change, back;
    String pinnumber;
    
    PinChange(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);
       
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/ATM.jpg"));
         Image i2 = i1.getImage().getScaledInstance(800,900, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image =  new JLabel(i3);
         image.setBounds( 0, 0, 900, 900);
         add(image);
         
         JLabel pintext = new JLabel("CHANGE YOUR PIN ");
         pintext.setForeground(Color.WHITE);
         pintext.setFont(new Font("System",Font.BOLD,20));
         pintext.setBounds(250,300,500,35);
         image.add(pintext);
         
         JLabel text = new JLabel("New PIN ");
         text.setForeground(Color.WHITE);
         text.setFont(new Font("System",Font.BOLD,16));
         text.setBounds(200,360,180,20);
         image.add(text);
         
         pin = new JPasswordField();
         pin.setFont(new Font("Raleway",Font.BOLD,25));
         pin.setBounds(200,390,180,20);
         image.add(pin);
         
        
         
         JLabel repintext = new JLabel("Re-Enter the New PIN ");
         repintext.setForeground(Color.WHITE);
         repintext.setFont(new Font("System",Font.BOLD,16));
         repintext.setBounds(200,420,180,20);
         image.add(repintext);
         
         repin = new JPasswordField();
         repin.setFont(new Font("Raleway",Font.BOLD,25));
         repin.setBounds(200,450,180,20);
         image.add(repin);
         
         change = new JButton("CHANGE");
         change.setBounds(380,530,120,30);
         change.addActionListener(this);
         image.add(change);
         
         back = new JButton("BACK");
         back.setBounds(200,530,120,30);
         back.addActionListener(this);
         image.add(back);

         
         setSize(900,900);
         setLocation(300,0);
         setUndecorated(true);
         setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == change) {      
      
        try {
            String npin = pin.getText();
            String rpin = repin.getText();
            
            if(!npin.equals(rpin)) {
                JOptionPane.showMessageDialog(null, "Entered PIN doesn't match");
                return;
            }
               if(npin.equals("")) {
                   JOptionPane.showMessageDialog(null, "Please Enter New PIN");
                   return;
               }
               
                 if(rpin.equals("")) {
                   JOptionPane.showMessageDialog(null, "Please Re-Enter New PIN");
                   return; 
                 }
               
                Conn conn = new Conn();
               String query1 = "update bank set Pin_Number = '"+rpin+"' where Pin_Number ='"+pinnumber+"'";
               String query2 = "update login set Pin_Number = '"+rpin+"' where Pin_Number ='"+pinnumber+"'";
               String query3 = "update signupthree set Pin_Number = '"+rpin+"' where Pin_Number ='"+pinnumber+"'";

               conn.s.executeUpdate(query1);
               conn.s.executeUpdate(query2);
               conn.s.executeUpdate(query3);
              
               JOptionPane.showMessageDialog(null, "PIN Changed Sucessfully");
               
               
               setVisible(false);
               new Transactions(rpin).setVisible(true);
                 
           }catch (Exception e) {
                System.out.println(e);
          }
       }else{
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    public static void main(String args[])  {
      new PinChange("").setVisible(true);
  }
}
