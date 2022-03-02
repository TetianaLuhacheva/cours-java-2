package fr.tetiana.bd_1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// Connexion to JDBC (on a téléchqrgé un lien
		
		// https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.28		
		// Regarde comment importer ça https://i.imgur.com/lpH3D7C.png
		// Regarde avec quelle class il travail https://i.imgur.com/7kLWzc4.png
		
		Class.forName("com.mysql.jdbc.Driver");		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/formation","root","Girugamesh1!");
		//Out.w("Connexion établie");
		
		
		// Pour faire une reau
		Statement stmt = con.createStatement();	
		
		// INSERT
//		stmt.executeUpdate("INSERT INTO t_niveau (NIVEAU_CD, DESCRIPTION) VALUES ('n1', 'niveau 1')");
//		Out.w("On a ajouté une ligne");
//		
		// Delete		
		//stmt.executeUpdate("DELETE FROM t_niveau WHERE NIVEAU_CD = 'n1'");
		//Out.w("On a supprimé une ligne");
		
		
		// SELECT * FROM t_niveau
//		ResultSet query = stmt.executeQuery("SELECT * FROM t_niveau");
//		Out.w("RESULTAT d'une requête");
//		while (query.next ()){
//			Out.w(query.getString("NIVEAU_CD") + " --> " + query.getString("DESCRIPTION"));
//			//getString \ getInt \ getDate \getBoolean  			
//
//		}
//		
		
//		ResultSet query = stmt.executeQuery("SELECT * FROM t_niveau WHERE NIVEAU_CD = 'n1'");
//		Out.w("RESULTAT d'une requête");
//		while (query.next ()){
//			Out.w(query.getString("NIVEAU_CD") + " --> " + query.getString("DESCRIPTION"));
//			//getString \ getInt \ getDate \getBoolean  			
//
//		}
		
		
		/*
		 *    Petit Aplication
		 */
		
		//JFrame
		JFrame frame=new JFrame();
		frame.setSize(800,500);
		
		//JTextField
		frame.setLayout(new FlowLayout());
		JTextField textField_1 = new JTextField(10); 
		
		//JButton
		JButton button1 = new JButton("Excecuter");
		
		JTextArea ta = new JTextArea();
		ta.append("Connexion établie\n\n");
		 		
		// On ajoute tout ça
		frame.getContentPane().add(textField_1);
		frame.getContentPane().add(button1);
		frame.getContentPane().add(ta);
		
		
		//Actions
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try {
					//String s = "SELECT * FROM t_niveau WHERE NIVEAU_CD = '"+ textField_1.getText() +"'";
					//Out.w(s);
					//query = stmt.executeQuery(con.prepareStatement("\"insert into Emp values(?,?)\");");
					
					PreparedStatement stmt=con.prepareStatement("select  *  FROM T_NIVEAU WHERE NIVEAU_CD = ?");
					stmt.setString(1, textField_1.getText());
				
					ResultSet query = stmt.executeQuery();
					
					while (query.next ()){					
						ta.append("RESULTAT d'une requête : \n");
						ta.append(query.getString("NIVEAU_CD") + " --> " + query.getString("DESCRIPTION") + "\n\n");
						//getString \ getInt \ getDate \getBoolean  			

					}
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
			
				
			}
		});
		
		frame.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
	}

}
