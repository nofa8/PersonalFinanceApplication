package Ficha4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserPage extends JFrame{
    private JLabel userName;
    private JButton logoutButton;
    private JButton backButton;
    private JTextArea userDetails;
    private JPanel bigPanel;
    private MainPage main;
    public UserPage() {
        super("MainPage");
        this.main = main;
        this.setContentPane(bigPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

}
