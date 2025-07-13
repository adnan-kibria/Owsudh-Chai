package Pages;
import javax.swing.*;    
import java.awt.event.*;  
import java.awt.*;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.io.IOException;
import javax.swing.JOptionPane;

import Pages.Checkout;
 
public class Bkash extends JFrame implements ActionListener 
{
 
    JButton b1,b2,b3,b4,b5,b6;
	JFrame f;// obj 
	Font font;
	final JTextField text1;

 
 
    Bkash() 
	{
		f=new JFrame("Owsudh Chai");
		font=new Font("Agency FB",Font.BOLD,20);
		Color c1 = new Color(26,95,122); 
	    Color c2 = new Color(81,163,0);
		Color c3 = new Color(115,181,50);
        final JLabel label = new JLabel();            
        label.setBounds(20,150, 200,50);
		JLabel p1 =new JLabel("BKASH PHONE NUMBER");
        p1.setBounds(50,50,200,40);
		p1.setFont(font);
		text1 = new JTextField(); 
        text1.setBounds(50,100,400,40);
        b1 = new JButton("SEND OTP");
        b1.setBounds(50,150,200,40); 
		b1.setForeground(Color.WHITE);	
        b1.setBackground(c2);	
		b1.setFont(new Font("Agency FB", Font.BOLD, 20));
	    b1.addActionListener(this);
 
				
		b2 = new JButton("BACK"); 	 
        b2.setBounds(50,350,100,40);
		b2.setForeground(Color.WHITE);	
        b2.setBackground(c3);
        b2.setFont(new Font("Agency FB", Font.BOLD, 20));		
	    b2.addActionListener(this);

		b3 = new JButton("Close"); 	 
        b3.setBounds(350,350,80,40); 
		b3.setFont(new Font("Agency FB", Font.BOLD, 20));
        b3.setForeground(Color.WHITE);	
        b3.setBackground(Color.red);		
	    b3.addActionListener(this);
 
 
		
 
		
 
	    
	    ImageIcon ImageIcon = new ImageIcon("L1.png");// JFrame logo change
        Image Image = ImageIcon.getImage();
        f.setIconImage(Image);
	    JLabel Background;
	    ImageIcon img = new ImageIcon("P1.png");
	    Background = new JLabel ("",img,JLabel.CENTER);
	    Background.setBounds(0,0,1000,620);
 
	    f.add(p1); 
	    f.add(b1); 
	    f.add(b2);
		f.add(b3);
		f.add(text1);
	    f.add(Background);
	    f.setSize(500,500);
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
			JOptionPane.showMessageDialog(null, "SEND OTP SUCCESSFULLY");
		}
		else if(e.getSource() == b2)
		{
			int choice =JOptionPane.showConfirmDialog(null, " DO YOU WANT TO GO CHECKOUT PAGE ? ","GO TO CHECKOUT PAGE",JOptionPane.YES_NO_OPTION);
			if(choice==JOptionPane.YES_OPTION)
			{
				new Checkout();
				f.setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "CANCEL");
			}
		}
 
		else if (e.getSource() == b3)
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