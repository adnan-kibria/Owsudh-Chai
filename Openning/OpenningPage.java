package Openning;
import javax.swing.*;

import Openning.Entry.*;

import java.awt.*;
import java.awt.event.*;
public class OpenningPage extends JFrame implements ActionListener
{
    JPanel panel;
    Color c1,c2,c3,c4;
    Font f1,f2;
    JLabel jL1,jL2,jL3;
    JButton jb1,jb2;
    ImageIcon img1,img2;
    public OpenningPage()
    {
        super("Owsudh Chai");
        super.setBounds(190,65,1000,620);
        img1 = new ImageIcon("Image/Logo.png");
        super.setIconImage(img1.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);

        c1 = new Color(238,50,51);
        c2 = new Color(85,98,100);
        c3 = new Color(51,153,255);
        c4 = new Color(0,204,102);

        f1 = new Font("Agency FB",Font.BOLD,50);
        f2 = new Font("Agency FB",Font.PLAIN,20);

        jL1 = new JLabel("Welcome To ");
        jL1.setBounds(280,420,220,40);
        jL1.setFont(f1);
        jL1.setBackground(c2);
        jL1.setForeground(c3);
        panel.add(jL1);

        jL2 = new JLabel("Owsudh Chai");
        jL2.setBounds(500,420,220,40);
        jL2.setFont(f1);
        jL2.setBackground(c2);
        jL2.setForeground(c4);
        panel.add(jL2);

        jb1 = new JButton("Cancel");
        jb1.setBounds(380,490,100,30);
        jb1.setFont(f2);
        jb1.setBackground(c3);
        jb1.setForeground(Color.WHITE);
        jb1.addActionListener(this);
        panel.add(jb1);

        jb2 = new JButton("Continue");
        jb2.setBounds(505,490,100,30);
        jb2.setFont(f2);
        jb2.setBackground(c4);
        jb2.setForeground(Color.WHITE);
        jb2.addActionListener(this);
        panel.add(jb2);

        img2 = new ImageIcon("Image/Entry.png");
        jL3 = new JLabel(img2);
        jL3.setBounds(0,0,1000,620);
        panel.add(jL3);

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource() == jb1)
        {
            System.exit(0);
        }
        else if(ae.getSource() == jb2)
        {
            EntryPage ep = new EntryPage();
            ep.setVisible(true);
            this.setVisible(false);
        }
        else{}
    }
}