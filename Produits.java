package Pack4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.plaf.InternalFrameUI;

public class Produits extends JInternalFrame{
	JButton Ajouter;
	public Produits() {
		setTitle("Catalogue Produits");
		setSize(810,550);
		setVisible(true);
		setLocation(5, 5);
		setIconifiable(true);
		setResizable(true);
		setClosable(true);
		setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		Ajouter=new JButton("ajouter Produit");
		add(Ajouter,BorderLayout.SOUTH);
		Ajouter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AjoutP m=new AjoutP();
				m.setVisible(true);
				
			}
		});
	}

}
