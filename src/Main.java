import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {

    JFrame frame = new JFrame();
    frame.setTitle("JFRAME title goes here"); // sets title of window
    frame.setSize(420,420); // sets the x & y dimension of frame
    frame.setVisible(true); // makes frame visible
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits application on close (doesnt do this normally)
    frame.setResizable(false); // user cannot resize window

    ImageIcon image = new ImageIcon("foams.jpg"); // creates image icon based on filename
    frame.setIconImage(image.getImage()); // changes icon of frame

    // frame.getContentPane().setBackground(Color.magenta); // changes color of JFrame background
        frame.getContentPane().setBackground(new Color(255,255,255)); // based on rgb values, makes custom color


    }
}


// JFrame = a GUI window to add components to