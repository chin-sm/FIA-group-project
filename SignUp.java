import java.awt.BorderLayout;
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

public class SignUp extends JFrame{
	
	public SignUp() {
		super("Sign Up");
		
		//create borders and font
		Border border = BorderFactory.createEmptyBorder(0,10,13,0);
		Border checkBoxBorder = BorderFactory.createEmptyBorder(10,1,0,50);
		Font labelFont = new Font("Arial", Font.BOLD, 16);
		
		//create header
        JPanel headerPanel = new JPanel();
		
		JLabel title = new JLabel("Sign Up");
		title.setFont(new Font("Algerian", Font.BOLD,60));
		title.setForeground(Donation.lightYellow);

		headerPanel.add(title);
		headerPanel.setBackground(Donation.gold);
		headerPanel.setPreferredSize(new Dimension(400,80));
		
		//text at the top of the page
		JLabel introText = new JLabel("<html><div style='text-align: center;'>Sign up with us today to be clutter-free and full of charity!</div></html>");
	    introText.setFont(new Font("Arial", Font.ITALIC+Font.BOLD, 16));
	    introText.setBorder(BorderFactory.createEmptyBorder(10,10,10,0));
	    introText.setPreferredSize(new Dimension(500,getHeight()));
		
	    //labels and fields to prompt for and contain information
	    JLabel username = new JLabel("Username:");
		JLabel password = new JLabel("Password:");
		JLabel passwordConfirm = new JLabel("Confirm password:");
		JLabel firstName = new JLabel("First Name:");
		JLabel lastName = new JLabel("Last Name:");
		JLabel email = new JLabel("E-mail Address:");
		JLabel phone = new JLabel("Phone Number:");
		JLabel address = new JLabel("Home Address:");
		JLabel newsletter = new JLabel("Newsletter Subscription:");
		JLabel terms = new JLabel("Terms of Services:");
		username.setFont(labelFont);
		password.setFont(labelFont);
		passwordConfirm.setFont(labelFont);
		firstName.setFont(labelFont);
		lastName.setFont(labelFont);
		email.setFont(labelFont);
		phone.setFont(labelFont);
		address.setFont(labelFont);
		newsletter.setFont(labelFont);
		terms.setFont(labelFont);
		
		JTextField usernameText = new JTextField(8);
		usernameText.setFont(labelFont);
		
		JPasswordField passwordText = new JPasswordField(8);
		passwordText.setFont(labelFont);
		
		JPasswordField passwordConfirmText = new JPasswordField(8);
		passwordConfirmText.setFont(labelFont);
		
		JTextField firstNameText = new JTextField(8);
		firstNameText.setFont(labelFont);
		
		JTextField lastNameText = new JTextField(8);
		lastNameText.setFont(labelFont);
		
		JTextField emailText = new JTextField(15);
		emailText.setFont(labelFont);
		
		JTextField phoneText = new JTextField(15);
		phoneText.setFont(labelFont);
		
		JTextArea addressText = new JTextArea();
		addressText.setLineWrap(true);
        addressText.setWrapStyleWord(true);
		addressText.setFont(labelFont);
        JScrollPane addressTextPane = new JScrollPane(addressText);
        addressTextPane.setPreferredSize(new Dimension(120,40));
        
        //creates JCheckBox to let the user select whether to receive newsletter
    	JCheckBox newsletterYes = new JCheckBox("Yes");
		newsletterYes.setOpaque(false);
		newsletterYes.setFont(labelFont);
		newsletterYes.setBorder(checkBoxBorder);
		newsletterYes.setSelected(true);
		JCheckBox newsletterNo = new JCheckBox("No");
		newsletterNo.setOpaque(false);
		newsletterNo.setFont(labelFont);
		newsletterNo.setBorder(checkBoxBorder);
		ButtonGroup newsletterGroup = new ButtonGroup();
		newsletterGroup.add(newsletterYes);
		newsletterGroup.add(newsletterNo);
		JLabel newsletterBox = new JLabel();
		newsletterBox.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
		newsletterBox.add(newsletterYes);
		newsletterBox.add(newsletterNo);
		
		//terms of services agreement
		JCheckBox termsBox = new JCheckBox("I agree with the TOS");
		termsBox.setOpaque(false);
		termsBox.setFont(labelFont);
		termsBox.setBorder(BorderFactory.createEmptyBorder(3,1,0,0));
		
		//back button to return to login page
		JButton backButton = new JButton("Back");
		backButton.setBackground(Donation.gold);
        backButton.setFont(Donation.buttonFont);
        backButton.setForeground(Donation.lightYellow);
		
		backButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent ae) {
		    	new Login();
		    	dispose();
		    }
		});
		
		//sign up button 
		JButton signUpButton = new JButton("Sign Up");
        signUpButton.setFont(Donation.buttonFont);
        signUpButton.setEnabled(false);
        
        signUpButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent ae) {
		    	//ensures the phone number is a number
		    	try{
		    	    int testNumber = Integer.parseInt(phoneText.getText().toString());
		    	}catch (NumberFormatException ex) {
		    		JOptionPane.showMessageDialog(null, "Please enter a valid phone number with no '-' in between", "Error", JOptionPane.ERROR_MESSAGE);
		    		return;
		    	}
		    	
		    	//ensures username is between 5 and 15 characters, password is at least 8 characters, password is confirmed correctly,
		    	//name is entered, phone number is of normal length, and email and addresss are entered
		    	//shows success message if all details are entered correctly
		    	if ((usernameText.getText().length()<5)||usernameText.getText().length()>15) {
		    		JOptionPane.showMessageDialog(null, "Username must be between 5 and 15 characters in length", "Error", JOptionPane.ERROR_MESSAGE);
		    	} else if (passwordText.getText().length()<8) {
		    		JOptionPane.showMessageDialog(null, "Password must be at least 8 characters in length", "Error", JOptionPane.ERROR_MESSAGE);
		    	} else if (!(passwordConfirmText.getText().contentEquals(passwordText.getText()))) {
		    		JOptionPane.showMessageDialog(null, "Password confirmation does not match password", "Error", JOptionPane.ERROR_MESSAGE);
		    	} else if ((firstNameText.getText().trim().length()<1)||(lastNameText.getText().trim().length()<1)) {
		    		JOptionPane.showMessageDialog(null, "Please enter your name", "Error", JOptionPane.ERROR_MESSAGE);
		    	} else if ((phoneText.getText().length()<10)||(phoneText.getText().length()>15)){
		    		JOptionPane.showMessageDialog(null, "Please enter a valid phone number", "Error", JOptionPane.ERROR_MESSAGE);
		    	} else if (emailText.getText().trim().length()<1) {
		    		JOptionPane.showMessageDialog(null, "Please enter your e-mail address", "Error", JOptionPane.ERROR_MESSAGE);
		    	} else if (addressText.getText().trim().length()<1) {
		    		JOptionPane.showMessageDialog(null, "Please enter your home address", "Error", JOptionPane.ERROR_MESSAGE);
		    	} else {
		    		JOptionPane.showMessageDialog(null, "Your registration has been completed! A confirmation\nmail has been sent to your e-mail.", "Success!", JOptionPane.INFORMATION_MESSAGE);
		    		new Login();
		    		dispose();
		    	}
		    }
		});
        
        //allows the user to click on the sign up button only if they agree to the terms of services
		termsBox.addItemListener(new ItemListener() {
			@Override
	         public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					signUpButton.setEnabled(true);
					signUpButton.setBackground(Donation.gold);
			        signUpButton.setForeground(Donation.lightYellow);
			        validate();
	            } else {
					signUpButton.setEnabled(false);
					signUpButton.setBackground(null);
			        signUpButton.setForeground(null);
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
		
		JPanel passwordConfirmPanel = new JPanel();
		passwordConfirmPanel.setOpaque(false);
		passwordConfirmPanel.setLayout(new GridLayout(1,2));
		passwordConfirmPanel.add(passwordConfirm);
		passwordConfirmPanel.add(passwordConfirmText);
		passwordConfirmPanel.setBorder(border);
		
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
		
		JPanel newsletterPanel = new JPanel();
		newsletterPanel.setOpaque(false);
		newsletterPanel.setLayout(new GridLayout(1,2));
		newsletterPanel.add(newsletter);
		newsletterPanel.add(newsletterBox);
		newsletterPanel.setBorder(border);
		
		JPanel termsPanel = new JPanel();
		termsPanel.setOpaque(false);
		termsPanel.setLayout(new GridLayout(1,2));
		termsPanel.add(terms);
		termsPanel.add(termsBox);
		termsPanel.setBorder(border);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		bottomPanel.setOpaque(false);
		bottomPanel.add(backButton);
		bottomPanel.add(signUpButton);
		
		//add panels to the main panel
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(12,1));
		mainPanel.setBackground(Donation.lightYellow);
		mainPanel.add(introText);
		mainPanel.add(usernamePanel);
		mainPanel.add(passwordPanel);
		mainPanel.add(passwordConfirmPanel);
		mainPanel.add(firstNamePanel);
		mainPanel.add(lastNamePanel);
		mainPanel.add(phonePanel);
		mainPanel.add(emailPanel);
		mainPanel.add(addressPanel);
		mainPanel.add(newsletterPanel);
		mainPanel.add(termsPanel);
		mainPanel.add(bottomPanel);
		
		//makes page scrollable
		JScrollPane pane = new JScrollPane(mainPanel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        pane.setBorder(BorderFactory.createEmptyBorder());
        pane.setPreferredSize(new Dimension(500,600));
        pane.getVerticalScrollBar().setUnitIncrement(16);
		
		add(headerPanel,BorderLayout.NORTH);
		add(pane,BorderLayout.CENTER);
      
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
