import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



class OptionScreen extends JFrame implements ActionListener {

    JButton button1, button2, button3;
    JTextField textfield;
    JLabel outputLabel;


    OptionScreen(String title, int x, int y, int width, int height){

        this.setTitle(title);
        this.setSize(width, height);
        this.setVisible(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
