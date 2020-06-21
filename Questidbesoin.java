package Pack4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;

public class Questidbesoin extends JInternalFrame{
	JLabel titre,q1,q2,nom,email,ncin,numtel,nbenfant,ddn;
	JPanel grid,val,pt;
	JTextField tnom,tmail,tncin,tnumtel,tnb;
	JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11;
	ButtonGroup g1,g2;
	JButton valider;
	JSpinner spinner,spinner1,spinner2;
	public Questidbesoin(String ch) {
		setTitle(ch);
		setSize(810,550);
		setVisible(true);
		setLocation(5, 5);
		setIconifiable(true);
		setResizable(true);
		setClosable(true);
		setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		grid=new JPanel(new GridLayout(25, 1, 10, 10));
		grid.setPreferredSize(new Dimension(300, 900));
		grid.setBackground(Color.white);
		JScrollPane sp = new JScrollPane(this.getContentPane(),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);	
		this.getContentPane().setBackground(Color.white);
		titre=new JLabel("<html><h2>Cher Client,<br>"+
		"Merci de remplir ce formulaire d'identification des besoins pour vous connaitre mieux et <br>vous profitez le maximum de nos offres que vous concerne :) \n"+
				"<br>Cordialement.</h2></html>");
		titre.setForeground(Color.white);
		pt=new JPanel();
		pt.add(titre);
		pt.setBackground(Color.blue);
		add(pt,BorderLayout.NORTH);
		
		
		ddn=new JLabel("Date de naissance:");
		ddn.setForeground(Color.red);
		JPanel pan=new JPanel(new BorderLayout());
		pan.setBackground(Color.white);
		JPanel p7=new JPanel(new FlowLayout());
		p7.setBackground(Color.white);
		String[] days = new String[32]; 
		for(int i=0;i<32;i++)
		days[i]=String.valueOf(i+1);
		SpinnerListModel daymodel = new SpinnerListModel(days);
		 spinner = new JSpinner(daymodel);
		 spinner.setPreferredSize(new Dimension(35, 22));
		JLabel lbll3 =new JLabel("/");	
		lbll3.setPreferredSize(new Dimension(30, 22));
		String[] monthStrings = {"janvier","fevrier","mars","avril","may","juin","juillet","Aout","septembre","Octobre","Novembre","Decembre"}; //get month names
		SpinnerListModel monthModel = new SpinnerListModel(monthStrings);
		 spinner1 = new JSpinner(monthModel);
		JLabel lbl4 =new JLabel("/");		
		lbl4.setPreferredSize(new Dimension(30, 22));
		String[] years = {"1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"}; 
		SpinnerListModel yearmodel = new SpinnerListModel(years);
		 spinner2 = new JSpinner(yearmodel);
		p7.add(spinner);
		p7.add(lbll3);
		p7.add(spinner1);
		p7.add(lbl4);
		p7.add(spinner2);
		pan.add(p7,BorderLayout.WEST);
		grid.add(ddn);
		grid.add(pan);
		
		nom=new JLabel("Quelle est votre profession?");
		nom.setForeground(Color.red);
		JPanel p1=new JPanel(new BorderLayout());
		p1.setBackground(Color.white);
		tnom=new JTextField(20);
		p1.add(tnom,BorderLayout.WEST);
		grid.add(nom);
		grid.add(p1);
		
		ncin=new JLabel("Quelles sont les activités que vous aimez?");
		ncin.setForeground(Color.red);
		JPanel p3=new JPanel(new BorderLayout());
		p3.setBackground(Color.white);
		tncin=new JTextField(20);
		p3.add(tncin,BorderLayout.WEST);
		grid.add(ncin);
		grid.add(p3);
		
	
		
		email=new JLabel("Quelle est la moyenne d'age de vos enfant si vous avez?");
		email.setForeground(Color.red);
		JPanel p4=new JPanel(new BorderLayout());
		p4.setBackground(Color.white);
		tmail=new JTextField(20);
		p4.add(tmail,BorderLayout.WEST);
		grid.add(email);
		grid.add(p4);
		
		numtel=new JLabel("Voulez vous la livraison à domicile ou bien le shopping?");
		numtel.setForeground(Color.red);
		r9=new JRadioButton("à Domicile");
		r9.setBackground(Color.white);
		r9.setActionCommand("a Domicile");
		r11=new JRadioButton("Shopping");
		r11.setActionCommand("Shopping");
		r11.setBackground(Color.white);
		g1=new ButtonGroup();
		g1.add(r9);
		g1.add(r11);
		grid.add(numtel);
		grid.add(r9);
		grid.add(r11);
		
		nbenfant=new JLabel("Avez vous des problémes ?");
		nbenfant.setForeground(Color.red);
		JPanel p6=new JPanel(new BorderLayout());
		p6.setBackground(Color.white);
		tnb=new JTextField(20);
		p6.add(tnb,BorderLayout.WEST);
		grid.add(nbenfant);
		grid.add(p6);
		
		
		
		q2=new JLabel("<html><h3>Combien de fois pa semaine vous serez disponible?</h3></html>");
		q2.setForeground(Color.red);
		r3=new JRadioButton("une fois");
		r3.setActionCommand("une fois");
		r3.setBackground(Color.white);
		r4=new JRadioButton("deux fois");
		r4.setActionCommand("deux fois");
		r4.setBackground(Color.white);
		r5=new JRadioButton("trois fois");
		r5.setActionCommand("trois fois");
		r5.setBackground(Color.white);
		r6=new JRadioButton("quatres fois");
		r6.setActionCommand("quatres fois");
		r6.setBackground(Color.white);
		r7=new JRadioButton("cinq fois");
		r7.setActionCommand("cinq fois");
		r7.setBackground(Color.white);
		r8=new JRadioButton("toute la semaine");
		r8.setActionCommand("toute la semaine");
		r8.setBackground(Color.white);
		r10=new JRadioButton("aucune fois ");
		r10.setActionCommand("aucune fois ");
		r10.setBackground(Color.white);
		g2=new ButtonGroup();
		g2.add(r3);
		g2.add(r4);
		g2.add(r5);
		g2.add(r6);
		g2.add(r7);
		g2.add(r8);
		g2.add(r10);
		grid.add(q2);
		grid.add(r3);
		grid.add(r4);
		grid.add(r5);
		grid.add(r6);
		grid.add(r7);
		grid.add(r8);
		grid.add(r10);
		
		val=new JPanel();
		valider=new JButton("VALIDER");
		valider.setBackground(Color.CYAN);
		add(grid);
		val.add(valider);
		add(val,BorderLayout.SOUTH);
		setContentPane(sp);
	
	}
	public static void main(String[] args) {
		Questidbesoin qe=new Questidbesoin("Questionnaire d'identification des Besoins");
		qe.setVisible(true);
	}
}
