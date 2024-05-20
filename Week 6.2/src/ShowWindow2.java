import javax.swing.*;
import java.awt.*;

public class ShowWindow2 {

    public static void main(String[] args) {

        // declare our variables
        // we are going to make them CONSTANTS

        final int WINDOW_WIDTH = 400;
        final int WINDOW_HEIGHT = 500;

        // Create a window

        JFrame window = new JFrame();

        // Set the title
        window.setTitle("My Simple Window");

        // Set the size of our window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        window.getContentPane().setBackground(Color.RED);
        window.setBackground(Color.RED);

        window.setLocationRelativeTo(null);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel messageLabel1 = new JLabel("My First Big Label!!!");
        JLabel messageLabel2 = new JLabel("My Second Big Label!!!");
        JTextField kiloTextField1 = new JTextField();
        JTextField kiloTextField2 = new JTextField();

        messageLabel1.setBounds(50, 50, 300, 30);
        kiloTextField1.setBounds(50, 100, 200, 30);
        messageLabel2.setBounds(50, 150, 300, 30);
        kiloTextField2.setBounds(50, 100, 200, 30);

        messageLabel1.setFont(new Font("Arial", Font.PLAIN, 14));
        messageLabel2.setFont(new Font("Arial", Font.BOLD, 16));

        window.add(messageLabel1);
        window.add(kiloTextField1);
        window.add(messageLabel2);
        window.add(kiloTextField2);

        window.setVisible(true);
    }
}
