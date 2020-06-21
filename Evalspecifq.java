package Pack4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Evalspecifq extends JInternalFrame{
	JLabel titre,q2,opinion,coment,nomp;
	JPanel grid,val,pt;
	JTextField tnomp;
	JRadioButton r3,r4,r5,r6,r7;
	ButtonGroup g2;
	JButton valider;
	JTextArea t;
	JComboBox<String> co1;
	public Evalspecifq(String ch) {
		setTitle(ch);
		setSize(810,550);
		setLocation(5, 5);
		setVisible(true);
		setIconifiable(true);
		setResizable(true);
		setClosable(true);
		setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		grid=new JPanel(new GridLayout(12, 1, 10, 10));
		grid.setPreferredSize(new Dimension(300, 600));
		grid.setBackground(Color.white);
		JScrollPane sp = new JScrollPane(this.getContentPane(),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);	
		this.getContentPane().setBackground(Color.white);
		titre=new JLabel("<html><h2>Madame, Monsieur,<br>"+
		"En remplissant ce questionnaire d'une quinzaine de minutes,vous nous aiderez <br>à avoir de meilleurs résultats pour mettre à jour nos produit adapté a vos besoins :) \n"+
				"<br>Merci d'avance!!</h2></html>");
		titre.setForeground(Color.white);
		pt=new JPanel();
		pt.add(titre);
		pt.setBackground(Color.blue);
		add(pt,BorderLayout.NORTH);
		//nom du produit
				nomp=new JLabel("Nom Produit:");
				nomp.setForeground(Color.red);
				JPanel p2=new JPanel(new BorderLayout());
				p2.setBackground(Color.white);
				tnomp=new JTextField(20);
				p2.add(tnomp,BorderLayout.WEST);
				grid.add(nomp);
				grid.add(p2);
		//quest 1
		co1=new JComboBox<String>();
		co1.setPreferredSize(new Dimension(200, 30));
		co1.addItem("Trés Satisfait");
		co1.addItem("Satisfait");
		co1.addItem("Indifférent");
		co1.addItem("Insatisfait");
		co1.addItem("Absolument insatisfait");
		opinion=new JLabel("<html><h3>Comment êtes-vous satisfait(e) de ce(s) produit(s)?</h3></html>");
		opinion.setForeground(Color.red);
		JPanel p1=new JPanel(new BorderLayout());
		p1.setBackground(Color.white);
		p1.add(co1,BorderLayout.WEST);
		grid.add(opinion);
		grid.add(p1);
		//quest2
		q2=new JLabel("<html><h3>À quelle fréquence utilisez-vous ce Produit ?</h3></html>");
		q2.setForeground(Color.red);
		r3=new JRadioButton("	Tous les jours");
		r3.setActionCommand("Tous les jours");
		r3.setBackground(Color.white);
		r4=new JRadioButton("Une fois par semaine");
		r4.setActionCommand("Une fois par semaine");
		r4.setBackground(Color.white);
		r5=new JRadioButton("Une fois par mois");
		r5.setActionCommand("Une fois par mois");
		r5.setBackground(Color.white);
		r6=new JRadioButton("Plusieurs fois par an");
		r6.setActionCommand("Plusieurs fois par an");
		r6.setBackground(Color.white);
		r7=new JRadioButton("Moins souvent");
		r7.setActionCommand("Moins souvent");
		r7.setBackground(Color.white);
		g2=new ButtonGroup();
		g2.add(r3);
		g2.add(r4);
		g2.add(r5);
		g2.add(r6);
		g2.add(r7);
		grid.add(q2);
		grid.add(r3);
		grid.add(r4);
		grid.add(r5);
		grid.add(r6);
		grid.add(r7);
		
		//quest3
		coment=new JLabel("<html><h3>Qu'aimez-vous et que n'aimez-vous pas sur notre produit ? Merci de votre opinion</h3></html>");
		coment.setForeground(Color.red);
		JPanel p6=new JPanel(new BorderLayout());
		p6.setBackground(Color.white);
		t=new JTextArea(7,20);
		JScrollPane sp6 = new JScrollPane(t,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		sp6.setPreferredSize(new Dimension(400,300));
		t.setBackground(Color.orange);
		grid.add(coment);
		grid.add(sp6);
		
		val=new JPanel();
		valider=new JButton("VALIDER");
		valider.setBackground(Color.CYAN);
		add(grid);
		val.add(valider);
		add(val,BorderLayout.SOUTH);
		setContentPane(sp);
}

	public static void main(String[] args) {
		Evalspecifq qe=new Evalspecifq("Questionnaire d'evaluation globale");
		qe.setVisible(true);
		
	}	

}
