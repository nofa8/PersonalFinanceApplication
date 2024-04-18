package Ficha4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StatisticsPage extends JFrame{
    private JButton backButton;
    private JLabel monthlyBalance;
    private JLabel dailyBalance;
    private JLabel weeklyBalance;
    private JPanel bigPanel;

    public StatisticsPage() {
        super("Statistics");
        this.setContentPane(bigPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainPage createAccPage = new MainPage();
                dispose();
            }
        });
    }
}
