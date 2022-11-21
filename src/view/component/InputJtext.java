package view.component;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class InputJtext extends JFrame {

    private JTextField textField;

    public void InputJtext() {
        this.setTitle("Sei lá");
        this.setSize(200, 120);

        textField = new JTextField(10);
    }
}