package Pack4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FormAjout extends JFrame{
	JButton Reg,Occ;
	JLabel qust;
	JPanel p;
	public FormAjout(String ch) {
		setTitle(ch);
		setSize(500,300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		setLocation(550, 350);
		getContentPane().setBackground(Color.white);
		qust=new JLabel("<html><body><h1>voulez vous choisir le type de Compagne?</h1></body></html>");
		qust.setForeground(Color.red);
		add(qust,BorderLayout.NORTH);
		p=new JPanel(new FlowLayout());
		Reg=new JButton("Compagne Réguliére");
		Reg.setPreferredSize(new Dimension(200, 100));
		Reg.setBackground(Color.cyan);
		p.add(Reg);
		Occ=new JButton("Compagne Occasionelle");
		Occ.setBackground(Color.cyan);
		Occ.setPreferredSize(new Dimension(200, 100));
		p.add(Occ);
		add(p,BorderLayout.CENTER);
		
		
				
		
	}
	public static void main(String[] args) {
		FormAjout f=new FormAjout("ajouter");
		f.setVisible(true);
	}

}
