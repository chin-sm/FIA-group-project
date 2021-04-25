import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class RedemptionConfirmation extends JFrame{
	
	public RedemptionConfirmation() {
		super("Congratulations!");
		//creating the header

		JLabel title = new JLabel("CONGRATULATIONS!");
		title.setFont(new Font("Algerian", Font.BOLD,60));
		title.setForeground(Donation.lightYellow);
		
		//message to confirm with the user the voucher they have claimed and their total remaining points
		JTextArea message = new JTextArea("You have claimed a "+VoucherRedemption.voucher+". Your current point balance is "+Account.totalPoints+" points.");
        message.setPreferredSize(new Dimension(400, 150));
		message.setLineWrap(true);
        message.setWrapStyleWord(true);
        message.setOpaque(false);
        message.setEditable(false);
		message.setFont(new Font("Arial", Font.BOLD, 24));
		
		//creates button to return to the home page
		JButton homeButton = new JButton("Return to Homepage");
        homeButton.setBackground(Donation.gold);
        homeButton.setFont(Donation.buttonFont);
        homeButton.setForeground(Donation.lightYellow);
        homeButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent ae) {
		        new HomePage();
		    	dispose();
		    }
		});
		
        //create and add panels
		JPanel headerPanel = new JPanel();
		headerPanel.add(title);
		headerPanel.setBackground(Donation.gold);
		headerPanel.setPreferredSize(new Dimension(400,80));
		
		JPanel mainPanel = new JPanel();
		mainPanel.setOpaque(false);
		mainPanel.add(message,BorderLayout.CENTER);
		mainPanel.add(homeButton,BorderLayout.SOUTH);
		
		setLayout(new BorderLayout(50,50));
		add(headerPanel,BorderLayout.NORTH);
		add(mainPanel,BorderLayout.CENTER);
		
		ImageIcon iconImg = new ImageIcon("src/iconImage.JPG");
	    setIconImage(iconImg.getImage());
		getContentPane().setBackground(Donation.lightYellow);
		setLocationRelativeTo(null);
		setBounds(400,20,650,400);
		setResizable(false);
	    setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}