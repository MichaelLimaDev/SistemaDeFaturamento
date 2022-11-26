package view.component;

import javax.swing.*;

public class Form extends JFrame {

    private String title;
    private int width = 300;
    private int height = 200;

    public void Form(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
    }

    public void createFormWindow() {
        JFrame form = new JFrame(this.title);
        form.setSize(this.width, this.height);
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        form.setVisible(false);
    }

}
