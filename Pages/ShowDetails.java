package Pages;

import javax.swing.*;    
import java.awt.event.*;  
import java.awt.*;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ShowDetails extends JFrame implements ActionListener 
{ 

    JButton b1,b2,b3,b4,b5;
	JFrame f;// obj 
	Font font;
	


    ShowDetails() 
	{
	
		f=new JFrame("Owsudh Chai");
		font=new Font("Agency FB",Font.BOLD,18);
		
		Color c1 = new Color(26,95,122); 
	    Color c2 = new Color(81,163,0);
		Color c3 = new Color(115,181,50);
        final JLabel label = new JLabel();            
        label.setBounds(20,150, 200,50);
		
		
        b1 = new JButton("HOME");
        b1.setBounds(45,5,100,40); 
		//b1.setForeground(c2);
		b1.setForeground(Color.WHITE);	
        b1.setBackground(c2);	
		b1.setFont(new Font("Agency FB", Font.BOLD, 20));
	    b1.addActionListener(this);
	    //b1.setBackground(Color.CYAN);
		
	    b2 = new JButton("ACCOUNT"); 
        b2.setBounds(700,5,140,40);
        //b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Agency FB", Font.BOLD, 20));
        b2.setForeground(Color.WHITE);	
        b2.setBackground(c2);		
	    b2.addActionListener(this);
	    //b2.setBackground(Color.CYAN);
		//b2.setBackground(c1);
		
	    b3 = new JButton("CART"); 	 
		b3.setFont(new Font("Agency FB", Font.BOLD, 20));
        b3.setBounds(860,5,80,40);
        b3.setForeground(Color.WHITE);	
        b3.setBackground(c2);		
	    b3.addActionListener(this);
	    //b3.setBackground(Color.CYAN);
		//b3.setBackground(c1);
		//b3.setForeground(Color.WHITE);
		
				
		b4 = new JButton("BACK"); 	 
        b4.setBounds(400,520,100,40);
		b4.setForeground(Color.WHITE);	
        b4.setBackground(c3);
        b4.setFont(new Font("Agency FB", Font.BOLD, 20));		
	    b4.addActionListener(this);
		
		
		b5 = new JButton("Close"); 	 
        b5.setBounds(530,520,80,40); 
		b5.setFont(new Font("Agency FB", Font.BOLD, 20));
        b5.setForeground(Color.WHITE);	
        b5.setBackground(Color.red);		
	    b5.addActionListener(this);
		
	
	 
        JLabel NAME=new JLabel("NAME :");
        NAME.setBounds(50,100,100,40);
		NAME.setFont(font);
		
		JLabel getNAME=new JLabel("ARNAB ");
        getNAME.setBounds(160,100,200,40);
		getNAME.setFont(font);
		
		
		JLabel PHONE_NUMBER = new JLabel("PHONE NUMBER :");
        PHONE_NUMBER.setBounds(50,150,200,40);
		PHONE_NUMBER.setFont(font);
        
	 
        JLabel ADDRESS = new JLabel("ADDRESS :");    
        ADDRESS.setBounds(50,200,150,40);
        ADDRESS.setFont(font);
		
		JLabel CITY = new JLabel("CITY :");
        CITY.setBounds(50,250,100, 40);
        CITY.setFont(font);
		
		
		JLabel ORDER_QUANTITY=new JLabel("ORDER QUANTITY :");
        ORDER_QUANTITY.setBounds(50,300,200,40);
		ORDER_QUANTITY.setFont(font);

		

		

	    
	    ImageIcon ImageIcon = new ImageIcon("L1.png");// JFrame logo change
        Image Image = ImageIcon.getImage();
        f.setIconImage(Image);
	
	    JLabel Background;
	    ImageIcon img = new ImageIcon("P1.png");
	    Background = new JLabel ("",img,JLabel.CENTER);
	    Background.setBounds(0,0,1000,620);

	    f.add(NAME); 
		f.add(getNAME);
		f.add(PHONE_NUMBER);
	    f.add(ADDRESS); 
	    f.add(CITY);
		f.add(ORDER_QUANTITY);
	    f.add(b1); 
	    f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
	    f.add(Background);
	 
	    f.setSize(1000,620); //196,65,1000,620   
	    f.setLayout(null);
        f.setLocationRelativeTo(null);     
	    f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    f.setResizable(false);
} 
	public void actionPerformed(ActionEvent e) 
	{
        if(e.getSource() == b1)
		{
			int choice =JOptionPane.showConfirmDialog(null, " DO YOU WANT TO GO HOME PAGE ? ","BACK HOME PAGE",JOptionPane.YES_NO_OPTION);
			if(choice==JOptionPane.YES_OPTION)
			{
				new Homepage1();
				f.setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "CANCEL");
			}

		}
		else if(e.getSource() == b2)
		{
			int choice =JOptionPane.showConfirmDialog(null, " DO YOU WANT TO GO ACCOUNT PAGE ? ","GO TO ACCOUNT PAGE",JOptionPane.YES_NO_OPTION);
			if(choice==JOptionPane.YES_OPTION)
			{
				new ShowDetails();
				f.setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "CANCEL");
			}
		}
		else if(e.getSource() == b3)
		{
		    int choice =JOptionPane.showConfirmDialog(null, " DO YOU WANT TO GO CART PAGE ? ","GO TO CART PAGE",JOptionPane.YES_NO_OPTION);
			if(choice==JOptionPane.YES_OPTION)
			{
				new Cart();
				f.setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "CANCEL");
			}
		}
		
		else if(e.getSource() == b4)
		{
		    int choice =JOptionPane.showConfirmDialog(null, " DO YOU WANT TO GO BACK ? ","GO TO BACK",JOptionPane.YES_NO_OPTION);
			if(choice==JOptionPane.YES_OPTION)
			{
				new Homepage1();
				f.setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "CANCEL");
			}
		}
		else if (e.getSource() == b5)
		{
		    try
		    {
                int choice =JOptionPane.showConfirmDialog(null, " DO YOU WANT TO EXIT ? ","EXIT",JOptionPane.YES_NO_OPTION);
			    if(choice==JOptionPane.YES_OPTION)
			    {
				    System.exit(0);
			    }
			     else
			    {
				    JOptionPane.showMessageDialog(null, "CANCEL");
			    }
		    }catch (Exception ex) {}
		}	
    }
}