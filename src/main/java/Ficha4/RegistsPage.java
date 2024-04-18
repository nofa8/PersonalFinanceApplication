package Ficha4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistsPage extends JFrame{

    private Registo selected;
    private JList list1;
    private JPanel bigPanel;
    private JButton backButton;
    private JButton createButton;
    private JButton editButton;
    private JButton deleteButton;

    public RegistsPage() {
        super("Create Registration");
        this.setContentPane(bigPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);



        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateRegistPage cr = new CreateRegistPage();

            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //main page viewable
                dispose();
            }
        });
    }
}
