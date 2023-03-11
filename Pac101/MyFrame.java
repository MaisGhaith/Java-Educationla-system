package Pac101;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MyFrame extends JFrame {

    static JFrame frame = new JFrame("login");
    static JLabel label = new JLabel();
    static JLabel label1 = new JLabel();
    static JButton button = new JButton("Submit");
    static JTextField user = new JTextField();
    static JPasswordField pass = new JPasswordField();
    static Font font1 = new Font("Times New Roman", Font.BOLD, 18);
    static Font font2 = new Font("Arial Black", Font.PLAIN, 16);
    static String name = "Mais";
    static String word = "mais123";

    public static String username;
    public static String password;
    static JLabel label_result = new JLabel();

    MyFrame() {

        frame.setTitle("Log in screen");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label.setText("Enter Username");
        label.setFont(font1);
        label.setForeground(Color.GRAY);

        user.setPreferredSize(new Dimension(250, 40));
        user.setFont(font2);
        user.setForeground(Color.white);
        user.setBackground(Color.black);
        user.setCaretColor(Color.BLUE);
//		user.setText("Username");
//		user.setEditable(true);

        frame.add(label);
        frame.add(user);

        label1.setText("Enter Password");
        pass.setPreferredSize(new Dimension(250, 40));
        pass.setFont(font2);
        label1.setFont(font1);
        label1.setForeground(Color.GRAY);
        pass.setForeground(Color.white);
        pass.setBackground(Color.black);

        frame.add(label1);
        frame.add(pass);

        frame.add(button);
        frame.setSize(350, 350);
        frame.setVisible(true);
        frame.setResizable(false);

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                try { 
                    username = String.valueOf(user.getText());
                    password = String.valueOf(pass.getText());
                    
                    if (e.getActionCommand() == "Submit") {

                        if (username.equalsIgnoreCase(name) && password.equalsIgnoreCase(word)) {
                            Class102 cl = new Class102();
                            frame.dispose();

                        } else {
                            JOptionPane.showMessageDialog(null, "Wrong :( \n check your username & password ",
                                     "Warning Message", JOptionPane.ERROR_MESSAGE);
                            
                        }
                    }
                } catch (Exception ex) {
                    frame.dispose();

                }
                

            }

        });

    }

}