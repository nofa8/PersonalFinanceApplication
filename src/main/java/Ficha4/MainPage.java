package Ficha4;

public class MainPage extends Frame{
    public MainPage() {
        super("MainPage");
        this.setContentPane(MainPage);
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
