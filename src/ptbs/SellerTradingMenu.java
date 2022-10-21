package PTBS;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;

//Factory Design Pattern Implementation
public class SellerTradingMenu extends TradingMenu {
	private static final long serialVersionUID = 1L;
	private boolean boolSubmit = false;
	private Offering offer;
	private Trading strade;
	JLabel tradingLabel = new JLabel();
	JLabel md = new JLabel();
	JButton sbtButton = new JButton();
	JButton cancelButton = new JButton()   ;
	JTextField mdOffering = new JTextField();
	JLabel tradeLabel = new JLabel();
	JLabel dDLabel = new JLabel();
	JLabel offerLabel = new JLabel();

	SellerTradingMenu() {
		try {
			displayBox();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void displayBox() throws Exception {
		tradeLabel.setText(" Trade : ");
		tradeLabel.setBounds(new Rectangle(36, 52, 115, 38));
		this.getContentPane().setLayout(null);
		tradingLabel.setText("prod name");
		tradingLabel.setBounds(new Rectangle(258, 35, 282, 18));
		dDLabel.setText("Bidding Date");
		dDLabel.setBounds(new Rectangle(42, 91, 112, 28));
		md.setText("msd");
		md.setBounds(new Rectangle(328, 102, 354, 24));
		offerLabel.setText("Minimum Offer");
		offerLabel.setBounds(new Rectangle(44, 208, 113, 18));
		mdOffering.setText("trade offer");
		mdOffering.setBounds(new Rectangle(362, 238, 300, 38));
		sbtButton.setText("Submit");
		sbtButton.setBounds(new Rectangle(573, 254, 98, 47));
		sbtButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent t) {
				bSubmitActionPerformed(t);
			}
		});
		cancelButton.setText("Cancel");
		cancelButton.setBounds(new Rectangle(475, 164, 79, 29));
		cancelButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bCancelActionPerformed(e);
			}
		});
		this.getContentPane().add(tradeLabel, null);
		this.getContentPane().add(tradingLabel, null); // insert name of item
		this.getContentPane().add(dDLabel, null);
		this.getContentPane().add(md, null); //insert due date
		this.getContentPane().add(offerLabel, null);
		this.getContentPane().add(mdOffering, null);// insert minimum offer
		this.getContentPane().add(sbtButton, null);
		this.getContentPane().add(cancelButton, null);
	}
	void bCancelActionPerformed(ActionEvent t) {
		boolSubmit = false;
		setVisible(false);
	}
	public void ShowMenu(Trading trade, Person person) {
		strade = trade;
	}
	void bSubmitActionPerformed(ActionEvent t) {
		boolSubmit = true;
		setVisible(false);
	}

	
	

}