package Openning.Entry.Admin.AdminPortal;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
public class AdminPortal extends JFrame implements ActionListener
{
    JPanel jP1,jP2,jP3,jP4;
    JLabel jL1,jL2,JL3;
    JButton jB1;
    ImageIcon img1,img2;
    Color c1,c2,c3;
    Font f1,f2,f3,f4;
    JTable t;
    DefaultTableModel m;
    JScrollPane s;
    private String[] column = { "Name", "User Name", "Phone Number", "Address", "City", "Password" };
    private String[] rows = new String[6];
    public AdminPortal()
    {
        super("Owsudh Chai");
        super.setBounds(190,65,1000,620);
        img1 = new ImageIcon("Image/Logo.png");
        super.setIconImage(img1.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f1 = new Font("Agency FB",Font.PLAIN,30);
        f2 = new Font("Agency FB",Font.BOLD,40);
        f3 = new Font("Agency FB",Font.BOLD,20);
        f4 = new Font("Agency FB",Font.PLAIN,18);
        c1 = new Color(231,27,28);
        c2 = new Color(81,163,0);
		c3 = new Color(225,253,213);

        jP1 = new JPanel();
        jP1.setLayout(null);

        jL2 = new JLabel("Admin Portal");
        jL2.setBounds(10,10,500,33);
        jL2.setFont(f2);
        jL2.setForeground(c2);
        jP1.add(jL2);

        jL2 = new JLabel("Customer Info");
        jL2.setBounds(10,50,500,33);
        jL2.setFont(f1);
        jL2.setForeground(c2);
        jP1.add(jL2);

        jB1 = new JButton("Close");
        jB1.setBounds(430,530,150,30);
        jB1.setFont(f3);
        jB1.setBackground(c1);
        jB1.setForeground(Color.WHITE);
        jB1.addActionListener(this);
        jP1.add(jB1);

        t = new JTable();
        m = new DefaultTableModel();
        m.setColumnIdentifiers(column);

        t.setModel(m);
        t.setFont(f4);
		t.setBackground(c3);
        t.setForeground(Color.BLACK);
        t.setRowHeight(30);
        t.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        t.getColumnModel().getColumn(0).setPreferredWidth(200);
        t.getColumnModel().getColumn(1).setPreferredWidth(100);
        t.getColumnModel().getColumn(2).setPreferredWidth(150);
        t.getColumnModel().getColumn(3).setPreferredWidth(300);
        t.getColumnModel().getColumn(4).setPreferredWidth(100);
        t.getColumnModel().getColumn(5).setPreferredWidth(100);

        s = new JScrollPane(t);
        s.setBounds(20, 90, 950, 420);
        s.setBackground(c3);
        jP1.add(s);

        String file = "./Openning/Entry/Login/Privatedata.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line;

			while ((line = reader.readLine()) != null) 
			{
				if (line.startsWith("Name")) 
				{
					rows[0] = line.substring(6).trim();
				} 
				else if (line.startsWith("User Name")) 
				{
					rows[1] = line.substring(11).trim();
				} 
				else if (line.startsWith("Phone Number")) 
				{
					rows[2] = line.substring(14).trim();
				} 
				else if (line.startsWith("Address")) 
				{
					rows[3] = line.substring(9).trim();
				} else if (line.startsWith("City")) 
				{
					rows[4] = line.substring(6).trim();
				} 
				else if (line.startsWith("Password")) 
				{
					rows[5] = line.substring(10).trim();
					m.addRow(rows);
					rows = new String[6];
				}
			}
			} 
			catch (Exception ex) 
			{
				ex.printStackTrace();
			}


        img2 = new ImageIcon("Image/Background.png");
        jL1 = new JLabel(img2);
        jL1.setBounds(0,0,1000,620);
        jP1.add(jL1); 

        this.add(jP1);
    }
    public void actionPerformed(ActionEvent ae) 
    {
        if (ae.getSource() == jB1)
        {
            System.exit(0);
        }
       else {}
    }
}
