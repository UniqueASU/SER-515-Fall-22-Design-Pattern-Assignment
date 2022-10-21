package PTBS;

import PTBS.Facade;
import PTBS.UserInfoItem;
import java.awt.Rectangle;
import java.io.BufferedReader;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileReader;
import javax.swing.JDialog;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import PTBS.UserInfoItem.USER_TYPE;;


// Contains and manages login functionalities.
public class Login extends JDialog{
	private static final long serialVersionUID = 1L;
	boolean switchVal = false;
	JLabel userNameLabel = new JLabel();
	JLabel userPasswordLabel = new JLabel();
	JTextField userNameText = new JTextField();
	JPasswordField passwordText = new JPasswordField();
	JRadioButton buyerRadioButton = new JRadioButton();
	JRadioButton sellerRadioButton = new JRadioButton();
	JButton loginButton = new JButton();
	JButton exitButton = new JButton();
	ButtonGroup radioButtonGroup = new ButtonGroup();

	private String userBox = null;
	@SuppressWarnings("unused")
	private USER_TYPE type = USER_TYPE.Buyer;
	public static Facade facade = new Facade();
	public Login() {
		try {
			jbInit();
			setSize(500, 500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jbInit() throws Exception {

		this.getContentPane().setLayout(null);
		userNameLabel.setText("Username");
		userNameLabel.setBounds(new Rectangle(82, 52, 100, 25));
		userNameText.setBounds(new Rectangle(170, 52, 300, 22));
		userPasswordLabel.setText("Password");
		userPasswordLabel.setBounds(new Rectangle(82, 119, 80, 18));
		passwordText.setBounds(new Rectangle(170, 119, 300, 22));

		loginButton.setText("Login");
		loginButton.setBounds(new Rectangle(165, 212, 85, 28));
		loginButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginValidation(e);
			}
		});
		exitButton.setText("Cancel");
		exitButton.setBounds(new Rectangle(290, 211, 97, 28));
		exitButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonExit_actionPerformed(e);
			}
		});

		buyerRadioButton.setSelected(true);
		buyerRadioButton.setText("Buyer");
		buyerRadioButton.setBounds(new Rectangle(165, 164, 103, 26));
		sellerRadioButton.setText("Seller");
		sellerRadioButton.setBounds(new Rectangle(290, 162, 103, 26));
		this.getContentPane().add(userNameLabel, null);
		this.getContentPane().add(userPasswordLabel, null);
		this.getContentPane().add(loginButton, null);
		this.getContentPane().add(exitButton, null);
		this.getContentPane().add(userNameText, null);
		this.getContentPane().add(passwordText, null);
		this.getContentPane().add(buyerRadioButton, null);
		this.getContentPane().add(sellerRadioButton, null);
		radioButtonGroup.add(buyerRadioButton);
		radioButtonGroup.add(sellerRadioButton);
	}
	void loginValidation(ActionEvent e) {
		BufferedReader file;
		switchVal = false;
		UserInfoItem user = new UserInfoItem();
		try {
			if (buyerRadioButton.isSelected() == true) {
				File buyerDetails = new File("BuyerInfo.txt");
				type= USER_TYPE.Buyer;
				file = new BufferedReader(new FileReader(buyerDetails));
			}
			else {
				File sellerDetails = new File("SellerInfo.txt");
				type = USER_TYPE.Seller;
				file = new BufferedReader(new FileReader(sellerDetails));
			}
			userBox = userNameText.getText();
			String PasswordBox = new String(passwordText.getPassword());
			String LoginName = null;
			String name = null, userName = null, Password = null;
			while ((name = file.readLine()) != null) {
				userName = getUserName(name);
				Password = getPassword(name);
				if (userName.compareTo(userBox) == 0 && Password.compareTo(PasswordBox) == 0) {
					LoginName = userName;
					user.type = type;
					user.name = userName;
					facade.createProductList();
					facade.createUser(user);
					facade.AttachProductToUser();
					System.out.println("Hi"+" "+ userName +"," +" "+ "Your are logged in successfully");
					System.out.println("#####################################");
					System.out.println("Hi" + " " + userName + ",");
					System.out.println("User Type : " + type);
					System.out.println("#####################################");
					if(type == USER_TYPE.Buyer)
						System.out.println("Products");
					else
						System.out.println("Added Products");
					for(Product product : facade.thePerson.GetProductList()) {
						System.out.println("Product Name :" + product.getName() +  " , Product category :" + product.getCategory());
					}
					System.out.println("#####################################");
				}
			}
			if (LoginName != null) {
				this.setVisible(false);
			} else {
				System.out.println("Invalid user");
			}
		} catch (Exception ee) {
			;
		}

	}

	/*
	 * get the username from name UserName:Password
	 */
	private String getUserName(String name) {

		int Sep = name.lastIndexOf(':');
		return name.substring(0, Sep);
	}

	/*
	 * get the password from name UserName:Password
	 */
	private String getPassword(String name) {

		int Sep = name.lastIndexOf(':');
		return name.substring(Sep + 1, name.length());
	}

	/* after login get the UserName of the login interface */
	public String getUserName() {
		return userBox;
	}

	/* after login get the userType of the login interface */
//    public USER_TYPE getUserType() {
//        return type;
//    }

	public boolean isExit() {
		return switchVal;
	}

	void buttonExit_actionPerformed(ActionEvent e) {
		switchVal = true;
		this.setVisible(false);
	}
}

