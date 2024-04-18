package Ficha4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage extends JFrame {
    private JPanel bigPanel;
    private JProgressBar progressBar1;
    private JLabel userName;
    private JLabel saldoValue;
    private JPanel navBarUp;
    private JButton buttonPerfil;
    private JButton buttonStatistics;
    private JButton buttonHome;
    private JButton buttonMoviments;
    private JLabel saldoText;
    private JRadioButton radioButton;
    private JTextArea textLastMoviments;

    public MainPage() {
        super("MainPage");
        this.setContentPane(bigPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


        buttonMoviments.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                RegistsPage regists = new RegistsPage();
                //setVisible(false);
            }
        });
        buttonStatistics.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StatisticsPage stat = new StatisticsPage();
                //setVisible(false);
            }
        });
        buttonPerfil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserPage stat = new UserPage();
                //setVisible(false);
            }
        });
    }
}
