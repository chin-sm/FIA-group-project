import java.awt.BorderLayout;  
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout; 
import java.awt.Image;  
import java.awt.Font;    
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;   
  
import javax.swing.JButton;  
import javax.swing.ImageIcon;    
import javax.swing.JFrame;  
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;  
import javax.swing.JPasswordField;  
import javax.swing.JTextField;  
  
public class Login extends JFrame {  
    
    JPanel panel, heading ;  
    JLabel username, password, message, name;  
    JTextField usernameText;  
    JPasswordField passwordText;  
    JButton signupButton, loginButton;  
      
    // constructor  
    Login (){  
    	super("Login");

    	//font  
    	Font loginLabels = new Font("Arial", Font.BOLD,30);       
    	
        //heading
    	heading = new JPanel();  
    	heading.setBackground(Donation.gold);  
    	heading.setBounds(0,0,450,80);  
    	JLabel name = new JLabel ("Login");  
    	name.setForeground(Donation.lightYellow);  
    	name.setFont(new Font("Algerian", Font.BOLD,60));  
    	heading.add(name);  
    	
    	//background  
    	ImageIcon tempImg = new ImageIcon("src/logo.png");   
    	ImageIcon logoImg = new ImageIcon(tempImg.getImage().getScaledInstance(163, 151, Image.SCALE_DEFAULT));
    	JLabel logo = new JLabel(logoImg);
    	logo.setPreferredSize(new Dimension(200,200));
    	
    	//username panel
    	JPanel usernamePanel = new JPanel();
    	usernameText = new JTextField(8);  
    	usernameText.setFont(loginLabels);
    	username = new JLabel("Username:");
    	username.setOpaque(false);  
    	username.setForeground(Color.BLACK);  
    	username.setBackground(Donation.lightYellow); 
    	username.setFont(loginLabels);
    	usernamePanel.add(username);  
    	usernamePanel.add(usernameText);
    	usernamePanel.setOpaque(false);
    	
    	//password panel
    	JPanel passwordPanel = new JPanel();
    	passwordText = new JPasswordField(8);  
    	passwordText.setFont(loginLabels);
    	password = new JLabel("Password:");
    	password.setBackground(Donation.lightYellow);   
    	password.setOpaque(false);  
    	password.setForeground(Color.BLACK); 
    	password.setFont(loginLabels);
    	passwordPanel.add(password);
    	passwordPanel.add(passwordText);
    	passwordPanel.setOpaque(false);
    	
    	//creating and adding buttons
    	JButton signupButton = new JButton ("Sign Up");  
    	signupButton.setBounds(50, 250, 150, 50);  
    	signupButton.setBackground(Donation.gold);  
    	signupButton.setForeground(Donation.lightYellow);  
    	signupButton.setFont(Donation.buttonFont);
    	
    	signupButton.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent ae) {
    			new SignUp();
    			dispose();
    		}
    	});
 
    	JButton loginButton = new JButton ("Login");  
    	loginButton.setBounds(50, 250, 150, 50);  
    	loginButton.setBackground(Donation.gold);
    	loginButton.setForeground(Donation.lightYellow);  
    	loginButton.setFont(Donation.buttonFont);
    	
    	//accepted username is "admin" and password is "adminone"
    	loginButton.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvent ae) {
    			String userName = usernameText.getText();
    			String password = passwordText.getText();
    			if (userName.trim().equals("admin")&&password.trim().equals("adminone")) {
    				new HomePage();
    				dispose();
    			} else {
    				JOptionPane.showMessageDialog(null, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
    			}
    		}
    	});
    
    	JPanel buttonPanel = new JPanel();
    	buttonPanel.setOpaque(false);
    	buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER,20,10));
    	buttonPanel.add(signupButton);
    	buttonPanel.add(loginButton);
    	
    	
    	//login Panel  
    	JPanel login = new JPanel();   
    	login.setSize(400,350);  
    	login.setBackground(Donation.lightYellow);  
    	login.add(logo);
    	login.add(usernamePanel);
    	login.add(passwordPanel);
    	login.add(buttonPanel);
    	
    	add(login,BorderLayout.CENTER);  
    	add(heading,BorderLayout.NORTH);  
    	
    	ImageIcon iconImg = new ImageIcon("src/iconImage.JPG");
    	setIconImage(iconImg.getImage());
    	getContentPane().setBackground(Donation.lightYellow);
    	setLocationRelativeTo(null);
    	setBounds(400,20,450,700);
    	setResizable(false);
    	setVisible(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }      

    public static void main (String [] args) {  
        new Login();  
    }    
}  