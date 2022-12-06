package view.component;

import view.functions.interaction.AddItem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame {

    private String title;
    private int width = 300;
    private int height = 200;

    private JTextField textField;

    public void Form(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
    }

    public void createFormWindow() {
        JFrame form = new JFrame(this.title);
        form.setSize(this.width, this.height);
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Panel panel = new Panel();
        JTextField inputNameProduct = new JTextField("Sei la");
        JTextField inputQuantityProduct = new JTextField("Sei la");
        JTextField inputValueProduct = new JTextField("Sei la");

        JButton button = new JButton("Opan");
        button.setBackground(Color.green);
        button.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        AddItem addItem = new AddItem();
                        addItem.insertItem(inputNameProduct.getText(), Double.parseDouble(inputValueProduct.getText()), Integer.parseInt(inputQuantityProduct.getText()));
                    }
                }
        );

        panel.add(inputNameProduct);
        panel.add(inputValueProduct);
        panel.add(inputQuantityProduct);
        panel.add(button);

        form.add(panel);

        form.setVisible(true);
    }

}
