package PTBS;
import javax.swing.JDialog;
abstract public class TradingMenu extends JDialog {
	private static final long serialVersionUID = 1L;
	abstract void ShowMenu(Trading trade, Person cus );
	public void TradingMenu() {
		setSize(600,355);
		setVisible(true);
		setModal(true);
	}
}
