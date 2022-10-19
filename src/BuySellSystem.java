import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuySellSystem {
    private JButton login;
    private JPasswordField passwordField1;
    private JTextField userNameTextField;
    private JLabel userPassword;

    public BuySellSystem() {
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"hello");
            }
        });
    }
}
