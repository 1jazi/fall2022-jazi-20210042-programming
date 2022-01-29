package ProgrammingParadaigms;

import java.awt.Color;
import java.awt.Dimension;   // import libraries  
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Event {
	public static void main(String[] args) {
		Border border = BorderFactory.createLineBorder(Color.green, 3);  // set border to label with green color
		// add image to the label and get directory of image
		ImageIcon image = new ImageIcon("C:\\Users\\DELL\\OneDrive - AL-Hussien bin Abdullah Technical University\\onedrive_htu\\OneDrive - AL-Hussien bin Abdullah Technical University\\Desktop\\image\\jazi2.JPEG");
	    
		
		//////////// text field
		JTextField text = new JTextField();
		text.setBackground(Color.white);
		text.setOpaque(true);
		text.setBorder(border);
		text.setBounds(420, 50, 100, 70);
		text.setFont(new Font("Consolas", Font.BOLD, 25));
		text.setForeground(Color.green);
		text.setBackground(Color.black);
		//make a text field 
		JTextField text2 = new JTextField();
		
		text2.setBorder(border);
		text2.setBounds(225, 50, 100, 70);
		text2.setFont(new Font("Consolas", Font.BOLD, 25));
		text2.setForeground(Color.green); //text color
		text2.setBackground(Color.black);
		
		JTextField text3 = new JTextField();
		text3.setBorder(border);
		text3.setBounds(35, 50, 100, 70);
		text3.setFont(new Font("Consolas", Font.BOLD, 25));
		text3.setForeground(Color.green); //text color
		text3.setBackground(Color.black);

		JButton button = new JButton();
		button.setText("sumbit");
		button.setBounds(212, 180, 120, 50);
		JButton button1 = new JButton();
		button1.setText("show subjects");
		button1.setBounds(212, 250, 120, 50);
		//add action listener to button1
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button1) {
				// add a j option message 
				 JOptionPane.showMessageDialog(null, "your subject are in console ");
				
				// print the subjects on console
				System.out.println("database design & development\nnetworking\nenglish");
				System.out.println("Advanced programming\nsoft skills 2");
				 
			}
				
			}
		});
		
		JLabel sub = new JLabel();
		// add action listener to button 
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button) {
					if (text.getText().equals("20210042")) {
						
					sub.setText(" jazi ");		
					sub.setVerticalAlignment(JLabel.TOP);
					sub.setHorizontalAlignment(JLabel.CENTER);
					sub.setForeground(Color.green);
					sub.setFont(new Font("MV Boli", Font.BOLD, 15));
					sub.setBorder(border);
					sub.setIcon(image); // add image
					sub.setBounds(18, 120, 550, 350);
				}
				}
			}
		});

		/////// label
		JLabel label = new JLabel();
		label.setText("first name:       second name:                Id:  ");
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setForeground(Color.green);
		label.setFont(new Font("MV Boli", Font.BOLD, 15));
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);

		label.setBounds(18, 120, 550, 350);
		label.add(text);
		label.add(button);
		label.add(button1);
		label.add(text2);
		label.add(text3);
		
       // label.setIcon(image);
		JLabel label2 = new JLabel();
		label2.setText("HTU");
		label2.setForeground(Color.black);
		label2.setVerticalAlignment(JLabel.CENTER);
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setFont(new Font("MV Boli", Font.BOLD, 20));
		label2.setBounds(0,0, 119, 119);
		label2.setBackground(Color.red);
		label2.setOpaque(true);
		
		////// frame
		JFrame fram = new JFrame();
		fram.setSize(600, 600);
		fram.setTitle(" jazi");
		fram.setLayout(null);
		fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fram.setLocationRelativeTo(null);
		//// add mouse listener 
		fram.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

				fram.getContentPane().setBackground(Color.black);
			}

			@Override
			public void mouseEntered(MouseEvent e) {

				fram.getContentPane().setBackground(Color.darkGray);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// fram.getContentPane().setBackground(Color.blue);

			}
			
		});
		
		
		// key listener:
		fram.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				switch(e.getKeyChar()) {
				case 'a': label2.setLocation(label2.getX()-5, label2.getY());
				break;
				
				case 'd': label2.setLocation(label2.getX()+5, label2.getY());
				break;
				}
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		fram.setVisible(true);
		fram.add(label);
		fram.add(sub);
		fram.add(label2);

	}
}
