package Pages;

import javax.swing.*;    
import java.awt.event.*;  
import java.awt.*;

import javax.imageio.*;
import java.io.IOException;

public class Homepage1 extends JFrame implements ActionListener 
{ 
    JLabel j1,j2,j3,j5,j6,j7,j8,j9,j10,j11,j12,j13,j14,j15,j16,j17,j18,j19,j20,j21,j22,j23,j24,j25,j26,j27,j28,j29,j30,j31,j32,j33,j34,j35,j36,j37,j38,j39,j40,j41;
	JComboBox jcb1,jcb2,jcb3,jcb4,jcb5,jcb6,jcb7,jcb8,jcb9,jcb10;
    JButton b1, b2, b3, b4, b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
    JFrame f; // obj 
    Font font;
	ImageIcon img1,img2,img3,img4,img5,img6,img7,img8,img9,img10;
	JPanel mainPanel,mainPanel2;
	
	public String selectedValue1,selectedValue2,selectedValue3,selectedValue4,selectedValue5,selectedValue6,selectedValue7,selectedValue8,selectedValue9,selectedValue10;

    public Homepage1() 
	{
        f = new JFrame("Owsudh Chai");
        font = new Font("Agency FB", Font.BOLD, 18);

        Color c1 = new Color(26, 95, 122);
        Color c2 = new Color(81, 163, 0);
        Color c3 = new Color(115, 181, 50);

        b1 = new JButton("HOME");
        b1.setBounds(35, 35, 100, 25);
        b1.setForeground(Color.WHITE);
        b1.setBackground(c2);
        b1.setFont(new Font("Agency FB", Font.BOLD, 18));
        b1.addActionListener(this);

        b2 = new JButton("ACCOUNT");
        b2.setBounds(730, 35, 140, 25);
        b2.setFont(new Font("Agency FB", Font.BOLD, 18));
        b2.setForeground(Color.WHITE);
        b2.setBackground(c2);
        b2.addActionListener(this);

        b3 = new JButton("CART");
        b3.setFont(new Font("Agency FB", Font.BOLD, 18));
        b3.setBounds(880, 35, 80, 25);
        b3.setForeground(Color.WHITE);
        b3.setBackground(c2);
        b3.addActionListener(this);

        b4 = new JButton("BACK");
        b4.setBounds(240, 520, 100, 20);
        b4.setForeground(Color.WHITE);
        b4.setBackground(c2);
        b4.setFont(new Font("Agency FB", Font.BOLD, 18));
        b4.addActionListener(this);

        b5 = new JButton("Close");
        b5.setBounds(850, 540, 80, 25);
        b5.setFont(new Font("Agency FB", Font.BOLD, 20));
        b5.setForeground(Color.WHITE);
        b5.setBackground(Color.RED);
        b5.addActionListener(this);
	
			
        b6 = new JButton("1");
        b6.setBounds(365, 520, 100, 20);
        b6.setFont(new Font("Agency FB", Font.BOLD, 20));
        b6.setForeground(Color.WHITE);
        b6.setBackground(c2);
        b6.addActionListener(this);
		
	    b7 = new JButton("2");
        b7.setBounds(445, 520, 100, 20);
        b7.setFont(new Font("Agency FB", Font.BOLD, 20));
        b7.setForeground(Color.WHITE);
        b7.setBackground(c2);
        b7.addActionListener(this);
		
		b8 = new JButton("3");
        b8.setBounds(530, 520, 100, 20);
        b8.setFont(new Font("Agency FB", Font.BOLD, 20));
        b8.setForeground(Color.WHITE);
        b8.setBackground(c2);
        b8.addActionListener(this);
		
			
        b9 = new JButton("NEXT");
        b9.setBounds(655, 520, 80, 20);
        b9.setForeground(Color.WHITE);
        b9.setBackground(c2);
        b9.setFont(new Font("Agency FB", Font.BOLD, 18));
        b9.addActionListener(this);

		
		
//1		
		
		j1 = new JLabel("Quantity :");
		j1.setBounds(160,225,100,20);
		j1.setBackground(c2);
		j1.setFont(new Font("Agency FB", Font.BOLD, 11));
		j1.setForeground(Color.WHITE);
		

		String[] arr1 = new String[]
		{" ","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};		
		jcb1 = new JComboBox<>(arr1);
		jcb1.setBounds(194,232,50,10);
	

		j2 = new JLabel("Medicine Name: ACE ");
		j2.setBounds(160,190,100,20);
		j2.setBackground(c2);
		j2.setFont(new Font("Agency FB", Font.BOLD, 11));
		j2.setForeground(Color.WHITE);
		

		j3 = new JLabel("Price: Tk 30 ");
		j3.setBounds(160,193,80,50);
		j3.setBackground(c2);
		j3.setFont(new Font("Agency FB", Font.BOLD, 11));
		j3.setForeground(Color.WHITE);
		

		b10 = new JButton("Add To Cart");
		b10.setBounds(155,245,90,15);
		b10.setBackground(c2);
		b10.setFont(new Font("Agency FB", Font.BOLD, 11));
		b10.setForeground(Color.WHITE);
		b10.addActionListener(this);
		
//2
		j15 = new JLabel("Quantity :");
		j15.setBounds(310,225,100,20);
		j15.setBackground(c2);
		j15.setFont(new Font("Agency FB", Font.BOLD, 11));
		j15.setForeground(Color.WHITE);


		String[] arr2 = new String[]
		{" ","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};		
		jcb2 = new JComboBox<>(arr2);
		jcb2.setBounds(344,232,50,10);
	

		j16 = new JLabel
		("Medicine Name:Citra-K");
		j16.setBounds(310,190,100,20);
		j16.setBackground(c2);
		j16.setFont(new Font("Agency FB", Font.BOLD, 11));
		j16.setForeground(Color.WHITE);
			

		j17 = new JLabel("Price: Tk 270 ");
		j17.setBounds(310,193,80,50);
		j17.setBackground(c2);
		j17.setFont(new Font("Agency FB", Font.BOLD, 11));
		j17.setForeground(Color.WHITE);
	

		b11 = new JButton("Add To Cart");
		b11.setBounds(305,245,90,15);
		b11.setBackground(c2);
		b11.setFont(new Font("Agency FB", Font.BOLD, 11));
		b11.setForeground(Color.WHITE);
		b11.addActionListener(this);
		
//3	
		
		
		
		j18 = new JLabel("Quantity :");
		j18.setBounds(450,225,100,20);
		j18.setBackground(c2);
		j18.setFont(new Font("Agency FB", Font.BOLD, 11));
		j18.setForeground(Color.WHITE);


		String[] arr3 = new String[]
		{" ","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};		
		jcb3 = new JComboBox<>(arr3);
		jcb3.setBounds(484,232,50,10);
	

		j19 = new JLabel
		("Medicine Name: Urikal");
		j19.setBounds(450,190,100,20);
		j19.setBackground(c2);
		j19.setFont(new Font("Agency FB", Font.BOLD, 11));
		j19.setForeground(Color.WHITE);
			

		j20 = new JLabel("Price: Tk 180 ");
		j20.setBounds(450,193,80,50);
		j20.setBackground(c2);
		j20.setFont(new Font("Agency FB", Font.BOLD, 11));
		j20.setForeground(Color.WHITE);
	

		b12 = new JButton("Add To Cart");
		b12.setBounds(445,245,90,15);
		b12.setBackground(c2);
		b12.setFont(new Font("Agency FB", Font.BOLD, 11));
		b12.setForeground(Color.WHITE);
		b12.addActionListener(this);
		
		
		
//4		
		
		
		j21 = new JLabel("Quantity :");
		j21.setBounds(590,225,100,20);
		j21.setBackground(c2);
		j21.setFont(new Font("Agency FB", Font.BOLD, 11));
		j21.setForeground(Color.WHITE);


		String[] arr4 = new String[]
		{" ","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};		
		jcb4 = new JComboBox<>(arr4);
		jcb4.setBounds(624,232,50,10);
	

		j22 = new JLabel
		("Medicine Name: NapaDol");
		j22.setBounds(590,190,100,20);
		j22.setBackground(c2);
		j22.setFont(new Font("Agency FB", Font.BOLD, 11));
		j22.setForeground(Color.WHITE);
			

		j23 = new JLabel("Price: Tk 86 ");
		j23.setBounds(590,193,80,50);
		j23.setBackground(c2);
		j23.setFont(new Font("Agency FB", Font.BOLD, 11));
		j23.setForeground(Color.WHITE);
	

		b13 = new JButton("Add To Cart");
		b13.setBounds(585,245,90,15);
		b13.setBackground(c2);
		b13.setFont(new Font("Agency FB", Font.BOLD, 11));
		b13.setForeground(Color.WHITE);
		b13.addActionListener(this);
		
		
//5		
		
		
		
		j24 = new JLabel("Quantity :");
		j24.setBounds(730,225,100,20);
		j24.setBackground(c2);
		j24.setFont(new Font("Agency FB", Font.BOLD, 11));     
		j24.setForeground(Color.WHITE);


		String[] arr5 = new String[]
		{" ","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};		
		jcb5 = new JComboBox<>(arr5);
		jcb5.setBounds(764,232,50,10);
	

		j25 = new JLabel
		("Medicine Name: Harnal");
		j25.setBounds(730,190,100,20);
		j25.setBackground(c2);
		j25.setFont(new Font("Agency FB", Font.BOLD, 11));
		j25.setForeground(Color.WHITE);
			

		j26 = new JLabel("Price: Tk 2802 ");
		j26.setBounds(730,193,80,50);
		j26.setBackground(c2);
		j26.setFont(new Font("Agency FB", Font.BOLD, 11));
		j26.setForeground(Color.WHITE);
	

		b14 = new JButton("Add To Cart");
		b14.setBounds(725,245,90,15);
		b14.setBackground(c2);
		b14.setFont(new Font("Agency FB", Font.BOLD, 11));
		b14.setForeground(Color.WHITE);
		b14.addActionListener(this);
		
		
		
//6		
		
		
		
		
		
		j27 = new JLabel("Quantity :");
		j27.setBounds(160,433,100,20);
		j27.setBackground(c2);
		j27.setFont(new Font("Agency FB", Font.BOLD, 11));
		j27.setForeground(Color.WHITE);
		

		String[] arr6 = new String[]
		{" ","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};		
		jcb6 = new JComboBox<>(arr6);
		jcb6.setBounds(194,440,50,10);
	

		j28 = new JLabel("Medicine Name: Muconil ");
		j28.setBounds(160,399,100,20);
		j28.setBackground(c2);
		j28.setFont(new Font("Agency FB", Font.BOLD, 11));
		j28.setForeground(Color.WHITE);
		

		j29 = new JLabel("Price: Tk 29 ");
		j29.setBounds(160,402,80,50);
		j29.setBackground(c2);
		j29.setFont(new Font("Agency FB", Font.BOLD, 11));
		j29.setForeground(Color.WHITE);
		

		b15 = new JButton("Add To Cart");
		b15.setBounds(155,458,90,15);
		b15.setBackground(c2);
		b15.setFont(new Font("Agency FB", Font.BOLD, 11));
		b15.setForeground(Color.WHITE);
		b15.addActionListener(this);
		
//7  



		
		j30 = new JLabel("Quantity :");
		j30.setBounds(310,433,100,20);
		j30.setBackground(c2);
		j30.setFont(new Font("Agency FB", Font.BOLD, 11));
		j30.setForeground(Color.WHITE);
		

		String[] arr7= new String[]
		{" ","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};		
		jcb7 = new JComboBox<>(arr7);
		jcb7.setBounds(344,440,50,10);
	

		j31 = new JLabel("Medicine Name: Esipram ");
		j31.setBounds(310,399,100,20);
		j31.setBackground(c2);
		j31.setFont(new Font("Agency FB", Font.BOLD, 11));
		j31.setForeground(Color.WHITE);
		

		j32 = new JLabel("Price: Tk 108 ");
		j32.setBounds(310,402,80,50);
		j32.setBackground(c2);
		j32.setFont(new Font("Agency FB", Font.BOLD, 11));
		j32.setForeground(Color.WHITE);
		

		b16 = new JButton("Add To Cart");
		b16.setBounds(305,458,90,15);
		b16.setBackground(c2);
		b16.setFont(new Font("Agency FB", Font.BOLD, 11));
		b16.setForeground(Color.WHITE);
		b16.addActionListener(this);
		
		
//8		
		
		
		
		j33 = new JLabel("Quantity :");
		j33.setBounds(450,433,100,20);
		j33.setBackground(c2);
		j33.setFont(new Font("Agency FB", Font.BOLD, 11));
		j33.setForeground(Color.WHITE);
		

		String[] arr8= new String[]
		{" ","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};		
		jcb8 = new JComboBox<>(arr8);
		jcb8.setBounds(484,440,50,10);
	

		j34 = new JLabel("Medicine Name: Xanita ");
		j34.setBounds(450,399,100,20);
		j34.setBackground(c2);
		j34.setFont(new Font("Agency FB", Font.BOLD, 11));
		j34.setForeground(Color.WHITE);
		

		j35 = new JLabel("Price: Tk 40 ");
		j35.setBounds(450,402,80,50);
		j35.setBackground(c2);
		j35.setFont(new Font("Agency FB", Font.BOLD, 11));
		j35.setForeground(Color.WHITE);
		

		b17 = new JButton("Add To Cart");
		b17.setBounds(445,458,90,15);
		b17.setBackground(c2);
		b17.setFont(new Font("Agency FB", Font.BOLD, 11));
		b17.setForeground(Color.WHITE);
		b17.addActionListener(this);
		
		
		
//9		
		
		
		j36 = new JLabel("Quantity :");
		j36.setBounds(590,433,100,20);
		j36.setBackground(c2);
		j36.setFont(new Font("Agency FB", Font.BOLD, 11));
		j36.setForeground(Color.WHITE);
		

		String[] arr9= new String[]
		{" ","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};		
		jcb9 = new JComboBox<>(arr9);
		jcb9.setBounds(624,440,50,10);
	

		j37 = new JLabel("Medicine Name: Imotil ");
		j37.setBounds(590,399,100,20);
		j37.setBackground(c2);
		j37.setFont(new Font("Agency FB", Font.BOLD, 11));
		j37.setForeground(Color.WHITE);
		

		j38 = new JLabel("Price: Tk 10 ");
		j38.setBounds(590,402,80,50);
		j38.setBackground(c2);
		j38.setFont(new Font("Agency FB", Font.BOLD, 11));
		j38.setForeground(Color.WHITE);
		

		b18 = new JButton("Add To Cart");
		b18.setBounds(585,458,90,15);
		b18.setBackground(c2);
		b18.setFont(new Font("Agency FB", Font.BOLD, 11));
		b18.setForeground(Color.WHITE);
		b18.addActionListener(this);
		
		
//10    




         
		j39 = new JLabel("Quantity :");
		j39.setBounds(730,433,100,20);
		j39.setBackground(c2);
		j39.setFont(new Font("Agency FB", Font.BOLD, 11));
		j39.setForeground(Color.WHITE);
		

		String[] arr10= new String[]
		{" ","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};		
		jcb10 = new JComboBox<>(arr10);
		jcb10.setBounds(764,440,50,10);
	

		j40 = new JLabel("Medicine Name: Aleze ");
		j40.setBounds(730,399,100,20);
		j40.setBackground(c2);
		j40.setFont(new Font("Agency FB", Font.BOLD, 11));
		j40.setForeground(Color.WHITE);
		

		j41 = new JLabel("Price: Tk 31 ");
		j41.setBounds(730,402,80,50);
		j41.setBackground(c2);
		j41.setFont(new Font("Agency FB", Font.BOLD, 11));
		j41.setForeground(Color.WHITE);
		

		b19 = new JButton("Add To Cart");
		b19.setBounds(725,458,90,15);
		b19.setBackground(c2);
		b19.setFont(new Font("Agency FB", Font.BOLD, 11));
		b19.setForeground(Color.WHITE);
		b19.addActionListener(this);
				
		
		
		
//11
		
		
		
		
		
		mainPanel = new JPanel();
		mainPanel.setLayout(null);
		mainPanel.setBackground(c2);
		//mainPanel2 = new JPanel();
		//mainPanel2.setLayout(null);
		//mainPanel2.setBackground(c2);
		 
		 
		 
		 img1 = new ImageIcon("Image1/img1.jpeg");
			j5 = new JLabel(img1);
			j5.setBounds(155,100,90,160);
			mainPanel.add(j5);
			
			
			img2 = new ImageIcon("Image1/img2.jpeg");
			j6 = new JLabel(img2);
			j6.setBounds(305,100,90,160);
			mainPanel.add(j6);

		  img3 = new ImageIcon("Image1/img3.jpeg");
			j7 = new JLabel(img3);
			j7.setBounds(445,100,90,160);
			mainPanel.add(j7);

		   img4 = new ImageIcon("Image1/img4.jpeg");
			j8 = new JLabel(img4);
			j8.setBounds(585,100,90,160);
			mainPanel.add(j8);
			
		  img5 = new ImageIcon("Image1/img5.jpeg");
			j9 = new JLabel(img5);
			j9.setBounds(725,100,90,160);
			mainPanel.add(j9);
		
		 img6 = new ImageIcon("Image1/img6.jpeg");
			j10 = new JLabel(img6);
			j10.setBounds(155,310,90,160);
			mainPanel.add(j10);
			
			img7 = new ImageIcon("Image1/img7.jpeg");
			j11 = new JLabel(img7);
			j11.setBounds(305,310,90,160);
			mainPanel.add(j11);
		
		 img8 = new ImageIcon("Image1/img8.jpeg");
			j12 = new JLabel(img8);
			j12.setBounds(445,310,90,160);
			mainPanel.add(j12);
			
			img9 = new ImageIcon("Image1/img9.jpeg");
			j13 = new JLabel(img9);
			j13.setBounds(585,310,90,160);
			mainPanel.add(j9);
			
			img10 = new ImageIcon("Image1/img10.jpeg");
			j14 = new JLabel(img10);
			j14.setBounds(725,310,90,160);
			mainPanel.add(j14);
		
		
		

        ImageIcon ImageIcon = new ImageIcon("Image1/L1.png");
        Image Image = ImageIcon.getImage();
        f.setIconImage(Image);
		
		 

        JLabel Background;
        ImageIcon img = new ImageIcon("Image1/P1.png");
        Background = new JLabel("", img, JLabel.CENTER);
        Background.setBounds(0, 0, 1000, 620);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		f.add(b11);
		f.add(b12);
		f.add(b13);
		f.add(b14);
		f.add(b15);
		f.add(b16);
		f.add(b17);
		f.add(b18);
		f.add(b19);
		f.add(jcb1);
		f.add(jcb2);
		f.add(jcb3);
		f.add(jcb4);
		f.add(jcb5);
		f.add(jcb6);
		f.add(jcb7);
		f.add(jcb8);
		f.add(jcb9);
		f.add(jcb10);
		f.add(mainPanel);
		
		
		
		// foregrounds
		f.add(j1);
		f.add(j2);
		f.add(j3);
		f.add(j15);
		f.add(j16);
		f.add(j17);
		f.add(j18);
		f.add(j19);
		f.add(j20);
		f.add(j21);
		f.add(j22);
		f.add(j23);
		f.add(j24);
		f.add(j25);
		f.add(j26);
		f.add(j27);
		f.add(j28);
		f.add(j29);
		f.add(j30);
		f.add(j31);
		f.add(j32);
		f.add(j33);
		f.add(j34);
		f.add(j35);
		f.add(j36);
		f.add(j37);
		f.add(j38);
		f.add(j39);
		f.add(j40);
		f.add(j41);
	
		

		// backgrounds
		f.add(j5);
		f.add(j6);
		f.add(j7);
		f.add(j8);
		f.add(j9);
		f.add(j10);
		f.add(j11);
		f.add(j12);
		f.add(j13);
		f.add(j14);
		
	
		//f.add(jcb1);
		//f.add(jcb2);
		//f.add(jcb3);
		//f.add(jcb4);
		//f.add(jcb5);
		//f.add(jcb6);
		//f.add(jcb7);
		//f.add(mainPanel);
		//f.add(mainPanel2);
		
		
		
		
		
		
        f.add(Background);

        f.setSize(1000, 620);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setResizable(false);
    }

    public void actionPerformed(ActionEvent e) 
	{
        if (e.getSource() == b1) 
		{
			
        } 
		else if (e.getSource() == b2) 
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
		
		else if (e.getSource() == b3) 	
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
		
		else if (e.getSource() == b4) 
		{
            
        }
		
		else if (e.getSource() == b6) 
		{
            new Homepage1();
			f.setVisible(false);
		}	
		else if (e.getSource() == b7) 
		{
            new Homepage2();
			f.setVisible(false);
		}
			
		else if (e.getSource() == b8) 
		{
            new Homepage3();
			f.setVisible(false);
		}
			
		else if (e.getSource() == b9) 
		{
            new Homepage2();
			f.setVisible(false);
			
        }
		
        //add to cart1
	    else if (e.getSource() == b10) 
		{
			selectedValue1 = (String)
			jcb1.getSelectedItem();
			int selectedValue=Integer.parseInt(selectedValue1);
			JOptionPane.showMessageDialog(null,"ADDED TO CART SUCCESSFULLY\n"+"ACE "+selectedValue1+"PIECES\n"+"PRICE "+(selectedValue*30));
			
			f.setVisible(false);
            String medName = "ACE";
            int quantity = selectedValue;
            int price = 30;
            int totalPrice = quantity * price; 

            DataHolder.setMedName(medName);
            DataHolder.setQuantity(quantity);
            DataHolder.setPrice(price);
            DataHolder.setTotalPrice(totalPrice);

            Cart cartInstance = new Cart();
			
			
        }
		//add to cart2 
	    else if (e.getSource() == b11) 
		{
			selectedValue2 = (String)
			jcb2.getSelectedItem();
			int selectedValue=Integer.parseInt(selectedValue2);
			JOptionPane.showMessageDialog(null,"Citra-K"+selectedValue2+"PIECES\n"+"PRICE "+(selectedValue*270));
			f.setVisible(false);

			
			String medName = "Citra-K";
            int quantity = selectedValue;
            int price = 270;
            int totalPrice = quantity * price; 

            DataHolder.setMedName(medName);
            DataHolder.setQuantity(quantity);
            DataHolder.setPrice(price);
            DataHolder.setTotalPrice(totalPrice);

            Cart cartInstance = new Cart();
        }
		//add to cart 3 
		else if (e.getSource() == b12) 
		{
			selectedValue3 = (String)
			jcb3.getSelectedItem();
			int selectedValue=Integer.parseInt(selectedValue3);
			JOptionPane.showMessageDialog(null,"Urikal"+selectedValue3+"PIECES\n"+"PRICE "+(selectedValue*180));
			f.setVisible(false);

			
			String medName = "Urikal";
            int quantity = selectedValue;
            int price = 180;
            int totalPrice = quantity * price; 

            DataHolder.setMedName(medName);
            DataHolder.setQuantity(quantity);
            DataHolder.setPrice(price);
            DataHolder.setTotalPrice(totalPrice);

            Cart cartInstance = new Cart();
			
        }
		
		//add to cart 4 
		else if (e.getSource() == b13) 
		{
			selectedValue4 = (String)
			jcb4.getSelectedItem();
			int selectedValue=Integer.parseInt(selectedValue4);
			JOptionPane.showMessageDialog(null,"NapaDol"+selectedValue4+"PIECES\n"+"PRICE "+(selectedValue*86));
			f.setVisible(false);
			
			String medName = "NapaDol";
            int quantity = selectedValue;
            int price = 86;
            int totalPrice = quantity * price; 

            DataHolder.setMedName(medName);
            DataHolder.setQuantity(quantity);
            DataHolder.setPrice(price);
            DataHolder.setTotalPrice(totalPrice);

            Cart cartInstance = new Cart();
        }
		
		
		
		//add to cart 5
		else if (e.getSource() == b14) 
		{
			selectedValue5 = (String)
			jcb5.getSelectedItem();
			int selectedValue=Integer.parseInt(selectedValue5);
			JOptionPane.showMessageDialog(null,"Harnal"+selectedValue5+"PIECES\n"+"PRICE "+(selectedValue*2602));
			f.setVisible(false);
			
			String medName = "Harnal";
            int quantity = selectedValue;
            int price = 2602;
            int totalPrice = quantity * price; 

            DataHolder.setMedName(medName);
            DataHolder.setQuantity(quantity);
            DataHolder.setPrice(price);
            DataHolder.setTotalPrice(totalPrice);

            Cart cartInstance = new Cart();
        }
		
		
		
		
		//add to cart 6 
		else if (e.getSource() == b15) 
		{
			selectedValue6 = (String)
			jcb6.getSelectedItem();
			int selectedValue=Integer.parseInt(selectedValue6);
			JOptionPane.showMessageDialog(null,"Muconil"+selectedValue6+"PIECES\n"+"PRICE "+(selectedValue*29));
			f.setVisible(false);
			
			String medName = "Muconil";
            int quantity = selectedValue;
            int price = 29;
            int totalPrice = quantity * price; 

            DataHolder.setMedName(medName);
            DataHolder.setQuantity(quantity);
            DataHolder.setPrice(price);
            DataHolder.setTotalPrice(totalPrice);

            Cart cartInstance = new Cart();
        }
		
		
		
		//add to cart 7 
		else if (e.getSource() == b16) 
		{
			selectedValue7 = (String)
			jcb7.getSelectedItem();
			int selectedValue=Integer.parseInt(selectedValue7);
			JOptionPane.showMessageDialog(null,"Esipram"+selectedValue7+"PIECES\n"+"PRICE "+(selectedValue*108));
			f.setVisible(false);
			
		    String medName = "Esipram";
            int quantity = selectedValue;
            int price = 108;
            int totalPrice = quantity * price; 

            DataHolder.setMedName(medName);
            DataHolder.setQuantity(quantity);
            DataHolder.setPrice(price);
            DataHolder.setTotalPrice(totalPrice);

            Cart cartInstance = new Cart();
        }
		
		
		
		//add to cart 8 
		else if (e.getSource() == b17) 
		{
			selectedValue8 = (String)
			jcb8.getSelectedItem();
			int selectedValue=Integer.parseInt(selectedValue8);
			JOptionPane.showMessageDialog(null,"Xanita"+selectedValue8+"PIECES\n"+"PRICE "+(selectedValue*40));
			f.setVisible(false);
			
		    String medName = "Xanita";
            int quantity = selectedValue;
            int price = 40;
            int totalPrice = quantity * price; 

            DataHolder.setMedName(medName);
            DataHolder.setQuantity(quantity);
            DataHolder.setPrice(price);
            DataHolder.setTotalPrice(totalPrice);

            Cart cartInstance = new Cart();
        }
		
		
		
		
		//add to cart 9
		else if (e.getSource() == b18) 
		{
			selectedValue9 = (String)
			jcb9.getSelectedItem();
			int selectedValue=Integer.parseInt(selectedValue9);
			JOptionPane.showMessageDialog(null,"Imotil"+selectedValue9+"PIECES\n"+"PRICE "+(selectedValue*10));
			f.setVisible(false);
			
		    String medName = "Imotil";
            int quantity = selectedValue;
            int price = 10;
            int totalPrice = quantity * price; 

            DataHolder.setMedName(medName);
            DataHolder.setQuantity(quantity);
            DataHolder.setPrice(price);
            DataHolder.setTotalPrice(totalPrice);

            Cart cartInstance = new Cart();
        }
		
		
		
		
		//add to cart 10 
		else if (e.getSource() == b19) 
		{
			selectedValue10 = (String)
			jcb10.getSelectedItem();
			int selectedValue=Integer.parseInt(selectedValue10);
			JOptionPane.showMessageDialog(null,"Aleze"+selectedValue10+"PIECES\n"+"PRICE "+(selectedValue*31));
			f.setVisible(false);
			
			String medName = "Aleze";
            int quantity = selectedValue;
            int price = 31;
            int totalPrice = quantity * price; 

            DataHolder.setMedName(medName);
            DataHolder.setQuantity(quantity);
            DataHolder.setPrice(price);
            DataHolder.setTotalPrice(totalPrice);

            Cart cartInstance = new Cart();
			
			
        }
		
		
		else if (e.getSource() == b5) 
		{
            try 
			{
                int choice = JOptionPane.showConfirmDialog(null, " DO YOU WANT TO EXIT ? ", "EXIT",JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) 
				{
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, "CANCEL");
                }
            } catch (Exception ex) {}
        }
    }
	
}