import java.awt.BorderLayout;  
import java.awt.Color;  
import java.awt.Dimension;  
import java.awt.FlowLayout;  
import java.awt.Font;
import java.awt.GridLayout;  
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;  

public class HomePage extends JFrame{  
    
	//create colors
    public static Color gold = new Color(212,175,55);  
    public static Color lightYellow = new Color(255,255,237);    
   
    //create class constructor
    public HomePage() {  
	    super("Home Page");  
	    
	    //create font
	    Font headline = new Font("Arial Narrow", Font.BOLD, 20);
	    
	    //create header label
	    JLabel title = new JLabel("Old 2 Gold");  
	    title.setFont(new Font("Algerian", Font.BOLD,60));  	      
	    title.setForeground(lightYellow);  
	    
	    //creates photos
	    ImageIcon tempIcon = new ImageIcon("src/charity.JPG");
	    ImageIcon icon = new ImageIcon(tempIcon.getImage().getScaledInstance(160, 96, Image.SCALE_DEFAULT));
	    JLabel image = new JLabel(icon);
	    
	    ImageIcon tempIcon2 = new ImageIcon("src/charity3.jpg");
	    ImageIcon icon2 = new ImageIcon(tempIcon2.getImage().getScaledInstance(160, 96, Image.SCALE_DEFAULT));
	    JLabel image2 = new JLabel(icon2);
	    
	    ImageIcon tempIcon3 = new ImageIcon("src/charity2.jpeg");
	    ImageIcon icon3 = new ImageIcon(tempIcon3.getImage().getScaledInstance(160, 96, Image.SCALE_DEFAULT));
	    JLabel image3 = new JLabel(icon3);
	    
	    ImageIcon tempIcon4 = new ImageIcon("src/charity4.jpg");
	    ImageIcon icon4 = new ImageIcon(tempIcon4.getImage().getScaledInstance(160, 96, Image.SCALE_DEFAULT));
	    JLabel image4 = new JLabel(icon4);
	    
	    //create information about the news articles 
	    JLabel newsTitle = new JLabel("RM800,000 Worth of Donations Reached");
	    newsTitle.setFont(headline);
	    JLabel newsDescription = new JLabel("<html>6th FEBRUARY 2020 - Last week, Old 2 Gold donated over RM9,000 worth of donations to a number of charities. This led to an estimated total of RM803,864 in donations handed out...</html>");
	    JPanel newsTextPanel = new JPanel();
	    newsTextPanel.setOpaque(false);
	    newsTextPanel.setLayout(new GridLayout(2,1));
	    newsTextPanel.setPreferredSize(new Dimension(400,100));
	    newsTextPanel.add(newsTitle);
	    newsTextPanel.add(newsDescription);
	    
	    JLabel newsTitle2 = new JLabel("Elderly Couple Enters 5th Year with Us");
	    newsTitle2.setFont(headline);
	    JLabel newsDescription2 = new JLabel("<html>27th NOVEMBER 2019 - There are many who dread turning old as they fear having no purpose in life. Not for this elderly couple, who have been donating with Old 2 Gold since 2015...</html>");
	    JPanel newsTextPanel2 = new JPanel();
	    newsTextPanel2.setOpaque(false);
	    newsTextPanel2.setLayout(new GridLayout(2,1));
	    newsTextPanel2.setPreferredSize(new Dimension(400,100));
	    newsTextPanel2.add(newsTitle2);
	    newsTextPanel2.add(newsDescription2);
	    
	    JLabel newsTitle3 = new JLabel("Partnering for Malaysia Day Celebrations");
	    newsTitle3.setFont(headline);
	    JLabel newsDescription3 = new JLabel("<html>16th SEPTEMBER 2019 - Together with our longest-running partner, the We Care Society, Old 2 Gold held a Malaysia Day celebration which invited underprivileged guests for a night of festivity...</html>");
	    JPanel newsTextPanel3 = new JPanel();
	    newsTextPanel3.setOpaque(false);
	    newsTextPanel3.setLayout(new GridLayout(2,1));
	    newsTextPanel3.setPreferredSize(new Dimension(400,100));
	    newsTextPanel3.add(newsTitle3);
	    newsTextPanel3.add(newsDescription3);
	    
	    JLabel newsTitle4 = new JLabel("Employee of the Month Delivers 348 Items");
	    newsTitle4.setFont(headline);
	    JLabel newsDescription4 = new JLabel("<html>30th AUGUST 2019 - Shah Rukh Khan, 28 years of age, joined Old 2 Gold as a fresh deliveryman just 6 months ago. Little did everyone know that he was about to make a big name for himself... </html>");
	    JPanel newsTextPanel4 = new JPanel();
	    newsTextPanel4.setOpaque(false);
	    newsTextPanel4.setLayout(new GridLayout(2,1));
	    newsTextPanel4.setPreferredSize(new Dimension(400,100));
	    newsTextPanel4.add(newsTitle4);
	    newsTextPanel4.add(newsDescription4);
	    
	    //create and format buttons
	    JButton donationButton = new JButton("Donation");  
	    JButton redeemButton = new JButton("Redeem");  
	    JButton contactButton = new JButton("Contacts");
	    JButton accountButton = new JButton("Account");
	           
	    Font buttonFont = new Font("Arial", Font.BOLD, 20);  
	    donationButton.setBackground(gold);  
	    donationButton.setFont(buttonFont);  
	    donationButton.setForeground(lightYellow);  
	    redeemButton.setBackground(gold);  
	    redeemButton.setFont(buttonFont);  
	    redeemButton.setForeground(lightYellow); 
	    contactButton.setBackground(gold);  
	    contactButton.setFont(buttonFont);  
	    contactButton.setForeground(lightYellow); 
	    accountButton.setBackground(gold);  
	    accountButton.setFont(buttonFont);  
	    accountButton.setForeground(lightYellow); 
	    
	    //each button links to a different page
	    donationButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent ae) {
		        new Donation();
		    	dispose();
		    }
		});
	    
	    redeemButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent ae) {
		        new VoucherRedemption();
		    	dispose();
		    }
		});
	    
	    contactButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent ae) {
		        new Contacts();
		    	dispose();
		    }
		});
	    
	    accountButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent ae) {
		        new Account();
		    	dispose();
		    }
		});
	    
	    //create header   
	    JPanel headerPanel = new JPanel(); 
	    headerPanel.add(title);  
	    headerPanel.setBackground(gold);  
	    headerPanel.setPreferredSize(new Dimension(600,80)); 
	    
	    //create dimension
	    Dimension newsDimension = new Dimension(600,120);
	    
	    //create panels to add the preview of the news articles and their associated photos
	    JPanel newsPanel = new JPanel();
	    newsPanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
	    newsPanel.setOpaque(false);
	    newsPanel.setPreferredSize(newsDimension);
	    newsPanel.add(image);
	    newsPanel.add(newsTextPanel);
	    
	    JPanel newsPanel2 = new JPanel();
	    newsPanel2.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
	    newsPanel2.setOpaque(false);
	    newsPanel2.setPreferredSize(newsDimension);
	    newsPanel2.add(image2);
	    newsPanel2.add(newsTextPanel2);
	    
	    JPanel newsPanel3 = new JPanel();
	    newsPanel3.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
	    newsPanel3.setOpaque(false);
	    newsPanel3.setPreferredSize(newsDimension);
	    newsPanel3.add(image3);
	    newsPanel3.add(newsTextPanel3);
	    
	    JPanel newsPanel4 = new JPanel();
	    newsPanel4.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
	    newsPanel4.setOpaque(false);
	    newsPanel4.setPreferredSize(newsDimension);
	    newsPanel4.add(image4);
	    newsPanel4.add(newsTextPanel4);
	    
	    //adds buttons
	    JPanel buttonPanel = new JPanel();  
	    buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER,20,10));
	    buttonPanel.setPreferredSize(new Dimension(600,80)); 
	    buttonPanel.setOpaque(false);
	    buttonPanel.add(donationButton);
	    buttonPanel.add(redeemButton);
	    buttonPanel.add(contactButton);
	    buttonPanel.add(accountButton);
        
	    //adds the other panels to the main panel
	    JPanel mainPanel = new JPanel();
	    mainPanel.setLayout(new FlowLayout());
	    mainPanel.setOpaque(false);
	    mainPanel.add(newsPanel);
	    mainPanel.add(newsPanel2);
	    mainPanel.add(newsPanel3);
	    mainPanel.add(newsPanel4);
	    mainPanel.add(buttonPanel);
	    
        add(headerPanel,BorderLayout.NORTH);
	    add(mainPanel,BorderLayout.CENTER);
        
	    ImageIcon iconImg = new ImageIcon("src/iconImage.JPG");
	    setIconImage(iconImg.getImage());
	    getContentPane().setBackground(lightYellow);  
	    setLocationRelativeTo(null);  
	    setBounds(400,20,600,700);  
	    setResizable(false);  
	    setVisible(true);  
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}  

    public static void main(String[] args) {  
	   	 new HomePage();
    }
}
