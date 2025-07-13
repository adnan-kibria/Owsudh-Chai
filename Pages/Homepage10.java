package Pages;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.imageio.*;
import java.io.IOException;

public class Homepage10 extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6; 
    JButton pageButton1, pageButton2, pageButton3; // Added page buttons
    JFrame f; // obj 
    Font font;

    public Homepage10() {
        f = new JFrame("Owsudh Chai");
        font = new Font("Agency FB", Font.BOLD, 18);

        Color c1 = new Color(26, 95, 122);
        Color c2 = new Color(81, 163, 0);
        Color c3 = new Color(115, 181, 50);
        Color c4  = new Color(225,253,213);

        JLabel Label = new JLabel(". . . . .");
        Label.setFont(new Font("Agency FB", Font.BOLD, 20));
        Label.setForeground(c2);
        Label.setBounds(370, 530, 50, 20);
        f.add(Label);

        b1 = new JButton("HOME");
        b1.setBounds(45, 5, 100, 40);
        b1.setForeground(Color.WHITE);
        b1.setBackground(c2);
        b1.setFont(new Font("Agency FB", Font.BOLD, 20));
        b1.addActionListener(this);

        b2 = new JButton("ACCOUNT");
        b2.setBounds(700, 5, 140, 40);
        b2.setFont(new Font("Agency FB", Font.BOLD, 20));
        b2.setForeground(Color.WHITE);
        b2.setBackground(c2);
        b2.addActionListener(this);

        b3 = new JButton("CART");
        b3.setFont(new Font("Agency FB", Font.BOLD, 20));
        b3.setBounds(860, 5, 80, 40);
        b3.setForeground(Color.WHITE);
        b3.setBackground(c2);
        b3.addActionListener(this);

        b4 = new JButton("BACK");
        b4.setBounds(260, 520, 100, 30);
        b4.setForeground(Color.WHITE);
        b4.setBackground(c3);
        b4.setFont(new Font("Agency FB", Font.BOLD, 20));
        b4.addActionListener(this);

        b5 = new JButton("Close");
        b5.setBounds(850, 540, 80, 40);
        b5.setFont(new Font("Agency FB", Font.BOLD, 20));
        b5.setForeground(Color.WHITE);
        b5.setBackground(Color.red);
        b5.addActionListener(this);
        

        pageButton1 = new JButton("8");
        pageButton1.setBounds(420, 520, 50, 30);
        pageButton1.setFont(new Font("Agency FB", Font.BOLD, 10));
        pageButton1.setForeground(Color.WHITE);
        pageButton1.setBackground(c2);
        pageButton1.addActionListener(this);

        pageButton2 = new JButton("9");
        pageButton2.setBounds(480, 520, 50, 30);
        pageButton2.setFont(new Font("Agency FB", Font.BOLD, 10));
        pageButton2.setForeground(Color.black);
        pageButton2.setBackground(c4);
        pageButton2.addActionListener(this);

        pageButton3 = new JButton("10");
        pageButton3.setBounds(540, 520, 50, 30);
        pageButton3.setFont(new Font("Agency FB", Font.BOLD, 10));
        pageButton3.setForeground(Color.WHITE);
        pageButton3.setBackground(c2);
        pageButton3.addActionListener(this);

        b6 = new JButton("Next");
        b6.setBounds(600, 520, 100, 30);
        b6.setForeground(Color.WHITE);
        b6.setBackground(c3);
        b6.setFont(new Font("Agency FB", Font.BOLD, 20));
        b6.addActionListener(this);

        ImageIcon ImageIcon = new ImageIcon("L1.png");
        Image Image = ImageIcon.getImage();
        f.setIconImage(Image);

        JLabel Background;
        ImageIcon img = new ImageIcon("homepage1/P1.png");
        Background = new JLabel("", img, JLabel.CENTER);
        Background.setBounds(0, 0, 1000, 620);
        
        JLabel imageLabel1 = createImageLabel("homepage5/image.jpg", 150, 80, 100, 100, "Lorazepam", "100", "10");
        JLabel imageLabel2 = createImageLabel("homepage5/image1.jpg", 350, 80, 100, 100, "Atropine", "150", "15");
        JLabel imageLabel3 = createImageLabel("homepage5/image2.jpg", 550, 80, 100, 100, "Diclofenac", "200", "20");
        JLabel imageLabel7 = createImageLabel("homepage5/image3.jpg", 750, 80, 100, 100, "Enalapril", "25", "25");
        JLabel imageLabel4 = createImageLabel("homepage5/image4.jpg", 150, 300, 100, 100, "Amlodipine", "30", "30");
        JLabel imageLabel5 = createImageLabel("homepage5/image5.jpg", 350, 300, 100, 100, "Diazepam", "35", "35");
        JLabel imageLabel6 = createImageLabel("homepage5/image6.jpg", 550, 300, 100, 100, "Mefenamic", "40", "40");
        JLabel imageLabel8 = createImageLabel("homepage5/image7.jpg", 750, 300, 100, 100, "Panadol", "45", "45");

        f.add(imageLabel1);
        f.add(imageLabel2);
        f.add(imageLabel3);
        f.add(imageLabel4);
        f.add(imageLabel5);
        f.add(imageLabel6);
        f.add(imageLabel7);
        f.add(imageLabel8);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(pageButton1);
        f.add(pageButton2);
        f.add(pageButton3);
        f.add(Background);

       


        f.setSize(1000, 620);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setResizable(false);
    
    }
    private JLabel createImageLabel(String imagePath, int x, int y, int width, int height,
                                    String medicineName, String price, String availableQuantity) {
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
        JLabel label = new JLabel(scaledImageIcon);
        label.setBounds(x, y, width, height);
         Color c2 = new Color(81, 163, 0);

        // Add labels for medicine details
        JLabel nameLabel = new JLabel("" + medicineName);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 15));
        JLabel priceLabel = new JLabel("Price: " + price);
        JLabel quantityLabel = new JLabel("Quantity: ");
    
    // Use a JComboBox for quantity with values 0 to 9
        Integer[] quantityValues = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        JComboBox<Integer> quantityComboBox = new JComboBox<>(quantityValues);
        JButton addToCartButton = new JButton("Add to Cart");
        addToCartButton.setBackground(c2);
        addToCartButton.setForeground(Color.WHITE);
        addToCartButton.setFont(new Font("Agency FB", Font.BOLD, 15));
        

        nameLabel.setBounds(x, y + height + 10, width, 15);
        priceLabel.setBounds(x, y + height + 30, width, 15);
        quantityLabel.setBounds(x, y + height + 50, 75, 15);
        quantityLabel.setBounds(x, y + height + 50, 80, 20);
        quantityComboBox.setBounds(x + 80, y + height + 50, 50, 20);
        addToCartButton.setBounds(x, y + height + 70, width, 20);
    
        

        f.add(nameLabel);
        f.add(priceLabel);
        f.add(quantityLabel);
        f.add(quantityLabel);
        f.add(quantityComboBox);
        f.add(addToCartButton);

        return label;
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            int choice = JOptionPane.showConfirmDialog(null, " DO YOU WANT TO GO HOME PAGE ? ", "BACK HOME PAGE",JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                new Homepage1();
                f.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "CANCEL");
            }

        } else if (e.getSource() == b2) {
            int choice = JOptionPane.showConfirmDialog(null, " DO YOU WANT TO GO ACCOUNT PAGE ? ","GO TO ACCOUNT PAGE", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                new ShowDetails();
                f.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "CANCEL");
            }
        } else if (e.getSource() == b3) {
            int choice = JOptionPane.showConfirmDialog(null, " DO YOU WANT TO GO CART PAGE ? ", "GO TO CART PAGE",
                    JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                new Cart();
                f.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "CANCEL");
            }
        } else if (e.getSource() == b4) {
        
                new Homepage9();
                f.setVisible(false);
            }  



		else if(e.getSource() == b6) 
		{
			
        }
		else if (e.getSource() == pageButton1)
		{
            new Homepage8();
            f.setVisible(false);
        }
		else if (e.getSource() == pageButton2)
		{
            new Homepage9();
            f.setVisible(false);
        }
		else if (e.getSource() == pageButton3)
		{
            new Homepage10();
            f.setVisible(false);
        }			


 
            
         else if (e.getSource() == b5) {
            try {
                int choice = JOptionPane.showConfirmDialog(null, " DO YOU WANT TO EXIT ? ", "EXIT",
                        JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, "CANCEL");
                }
            } catch (Exception ex) {}
        }

    }
}