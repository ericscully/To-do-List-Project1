import javax.swing.*;
import java.awt.*;


public class Homescreen extends JPanel {
    public void HomeScreen(JPanel container, CardLayout layout) {
        setLayout(null);

        JLabel welcomeLabel = new JLabel("Welcome to the To-Do App!");
        welcomeLabel.setBounds(145, 20, 250, 30);
        add(welcomeLabel);

        JButton schoolButton = new JButton("School To-do List");
        schoolButton.setBounds(140, 100, 170, 40);
        add(schoolButton);

        JButton runningButton = new JButton("Running To-Do List");
        runningButton.setBounds(140, 250, 170, 40);
        add(runningButton);

        JButton choresButton = new JButton("Chores To-do List");
        choresButton.setBounds(140, 400, 170, 40);
        add(choresButton);

        // Navigation
        schoolButton.addActionListener(e -> layout.show(container, "School"));
        runningButton.addActionListener(e -> layout.show(container, "Running"));
        choresButton.addActionListener(e -> layout.show(container, "Chores"));
    }
}