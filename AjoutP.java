package Pack4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Pack3.MyConnection;
public class AjoutP extends JFrame{
	JLabel Nom,Type,Prix;
	JTextField N,T,P;
	JPanel p1,p2,p3;
	JButton val;
	public AjoutP() {
		MyConnection c=new MyConnection();
		c.connect();
		setSize(300,200);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new GridLayout(4, 2));
		setLocation(550, 350);
		getContentPane().setBackground(Color.white);
		p1=new JPanel(new FlowLayout());
		Nom=new JLabel("Nom du Produit:");
		N=new JTextField(10);
		p1.add(Nom);
		p1.add(N);
		add(p1);
		
		p2=new JPanel(new FlowLayout());
		Type=new JLabel("Marque du Produit:");
		T=new JTextField(10);
		p2.add(Type);
		p2.add(T);
		add(p2);
		
		p3=new JPanel(new FlowLayout());
		Prix=new JLabel("Modele du Produit:");
		P=new JTextField(10);
		p3.add(Prix);
		p3.add(P);
		add(p3);
		
		val=new JButton("Ajouter");
		add(val);
		val.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CRM.listProduits.addElement(N.getText());
				c.ajoutP(N.getText(),T.getText(),P.getText());
				AjoutP.this.dispose();
				
			}
		});
	}
	public static void main(String[] args) {
		AjoutP m=new AjoutP();
		m.setVisible(true);

	}

}
