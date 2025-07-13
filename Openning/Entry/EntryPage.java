package Openning.Entry;

import javax.swing.*;

import Openning.Entry.Admin.*;
import Openning.Entry.Login.*;
import Openning.Entry.Register.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class EntryPage extends JFrame implements ActionListener
{
    JPanel panel;
    Color c1,c2,c3;
    Font f1;
    JLabel jL1;
    JButton jB1,jB2,jB3,jB4;
    ImageIcon img1,img2;
    public EntryPage()
    {
        super("Owsudh Chai");
        super.setBounds(196,65,1000,620);
        img1 = new ImageIcon("Image/Logo.png");
        super.setIconImage(img1.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c1 = new Color(51,153,255);
        c2 = new Color(81,163,0);
        c3 = new Color(231,27,28);

        f1 = new Font("Agency FB",Font.BOLD,20);

        panel = new JPanel();
        panel.setLayout(null);

        jB1 = new JButton("Login");
        jB1.setBounds(350,460,130,30);
        jB1.setFont(f1);
        jB1.setBackground(c2);
        jB1.setForeground(Color.WHITE);
        jB1.addActionListener(this);
        panel.add(jB1);

        jB2 = new JButton("Register");
        jB2.setBounds(520,460,130,30);
        jB2.setFont(f1);
        jB2.setBackground(c2);
        jB2.setForeground(Color.WHITE);
        jB2.addActionListener(this);
        panel.add(jB2);

        jB3 = new JButton("Admin");
        jB3.setBounds(350,500,130,30);
        jB3.setFont(f1);
        jB3.setBackground(c2);
        jB3.setForeground(Color.WHITE);
        jB3.addActionListener(this);
        panel.add(jB3);

        jB4 = new JButton("Close");
        jB4.setBounds(520,500,130,30);
        jB4.setFont(f1);
        jB4.setBackground(c3);
        jB4.setForeground(Color.WHITE);
        jB4.addActionListener(this);
        panel.add(jB4);

        img2 = new ImageIcon("Image/UserPage.png");
        jL1 = new JLabel(img2);
        jL1.setBounds(0,0,1000,620);
        panel.add(jL1);

        this.add(panel); }
        
    public void actionPerformed(java.awt.event.ActionEvent ae) 
    {
        if(ae.getSource() == jB1)
        {
            LoginPage lp = new LoginPage();
            lp.setVisible(true);
            this.setVisible(false);
        }
        else if (ae.getSource() == jB2)
        {
            RegisterPage rp = new RegisterPage();
            rp.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() == jB3)
        {
            AdminPage ap = new AdminPage();
            ap.setVisible(true);
            this.setVisible(false);
        }
        else if (ae.getSource() == jB4)
        {
            System.exit(0);
        }
        else{}
    }

}