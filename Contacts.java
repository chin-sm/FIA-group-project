import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font; 
import java.awt.FlowLayout;
import java.awt.GridLayout;  
import java.awt.Image;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;  


public class Contacts extends JFrame{  
    
	//create colors
    public static Color gold = new Color(212,175,55);  
    public static Color lightYellow = new Color(255,255,237);    
   
    //create class constructor
    public Contacts() {  
	    super("Contact Us");  
	    
	    //create font
	    Font companyName = new Font("Arial Black", Font.BOLD, 20);
	    
	    //create title
	    JLabel title = new JLabel("Contact Us");  
	    title.setFont(new Font("Algerian", Font.BOLD,60));  	      
	    title.setForeground(lightYellow);  
	    
	    //create images and resizes them
	    ImageIcon tempIcon = new ImageIcon("src/logo.png");
	    ImageIcon icon = new ImageIcon(tempIcon.getImage().getScaledInstance(160, 96, Image.SCALE_DEFAULT));
	    JLabel image = new JLabel(icon);
	    
	    ImageIcon tempIcon2 = new ImageIcon("src/bigHearts.png");
	    ImageIcon icon2 = new ImageIcon(tempIcon2.getImage().getScaledInstance(160, 96, Image.SCALE_DEFAULT));
	    JLabel image2 = new JLabel(icon2);
	    
	    ImageIcon tempIcon3 = new ImageIcon("src/doGood.png");
	    ImageIcon icon3 = new ImageIcon(tempIcon3.getImage().getScaledInstance(160, 96, Image.SCALE_DEFAULT));
	    JLabel image3 = new JLabel(icon3);
	    
	    ImageIcon tempIcon4 = new ImageIcon("src/happiness.png");
	    ImageIcon icon4 = new ImageIcon(tempIcon4.getImage().getScaledInstance(160, 96, Image.SCALE_DEFAULT));
	    JLabel image4 = new JLabel(icon4);
	    
	    ImageIcon tempIcon5 = new ImageIcon("src/redMoon.png");
	    ImageIcon icon5 = new ImageIcon(tempIcon5.getImage().getScaledInstance(160, 96, Image.SCALE_DEFAULT));
	    JLabel image5 = new JLabel(icon5);
	    
	    ImageIcon tempIcon6 = new ImageIcon("src/weCare.png");
	    ImageIcon icon6 = new ImageIcon(tempIcon6.getImage().getScaledInstance(160, 96, Image.SCALE_DEFAULT));
	    JLabel image6 = new JLabel(icon6);
	    
	    //text at the top of the page
	    JLabel introText = new JLabel("<html><div style='text-align: center;'>Need to get in touch with us or one of our partner NGOs? <br>We're always ready to help!</div></html>");
	    introText.setFont(new Font("Arial", Font.ITALIC+Font.BOLD, 20));
	    
	    Font contactFont = new Font("Arial", Font.BOLD, 16);
	    
	    //shows the email and phone numbers of the app developers as well as the partnering NGOs
	    JLabel name = new JLabel("Old 2 Gold");
	    name.setFont(companyName);
	    JLabel details = new JLabel("<html>Phone no.: 03-94658799, 012-9787685, 019-2223141 <br>E-mail: old2gold.enquiry@gmail.com</html>");
	    details.setFont(contactFont);
	    JPanel detailsPanel = new JPanel();
	    detailsPanel.setOpaque(false);
	    detailsPanel.setLayout(new GridLayout(2,1));
	    detailsPanel.setPreferredSize(new Dimension(400,100));
	    detailsPanel.add(name);
	    detailsPanel.add(details);
	    
	    JLabel name2 = new JLabel("Big Hearts Centre");
	    name2.setFont(companyName);
	    JLabel details2 = new JLabel("<html>Phone no.: 017-3167866, 019-1312466 <br>E-mail: bigheartscentre@gmail.com</html>");
	    details2.setFont(contactFont);
	    JPanel detailsPanel2 = new JPanel();
	    detailsPanel2.setOpaque(false);
	    detailsPanel2.setLayout(new GridLayout(2,1));
	    detailsPanel2.setPreferredSize(new Dimension(400,100));
	    detailsPanel2.add(name2);
	    detailsPanel2.add(details2);
	    
	    JLabel name3 = new JLabel("Do Good Today");
	    name3.setFont(companyName);
	    JLabel details3 = new JLabel("<html>Phone no.: 03-91314606, 018-6985101 <br>E-mail: dogoodtoday@hotmail.com</html>");
	    details3.setFont(contactFont);
	    JPanel detailsPanel3 = new JPanel();
	    detailsPanel3.setOpaque(false);
	    detailsPanel3.setLayout(new GridLayout(2,1));
	    detailsPanel3.setPreferredSize(new Dimension(400,100));
	    detailsPanel3.add(name3);
	    detailsPanel3.add(details3);
	    
	    JLabel name4 = new JLabel("Happiness For All");
	    name4.setFont(companyName);
	    JLabel details4 = new JLabel("<html>Phone no.: 012-6585841, 012-6585333 <br>E-mail: happinessforall.enquiry@gmail.com</html>");
	    details4.setFont(contactFont);
	    JPanel detailsPanel4 = new JPanel();
	    detailsPanel4.setOpaque(false);
	    detailsPanel4.setLayout(new GridLayout(2,1));
	    detailsPanel4.setPreferredSize(new Dimension(400,100));
	    detailsPanel4.add(name4);
	    detailsPanel4.add(details4);
	    
	    JLabel name5 = new JLabel("Red Moon Charity");
	    name5.setFont(companyName);
	    JLabel details5 = new JLabel("<html>Phone no.: 03-91538776, 03-91614885 <br>E-mail: redmoon@gmail.com</html>");
	    details5.setFont(contactFont);
	    JPanel detailsPanel5 = new JPanel();
	    detailsPanel5.setOpaque(false);
	    detailsPanel5.setLayout(new GridLayout(2,1));
	    detailsPanel5.setPreferredSize(new Dimension(400,100));
	    detailsPanel5.add(name5);
	    detailsPanel5.add(details5);
	    
	    JLabel name6 = new JLabel("We Care Society");
	    name6.setFont(companyName);
	    JLabel details6 = new JLabel("<html>Phone no.: 018-6760118, 012-6653227 <br>E-mail: wecaresociety.enquiry@gmail.com</html>");
	    details6.setFont(contactFont);
	    JPanel detailsPanel6 = new JPanel();
	    detailsPanel6.setOpaque(false);
	    detailsPanel6.setLayout(new GridLayout(2,1));
	    detailsPanel6.setPreferredSize(new Dimension(400,100));
	    detailsPanel6.add(name6);
	    detailsPanel6.add(details6);
	    
	    //create back button
	    JButton backButton = new JButton("Back");  	           
	    Font buttonFont = new Font("Comic Sans MS", Font.BOLD, 20);  
	    backButton.setBackground(gold);  
	    backButton.setFont(buttonFont);  
	    backButton.setForeground(lightYellow);  
	    
	    backButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent ae) {
		        new HomePage();
		    	dispose();
		    }
		});
	    
	    //create header   
	    JPanel headerPanel = new JPanel(); 
	    headerPanel.add(title);  
	    headerPanel.setBackground(gold);  
	    headerPanel.setPreferredSize(new Dimension(600,80)); 
	    
	    //create dimension
	    Dimension contactDimension = new Dimension(600,120);
	    
	    //create panels 
	    JPanel introPanel = new JPanel();
	    introPanel.add(introText);
	    introPanel.setPreferredSize(contactDimension);
	    introPanel.setLayout(new FlowLayout(FlowLayout.CENTER,0,50));
	    introPanel.setOpaque(false);
	    
	    JPanel contactPanel = new JPanel();
	    contactPanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
	    contactPanel.setOpaque(false);
	    contactPanel.setPreferredSize(contactDimension);
	    contactPanel.add(detailsPanel);
	    contactPanel.add(image);
	    
	    JPanel contactPanel2 = new JPanel();
	    contactPanel2.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
	    contactPanel2.setOpaque(false);
	    contactPanel2.setPreferredSize(contactDimension);
	    contactPanel2.add(detailsPanel2);
	    contactPanel2.add(image2);

	    JPanel contactPanel3 = new JPanel();
	    contactPanel3.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
	    contactPanel3.setOpaque(false);
	    contactPanel3.setPreferredSize(contactDimension);
	    contactPanel3.add(detailsPanel3);
	    contactPanel3.add(image3);
	    
	    JPanel contactPanel4 = new JPanel();
	    contactPanel4.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
	    contactPanel4.setOpaque(false);
	    contactPanel4.setPreferredSize(contactDimension);
	    contactPanel4.add(detailsPanel4);
	    contactPanel4.add(image4);
	    
	    JPanel contactPanel5 = new JPanel();
	    contactPanel5.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
	    contactPanel5.setOpaque(false);
	    contactPanel5.setPreferredSize(contactDimension);
	    contactPanel5.add(detailsPanel5);
	    contactPanel5.add(image5);
	      
	    JPanel contactPanel6 = new JPanel();
	    contactPanel6.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
	    contactPanel6.setOpaque(false);
	    contactPanel6.setPreferredSize(contactDimension);
	    contactPanel6.add(detailsPanel6);
	    contactPanel6.add(image6); 
	    
	    JPanel buttonPanel = new JPanel();  
	    buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT,20,20));
	    buttonPanel.setPreferredSize(new Dimension(600,80)); 
	    buttonPanel.setOpaque(false);
	    buttonPanel.add(backButton);
 
	    //add panels to main panel
	    JPanel mainPanel = new JPanel();
	    mainPanel.setLayout(new GridLayout(7,1,10,10));
	    mainPanel.setBackground(Donation.lightYellow);
	    mainPanel.add(introPanel);
	    mainPanel.add(contactPanel);
	    mainPanel.add(contactPanel2);
	    mainPanel.add(contactPanel3);
	    mainPanel.add(contactPanel4);
	    mainPanel.add(contactPanel5);
	    mainPanel.add(contactPanel6);
	    
	    //makes screen scrollable
	    JScrollPane pane = new JScrollPane(mainPanel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	    pane.setBackground(Donation.lightYellow);
        pane.setBorder(BorderFactory.createEmptyBorder());
        pane.setPreferredSize(new Dimension(400,600));
        pane.getVerticalScrollBar().setUnitIncrement(16);
	    
        //adds panels to frame
        add(headerPanel,BorderLayout.NORTH);
	    add(pane,BorderLayout.CENTER);
	    add(buttonPanel,BorderLayout.SOUTH);

	    ImageIcon iconImg = new ImageIcon("src/iconImage.JPG");
        setIconImage(iconImg.getImage());
	    getContentPane().setBackground(lightYellow);  
	    setLocationRelativeTo(null);  
	    setBounds(400,20,620,700);  
	    setResizable(false);  
	    setVisible(true);  
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}  

}

