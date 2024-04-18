package Ficha4;

import javax.swing.*;

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
        this.setVisible(true);


    }

    public static void main(String[] args) {
        MainPage mainPage1 = new MainPage();
        mainPage1.setSize(1200, 800);
        mainPage1.setVisible(true);
    }

}
