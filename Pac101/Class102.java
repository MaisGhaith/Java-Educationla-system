package Pac101;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Class102  {
	JFrame frame1 = new JFrame ();
	JButton button1 = new JButton("Start");
	JLabel label2 = new JLabel();
	
	Class102 (){
				
		MyFrame OB = new MyFrame();
		frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame1.setTitle("Welcome");
		frame1.setLayout(new FlowLayout());

		
		
		label2.setText("Hello "+OB.user.getText() +" please enter 'Start' ");
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setVerticalAlignment(JLabel.CENTER);
		frame1.add(label2);
		
		
		//button1.setBounds(100,200,100,50);
		
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == button1 ) {
					
					frame1.dispose();
					Class103 c = new Class103();
					frame1.dispose();
					
				}
				
			}
		
		});
		
		frame1.setSize(250,150);
		frame1.add(button1);
		frame1.setVisible(true);
	}
	
	
	
	
	
	

}