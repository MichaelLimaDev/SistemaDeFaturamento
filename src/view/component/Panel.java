package view.component;

import javax.swing.*;

public class Panel extends JPanel {
    public void Panel() {
        JTextField field = new JTextField(10);
        field.setSize(100, 50);
        field.setText("Sei la");
        field.setVisible(true);

        add(field);
    }
}
