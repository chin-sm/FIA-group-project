import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class VoucherRedemption extends JFrame {
	JPanel panel, panel2, panel3, panel4, panel5, panel6;
	JLabel redemption, redemption2, redemption3, redemption4, redemption5, redemption6;
	JButton redeemButton, redeemButton2, redeemButton3, redeemButton4, redeemButton5, redeemButton6;
	
	//images for each voucher
	private ImageIcon redemptionImage = new 
			ImageIcon("src/amazon.jpeg");
	private ImageIcon redemption2Image = new 
			ImageIcon("src/starbucks.jpeg");
	private ImageIcon redemption3Image = new
			ImageIcon("src/zalora.jpeg");
	private ImageIcon redemption4Image = new 
			ImageIcon("src/jd.jpeg");
	private ImageIcon redemption5Image = new
	        ImageIcon("src/zara.jpeg");
	private ImageIcon redemption6Image = new
			ImageIcon("src/ikea.jpeg");
			
	//points needed to redeem each voucher
	public static final int AMAZON_POINTS = 250;

	public static final int ZALORA_POINTS = 100;
	 
	public static final int STARBUCKS_POINTS = 50;
	
	public static final int JD_POINTS = 150;
	
	public static final int ZARA_POINTS = 200;
	
	public static final int IKEA_POINTS = 150;
	
	//string to tell the selected voucher when confirming redemption
	public static String voucher;
	
	public VoucherRedemption(){
		super("Voucher Redemption");
		
		//create header
        JPanel headerPanel = new JPanel();
		
		JLabel header = new JLabel("REDEEM");
		header.setFont(new Font("Algerian", Font.BOLD,60));
		header.setForeground(Donation.lightYellow);

		headerPanel.add(header);
		headerPanel.setBackground(Donation.gold);
		headerPanel.setPreferredSize(new Dimension(400,80));
		
		JPanel mainPanel = new JPanel();
		mainPanel.setOpaque(false);
		
		//create font
		Font voucherTitle = new Font("Arial", Font.BOLD, 18);
		
		//set layout
		mainPanel.setLayout(new GridLayout (3, 6, 10, 10));
				
		//AMAZON
		//resizes image
		ImageIcon amazonImage = new ImageIcon(redemptionImage.getImage().getScaledInstance(230, 130, Image.SCALE_DEFAULT));
		
		JLabel redemption = new JLabel(amazonImage);
		
		//create button and set couher title
		redeemButton = new JButton("REDEEM");
		redeemButton.setForeground(Donation.lightYellow);
		redeemButton.setBackground(Donation.gold);
		JLabel title = new JLabel("RM50 Amazon Voucher");
		title.setFont(voucherTitle);
		
		//add voucher title and image
		panel = new JPanel();
		panel.add(title,BorderLayout.NORTH);
		panel.add(redemption,BorderLayout.CENTER);
		panel.setBackground(new Color(250,218,94));
		
		//create panel for points and redeem button
		JPanel bottomPart = new JPanel();
		bottomPart.setOpaque(false);
		JLabel points = new JLabel(AMAZON_POINTS+" points");
		bottomPart.add(points); 
		bottomPart.add(redeemButton);
		bottomPart.setLayout(new FlowLayout(FlowLayout.RIGHT, 80,0));
		
		redeemButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent ae) {
		    	//shows error if the user does not have enough points to redeem the voucher
		    	if (AMAZON_POINTS>Account.totalPoints) {
		    		JOptionPane.showMessageDialog(null, "Insufficient balance", "Error", JOptionPane.ERROR_MESSAGE);
		    		return;
		    	} else {
		    		//decreases total points and sets the selected voucher for confirmation message
		    		Account.totalPoints -= AMAZON_POINTS;
		    		voucher = "RM50 Amazon Voucher";
		    		new RedemptionConfirmation();
			    	dispose();
		    	}
		    }
		});
		
		panel.add(bottomPart,BorderLayout.SOUTH);
		mainPanel.add(panel);
		
		//STARBUCKS
		ImageIcon starbucksImage = new ImageIcon(redemption2Image.getImage().getScaledInstance(230, 130, Image.SCALE_DEFAULT));
		
		JLabel redemption2 = new JLabel(starbucksImage);

		redeemButton2 = new JButton("REDEEM");
		redeemButton2.setForeground(Donation.lightYellow);
		redeemButton2.setBackground(Donation.gold);
		JLabel title2 = new JLabel("RM10 Starbucks Voucher");
		title2.setFont(voucherTitle);
		
		panel2 = new JPanel();
		panel2.add(title2,BorderLayout.NORTH);
		panel2.add(redemption2,BorderLayout.CENTER);
		panel2.setBackground(new Color(250,218,94));
		
		JPanel bottomPart2 = new JPanel();
		bottomPart2.setOpaque(false);
		JLabel points2 = new JLabel(STARBUCKS_POINTS+" points");
		bottomPart2.add(points2); 
		bottomPart2.add(redeemButton2);
		bottomPart2.setLayout(new FlowLayout(FlowLayout.RIGHT, 80,0));
		
		redeemButton2.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent ae) {
		    	if (STARBUCKS_POINTS>Account.totalPoints) {
		    		JOptionPane.showMessageDialog(null, "Insufficient balance", "Error", JOptionPane.ERROR_MESSAGE);
		    		return;
		    	} else {
		    		Account.totalPoints -= STARBUCKS_POINTS;
		    		voucher = "RM10 Starbucks Voucher";
		    		new RedemptionConfirmation();
			    	dispose();
		    	}
		    }
		});
		
		panel2.add(bottomPart2,BorderLayout.SOUTH);
		mainPanel.add(panel2);

		
     	// ZALORA
		ImageIcon zaloraImage = new ImageIcon(redemption3Image.getImage().getScaledInstance(230, 130, Image.SCALE_DEFAULT));
		
		JLabel redemption3 = new JLabel(zaloraImage);

		redeemButton3 = new JButton("REDEEM");
		redeemButton3.setForeground(Donation.lightYellow);
		redeemButton3.setBackground(Donation.gold);
		JLabel title3 = new JLabel("RM20 Zalora Voucher");
		title3.setFont(voucherTitle);
		
		panel3 = new JPanel();
		panel3.add(title3,BorderLayout.NORTH);
		panel3.add(redemption3,BorderLayout.CENTER);
		panel3.setBackground(new Color(250,218,94));
		
		JPanel bottomPart3 = new JPanel();
		bottomPart3.setOpaque(false);
		JLabel points3 = new JLabel(ZALORA_POINTS+" points");
		bottomPart3.add(points3);
		bottomPart3.add(redeemButton3);
		bottomPart3.setLayout(new FlowLayout(FlowLayout.RIGHT, 80,0));
		
		redeemButton3.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent ae) {
		    	if (ZALORA_POINTS>Account.totalPoints) {
		    		JOptionPane.showMessageDialog(null, "Insufficient balance", "Error", JOptionPane.ERROR_MESSAGE);
		    		return;
		    	} else {
		    		Account.totalPoints -= ZALORA_POINTS;
		    		voucher = "RM20 Zalora Voucher";
		    		new RedemptionConfirmation();
			    	dispose();
		    	}
		    }
		});
		
		panel3.add(bottomPart3,BorderLayout.SOUTH);
		mainPanel.add(panel3);
		
		
		//JD SPORTS
		ImageIcon jdImage = new ImageIcon(redemption4Image.getImage().getScaledInstance(230, 130, Image.SCALE_DEFAULT));
				
		JLabel redemption4 = new JLabel(jdImage);

		redeemButton4 = new JButton("REDEEM");
		redeemButton4.setForeground(Donation.lightYellow);
		redeemButton4.setBackground(Donation.gold);
		JLabel title4 = new JLabel("RM30 JD Sports Voucher");
		title4.setFont(voucherTitle);
				
		panel4 = new JPanel();
		panel4.add(title4,BorderLayout.NORTH);
		panel4.add(redemption4,BorderLayout.CENTER);
		panel4.setBackground(new Color(250,218,94));
				
		JPanel bottomPart4 = new JPanel();
		bottomPart4.setOpaque(false);
		JLabel points4 = new JLabel(JD_POINTS+" points");
		bottomPart4.add(points4); 
		bottomPart4.add(redeemButton4);
		bottomPart4.setLayout(new FlowLayout(FlowLayout.RIGHT, 80,0));
				
		redeemButton4.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent ae) {
		    	if (JD_POINTS>Account.totalPoints) {
		    		JOptionPane.showMessageDialog(null, "Insufficient balance", "Error", JOptionPane.ERROR_MESSAGE);
		    		return;
		    	} else {
		    		Account.totalPoints -= JD_POINTS;
		    		voucher = "RM30 JD Sports Voucher";
		    		new RedemptionConfirmation();
			    	dispose();
		    	}
		    }
		});
				
		panel4.add(bottomPart4,BorderLayout.SOUTH);
		mainPanel.add(panel4);		

		
		//ZARA
		ImageIcon zaraImage = new ImageIcon(redemption5Image.getImage().getScaledInstance(230, 130, Image.SCALE_DEFAULT));
				
		JLabel redemption5 = new JLabel(zaraImage);

		redeemButton5 = new JButton("REDEEM");
		redeemButton5.setForeground(Donation.lightYellow);
		redeemButton5.setBackground(Donation.gold);
		JLabel title5 = new JLabel("RM40 Zara Voucher");
		title5.setFont(voucherTitle);
				
		panel5 = new JPanel();
		panel5.add(title5,BorderLayout.NORTH);
		panel5.add(redemption5,BorderLayout.CENTER);
		panel5.setBackground(new Color(250,218,94));
				
		JPanel bottomPart5 = new JPanel();
		bottomPart5.setOpaque(false);
		JLabel points5 = new JLabel(ZARA_POINTS+" points");
		bottomPart5.add(points5); 
		bottomPart5.add(redeemButton5);
		bottomPart5.setLayout(new FlowLayout(FlowLayout.RIGHT, 80,0));
				
		redeemButton5.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent ae) {
		    	if (ZARA_POINTS>Account.totalPoints) {
		    		JOptionPane.showMessageDialog(null, "Insufficient balance", "Error", JOptionPane.ERROR_MESSAGE);
		    		return;
		    	} else {
		    		Account.totalPoints -= ZARA_POINTS;
		    		voucher = "RM40 Zara Voucher";
		    		new RedemptionConfirmation();
			    	dispose();
		    	}
		    }
		});
			
				
		panel5.add(bottomPart5,BorderLayout.SOUTH);
		mainPanel.add(panel5);		
		
		
		//IKEA
		ImageIcon ikeaImage = new ImageIcon(redemption6Image.getImage().getScaledInstance(230, 130, Image.SCALE_DEFAULT));
						
		JLabel redemption6 = new JLabel(ikeaImage);

		redeemButton6 = new JButton("REDEEM");
		redeemButton6.setForeground(Donation.lightYellow);
		redeemButton6.setBackground(Donation.gold);
		JLabel title6 = new JLabel("RM30 Ikea Voucher");
		title6.setFont(voucherTitle);
				
		panel6 = new JPanel();
		panel6.add(title6,BorderLayout.NORTH);
		panel6.add(redemption6,BorderLayout.CENTER);
		panel6.setBackground(new Color(250,218,94));
				
		JPanel bottomPart6 = new JPanel();
		bottomPart6.setOpaque(false);
		JLabel points6 = new JLabel(IKEA_POINTS+" points");
		bottomPart6.add(points6); 
		bottomPart6.add(redeemButton6);
		bottomPart6.setLayout(new FlowLayout(FlowLayout.RIGHT, 80,0));
				
		redeemButton6.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent ae) {
		    	if (IKEA_POINTS>Account.totalPoints) {
		    		JOptionPane.showMessageDialog(null, "Insufficient balance", "Error", JOptionPane.ERROR_MESSAGE);
		    		return;
		    	} else {
		    		Account.totalPoints -= IKEA_POINTS;
		    		voucher = "RM30 Ikea Voucher";
		    		new RedemptionConfirmation();
			    	dispose();
		    	}
		    }
		});
						
		panel6.add(bottomPart6,BorderLayout.SOUTH);
		mainPanel.add(panel6);	
	
	    //creates the bottom panel that shows the available points and has a back button
	    JPanel bottomPanel = new JPanel();
	    bottomPanel.setOpaque(false);
    	bottomPanel.setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
    	JButton backButton = new JButton("Back");
    	backButton.setBackground(Donation.gold);
    	backButton.setFont(Donation.buttonFont);
    	backButton.setForeground(Donation.lightYellow);
    	JLabel availablePoints = new JLabel("Available points: "+Account.totalPoints);
    	availablePoints.setFont(Donation.buttonFont);
    	bottomPanel.add(availablePoints);
    	bottomPanel.add(backButton);
    
    	backButton.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent ae) {
    			new HomePage();
    			dispose();
    		}
    	});
	
    	setLayout(new BorderLayout(5,5));
    	add(headerPanel,BorderLayout.NORTH);
    	add(mainPanel,BorderLayout.CENTER);
    	add(bottomPanel,BorderLayout.SOUTH);
	
    	ImageIcon iconImg = new ImageIcon("src/iconImage.JPG");
        setIconImage(iconImg.getImage());
    	getContentPane().setBackground(Donation.lightYellow);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setSize(600, 800);
    	setLocationRelativeTo(null);
    	setResizable(false);
    	setVisible(true);
	}

}