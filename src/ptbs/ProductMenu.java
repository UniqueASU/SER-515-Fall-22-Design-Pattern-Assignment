package PTBS;
import java.awt.event.*;



import java.util.Iterator;
import javax.swing.*;

import java.awt.*;
//Keeping track of Product Menu
 abstract public class  ProductMenu extends JDialog {
	private static final long serialVersionUID = 1L;
	private Person person;
	public Product productItem;
	public boolean quit = true;
	JButton buttonChangeProduct = new JButton();
	JButton BLogout = new JButton();
	public ProductMenu() {
		try {
			jbInit();
		} catch (Exception ee) {
			ee.printStackTrace();
		}
		setModal(true);
		setSize(500, 290);
	}
	private void jbInit() throws Exception {
		buttonChangeProduct.setText("Product Change");
		buttonChangeProduct.setBounds(new Rectangle(111, 212, 76, 40));
		buttonChangeProduct.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonChangeProductActionPerformed(e);
			}
		});
		this.getContentPane().setLayout(null);
		this.setTitle("");
		BLogout.setBounds(new Rectangle( 350, 350 , 117, 73) );
		BLogout.setText("Logout");
		BLogout.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(ActionEvent e) {
				buttonLogoutActionPerformed(e);
			}
		});
		this.getContentPane().add(buttonChangeProduct, null);
		this.getContentPane().add(BLogout, null);
	}
	
	JComboBox<Trading> trax = new JComboBox<Trading>();
	void render() {
		trax.removeAllItems();
		Iterator<Trading> mv = productItem.tradeList.iterator();
		while(mv.hasNext()) {
			trax.addItem(mv.next());
		}
	}
	
	void TradingAddButtonActionPerformed(  ActionEvent t) {
		Main.facade.addTrading(productItem);
		render();
	}
	void TradingViewButtonActionPerformed( ActionEvent t) {
		Trading trade = (Trading) trax.getSelectedItem();
		Main.facade.viewTrading(trade);
	};
	void buttonChangeProductActionPerformed(ActionEvent t){
		setVisible(false);
		quit = false;
	}
	void buttonLogoutActionPerformed(ActionEvent t) {
		setVisible(false);
		quit = true;
	}
	
	boolean ifLogout() {
		return quit;
	}
	public abstract void showMenu(Product product);

	public abstract void showAddButton();

	public abstract void showViewButton();

	public abstract void showRadioButton();

	public abstract void showLabels();

	public abstract void showComboxes();

}
