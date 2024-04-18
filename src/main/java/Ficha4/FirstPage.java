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
        this.setVisible(true);


        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateAccPage createAccPage = new CreateAccPage();
                createAccPage.setSize(400, 400);
                createAccPage.setVisible(true);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        FirstPage firstPage1 = new FirstPage();
        firstPage1.setSize(400, 400);
        firstPage1.setVisible(true);
    }
}
