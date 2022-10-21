package PTBS;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Button;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;

public class Reminder extends JDialog {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public JLabel availabletrade =new JLabel();
	public JLabel finishedtrade = new JLabel();
	Button done = new Button();
	
	ClassProductList productList;
	protected java.awt.List next = new java.awt.List();
	protected java.awt.List finished= new java.awt.List();
	
	
	public Reminder() {
		
		try {
			diaInit();
			setSize(395, 395);
			setVisible(true);
			setModal(true);
		} catch (Exception t) {
			t.printStackTrace();
		}
	}
	
	private void diaInit() {
		availabletrade.setText("Available Items");
		availabletrade.setBounds(new Rectangle(30, 42, 160, 20));
		
		
		this.getContentPane().setLayout(null);
		
		finishedtrade.setText("Finished Items");
		finishedtrade.setBounds(new Rectangle(40, 159, 159, 20));
		
		next.setBounds(new Rectangle(29, 65, 340, 79));
		
		done.setLabel("OK");
		done.setBounds(new Rectangle(150, 310, 71, 35));
		
		
		done.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doneActionPerformed(e);
			}
		});
		
		this.getContentPane().add(finishedtrade, null);
		this.getContentPane().add(availabletrade, null);
		this.getContentPane().add(next, null);
		this.getContentPane().add(finished, null);
		this.getContentPane().add(done, null);
	}

	
	void doneActionPerformed(ActionEvent t) {
		
		setVisible(false);
	}
	
	void showReminder(ClassProductList productList) {
		
		ReminderVisitor visitor = new ReminderVisitor();
		
		visitor.visitFacade(Main.facade);
		setVisible(true);
	}

	
}
