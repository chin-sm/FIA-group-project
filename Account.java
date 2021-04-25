import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Account extends JFrame {
	
	//allows total points and lifetime donations to be updated
	public static int totalPoints = 150;
	public static int lifetimeDonations = 62;
	
	//allows changes in details to be saved
	public static String homeAddress = "No. 90, Jalan Bukit Emas 3, Taman Bukit Emas, 56100 Kuala Lumpur.";
	public static String accountEmail = "johndoe@gmail.com";
	public static String phoneNumber = "0123456789";
	public static String accountPassword = "adminone";
	
	//allows checkbox state to be saved
	public static boolean isSelected = true;
	public static boolean isSelected2 = false;
	public static boolean isSelected3 = true;
	public static boolean isSelected4 = false;
	
	public Account() {
		super("Account Details");
		
		//create font
		Font labelFont = new Font("Arial", Font.BOLD, 16);
		
		//create header
        JPanel headerPanel = new JPanel();
		
		JLabel title = new JLabel("Account");
		title.setFont(new Font("Algerian", Font.BOLD,60));
		title.setForeground(Donation.lightYellow);

		headerPanel.add(title);
		headerPanel.setBackground(Donation.gold);
		headerPanel.setPreferredSize(new Dimension(400,80));
		
		//create borders
		Border border = BorderFactory.createEmptyBorder(0,10,13,0);
		Border checkBoxBorder = BorderFactory.createEmptyBorder(19,1,0,50);
		
		//creates labels and sets their font
		JLabel username = new JLabel("Username:");
		JLabel password = new JLabel("Password:");
		JLabel firstName = new JLabel("First Name:");
		JLabel lastName = new JLabel("Last Name:");
		JLabel email = new JLabel("E-mail Address:");
		JLabel phone = new JLabel("Phone Number:");
		JLabel address = new JLabel("Home Address:");
		JLabel points = new JLabel("Available Points:");
		JLabel donations = new JLabel("Lifetime Donations:");
		JLabel newsletter = new JLabel("Newsletter Subscription:");
		JLabel remember = new JLabel("Remember me?");
		username.setFont(labelFont);
		password.setFont(labelFont);
		firstName.setFont(labelFont);
		lastName.setFont(labelFont);
		email.setFont(labelFont);
		phone.setFont(labelFont);
		address.setFont(labelFont);
		points.setFont(labelFont);
		donations.setFont(labelFont);
		newsletter.setFont(labelFont);
		remember.setFont(labelFont);
		
		//creates labels, text areas and text field to contain information
		JLabel usernameText = new JLabel("admin");
		usernameText.setFont(labelFont);
		
		JPasswordField passwordText = new JPasswordField(accountPassword,8); 
		passwordText.setFont(labelFont);
		passwordText.setEditable(false);
		passwordText.setOpaque(false);
		passwordText.setBorder(BorderFactory.createEmptyBorder());
		
		JTextField emailText = new JTextField(accountEmail,15); 
		emailText.setFont(labelFont);
		emailText.setEditable(false);
		emailText.setOpaque(false);
		emailText.setBorder(BorderFactory.createEmptyBorder());
		
		JTextField phoneText = new JTextField(phoneNumber,15); 
		phoneText.setFont(labelFont);
		phoneText.setEditable(false);
		phoneText.setOpaque(false);
		phoneText.setBorder(BorderFactory.createEmptyBorder());
		
		JLabel firstNameText = new JLabel("John");
		firstNameText.setFont(labelFont);
		
		JLabel lastNameText = new JLabel("Doe");
		lastNameText.setFont(labelFont);
		
		//creates checkbox for newsletter subscription
		JCheckBox newsletterYes = new JCheckBox("Yes");
		newsletterYes.setOpaque(false);
		newsletterYes.setFont(labelFont);
		newsletterYes.setBorder(checkBoxBorder);
		newsletterYes.setSelected(isSelected);
		JCheckBox newsletterNo = new JCheckBox("No");
		newsletterNo.setOpaque(false);
		newsletterNo.setFont(labelFont);
		newsletterNo.setBorder(checkBoxBorder);
		newsletterNo.setSelected(isSelected2);
		ButtonGroup newsletterGroup = new ButtonGroup();
		newsletterGroup.add(newsletterYes);
		newsletterGroup.add(newsletterNo);
		JLabel newsletterBox = new JLabel();
		newsletterBox.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
		newsletterBox.add(newsletterYes);
		newsletterBox.add(newsletterNo);
		
		//creates checkbox for remember me feature
		JCheckBox rememberYes = new JCheckBox("Yes");
		rememberYes.setOpaque(false);
		rememberYes.setFont(labelFont);
		rememberYes.setBorder(checkBoxBorder);
		rememberYes.setSelected(isSelected3);
		JCheckBox rememberNo = new JCheckBox("No");
		rememberNo.setOpaque(false);
		rememberNo.setFont(labelFont);
		rememberNo.setBorder(checkBoxBorder);
		rememberNo.setSelected(isSelected4);
		ButtonGroup rememberGroup = new ButtonGroup();
		rememberGroup.add(rememberYes);
		rememberGroup.add(rememberNo);
		JLabel rememberBox = new JLabel();
		rememberBox.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
		rememberBox.add(rememberYes);
		rememberBox.add(rememberNo);
		
		//saves the state of the checkboxes when they are clicked
    	newsletterYes.addItemListener(new ItemListener() {
			@Override
	        public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					isSelected = true;
	            } else {
	            	isSelected = false;
	            }
	        }
	    });
		
		newsletterNo.addItemListener(new ItemListener() {
			@Override
	         public void itemStateChanged(ItemEvent e2) {
				if (e2.getStateChange() == ItemEvent.SELECTED) {
					isSelected2 = true;
	            } else {
	            	isSelected2 = false;
	            }
	         }
	    });
		
		
		rememberYes.addItemListener(new ItemListener() {
			@Override
	         public void itemStateChanged(ItemEvent e3) {
				if (e3.getStateChange() == ItemEvent.SELECTED) {
					isSelected3 = true;
	            } else {
	            	isSelected3 = false;
	            }
	         }
	    });
		
		rememberNo.addItemListener(new ItemListener() {
			@Override
	         public void itemStateChanged(ItemEvent e4) {
				if (e4.getStateChange() == ItemEvent.SELECTED) {
					isSelected4 = true;
	            } else {
	            	isSelected4 = false;
	            }
	         }
	    });
    	
		
		JTextArea addressText = new JTextArea(homeAddress);
		addressText.setLineWrap(true);
        addressText.setWrapStyleWord(true);
		addressText.setFont(labelFont);
		addressText.setEditable(false);
		addressText.setBackground(Donation.lightYellow);
        JScrollPane addressTextPane = new JScrollPane(addressText);
        addressTextPane.setPreferredSize(new Dimension(120,60));
        addressTextPane.setBorder(BorderFactory.createEmptyBorder());
		
		JLabel pointsText = new JLabel(Integer.toString(totalPoints));
		pointsText.setFont(labelFont);
		
		JLabel donationsText = new JLabel(Integer.toString(lifetimeDonations));
		donationsText.setFont(labelFont);
		
		//creates the bottom panel to contain buttons
		JPanel bottomPanel = new JPanel();
		
		//back button to return to homepage
		JButton backButton = new JButton("Back");
		backButton.setBackground(Donation.gold);
        backButton.setFont(Donation.buttonFont);
        backButton.setForeground(Donation.lightYellow);
		
		backButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent ae) {
		    	new HomePage();
		    	dispose();
		    }
		});
		
		//button to change details
		JButton changeButton = new JButton("Change Details");
		changeButton.setBackground(Donation.gold);
        changeButton.setFont(Donation.buttonFont);
        changeButton.setForeground(Donation.lightYellow);
        
        //button to save details that is hidden at first
        JButton saveButton = new JButton("Save");
		saveButton.setBackground(Donation.gold);
        saveButton.setFont(Donation.buttonFont);
        saveButton.setForeground(Donation.lightYellow);
        saveButton.setVisible(false);
        
        changeButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent ae) {
		    	//makes the password, email address, phone number and home address editable, and makes the save button appear
		    	passwordText.setEditable(true);
				passwordText.setOpaque(true);
				passwordText.setBorder(BorderFactory.createLineBorder(Color.black));
				emailText.setEditable(true);
				emailText.setOpaque(true);
				emailText.setBorder(BorderFactory.createLineBorder(Color.black));
				phoneText.setEditable(true);
				phoneText.setOpaque(true);
				phoneText.setBorder(BorderFactory.createLineBorder(Color.black));
				addressText.setEditable(true);
				addressText.setBackground(Color.white);
				addressTextPane.setBorder(BorderFactory.createLineBorder(Color.black));
				saveButton.setVisible(true);
				validate();
		    }
		});
        
        saveButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent ae) {
		    	//ensures that the phone number entered is a number
		    	try{
		    	    int testNumber = Integer.parseInt(phoneText.getText().toString());
		    	}catch (NumberFormatException ex) {
		    		JOptionPane.showMessageDialog(null, "Please enter a valid phone number with no '-' in between", "Error", JOptionPane.ERROR_MESSAGE);
		    		return;
		    	}
		    	//ensures password is more than 8 characters in length
		    	if (passwordText.getText().length()<8) {
		    		JOptionPane.showMessageDialog(null, "Password must be at least 8 characters in length", "Error", JOptionPane.ERROR_MESSAGE);
		    	//ensures phone number is of a valid length
		    	} else if ((phoneText.getText().length()<10)||(phoneText.getText().length()>15)){
		    		JOptionPane.showMessageDialog(null, "Please enter a valid phone number", "Error", JOptionPane.ERROR_MESSAGE);
		    	//saves the changesand makes the save button disappear
		    	} else {
		    		passwordText.setEditable(false);
		    		passwordText.setOpaque(false);
		    		passwordText.setBorder(BorderFactory.createEmptyBorder());
		    		emailText.setEditable(false);
		    		emailText.setOpaque(false);
		    		emailText.setBorder(BorderFactory.createEmptyBorder());
		    		phoneText.setEditable(false);
		    		phoneText.setOpaque(false);
		    		phoneText.setBorder(BorderFactory.createEmptyBorder());
		    		addressText.setEditable(false);
		    		addressText.setBackground(Donation.lightYellow);
		    		addressTextPane.setBorder(BorderFactory.createEmptyBorder());
		    		accountPassword = passwordText.getText();
		    		accountEmail = emailText.getText();
		    		phoneNumber = phoneText.getText();
		    		homeAddress = addressText.getText();
		    		saveButton.setVisible(false);
		    		validate();
		    	}
		    }
		});
		
        //create panels and add components
		JPanel usernamePanel = new JPanel();
		usernamePanel.setOpaque(false);
		usernamePanel.setLayout(new GridLayout(1,2));
		usernamePanel.add(username);
		usernamePanel.add(usernameText);
		usernamePanel.setBorder(border);
		
		JPanel passwordPanel = new JPanel();
		passwordPanel.setOpaque(false);
		passwordPanel.setLayout(new GridLayout(1,2));
		passwordPanel.add(password);
		passwordPanel.add(passwordText);
		passwordPanel.setBorder(border);
		
		JPanel firstNamePanel = new JPanel();
		firstNamePanel.setOpaque(false);
		firstNamePanel.setLayout(new GridLayout(1,2));
		firstNamePanel.add(firstName);
		firstNamePanel.add(firstNameText);
		firstNamePanel.setBorder(border);
		
		JPanel lastNamePanel = new JPanel();
		lastNamePanel.setOpaque(false);
		lastNamePanel.setLayout(new GridLayout(1,2));
		lastNamePanel.add(lastName);
		lastNamePanel.add(lastNameText);
		lastNamePanel.setBorder(border);
		
		JPanel emailPanel = new JPanel();
		emailPanel.setOpaque(false);
		emailPanel.setLayout(new GridLayout(1,2));
		emailPanel.add(email);
		emailPanel.add(emailText);
		emailPanel.setBorder(border);
		
		JPanel phonePanel = new JPanel();
		phonePanel.setOpaque(false);
		phonePanel.setLayout(new GridLayout(1,2));
		phonePanel.add(phone);
		phonePanel.add(phoneText);
		phonePanel.setBorder(border);
		
		JPanel addressPanel = new JPanel();
		addressPanel.setOpaque(false);
		addressPanel.setLayout(new GridLayout(1,2));
		addressPanel.add(address);
		addressPanel.add(addressTextPane);
		addressPanel.setBorder(border);
		
		JPanel pointsPanel = new JPanel();
		pointsPanel.setOpaque(false);
		pointsPanel.setLayout(new GridLayout(1,2));
		pointsPanel.add(points);
		pointsPanel.add(pointsText);
		pointsPanel.setBorder(border);
		
		JPanel donationsPanel = new JPanel();
		donationsPanel.setOpaque(false);
		donationsPanel.setLayout(new GridLayout(1,2));
		donationsPanel.add(donations);
		donationsPanel.add(donationsText);
		donationsPanel.setBorder(border);
		
		JPanel newsletterPanel = new JPanel();
		newsletterPanel.setOpaque(false);
		newsletterPanel.setLayout(new GridLayout(1,2));
		newsletterPanel.add(newsletter);
		newsletterPanel.add(newsletterBox);
		newsletterPanel.setBorder(border);
		
		JPanel rememberPanel = new JPanel();
		rememberPanel.setOpaque(false);
		rememberPanel.setLayout(new GridLayout(1,2));
		rememberPanel.add(remember);
		rememberPanel.add(rememberBox);
		rememberPanel.setBorder(border);
		
		//add panels to the main panel
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(11,1));
		mainPanel.setBackground(Donation.lightYellow);
		
		mainPanel.add(usernamePanel);
		mainPanel.add(passwordPanel);
		mainPanel.add(firstNamePanel);
		mainPanel.add(lastNamePanel);
		mainPanel.add(phonePanel);
		mainPanel.add(emailPanel);
		mainPanel.add(addressPanel);
		mainPanel.add(pointsPanel);
		mainPanel.add(donationsPanel);
		mainPanel.add(newsletterPanel);
		mainPanel.add(rememberPanel);
		
		//add buttons
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		bottomPanel.setOpaque(false);
		bottomPanel.add(backButton);
		bottomPanel.add(changeButton);
		bottomPanel.add(saveButton);
		
		//make screen scrollable
		JScrollPane pane = new JScrollPane(mainPanel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        pane.setBorder(BorderFactory.createEmptyBorder());
        pane.setPreferredSize(new Dimension(500,600));
        pane.getVerticalScrollBar().setUnitIncrement(16);
		
		add(headerPanel,BorderLayout.NORTH);
		add(pane,BorderLayout.CENTER);
		add(bottomPanel,BorderLayout.SOUTH);
		
		ImageIcon iconImg = new ImageIcon("src/iconImage.JPG");
        setIconImage(iconImg.getImage());
		getContentPane().setBackground(Donation.lightYellow);
		setLocationRelativeTo(null);
		setBounds(400,20,500,700);
		setResizable(false);
	    setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

