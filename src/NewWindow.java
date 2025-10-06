import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWindow {

    // instance variables
    JFrame frame;
    JLabel label;
    JButton backButton;
    Color bgColor;

    //constructor for NewWindow class
    NewWindow(String title, MyFrame previousFrame, Color bgColor) {
        frame = new JFrame(); // new JFrame object assigns it to the instance variable 'frame' of the NewWindow class

        JLabel label = new JLabel(title + " to-do list", SwingConstants.CENTER); // The title that you will see in the window
        if (bgColor != null) {
        frame.getContentPane().setBackground(bgColor);
        } else {
        frame.getContentPane().setBackground(Color.GRAY);
        }

        backButton = new JButton("Back");
        backButton.setBounds(260, 600, 80, 40);
        backButton.setFont(new Font("Arial", Font.PLAIN, 16));

        // textarea for where the user inputs text to the screen
        JTextArea textArea = new JTextArea(); 
        textArea.setFont(new Font("Arial", Font.BOLD, 16));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBounds(90, 150, 400, 350);
        textArea.setEditable(true);

        // when the backbutton is clicked the current window is hidden and the main window is shown again
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setEditable(true); // enables text editing when you return
                frame.setVisible(false); // close current window
                previousFrame.setVisible(true); // show original frame again
            }
        });

        label.setBounds(80, 30, 400, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));

        //adds the interactivity and what the user can see to the screen
        frame.add(label);
        frame.add(backButton);
        frame.add(textArea);
        frame.setSize(600, 700);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    void updateColor(Color newColor){
        this.bgColor = newColor;
        frame.getContentPane().setBackground(bgColor);
        frame.repaint();
    }
}
