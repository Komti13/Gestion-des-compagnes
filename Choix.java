package Pack4;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Choix extends JFrame{
	JLabel type,quest;
	String question;
	JPanel p1,p2;
	JTextField t;
	JComboBox<String> com;
	public Choix() {
		type=new JLabel("choisir le type de question");
		quest=new JLabel("Saisre votre question");
		add(quest);
		p1=new JPanel();
		p2=new JPanel();
		t=new JTextField(40);
		p1.add(t);
	   	add(p1);
		setLayout(new GridLayout(4, 1));
		setSize(450, 300);
		setLocation(1000, 100);
		getContentPane().setBackground(Color.white);
		add(type);
		
		com=new JComboBox<String> ();
			com.addItem(".....");
	    	com.addItem("choix multiple");
	     	com.addItem("choix unique");
	   		com.addItem("Combo box");
	   	    com.addItem("Espace libre");
	   	p2.add(com);
	   	add(p2);
	 
	}
	public static void main(String[] args) {
		Choix c=new Choix();
		c.setVisible(true);
	}
}
