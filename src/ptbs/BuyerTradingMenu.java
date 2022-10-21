package PTBS;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;


import java.awt.event.ActionEvent;
import java.awt.Rectangle;

import java.util.Date;



//implements Factory method design pattern by instantiating/extending Tradingmenu

public class BuyerTradingMenu extends TradingMenu {
	private static final long serialVersionUID = 1L;
	private boolean boolSubmit = false;
	private Offering offer;
	private Trading strade;

	JLabel lTradingName = new JLabel();
	JLabel ldD = new JLabel();
	JTextField tbOffering = new JTextField();
	JButton butSubmit = new JButton();
	JButton butCancel = new JButton();
	JLabel lSuggestedOffering = new JLabel();
	JLabel lselected = new JLabel();
	
	JLabel oneofferLabel = new JLabel();
	JLabel selectedLabel = new JLabel();

	JLabel tradeLabel = new JLabel();
	JLabel dDLabel = new JLabel();
	JLabel offerLabel = new JLabel();
	

	BuyerTradingMenu() {
		
		try {
			
			dispbx();
		} catch (Exception t) {
			t.printStackTrace();
		}
	}

	private void dispbx() throws Exception {
// displays buyers trade menu
		tradeLabel.setText("Trade : ");
		tradeLabel.setBounds(new Rectangle(21, 35, 90, 20));
		
		this.getContentPane().setLayout(null);
		lTradingName.setText("jtname");
		lTradingName.setBounds(new Rectangle(260, 36, 280, 19));
		
		dDLabel.setText("Final Date");
		dDLabel.setBounds(new Rectangle(20, 82, 90, 20));
		
		ldD.setText("jtdD");
		ldD.setBounds(new Rectangle(253, 83, 290, 19));
		
		offerLabel.setText("Offer");
		offerLabel.setBounds(new Rectangle(25, 131, 90, 20));
		
		tbOffering.setText("jtoffer");
		tbOffering.setBounds(new Rectangle(252, 130, 212, 25));
		
		oneofferLabel.setText("Best Offer");
		oneofferLabel.setBounds(new Rectangle(24, 174, 117, 20));
		
		selectedLabel.setText("Final");
		selectedLabel.setBounds(new Rectangle(23, 224, 41, 20));
		
		lSuggestedOffering.setText("jLf");
		lSuggestedOffering.setBounds(new Rectangle(259, 169, 201, 20));
		
		lselected.setText("jtselect");
		lselected.setBounds(new Rectangle(258, 220, 43, 20));
		
		butSubmit.setText("Submit");
		butSubmit.setBounds(new Rectangle(475, 120, 81, 31));
		
		
		
		butSubmit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent t) {
				bSubmitActionPerformed(t);
			}
		});
		butCancel.setText("Cancel");
		butCancel.setBounds(new Rectangle(480, 165, 81, 30));
		butCancel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bCancelActionPerformed(e);
			}
		});
		this.getContentPane().add(tradeLabel, null);
		this.getContentPane().add(dDLabel, null);
		this.getContentPane().add(offerLabel, null);
		this.getContentPane().add(oneofferLabel, null);
		this.getContentPane().add(lTradingName, null);
		this.getContentPane().add(ldD, null);
		this.getContentPane().add(tbOffering, null);
		this.getContentPane().add(selectedLabel, null);
		this.getContentPane().add(lSuggestedOffering, null);
		this.getContentPane().add(lselected, null);
		this.getContentPane().add(butSubmit, null);
		this.getContentPane().add(butCancel, null);
	}

void bCancelActionPerformed(ActionEvent t) {
		
		setVisible(false);
		boolSubmit = false;
		
	}	
	void bSubmitActionPerformed(ActionEvent t) {
		setVisible(false);
		boolSubmit = true;
		
	}
	  //check for an offer by buyer, select the biggest offer if exists.
	 
	public void showMenu(Trading trade, Person person) {
		strade = trade;
		OfferingIterator theItr = strade.GetOfferingIterator();
		//type conversion error
		//offer = (Offering) theItr.Next();
		if (offer == null) {
			tbOffering.setText("No Offer");
		} else {
			tbOffering.setText(offer.item);
			lselected.setText(offer.stext());

		}

		lTradingName.setText(strade.tradeName);
		
		ldD.setText(strade.dD.toString());
		setVisible(true);
		
		lSuggestedOffering.setText(strade.alternateoff.item);

		

		if (boolSubmit == true) {
			if (offer == null) {
				offer = new Offering();
				strade.AddOffering(offer);
			}
			
			offer.item = tbOffering.getText();
			offer.Customer = person.userName;
			offer.sD = new Date();
		}
	}

	@Override
	void ShowMenu(Trading trade, Person cus) {
		// TODO Auto-generated method stub
		
	}

}