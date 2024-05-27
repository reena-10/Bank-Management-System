
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;


 public class SignUpTwo extends JFrame  implements ActionListener{
     
     
     JTextField religionTextField, categoryTextField, incomeTextField, qualificationTextField, occupationTextField, panTextField ,aadharTextField ,mobileTextField;
     JButton next,back;
     JRadioButton yes, no, Yes, No;
     String formno;
     
     SignUpTwo(String formno) {
         this.formno =formno;
         
         setTitle("Account Opening form-Page No.2");
         setLayout(null);
         
         
         JLabel additional = new JLabel("Additional Details");
         additional.setFont(new Font("Raleway", Font.BOLD, 38));
         additional.setBounds(260,60,400,30);
         add(additional);
         
         JLabel religion = new JLabel("Religion :");
         religion.setFont(new Font("Raleway", Font.BOLD, 20));
         religion.setBounds(100,140,100,30);
         add(religion);
         
        religionTextField = new JTextField();
        religionTextField.setBounds(290,140,400,30);
        religionTextField.setFont(new Font("Arial", Font.BOLD, 16));
        add(religionTextField);
         
         JLabel category = new JLabel("Category :");
         category.setFont(new Font("Raleway", Font.BOLD, 20));
         category.setBounds(100,190,150,30);
         add(category);
         
         categoryTextField = new JTextField();
        categoryTextField.setBounds(290,190,400,30);
        categoryTextField.setFont(new Font("Arial", Font.BOLD, 16));
        add(categoryTextField);
        
         JLabel qualification = new JLabel("Qualification:");
         qualification.setFont(new Font("Raleway",Font.BOLD, 20));
         qualification.setBounds(100,240,500,30);
         add(qualification);
         
        qualificationTextField = new JTextField();
        qualificationTextField.setBounds(290,240,400,30);
        qualificationTextField.setFont(new Font("Arial", Font.BOLD, 16));
        add(qualificationTextField);
         
         JLabel citizen = new JLabel("Senior Citizen:");
         citizen.setFont(new Font("Raleway", Font.BOLD,20));
         citizen.setBounds(100,290,200,30);
         add(citizen);
         
         yes = new JRadioButton("Yes");
         yes.setBounds(300,290,60,30);
         yes.setBackground(Color.WHITE);
         add(yes);
         
         no= new JRadioButton("No");
         no.setBounds(390,290,120,30);
         no.setBackground(Color.WHITE);
         add(no);
         
         ButtonGroup gendergroup = new ButtonGroup();
         gendergroup.add(yes);
         gendergroup.add(no);
         
         
         JLabel pan = new JLabel("PAN No. :");
         pan.setFont(new Font("Raleway", Font.BOLD,20));
         pan.setBounds(100,340,300,30);
         add(pan);
         
         panTextField = new JTextField();
        panTextField.setBounds(290,340,400,30);
        panTextField.setFont(new Font("Arial", Font.BOLD, 16));
        add(panTextField);
        
         JLabel aadhar = new JLabel("Aadhar No. :");
         aadhar.setFont(new Font("Raleway", Font.BOLD,20));
         aadhar.setBounds(100,390,300,30);
         add(aadhar);
         
         aadharTextField = new JTextField();
        aadharTextField.setBounds(290,390,400,30);
        aadharTextField.setFont(new Font("Arial", Font.BOLD, 16));
        add(aadharTextField);
         
         
       JLabel occupation = new JLabel("Occupation:");
         occupation.setFont(new Font("Raleway", Font.BOLD,20));
         occupation.setBounds(100,440,300,30);
         add(occupation);
         
         occupationTextField = new JTextField();
        occupationTextField.setBounds(290,440,400,30);
        occupationTextField.setFont(new Font("Arial", Font.BOLD, 16));
        add(occupationTextField);
         
        JLabel income= new JLabel("Income:");
         income.setFont(new Font("Raleway", Font.BOLD,20));
         income.setBounds(100,490,150,30);
         add(income);
         
         incomeTextField = new JTextField();
        incomeTextField.setBounds(290,490,400,30);
        incomeTextField.setFont(new Font("Arial", Font.BOLD, 16));
        add(incomeTextField);
         

         JLabel existing = new JLabel("Existing A/c:");
         existing.setFont(new Font("Railway", Font.BOLD,20));
         existing.setBounds(100,540,150,30);
         add(existing);
         
         Yes = new JRadioButton("YES");
         Yes.setBounds(300,540,100,30);
         Yes.setBackground(Color.WHITE);
         add(Yes);
         
         No = new JRadioButton("NO");
         No.setBounds(420,540,120,30);
         No.setBackground(Color.WHITE);
         add(No);
         
         JLabel mobile = new JLabel("Mobile No. :");
         mobile.setFont(new Font("Railway",Font.BOLD,20));
         mobile.setBounds(100,590,200,30);
         add(mobile);
         
        mobileTextField = new JTextField();
        mobileTextField.setBounds(290,590,400,30);
        mobileTextField.setFont(new Font("Arial", Font.BOLD, 16));
        add(mobileTextField);
         
       /*  JLabel city = new JLabel("City:");
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
        add(stateTextField);*/
        
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
          
           String sreligion = (String)religionTextField.getText();//setText
           String scategory = (String)categoryTextField.getText();
           String sincome = (String)incomeTextField.getText();
          if (ae.getSource()== next) {
           String citizen = null;
            if (yes.isSelected()) {
                citizen = "Yes";
            }else if(no.isSelected()) {
                citizen= "No";
            }
   
            String squalification = (String)qualificationTextField.getText();
            String exiting = null;
            if(Yes.isSelected())  {
                exiting = "YES";
            }else if (No.isSelected()) {
                exiting="NO";
            }
            String soccupation = (String)occupationTextField.getText();
            String saadhar = (String)aadharTextField.getText();
            String span = (String)panTextField.getText();
           
            
           try {
               if (sreligion.equals("")) {
                  JOptionPane.showMessageDialog(null,"not completed");
              }else 
               {
                   Conn c= new Conn();
                   String query ="insert into signuptwo values('"+formno+"','"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+citizen+"','"+squalification+"','"+exiting+"','"+soccupation+"','"+saadhar+"','"+span+"')";
                   c.s.executeUpdate(query);
                
                    //SignUpThree Object
                    setVisible(false);
                    new SignUpThree(formno).setVisible(true);
                   
               }
            } catch (Exception e) {
                System.out.println(e);
            }
           }else if(ae.getSource() == back) {
            setVisible(false);
            new SignUpOne().setVisible(true);
        }
        }
     public static void main(String args[]) {
         new SignUpTwo("");
     }
}
