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
        this.setVisible(true);


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstPage firstPage = new FirstPage();
                firstPage.setSize(1200, 800);
                firstPage.setVisible(true);
                dispose();

            }
        });
    }

    public static void main(String[] args) {
        CreateAccPage createAccs = new CreateAccPage();
        createAccs.setSize(1200, 800);

        createAccs.setVisible(true);
    }

}
