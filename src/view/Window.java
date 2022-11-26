package view;

import view.component.Panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        button.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame modal = new JFrame();
                        modal.setSize(300, 500);
                        modal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        modal.setResizable(false);
                        modal.setVisible(true);
                    }
                }
        );
        panel.add(button);

        window.add(panel);
        window.setVisible(true);
    }
}
