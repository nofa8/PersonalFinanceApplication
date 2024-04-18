package Ficha4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPage extends JFrame {
    private JPanel firstPage;
    private JTextField textPassword;
    private JTextField textEmail;
    private JButton registerButton;
    private JButton loginButton;

    public FirstPage() {
        super("Login");
        this.setContentPane(firstPage);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateAccPage createAccPage = new CreateAccPage();
                dispose();
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainPage main = new MainPage();
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        FirstPage firstPage1 = new FirstPage();
    }
}
