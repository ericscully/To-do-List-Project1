import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    
    //instance variables
    JButton button, button1, button2, button3;
    JTextField textfield;
    JLabel outputLabel, outputLabel2;
    //references to new windows of class NewWindow that open depending on what you click
    NewWindow schoolWindow, runningWindow, choresWindow;

    //Constructor for MyFrame class
    MyFrame(String title, int width, int height){ 

        this.setTitle(title); 
        this.setSize(width, height); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        ImageIcon image = new ImageIcon(Main.class.getResource("/Resources/Spider_image.png")); // create an image icon all images are saved in Resources folder
        this.setIconImage(image.getImage()); // change icon image of frame

        this.getContentPane().setBackground(Color.gray); // changes the background color of my home screen
        JLabel label = new JLabel("This is my to-do list for the day"); // This is the main heading in the first frame
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setBounds(140, 30, 310, 50); 
        
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2); // border for to-do list box
        label.setBorder(border); // apply border to label
        label.setOpaque(true); // makes backbround visable
        label.setBackground(Color.WHITE); // makes background color white in border

        textfield = new JTextField(); // Where you are imputting the date
        textfield.setBounds(325, 105, 100, 40);
        textfield.setFont(new Font("Arial", Font.PLAIN, 18));

        button = new JButton("Submit"); 
        button.setBounds(150, 105, 110, 40);
        button.addActionListener(this);

        //The output text after you click "submit" button
        outputLabel = new JLabel(" "); 
        outputLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        outputLabel.setForeground(Color.BLACK);
        outputLabel.setHorizontalAlignment(JLabel.CENTER);
        outputLabel.setBounds(150, 200, 300, 30);

        outputLabel2 = new JLabel(" "); 
        outputLabel2.setFont(new Font("Arial", Font.PLAIN, 18));
        outputLabel2.setForeground(Color.BLACK);
        outputLabel2.setHorizontalAlignment(JLabel.CENTER);
        outputLabel2.setBounds(150, 260, 300, 30);

        // 3 buttons that take you to your list
        button1 = new JButton("School");
        button1.setBounds(250, 325, 100, 40);
        button1.setVisible(false);
        button1.addActionListener(this);
        
        button2 = new JButton("Running");
        button2.setBounds(250, 425, 100, 40);
        button2.setVisible(false);
        button2.addActionListener(this);

        button3 = new JButton("Chores");
        button3.setBounds(250, 525, 100, 40);
        button3.setVisible(false);
        button3.addActionListener(this); 

        //adds the interactivity and what the user can see to the screen
        this.setLayout(null); // if you don't disable set layout, your bounds will be ignored or overridden
        this.add(button);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(textfield);
        this.add(label);
        this.add(outputLabel);
        this.add(outputLabel2);
        this.setVisible(true); // makes frame visible
}

    @Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button) { //e.getsource in this code is used to idenfity what button triggered the event
        String input = textfield.getText();
        //Strings that are output to the screen after you press submit button
        outputLabel.setText("Today's Date: " + input);
        outputLabel2.setText("Pick a list to begin");


        //The buttons are set to true
        //they were set as false in the creation of the button objects so they don't show up until you click the submit button
        button1.setVisible(true); // School
        button2.setVisible(true); // Running
        button3.setVisible(true); // Chores
    }
//determining which window to open based on what button you press
else if (e.getSource() == button1) { // if true the following block of code runs
    if (schoolWindow == null) { // checks to see if the window has already been created. 
        schoolWindow = new NewWindow("School", this);  // calls the NewWindow contructor and passes in School string and current instance of my MyFrame 
    }
    this.setVisible(false); // hides the MyFrame window
    schoolWindow.frame.setVisible(true); // method makes the frame appear on screen
}

else if (e.getSource() == button2) {
    if (runningWindow == null) {
        runningWindow = new NewWindow("Running", this);
    }
    this.setVisible(false);
    runningWindow.frame.setVisible(true);
}

else if (e.getSource() == button3) {
    if (choresWindow == null) {
        choresWindow = new NewWindow("Chores", this);
    }
    this.setVisible(false);
    choresWindow.frame.setVisible(true);
        }
    }
}