package Openning.Entry.Register;

import javax.swing.*;

import Openning.Entry.*;
import Openning.Entry.Login.*;
import Openning.Entry.Register.Userinfo.*;

import java.awt.*;
import java.awt.event.*;
public class RegisterPage extends JFrame implements ActionListener
{
    JPanel panel;
    Color c1,c2,c3,c4,c5;
    Font f1,f2,f3;
    JLabel jL1,jL2,jL3,jL4,jL5,jL6,jL7,jL8,jL9,jL10,jL11,jL12,jL13,jL14,jL15,jL16,jL17,j18;
    JTextField jTF1,jTF2,jTF3,jTF4;
    JComboBox jCB1;
    JPasswordField jPF1,jPF2;
    JTextArea jTA1;
    JButton jB1,jB2,jB3;
    ImageIcon img1,img2;
    public RegisterPage()
    {
        super("Owsudh Chai");
        super.setBounds(196,65,1000,620);
        img1 = new ImageIcon("Image/Logo.png");
        super.setIconImage(img1.getImage());
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);

        f1 = new Font("Agency FB",Font.BOLD,40);
        f2 = new Font("Agency FB",Font.BOLD,20);
        f3 = new Font("Agency FB",Font.PLAIN,15);
        c1 = new Color(81,163,0);
        c2 = new Color(0,204,102);
        c3 = new Color(225,253,213);
        c4 = new Color(231,27,28);
        c5 = new Color(115,181,50);

        jL2 = new JLabel("First Name");
        jL2.setBounds(510,80,100,20);
        jL2.setFont(f2);
        jL2.setForeground(c1);
        panel.add(jL2);

        jL3 = new JLabel("*");
        jL3.setBounds(575,80,10,20);
        jL3.setFont(f2);
        jL3.setForeground(Color.RED);
        panel.add(jL3);

        jTF1 = new JTextField();
        jTF1.setBounds(510,100,150,22);
        jTF1.setFont(f3);
        jTF1.setBackground(c3);
        panel.add(jTF1);

        jL4 = new JLabel("Last Name");
        jL4.setBounds(680,80,100,20);
        jL4.setFont(f2);
        jL4.setForeground(c1);
        panel.add(jL4);

        jL5 = new JLabel("*");
        jL5.setBounds(742,80,10,20);
        jL5.setFont(f2);
        jL5.setForeground(Color.RED);
        panel.add(jL5);

        jTF2 = new JTextField();
        jTF2.setBounds(680,100,150,22);
        jTF2.setFont(f3);
        jTF2.setBackground(c3);
        panel.add(jTF2);

        jL6 = new JLabel("Username");
        jL6.setBounds(510,130,100,20);
        jL6.setFont(f2);
        jL6.setForeground(c1);
        panel.add(jL6);

        jL7 = new JLabel("*");
        jL7.setBounds(572,130,10,20);
        jL7.setFont(f2);
        jL7.setForeground(Color.RED);
        panel.add(jL7);

        jTF3 = new JTextField();
        jTF3.setBounds(510,150,320,22);
        jTF3.setFont(f3);
        jTF3.setBackground(c3);
        panel.add(jTF3);

        jL6 = new JLabel("Phone Number");
        jL6.setBounds(510,180,100,20);
        jL6.setFont(f2);
        jL6.setForeground(c1);
        panel.add(jL6);

        jL7 = new JLabel("*");
        jL7.setBounds(600,180,10,20);
        jL7.setFont(f2);
        jL7.setForeground(Color.RED);
        panel.add(jL7);

        jTF4 = new JTextField();
        jTF4.setBounds(510,200,320,22);
        jTF4.setFont(f3);
        jTF4.setBackground(c3);
        panel.add(jTF4);

        jL8 = new JLabel("Address");
        jL8.setBounds(510,230,100,20);
        jL8.setFont(f2);
        jL8.setForeground(c1);
        panel.add(jL8);

        jL9 = new JLabel("*");
        jL9.setBounds(560,230,10,20);
        jL9.setFont(f2);
        jL9.setForeground(Color.RED);
        panel.add(jL9);

        jTA1 = new JTextArea();
        jTA1.setBounds(510,250,320,60);
        jTA1.setFont(f3);
        jTA1.setBackground(c3);
        panel.add(jTA1);

        jL10 = new JLabel("City");
        jL10.setBounds(510,325,30,20);
        jL10.setFont(f2);
        jL10.setForeground(c1);
        panel.add(jL10);

        jL11 = new JLabel("*");
        jL11.setBounds(534,325,10,20);
        jL11.setFont(f2);
        jL11.setForeground(Color.RED);
        panel.add(jL11);

        String arr1[] = new String[]
		{" ","Dhaka","Rajshahi","Jasshore","Cumilla","Natore","Dinajpur","Sylhet","Chittagong","Pabna"};
        jCB1 = new JComboBox(arr1);
        jCB1.setBounds(550,325,200,20);
        jCB1.setFont(f3);
        jCB1.setBackground(c3);
        panel.add(jCB1);

        jL12 = new JLabel("Password");
        jL12.setBounds(510,360,100,20);
        jL12.setFont(f2);
        jL12.setForeground(c1);
        panel.add(jL12);

        jL13 = new JLabel("*");
        jL13.setBounds(572,360,10,20);
        jL13.setFont(f2);
        jL13.setForeground(Color.RED);
        panel.add(jL13);

        jPF1 = new JPasswordField();
        jPF1.setBounds(510,380,150,22);
        jPF1.setFont(f3);
        jPF1.setBackground(c3);
        panel.add(jPF1);

        jL14 = new JLabel("Confirm Password");
        jL14.setBounds(680,360,120,20);
        jL14.setFont(f2);
        jL14.setForeground(c1);
        panel.add(jL14);

        jL15 = new JLabel("*");
        jL15.setBounds(792,360,10,20);
        jL15.setFont(f2);
        jL15.setForeground(Color.RED);
        panel.add(jL15);

        jPF2 = new JPasswordField();
        jPF2.setBounds(680,380,150,22);
        jPF2.setFont(f3);
        jPF2.setBackground(c3);
        panel.add(jPF2);

        jL16 = new JLabel("Create New Account");
        jL16.setBounds(510,20,500,50);
        jL16.setFont(f1);
        jL16.setForeground(c1);
        panel.add(jL16);

        jB3 = new JButton("Back");
        jB3.setBounds(600,470,150,30);
        jB3.setFont(f2);
        jB3.setBackground(c5);
        jB3.setForeground(Color.WHITE);
        jB3.addActionListener(this);
        panel.add(jB3);

        jB1 = new JButton("Register");
        jB1.setBounds(510,420,150,30);
        jB1.setFont(f2);
        jB1.setBackground(c1);
        jB1.setForeground(Color.WHITE);
        jB1.addActionListener(this);
        panel.add(jB1);

        jB2 = new JButton("Close");
        jB2.setBounds(680,420,150,30);
        jB2.setFont(f2);
        jB2.setBackground(c4);
        jB2.setForeground(Color.WHITE);
        jB2.addActionListener(this);
        panel.add(jB2);

        img2 = new ImageIcon("Image/Phase.png");
        jL1 = new JLabel(img2);
        jL1.setBounds(0,0,1000,620);
        panel.add(jL1);
        
        this.add(panel);
    }
    public void actionPerformed(ActionEvent ae) 
    {
       if(ae.getSource() == jB2)
        {
            System.exit(0);
        }
        else if(ae.getSource() == jB3)
        {
             EntryPage ep = new EntryPage();
            ep.setVisible(true);
            this.setVisible(false);
        }
        else if (ae.getSource() == jB1)
        {
            String firstname = jTF1.getText();
            String lastname = jTF2.getText();
			String username = jTF3.getText();
            String phonenumber = jTF4.getText();
            String address = jTA1.getText();
            String city = (String) jCB1.getSelectedItem();
			String confirmpassword = jPF2.getText();
				
			if(firstname.isEmpty()||lastname.isEmpty()||username.isEmpty()||phonenumber.isEmpty()||address.isEmpty()||city.isEmpty()||confirmpassword.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"You must fill all of above!");
			}
			else
			{		
				UserInfo ui = new UserInfo (firstname,lastname,username,phonenumber,address,city,confirmpassword);
				ui.addInfo();
					
				JOptionPane.showMessageDialog(this,"Registration Successful!");
				
                jTF1.setText("");
                jTF2.setText("");
				jTF3.setText("");
                jTF4.setText("");
                jTA1.setText("");
                jCB1.setSelectedItem("");
				jPF2.setText("");

            LoginPage lp = new LoginPage();
            lp.setVisible(true);
            this.setVisible(false);
            }    
        }
        else {}
    }
}