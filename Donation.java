import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Donation extends JFrame implements ItemListener{
	
	//create custom colors
	public static Color gold = new Color(212,175,55);
	public static Color lightYellow = new Color(255,255,237);
	
	//creating fonts
	public Font sections = new Font("Arial", Font.BOLD,24);
    public static Font buttonFont = new Font("Arial", Font.BOLD, 20);
	
	//imports and resizes logo
	public ImageIcon logo = new ImageIcon("src/logo.png");
	public ImageIcon smallerLogo = new ImageIcon(logo.getImage().getScaledInstance(163, 151, Image.SCALE_DEFAULT));
	
	//for use in another class
	public static int quantity;
	public static String item;
    int points = 0;
    public static int pointsEarned;
	
    int countChecked = 0;
    @Override
    public void itemStateChanged(ItemEvent ie) {
        if(ie.getSource().getClass() == JCheckBox.class)
        {
            if(ie.getStateChange() == ie.SELECTED)
                countChecked++;
            else if(ie.getStateChange() == ie.DESELECTED)
                countChecked--;
        }
    }
	
    ActionListener typeListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() instanceof JRadioButton){
                JRadioButton radioButton = (JRadioButton) e.getSource();
                if(radioButton.isSelected()){
                    item = (radioButton.getText().toLowerCase());
                }
            }
        }
    };
    
	//class constructor
	public Donation() {
		super("Donation Page");
		
		//creating the header
		JPanel headerPanel = new JPanel();
		
		JLabel title = new JLabel("Donate");
		title.setFont(new Font("Algerian", Font.BOLD,60));
		title.setForeground(lightYellow);

		headerPanel.add(title);
		headerPanel.setBackground(gold);
		headerPanel.setPreferredSize(new Dimension(400,80));

		//creating the donation selection as well as the logo
		JLabel instructions = new JLabel("Choose your donation type:");
		instructions.setFont(sections);
		
        JLabel icon = new JLabel(smallerLogo);
        
		JRadioButton clothingButton = new JRadioButton("Clothing");
		JRadioButton furnitureButton = new JRadioButton("Furniture");
		JRadioButton booksButton = new JRadioButton("Books");
		JRadioButton foodButton = new JRadioButton("Food");
		clothingButton.setOpaque(false);
		furnitureButton.setOpaque(false);
		booksButton.setOpaque(false);
		foodButton.setOpaque(false);
		clothingButton.addActionListener(typeListener);
		furnitureButton.addActionListener(typeListener);
		booksButton.addActionListener(typeListener);
		foodButton.addActionListener(typeListener);
		ButtonGroup donationSelection = new ButtonGroup();
		donationSelection.add(clothingButton);
		donationSelection.add(furnitureButton);
		donationSelection.add(booksButton);
		donationSelection.add(foodButton);

		//creating the option to choose the quantity to donate
		JLabel quantityLabel = new JLabel("Quantity:");
		quantityLabel.setFont(sections);
		JLabel maximumLabel = new JLabel("*Maximum donation is 10 items per transaction");
		String[] qty = {"1","2","3","4","5","6","7","8","9","10"};
		JComboBox quantitySelection = new JComboBox(qty);
		quantitySelection.setSelectedIndex(0);
		quantitySelection.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	quantity = Integer.parseInt((String)quantitySelection.getSelectedItem());
		    }
		});
		
		//creates area to describe the items donated
		JLabel descriptionLabel = new JLabel("Item Descriptions:");
		descriptionLabel.setFont(sections);
		JLabel detailLabel = new JLabel("<html>Please include details about the items you are donating<br>for easier reference (e.g. type of clothes, type and dimensions<br>of furniture, title of books, type and expiry date of food, etc.)</html>");
        JTextArea descriptionInput = new JTextArea(1,1);
        descriptionInput.setLineWrap(true);
        JScrollPane description = new JScrollPane(descriptionInput);
        description.setPreferredSize(new Dimension(390,50));
        
        //creates the part for selection of NGOs
        JLabel ngoLabel = new JLabel("NGO Selection:");
        ngoLabel.setFont(sections);
        JLabel ngoInstructions = new JLabel("Select the NGO(s) you would like to donate to");
        JCheckBox ngoBox1 = new JCheckBox("We Care Society");
        JCheckBox ngoBox2 = new JCheckBox("Big Hearts Centre");
        JCheckBox ngoBox3 = new JCheckBox("Happiness For All");
        JCheckBox ngoBox4 = new JCheckBox("Red Moon Charity");
        JCheckBox ngoBox5 = new JCheckBox("Do Good Today");
        ngoBox1.setOpaque(false);
        ngoBox2.setOpaque(false);
        ngoBox3.setOpaque(false);
        ngoBox4.setOpaque(false);
        ngoBox5.setOpaque(false);
        ngoBox1.addItemListener(this);
        ngoBox2.addItemListener(this);
        ngoBox3.addItemListener(this);
        ngoBox4.addItemListener(this);
        ngoBox5.addItemListener(this);
        
        //creates and formats buttons
        JButton submitButton = new JButton("Submit");
        JButton backButton = new JButton("Back");
        JLabel buttonLabel = new JLabel();
        backButton.setBackground(gold);
        backButton.setFont(buttonFont);
        backButton.setForeground(lightYellow);
        submitButton.setBackground(gold);
        submitButton.setFont(buttonFont);
        submitButton.setForeground(lightYellow);
        buttonLabel.setLayout(new FlowLayout(FlowLayout.RIGHT,20,5));
        buttonLabel.add(backButton);
        buttonLabel.add(submitButton);
        
        backButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent ae) {
		        new HomePage();
		    	dispose();
		    }
		});
        
        submitButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent ae) {
		    	//ensures the user does not select more NGOs than the number of items they plan to donate
		        if (countChecked > quantity) {
		        	JOptionPane.showMessageDialog(null, "Number of NGOs selected cannot exceed donation quantity", "Error", JOptionPane.ERROR_MESSAGE);
		        //leads to the donation confirmation if all details are entered
		        } else if ((donationSelection.getSelection()!=null)&&(descriptionInput.getText().trim().length()>0)&&(countChecked>0)) {
		        	//assigns points based on the type of donation
		        	switch (item) {
		    	    case "clothing":
		    	    case "food":
		    	    	points = 10;
		    	    	break;
		    	    case "books":
		    	    	points = 30;
		    	    	break;
		    	    case "furniture":
		    	    	points = 50;
		    	    	break;
		    	    }
		        	//records the points earned and the total points
		        	pointsEarned = points*quantity;
		        	Account.totalPoints += pointsEarned;
		        	//increases the number of lifetime donations
		        	Account.lifetimeDonations += quantity;
		        	new DonationConfirmation();
			    	dispose();
		        } else {
		        	JOptionPane.showMessageDialog(null, "Please ensure all relevant details have been selected or entered", "Error", JOptionPane.ERROR_MESSAGE);
		        }
		    }
		});
		
        //adds components to respective panels
		JPanel donationPanel = new JPanel();
		donationPanel.setLayout(new GridLayout(5,1,0,0));
		donationPanel.setOpaque(false);
        donationPanel.add(instructions);
        donationPanel.add(clothingButton);
        donationPanel.add(furnitureButton);
        donationPanel.add(booksButton);
        donationPanel.add(foodButton);
        
        JPanel quantityPanel = new JPanel();
        quantityPanel.setLayout(new GridLayout(4,1,5,0));
		quantityPanel.setPreferredSize(new Dimension(400,100));
		quantityPanel.setOpaque(false);
		quantityPanel.add(quantityLabel);
		quantityPanel.add(maximumLabel);
		quantityPanel.add(quantitySelection);
		
		JPanel descriptionPanel = new JPanel();
		descriptionPanel.setLayout(new GridLayout(3,1,5,0));
		descriptionPanel.setOpaque(false);
		descriptionPanel.add(descriptionLabel);
		descriptionPanel.add(detailLabel);
		descriptionPanel.add(description);

        JPanel ngoPanel = new JPanel();
        ngoPanel.setLayout(new GridLayout(7,1,5,5));
        ngoPanel.setOpaque(false);
        ngoPanel.add(ngoLabel);
        ngoPanel.add(ngoInstructions);
        ngoPanel.add(ngoBox1);
        ngoPanel.add(ngoBox2);
        ngoPanel.add(ngoBox3);
        ngoPanel.add(ngoBox4);
        ngoPanel.add(ngoBox5);
        
        //adds all panels to the main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6,1,10,40));
        mainPanel.setBackground(lightYellow);
        mainPanel.add(icon);
        mainPanel.add(donationPanel);
        mainPanel.add(quantityPanel);
        mainPanel.add(descriptionPanel);
        mainPanel.add(ngoPanel);
        mainPanel.add(buttonLabel);
        
        JPanel background = new JPanel();
        background.setBackground(lightYellow);
        background.add(mainPanel,BorderLayout.CENTER);
        
        //makes the screen scrollable
        JScrollPane pane = new JScrollPane(background,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        pane.setBorder(BorderFactory.createEmptyBorder());
        pane.setPreferredSize(new Dimension(400,600));
        pane.getVerticalScrollBar().setUnitIncrement(16);

        add(headerPanel,BorderLayout.NORTH);
        add(pane,BorderLayout.CENTER);
      
        ImageIcon iconImg = new ImageIcon("src/iconImage.JPG");
        setIconImage(iconImg.getImage());
		getContentPane().setBackground(lightYellow);
		setLocationRelativeTo(null);
		setBounds(400,20,450,700);
		setResizable(false);
	    setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


