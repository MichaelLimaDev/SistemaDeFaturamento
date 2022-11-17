package view;

import javax.swing.*;

public class Window extends JFrame {

    public static void Window() {
        JFrame window = new JFrame("Window test");

        window.setSize(300, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        Panel panel = new Panel();

        window.add(panel);
        window.setVisible(true);
    }

}
