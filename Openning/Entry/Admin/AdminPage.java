package Openning.Entry.Admin;

import javax.swing.*;

import Openning.Entry.*;
import Openning.Entry.Admin.AdminPortal.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
public class AdminPage extends JFrame implements ActionListener
{
    JPanel panel;
    Color c1,c2,c3,c4,c5,c6;
    Font f1,f2,f3,f4;
    JLabel jL1,jL2,jL3,jL4,jL5,jL6;
    JTextField jTF1;
    JPasswordField jPF1;
    JButton jB1,jB2,jB3;
    ImageIcon img1,img2;
    public AdminPage()
    {
        super("Owsudh Chai");
        super.setBounds(196,65,1000,620);
        img1 = new ImageIcon("Image/Logo.png");
        super.setIconImage(img1.getImage());
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);

        f1 = new Font("Agency FB",Font.BOLD,20);
        f2 = new Font("Agency FB",Font.BOLD,40);
        f3 = new Font("Agency FB",Font.PLAIN,25);
        f4 = new Font("Agency FB",Font.PLAIN,20);
        c1 = new Color(81,163,0);
        c2 = new Color(231,27,28);
        c3 = new Color(235,235,235);
        c4 = new Color(51,153,255);
        c5 = new Color(115,181,50);
        c6 = new Color(225,253,213);

        jL1 = new JLabel("Username");
        jL1.setBounds(510,245,100,20);
        jL1.setFont(f1);
        jL1.setForeground(c1);
        panel.add(jL1);

        jL2 = new JLabel("*");
        jL2.setBounds(570,245,10,20);
        jL2.setFont(f1);
        jL2.setForeground(Color.RED);
        panel.add(jL2);

        jTF1 = new JTextField();
        jTF1.setBounds(510,270,340,30);
        jTF1.setFont(f4);
        jTF1.setBackground(c6);
        panel.add(jTF1);

        jL3 = new JLabel("Password");
        jL3.setBounds(510,315,100,20);
        jL3.setFont(f1);
        jL3.setForeground(c1);
        panel.add(jL3);

        jL4 = new JLabel("*");
        jL4.setBounds(570,315,10,20);
        jL4.setFont(f1);
        jL4.setForeground(Color.RED);
        panel.add(jL4);

        jPF1 = new JPasswordField();
        jPF1.setBounds(510,340,345,30);
        jPF1.setFont(f4);
        jPF1.setBackground(c6);
        panel.add(jPF1);

        jL5 = new JLabel("Welcome to Owsudh Chai!");
        jL5.setBounds(510,160,500,33);
        jL5.setFont(f2);
        jL5.setForeground(c1);
        panel.add(jL5);

        jL6 = new JLabel("Our vision is help you to cure your diseases.");
        jL6.setBounds(510,200,500,30);
        jL6.setFont(f3);
        jL6.setForeground(c4);
        panel.add(jL6);

        jB1 = new JButton("Login");
        jB1.setBounds(513,390,150,30);
        jB1.setFont(f1);
        jB1.setBackground(c1);
        jB1.setForeground(Color.WHITE);
        jB1.addActionListener(this);
        panel.add(jB1);

        jB2 = new JButton("Close");
        jB2.setBounds(700,390,150,30);
        jB2.setFont(f1);
        jB2.setBackground(c2);
        jB2.setForeground(Color.WHITE);
        jB2.addActionListener(this);
        panel.add(jB2);

        jB3 = new JButton("Back");
        jB3.setBounds(610,440,150,30);
        jB3.setFont(f1);
        jB3.setBackground(c5);
        jB3.setForeground(Color.WHITE);
        jB3.addActionListener(this);
        panel.add(jB3);

        img2 = new ImageIcon("Image/Phase.png");
        jL1 = new JLabel(img2);
        jL1.setBounds(0,0,1000,620);
        panel.add(jL1);

        this.add(panel);
    }
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource() ==jB2)
        {
            System.exit(0);
        }
        else if(ae.getSource() == jB1)
        {
            String tField = jTF1.getText();
            String pField = jPF1.getText(); 

                if (tField.isEmpty() || pField.isEmpty()) 
                {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                    JOptionPane.WARNING_MESSAGE);
                } 
                else 
                {

                    try {

                        String userNameS = "Name : " + tField;
                        String passwordS = "Password : " + pField;
                        BufferedReader reader = new BufferedReader(new FileReader("./Openning/Entry/Admin/Admindata.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i <= totalLines; i++) {
                            String line = Files.readAllLines(Paths.get("./Openning/Entry/Admin/Admindata.txt")).get(i);
                            if (line.equals(userNameS)) {
                                String line2 = Files.readAllLines(Paths.get("./Openning/Entry/Admin/Admindata.txt")).get((i + 1));
                                if (line2.equals(passwordS)) {
                                    JOptionPane.showMessageDialog(null, "Admin Login Successful.", "Owsudh Cai",
                                            JOptionPane.WARNING_MESSAGE);

                                    AdminPortal ap = new AdminPortal();
                                    ap.setVisible(true);
                                    this.setVisible(false);
                                    break;
                                }
                            }
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Invalid Name or Password!", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }
                }

        }
    
        else if(ae.getSource() == jB3)
        {
            EntryPage ep = new EntryPage();
            ep.setVisible(true);
            this.setVisible(false);
        }
        else {}
    }

}