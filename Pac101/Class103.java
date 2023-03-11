package Pac101;

import java.awt.*;
import java.awt.event.*;
import java.util.regex.Pattern;

import javax.swing.*;


public class Class103  {
	
	JFrame frame2 = new JFrame ();
	JLabel label = new JLabel("Enter the name of country");
	static JTextField text= new JTextField();
	Font font = new Font("Arial Black",Font.BOLD, 18);
	JButton button = new JButton("ok");
	
	Class103() {
	
		
		frame2.setTitle("Countries name");
		frame2.setLayout(new FlowLayout());
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	

		text.setPreferredSize(new Dimension(150,30));
		text.setLayout(new FlowLayout());
		frame2.getContentPane().setBackground(Color.DARK_GRAY);
		label.setOpaque(true);
		text.setFont(font);
		
		frame2.setForeground(Color.BLACK);
		
		frame2.add(label);
		frame2.add(text);
		frame2.setSize(350,250);
		frame2.add(button);
		frame2.setVisible(true);
		
		

			button.addActionListener(new ActionListener () {

				@Override
				public void actionPerformed(ActionEvent e) {
					
					if (e.getSource() == button ) {
						
						frame2.dispose();
						Class104 b = new Class104();
						frame2.dispose();
						
						
					}
				}
				
				
			});
}
	
	 {
	}

	
}