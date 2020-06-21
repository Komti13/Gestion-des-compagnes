package Pack4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormajoutREG extends JFrame{
	JLabel Type,Produit, Objectif, Lieu, TC, Forme,promo,Equipe, Message,periode;
	JTextField t,p,o,L,tc,f,pro,e,m,per;
	JPanel grid;
	JButton add;
	JComboBox<String> liste;
	public FormajoutREG(String ch) {
		setTitle(ch);
		setSize(300,650);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		add=new JButton("Add");
		add.setBackground(Color.cyan);
		add(add,BorderLayout.SOUTH);
		grid=new JPanel(new GridLayout(19, 1, 10, 10));
		grid.setPreferredSize(new Dimension(200, 700));
		grid.setBackground(Color.white);
		
		
		
		
		Produit=new JLabel("Le nom du Produit");
		Produit.setForeground(Color.red);
		JPanel p8=new JPanel(new BorderLayout());
		p8.setBackground(Color.white);
		liste=new JComboBox<String>();
		 for(int i=0;i<CRM.listProduits.getSize();i++)
	    	   liste.addItem(CRM.listProduits.elementAt(i));
    	/*liste.addItem("P1");
  		liste.addItem("P2");
  	    liste.addItem("P3");
  		liste.addItem("P4");
  		liste.addItem("P5");
  		liste.addItem("P6");
  		liste.addItem("P7");
  		liste.addItem("P8");
  		liste.addItem("P9");*/
  		liste.setPreferredSize(new Dimension(70, 20));
		p8.add(liste,BorderLayout.WEST);
		grid.add(Produit);
		grid.add(p8);
		
		
		Objectif=new JLabel("L'objectif");
		Objectif.setForeground(Color.red);
		JPanel p2=new JPanel(new BorderLayout());
		p2.setBackground(Color.white);
		o=new JTextField(20);
		p2.add(o,BorderLayout.WEST);
		grid.add(Objectif);
		grid.add(p2);
		
		
		periode=new JLabel("La Période");
		periode.setForeground(Color.red);
		JPanel pa=new JPanel(new BorderLayout());
		pa.setBackground(Color.white);
		per=new JTextField(20);
		pa.add(per,BorderLayout.WEST);
		grid.add(periode);
		grid.add(pa);
		

		
		Lieu=new JLabel("Le Lieu");
		Lieu.setForeground(Color.red);
		JPanel p3=new JPanel(new BorderLayout());
		p3.setBackground(Color.white);
		L=new JTextField(20);
		p3.add(L,BorderLayout.WEST);
		grid.add(Lieu);
		grid.add(p3);
		
		TC=new JLabel("Le type de Client");
		TC.setForeground(Color.red);
		JPanel p4=new JPanel(new BorderLayout());
		p4.setBackground(Color.white);
		tc=new JTextField(20);
		p4.add(tc,BorderLayout.WEST);
		grid.add(TC);
		grid.add(p4);
		
		
		
		promo=new JLabel("La Promotion");
		promo.setForeground(Color.red);
		JPanel p9=new JPanel(new BorderLayout());
		p9.setBackground(Color.white);
		pro=new JTextField(20);
		p9.add(pro,BorderLayout.WEST);
		grid.add(promo);
		grid.add(p9);
		
		Equipe=new JLabel("L'Equipe Commerciale");
		Equipe.setForeground(Color.red);
		JPanel p6=new JPanel(new BorderLayout());
		p6.setBackground(Color.white);
		e=new JTextField(20);
		p6.add(e,BorderLayout.WEST);
		grid.add(Equipe);
		grid.add(p6);
		
		Message=new JLabel("Le Message è Transmettre");
		Message.setForeground(Color.red);
		JPanel p7=new JPanel(new BorderLayout());
		p7.setBackground(Color.white);
		m=new JTextField(20);
		p7.add(m,BorderLayout.WEST);
		grid.add(Message);
		grid.add(p7);
		
		

		Forme=new JLabel("La Forme d'Annonce");
		Forme.setForeground(Color.red);
		JPanel p5=new JPanel(new BorderLayout());
		p5.setBackground(Color.white);
		f=new JTextField(20);
		p5.add(f,BorderLayout.WEST);
		grid.add(Forme);
		grid.add(p5);
		
		
		
		
		add(grid);
	}
	public static void main(String[] args) {
		FormajoutREG f=new FormajoutREG("form");
		f.setVisible(true);
	}
}
