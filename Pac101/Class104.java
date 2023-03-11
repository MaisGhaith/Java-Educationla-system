package Pac101;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Class104  {
	JFrame frame3 = new JFrame();
	JButton button = new JButton("Close");
	Font font1 = new Font("Segoe UI Black",Font.BOLD, 18);
	Font font2 = new Font("Berlin Sans FB", Font.ROMAN_BASELINE, 16);
	// define an objcet from Class103 to use the "text" variable 
	Class103 ob = new Class103();
	
	 /////////////////////////////////////////////////////////////////////////////////////
    // add countries info methods

	
	
	// set Palestine method info
	JLabel PLABEL = new JLabel("'PALESTINE' It covers an area of 27,000 km, not less "
			+ "it's the greatest country ever ");
	ImageIcon pa = new ImageIcon("PAL2.JPG");
	
	
	// set Jordan method info
	JLabel JoLabel = new JLabel ("'Jordan' it capital is Amman, also, it's have a "
			+ "one of seven wonders of the world 'Petra' ");
	ImageIcon Jo = new ImageIcon("Jordan.JPEG");
	
	
	
	// set Alergia method info 
	
	JLabel  ALabel = new JLabel("Its capital is Algeria, which is the"
			+ " tenth largest country in the world");
	ImageIcon AL = new ImageIcon("Alergia.JPEG");
	
	
	// set Syria method info 
	JLabel SLabel = new JLabel("Syria, whose capital is Damascus, "
			+ "the highest peak is Jabal al-Sheikh");
	ImageIcon Sy = new ImageIcon("SYRIA.JPEG");
	
	
	// set Bahrin method info 
    JLabel BLabel = new JLabel("The State of Bahrain, its capital is Manama, "
    		+ "and it is the smallest Arab country in terms "
    		+ "of area, it is only 758 km");
    ImageIcon B = new ImageIcon("Bahrin.JPEG");
	
    // set others method info 
    
    
    
     public void Palestine () {
		
		
    	 frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 frame3.setSize(850,750);
    	 frame3.setVisible(true);
    	 frame3.setTitle("Palestine");

    	 frame3.setLayout(new FlowLayout());
    	 frame3.getContentPane().setBackground(Color.BLACK);
		PLABEL.setForeground(Color.white);
		frame3.add(PLABEL);
		PLABEL.setHorizontalTextPosition(JLabel.CENTER);
		PLABEL.setVerticalTextPosition(JLabel.TOP);
		PLABEL.setFont(font1);
		PLABEL.setHorizontalAlignment(JLabel.CENTER);
		PLABEL.setVerticalAlignment(JLabel.TOP);
		//pa.setImage(getIconImage());
		PLABEL.setIcon(pa);
		
		

		
	}
     
     
    public void Jordan (){
    	 
    	frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame3.setSize(800,500);
    	frame3.setVisible(true);
    	frame3.setTitle("Jordan");
    	
   	   frame3.setLayout(new FlowLayout());

    	JoLabel.setHorizontalTextPosition(JLabel.CENTER);
    	JoLabel.setVerticalTextPosition(JLabel.TOP);
    	JoLabel.setHorizontalAlignment(JLabel.CENTER);
    	JoLabel.setVerticalAlignment(JLabel.TOP);
    	JoLabel.setFont(font2);
    	frame3.add(JoLabel);
    	JoLabel.setIcon(Jo);
    	
    	
     }
	
	
    public void Alergia () {
    	
    	frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame3.setSize(500,300);
    	frame3.setVisible(true);
    	frame3.setTitle("Alergia");
    	
    	   frame3.setLayout(new FlowLayout());

    	ALabel.setHorizontalTextPosition(JLabel.CENTER);
    	ALabel.setVerticalTextPosition(JLabel.TOP);
    	ALabel.setHorizontalAlignment(JLabel.CENTER);
    	ALabel.setVerticalAlignment(JLabel.TOP);
    	
    	ALabel.setForeground(Color.GRAY);
    	ALabel.setFont(font2);
    	frame3.add(ALabel);
    	ALabel.setIcon(AL);
    	
    	
    }
    
    public void Syria (){
    	
    	frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame3.setSize(700,300);
    	frame3.setVisible(true);
    	frame3.setTitle("Syria");
    	
    	   frame3.setLayout(new FlowLayout());

    	SLabel.setFont(font2);
    	SLabel.setHorizontalTextPosition(JLabel.CENTER);
    	SLabel.setVerticalTextPosition(JLabel.TOP);
    	SLabel.setHorizontalAlignment(JLabel.CENTER);
    	SLabel.setVerticalAlignment(JLabel.TOP);
    	frame3.add(SLabel);
    	SLabel.setFont(font1);
    	SLabel.setIcon(Sy);
    	
    	
    }
    
    
    public void Bahrin () {
    	
    	frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame3.setSize(770,350);
    	frame3.setVisible(true);
    	frame3.setTitle("Bahrin");
    	
    	   frame3.setLayout(new FlowLayout());

    	BLabel.setHorizontalTextPosition(JLabel.CENTER);
    	BLabel.setVerticalTextPosition(JLabel.TOP);
    	BLabel.setHorizontalAlignment(JLabel.CENTER);
    	BLabel.setVerticalAlignment(JLabel.TOP);
    	BLabel.setFont(font2);
    	frame3.add(BLabel);
    	BLabel.setIcon(B);
    }
    
    public void others () {
    	
    	JOptionPane.showMessageDialog(null, "Please enter valid name", "ERROR", JOptionPane.ERROR_MESSAGE);
    	
    }
    
    
	Class104(){
		
		switch (ob.text.getText()) {
		
		case "Palestine" :
			
			Palestine();
		break;
		
		case "Jordan" :
		
			Jordan();
		break;
		
		case "Alergia" :
			
			Alergia();
		break;
			
		case "Syria" :
			
			Syria();
		break;
		
		case "Bahrin" :
		
			Bahrin();
		break;
		
		default :
			
			others ();		
		break;
		}
		
		
		
		frame3.add(button);
		button.setBackground(Color.white);
		
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == button ) {
					
					Class103 obj = new Class103();
					frame3.dispose();
					
					
				}
			}
			
		});
		
	}


	
}