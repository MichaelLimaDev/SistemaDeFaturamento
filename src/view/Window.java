package view;

import view.component.Panel;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private static JButton button;

    public static void Window() {
        JFrame window = new JFrame("Window test");

        window.setSize(300, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        Panel panel = new Panel();

        button = new JButton("Botão test");
        button.setBackground(Color.green);
        button.setSize(200, 75);
        panel.add(button);

        window.add(panel);
        window.setVisible(true);
    }

}
