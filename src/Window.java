import javax.swing.*;

public class Window extends JFrame {

    protected int with = 600;
    protected int heigth = 600;
    protected boolean rezisable = false;
    protected String title = "Faturamento";

    public Window() {
        JFrame window = new JFrame(title);
        window.setBounds(50, 100, this.with, this.heigth);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

}
