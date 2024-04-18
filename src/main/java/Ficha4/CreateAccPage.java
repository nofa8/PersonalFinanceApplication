package Ficha4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateAccPage extends JFrame {
    private JPanel createAcc;
    private JButton createAccountButton;
    private JPasswordField passwordField1;
    private JTextField textField1;
    private JButton backButton;

    public CreateAccPage() {
        super("Login");
        this.setContentPane(createAcc);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);



        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstPage firstPage = new FirstPage();
                dispose();

            }
        });

        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainPage main = new MainPage();
                dispose();
            }
        });
    }

}
