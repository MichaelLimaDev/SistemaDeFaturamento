package view;

import view.component.Panel;

import javax.swing.*;

public class Window extends JFrame {

    private static JTextField tfild;

    public static void Window() {
        JFrame window = new JFrame("Window test");

        window.setSize(300, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        Panel panel = new Panel();

        tfild = new JTextField(10);
        panel.add(tfild);

        window.add(panel);
        window.setVisible(true);
    }

}
