import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class list {


    JFrame frame;
    JTextArea textArea;
    JButton saveButton, backButton;


    list(String title, MyFrame prevFrame){

        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBounds(100, 150, 400, 150);

        JButton saveButton = new JButton();
        saveButton.setFont(new Font("Arial", Font.PLAIN, 16));
        saveButton.setBounds(250, 370, 100, 35);
        
        frame.add(textArea);
        frame.add(saveButton);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

