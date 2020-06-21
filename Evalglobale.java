package Pack4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
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

public class Evalglobale extends JInternalFrame{
	JLabel titre,q2,opinion,coment;
	JPanel grid,val,pt;
	JRadioButton r3,r4,r5,r6,r7;
	ButtonGroup g2;
	JButton valider;
	JTextArea t;
	JComboBox<String> co1;
	public Evalglobale(String ch) {
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
		"En remplissant ce questionnaire d'une quinzaine de minutes,<br>vous nous aiderez à avoir de meilleurs résultats dans la performance globale :) \n"+
				"<br>Merci d'avance!!</h2></html>");
		titre.setForeground(Color.white);
		pt=new JPanel();
		pt.add(titre);
		pt.setBackground(Color.blue);
		add(pt,BorderLayout.NORTH);
		//quest 1
		co1=new JComboBox<String>();
		co1.setPreferredSize(new Dimension(200, 30));
		co1.addItem("Trés Satisfait");
		co1.addItem("Satisfait");
		co1.addItem("Indifférent");
		co1.addItem("Insatisfait");
		co1.addItem("Absolument insatisfait");
		opinion=new JLabel("<html><h3>    En général, comment êtes-vous satisfait(e) de votre/vos fonction(s) et tâches à Notre entreprise?</h3></html>");
		opinion.setForeground(Color.red);
		JPanel p1=new JPanel(new BorderLayout());
		p1.setBackground(Color.white);
		p1.add(co1,BorderLayout.WEST);
		grid.add(opinion);
		grid.add(p1);
		//quest2
		q2=new JLabel("<html><h3>    En considérant vos objectifs et vos buts au sein de notre societé, laquelle des possibilités suivantes décrit-elle le mieux votre performance ?</h3></html>");
		q2.setForeground(Color.red);
		r3=new JRadioButton("  J'ai excédé mes objectifs/buts");
		r3.setActionCommand("J ai excédé mes objectifs");
		r3.setBackground(Color.white);
		r4=new JRadioButton("  J'ai entièrement accompli mes objectifs/buts");
		r4.setActionCommand("J ai entièrement accompli mes objectifs");
		r4.setBackground(Color.white);
		r5=new JRadioButton("  J'ai accompli une partie de mes objectifs/buts");
		r5.setActionCommand("J ai accompli une partie de mes objectifs");
		r5.setBackground(Color.white);
		r6=new JRadioButton("  Je n'ai pas accompli mes objectifs/buts");
		r6.setActionCommand("Je n ai pas accompli mes objectifs");
		r6.setBackground(Color.white);
		r7=new JRadioButton("  Je n'ai aucune idée précise sur les objectifs/buts que je dois accomplir");
		r7.setActionCommand("Je n ai aucune idée précise sur les objectifs");
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
		coment=new JLabel("<html><h3>    Quelle(s) amélioration(s) significative(s) souhaitez-vous au sein de notre societé? (suggestions)</h3></html>");
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
}
