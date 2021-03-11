package JavaFx;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame {

    public Window() throws HeadlessException {
        setSize(500, 500);
        setLocation(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
        BorderLayout borderLayout = new BorderLayout();
        GridLayout gridLayout = new GridLayout(3,3);
        JPanel panel = new JPanel(borderLayout);
        JButton ok = new JButton("OK");
        JLabel label = new JLabel();
        JTextField textField = new JTextField();
        textField.setText("sgjkjdhgjkhsjkghsdjkhgk");
        JButton cancel = new JButton("Cancel");
        panel.add(ok,  BorderLayout.CENTER);
        panel.add(cancel, BorderLayout.NORTH);
        panel.add(label, BorderLayout.EAST);
        panel.add(textField, BorderLayout.WEST);
        ok.addActionListener(e -> {
            String text = textField.getText();
            label.setText(text);
        });

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }
}