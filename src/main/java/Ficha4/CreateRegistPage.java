package Ficha4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateRegistPage  extends JFrame {
    private JButton backButton;
    private JButton createButton;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JTextArea description;
    private JComboBox comboBox2;
    private JPanel bigPanel;

    public CreateRegistPage() {
        super("Create Registration");
        this.setContentPane(bigPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        comboBox1.addItem("Profit");

        comboBox1.addItem("Loss");

        for (Categoria categoria : Categoria.values()) {
            comboBox2.addItem(categoria.name());
        }


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainPage mainPage = new MainPage();
                dispose();

            }
        });
    }
}



