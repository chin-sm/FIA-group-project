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

public class DonationConfirmation extends JFrame{

	public DonationConfirmation() {
		super("Confirmation");
		
		//creating the header
		JLabel title = new JLabel("Thank you!");
		title.setFont(new Font("Algerian", Font.BOLD,60));
		title.setForeground(Donation.lightYellow);

		//message to confirm with the user how many of the selected item they have donated, the number of points earned, and their total points
		JTextArea message = new JTextArea("You have donated "+Donation.quantity+" unit(s) of "+Donation.item+". You have earned "+Donation.pointsEarned+" points. Your current total is "+Account.totalPoints+" points. Our delivery services will be dispatched to your address within 3 working days.");
        message.setPreferredSize(new Dimension(400, 400));
		message.setLineWrap(true);
        message.setWrapStyleWord(true);
        message.setOpaque(false);
        message.setEditable(false);
		message.setFont(new Font("Arial", Font.BOLD, 24));
		
		//adds button to return to the homepage
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
		
		setLayout(new BorderLayout(50,100));
		add(headerPanel,BorderLayout.NORTH);
		add(mainPanel,BorderLayout.CENTER);
		
		ImageIcon iconImg = new ImageIcon("src/iconImage.JPG");
	    setIconImage(iconImg.getImage());
		getContentPane().setBackground(Donation.lightYellow);
		setLocationRelativeTo(null);
		setBounds(400,20,450,700);
		setResizable(false);
	    setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
