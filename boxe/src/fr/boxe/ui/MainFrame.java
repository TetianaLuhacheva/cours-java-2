package fr.boxe.ui;

import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainFrame extends JFrame{

	public MainFrame() throws HeadlessException { 
		this.setSize(800,500);
		
		//JTextField		
		this.setLayout(new FlowLayout());
		JTextField textField_1 = new JTextField(10); 
		
		//JButton
		JButton button1 = new JButton("Excecuter");
		
		JTextArea ta = new JTextArea();
		ta.append("Connexion établie\n\n");
		 		
		// On ajoute tout ça
		this.getContentPane().add(textField_1);
		this.getContentPane().add(button1);
		this.getContentPane().add(ta);		

		this.setVisible(true);
	}
	
}
