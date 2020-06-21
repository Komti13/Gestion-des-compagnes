package Pack4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import Pack3.MyConnection;

public class CRM extends JFrame implements ActionListener{
	public static DefaultListModel<String> listProduits;
	JMenuBar bar;
	int i=1,j=1,k=1;
	JPopupMenu pop;
	JMenu rc,av_v,vente,ap_v,gc,plc;
	JMenuItem cl,cp,ec,ed,cmp,realc,suivc,idvp,pp,scmd,suivfact,qeg,qes,qid,choix;
	JDesktopPane desk;
	public CRM(String ch) {
		setTitle(ch);
		MyConnection c=new MyConnection();
		c.connect();
		setSize(1500,650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		//Liste des Produits
		
		    listProduits = new DefaultListModel<String>();
	    	listProduits.addElement("P1");
	    	listProduits.addElement("P2");
	    	listProduits.addElement("P3");
	    	listProduits.addElement("P4");
	    	listProduits.addElement("P5");
	    	listProduits.addElement("P6");
	    	listProduits.addElement("P7");
	    	listProduits.addElement("P8");
	    	listProduits.addElement("P9");
	    	
	    	 c.ajoutCompagne("1",CRM.listProduits.getElementAt(0),"reguliere","aucun", "5 jours", "point de vente Sousse", "enfants","50%","equipe1","bonjour","courrier");
	         c.ajoutCompagne("2",CRM.listProduits.getElementAt(1),"occasionnelle","aucun", "5/5/2020-->7/5/2020","Foire sousse", "enfants","20%","equipe12","bonjour","e-mail");
	         c.ajoutCompagne("3",CRM.listProduits.getElementAt(2),"réguliere","aucun", "3 jours", "Foire Nabeul", "femmes","50%","equipe2","bonjour","affichage");
	         c.ajoutCompagne("4",CRM.listProduits.getElementAt(1),"reguliere","aucun", "4 jours", "Foire Mahdya", "femmes","50%","equipe3","bonjour","courrier");
	         c.ajoutCompagne("5",CRM.listProduits.getElementAt(4),"reguliere","aucun", "7 jours","point de vente Tunis", "enfants","25%","equipe4","bonjour","spot publicitaire");
	         c.ajoutCompagne("6",CRM.listProduits.getElementAt(3),"occasionnelle","aucun","5/5/2020-->7/5/2020","point de vente Aziza", "femmes","55%","equipe5","bonjour","e-mail");
	         c.ajoutCompagne("7",CRM.listProduits.getElementAt(3),"occasionnelle","aucun", "5/5/2020-->7/5/2020","Foire Monastsir", "enfants","70%","equipe6","bonjour","courrier");
	         c.ajoutCompagne("8",CRM.listProduits.getElementAt(0),"occasionnelle","aucun", "5/5/2020-->7/5/2020", "point de vente Mg", "femmes","20%","equipe7","bonjour","spot publicitaire");
	         c.ajoutCompagne("9",CRM.listProduits.getElementAt(0),"occasionnelle","aucun","5/5/2020-->7/5/2020", "point de vente Carrefour", "hommes","5%","equipe8","bonjour","spot publicitaire");
	         c.ajoutCompagne("10",CRM.listProduits.getElementAt(1),"reguliere","aucun", "1 mois","point de vente Mg maxi", "hommes","10%","equipe9","bonjour","courrier");
	         c.ajoutCompagne("11",CRM.listProduits.getElementAt(8),"reguliere","aucun", "3 jours", "point de vente Aziza", "hommes","40%","equipe10","bonjour","exposition");
	         c.ajoutCompagne("12",CRM.listProduits.getElementAt(0),"occasionnelle","aucun","5/5/2020-->7/5/2020", "point de vente Aziza", "enfants","55%","equipe11","bonjour","spot publicitaire");
	         c.ajoutCompagne("13",CRM.listProduits.getElementAt(5),"reguliere","aucun", "5 jours", "point de vente Mg", "hommes","50%","equipe1","bonjour","exposition");
	         c.ajoutCompagne("14",CRM.listProduits.getElementAt(0),"occasionnelle","aucun","5/5/2020-->7/5/2020", "point de vente Aziza", "enfants","55%","equipe2","bonjour","exposition");
	         c.ajoutCompagne("15",CRM.listProduits.getElementAt(0),"reguliere","aucun", "4 jours", "point de vente Carrefour", "sportifs","15%","equipe3","bonjour","SMS");
	         c.ajoutCompagne("16",CRM.listProduits.getElementAt(6),"occasionnelle","aucun","5/5/2020-->7/5/2020", "point de vente Aziza", "enfants","50%","equipe4","bonjour","affichage");
	         c.ajoutCompagne("17",CRM.listProduits.getElementAt(0),"reguliere","aucun", "8 jours","point de vente Aziza", "sportifs","80%","equipe5","bonjour","SMS");
	         c.ajoutCompagne("18",CRM.listProduits.getElementAt(8),"reguliere","aucun", "2 ans", "point de vente Mg", " 3eme ag","52%","equipe6","bonjour","SMS");
	         c.ajoutCompagne("19",CRM.listProduits.getElementAt(0),"reguliere","aucun", "4 mois", "point de vente Mg maxi", " 3eme ag","55%","equipe7","bonjour","SMS");
	         c.ajoutCompagne("20",CRM.listProduits.getElementAt(7),"occasionnelle","aucun","5/5/2020-->7/5/2020", "point de vente Aziza", "hommes","5%","equipe8","bonjour","affichage");
	         c.ajoutCompagne("21",CRM.listProduits.getElementAt(8),"occasionnelle","aucun", "5/5/2020-->7/5/2020", "point de vente Carrefour", "femmes","55%","equipe9","bonjour","e-mail");
	         
	         c.ajoutEquipe("equipe1", "equipe1");
	         c.ajoutEquipe("equipe2", "equipe2");
	         c.ajoutEquipe("equipe3", "equipe3");
	         c.ajoutEquipe("equipe4", "equipe4");
	         c.ajoutEquipe("equipe5", "equipe5");
	         c.ajoutEquipe("equipe6", "equipe6");
	         c.ajoutEquipe("equipe7", "equipe7");
	         c.ajoutEquipe("equipe8", "equipe8");
	         c.ajoutEquipe("equipe9", "equipe9");
	         c.ajoutEquipe("equipe10", "equipe10");
	         c.ajoutEquipe("equipe11", "equipe11");
	         c.ajoutEquipe("equipe12", "equipe12");
	    	
	    	
		bar=new JMenuBar();
		rc=new JMenu("Reférentiel Commun");
		av_v=new JMenu("Avant-vente");
		vente=new JMenu("Vente");
		ap_v=new JMenu("Aprés-vente");
		gc=new JMenu("gestion de Communication");
		
		cl =new JMenuItem("Clientéle");
		cp =new JMenuItem("Catalogue Produits");
		ec =new JMenuItem("Equipe Commerciale");
		ed =new JMenuItem("Etude des données commerciales");
		plc =new JMenu("plannification des Compagnes");
		realc =new JMenuItem("Realisation d'une Compagne");
		suivc =new JMenuItem("Suivi d'une Compagne");
		idvp =new JMenuItem("Identifiant des ventes potentielles");
		pp =new JMenuItem("Preparation des Propositions");
		scmd =new JMenuItem("Suivi des commandes");
		suivfact =new JMenuItem("suivi des Factures");
		qid =new JMenuItem("Questionnaire d'identification des Besoins");
		qeg =new JMenuItem("Questionnaire d'évaluation globale");
		qes =new JMenuItem("Questionnaire d'évaluation spécifique");
		choix =new JMenuItem("Questionnaire à votre choix");

		JMenu q=new JMenu("Questionnaire");
		JMenuItem cmp=new JMenuItem("Compagnes");
		
		rc.add(cl);
		rc.add(cp);
		rc.add(ec);
		
		av_v.add(ed);
		av_v.add(plc);
		av_v.add(realc);
		av_v.add(suivc);
		
		vente.add(idvp);
		vente.add(pp);
		vente.add(scmd);
		vente.add(suivfact);
		
		bar.add(rc);
		bar.add(av_v);
		bar.add(vente);
		bar.add(ap_v);
		bar.add(gc);
		
		
		plc.add(q);
		plc.add(cmp);
		q.add(qid);
		q.add(qeg);
		q.add(qes);
		q.add(choix);
		
		setJMenuBar(bar);
		
		desk=new JDesktopPane();
		add(desk,BorderLayout.CENTER);
		
		//events
		cmp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 Compagne cmp=new Compagne("Table des Compagnes");
				 desk.add(cmp);
					cmp.toFront();
				
			}
		});
		qid.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Questidbesoin qe=new Questidbesoin("Questionnaire d'identification des Besoins");
				qe.valider.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						c.ajoutQid(String.valueOf(i),String.valueOf(2020-Integer.parseInt((String) qe.spinner2.getValue())), qe.tnom.getText(), qe.tncin.getText(), qe.tmail.getText(), qe.g1.getSelection().getActionCommand(), qe.tnb.getText(), qe.g2.getSelection().getActionCommand());
						i++;
						qe.dispose();
					}
				});
				
				desk.add(qe);
				qe.toFront();
				
			}
		});
		qeg.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Evalglobale qeg=new Evalglobale("Questionnaire d'evaluation globale");
				qeg.valider.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						c.ajoutQevalG(String.valueOf(j),qeg.co1.getSelectedItem().toString() , qeg.g2.getSelection().getActionCommand(), qeg.t.getText());
						j++;
						qeg.dispose();
					}
				});
				desk.add(qeg);
				qeg.toFront();
				
			}
		});
		qes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Evalspecifq qs=new Evalspecifq("Questionnaire d'evaluation spécifique");
				qs.valider.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						c.ajoutQevalS(String.valueOf(k),qs.tnomp.getText() ,qs.co1.getSelectedItem().toString(), qs.g2.getSelection().getActionCommand(),qs.t.getText());
						k++;
						qs.dispose();
					}
				});
				desk.add(qs);
				qs.toFront();
				
			}
		});
	choix.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Plan qc=new Plan();
				desk.add(qc.q);
				qc.q.toFront();
				
			}
		});
	cp.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Produits c=new Produits();
			desk.add(c);
			c.toFront();
		}
	});
	}

//main
	public static void main(String[] args) {
		CRM crm=new CRM("GESTION DE LA RELATION CLIENT ");
		crm.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
