package ptbs;

import javax.swing.JDialog;


abstract public class TradingMenu extends JDialog {


    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public abstract void ShowMenu(Trading trade, Person cus);

    public void TradingMenu() {
        setSize(800,675);
        setVisible(true);

        setModal(true);
    }
}
