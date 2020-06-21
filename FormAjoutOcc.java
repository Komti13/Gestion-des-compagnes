package Pack4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;

public class FormAjoutOcc extends JFrame{
	JLabel Type,Produit, Objectif, Lieu, TC, Forme,promo,Equipe, Message,periode,deb,fin;
	JTextField t,p,o,L,tc,f,pro,e,m;
	JPanel grid;
	JButton add;
	JSpinner spinner,spinner1,spinner2,spinner3,spinner4,spinner5;
	JComboBox<String> liste;
	public FormAjoutOcc(String ch) {
		setTitle(ch);
		setSize(600,820);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		add=new JButton("Add");
		add.setBackground(Color.cyan);
		add(add,BorderLayout.SOUTH);
		grid=new JPanel(new GridLayout(19, 1, 10, 10));
		grid.setPreferredSize(new Dimension(400, 810));
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
		JPanel pc=new JPanel(new BorderLayout());
		pc.setBackground(Color.white);
		o=new JTextField(20);
		pc.add(o,BorderLayout.WEST);
		grid.add(Objectif);
		grid.add(pc);
		
		
		periode=new JLabel("La Période");
		periode.setForeground(Color.red);
		JPanel pa=new JPanel(new FlowLayout());
		pa.setBackground(Color.white);
		//per=new JTextField(20);
		deb=new JLabel("Date Debut");
		pa.add(deb);
		String[] days = new String[32]; 
		for(int i=0;i<32;i++)
		days[i]=String.valueOf(i+1);
		SpinnerListModel daymodel = new SpinnerListModel(days);
		 spinner = new JSpinner(daymodel);
		JLabel lbll3 =new JLabel("/");	
		String[] monthStrings = {"janvier","fevrier","mars","avril","may","juin","juillet","Aout","septembre","Octobre","Novembre","Decembre"}; //get month names
		SpinnerListModel monthModel = new SpinnerListModel(monthStrings);
		 spinner1 = new JSpinner(monthModel);
		JLabel lbl4 =new JLabel("/");		
		String[] years = {"1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"}; 
		SpinnerListModel yearmodel = new SpinnerListModel(years);
		 spinner2 = new JSpinner(yearmodel);
		JPanel p2=new JPanel();
		p2.add(spinner);
		p2.add(lbll3);
		p2.add(spinner1);
		p2.add(lbl4);
		p2.add(spinner2);
		////////////
		String[] days1 = new String[32]; 
		for(int i=0;i<32;i++)
		days[i]=String.valueOf(i+1);
		SpinnerListModel daymodel1 = new SpinnerListModel(days);
		 spinner3 = new JSpinner(daymodel1);
		JLabel lbll5 =new JLabel("/");	
		String[] monthStrings1 = {"janvier","fevrier","mars","avril","may","juin","juillet","Aout","septembre","Octobre","Novembre","Decembre"}; //get month names
		SpinnerListModel monthModel1 = new SpinnerListModel(monthStrings);
		 spinner4 = new JSpinner(monthModel1);
		JLabel lbl6 =new JLabel("/");		
		String[] years1 = {"1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"}; 
		SpinnerListModel yearmodel1 = new SpinnerListModel(years);
		 spinner5 = new JSpinner(yearmodel1);
		JPanel p3=new JPanel();
		p3.add(spinner3);
		p3.add(lbll5);
		p3.add(spinner4);
		p3.add(lbl6);
		p3.add(spinner5);

		pa.add(p2);
		fin=new JLabel("Date de fin");
		pa.add(fin);
		pa.add(p3);
		grid.add(periode);
		grid.add(pa);
		

		
		Lieu=new JLabel("Le Lieu");
		Lieu.setForeground(Color.red);
		JPanel pb=new JPanel(new BorderLayout());
		pb.setBackground(Color.white);
		L=new JTextField(20);
		pb.add(L,BorderLayout.WEST);
		grid.add(Lieu);
		grid.add(pb);
		
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
		FormAjoutOcc f=new FormAjoutOcc("form");
		f.setVisible(true);
	}
}
