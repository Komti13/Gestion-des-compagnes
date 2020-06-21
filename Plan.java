package Pack4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Plan {
	int i=0,nb=0,k;
	String title;
	JLabel titre;
	String question="";
	ButtonGroup g1=new ButtonGroup();
	QuestionnaireAuChoix q;
	public Plan() {
		q=new QuestionnaireAuChoix("mon questionnaire");
		String title=JOptionPane.showInputDialog("Donner le titre de votre Questionnaire");
		titre=new JLabel("<html><h2>"+	title	+"</h2></html>");
		titre.setForeground(Color.white);
		q.pt.add(titre);
		question=JOptionPane.showInputDialog("Donner le nombre des questions total");
		for(k=0;k<Integer.parseInt(question);k++) {
			Choix c=new Choix();
			q.grid.setLayout(new GridLayout(15, 1));
			JPanel p1=new JPanel(new BorderLayout());
			p1.setBackground(Color.white);
			c.com.addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange() == ItemEvent.SELECTED) {
					if((String)e.getItem()=="choix multiple") {
						JPanel checkbox=new JPanel(new FlowLayout());
						String nbchoix=JOptionPane.showInputDialog("donner le nombre des choix");
						JLabel nom=new JLabel(c.t.getText());
						nom.setForeground(Color.red);
						q.grid.add(nom);
						for(int j=0;j<Integer.parseInt(nbchoix);j++)
						{	
							String choix=JOptionPane.showInputDialog("Ecriver votre choix N°"+(j+1));
							JCheckBox cb1 =new JCheckBox(choix);
							checkbox.add(cb1);
						}
						
						q.grid.add(checkbox);
						c.dispose();
					}
					if((String)e.getItem()=="choix unique") {
						JPanel Radio=new JPanel(new FlowLayout());
						String nbchoix=JOptionPane.showInputDialog("donner le nombre des choix");
						JLabel nom=new JLabel(c.t.getText());
						nom.setForeground(Color.red);
						q.grid.add(nom);
						for(int j=0;j<Integer.parseInt(nbchoix);j++)
						{	
							String choix=JOptionPane.showInputDialog("Ecriver votre choix N°"+(j+1));
							JRadioButton rb=new JRadioButton(choix);
							g1.add(rb);
							Radio.add(rb);
							
						}
						
						q.grid.add(Radio);
						c.dispose();
					}
					if((String)e.getItem()=="Combo box") {
						JPanel Combo=new JPanel(new FlowLayout());
						String nbchoix=JOptionPane.showInputDialog("donner le nombre des choix ");
						JLabel nom=new JLabel(c.t.getText());
						nom.setForeground(Color.red);
						q.grid.add(nom);
						JComboBox<String>com=new JComboBox<String> ();
						for(int j=0;j<Integer.parseInt(nbchoix);j++)
						{
							String choix=JOptionPane.showInputDialog("Ecriver votre choix N°"+(j+1));
							com.addItem(choix);
							Combo.add(com);
							
						}
						
						q.grid.add(Combo);
						c.dispose();
						
					}
					if((String)e.getItem()=="Espace libre") {
					
						JPanel Coment=new JPanel(new FlowLayout());
						JLabel nom=new JLabel(c.t.getText());
						nom.setForeground(Color.red);
						q.grid.add(nom);
						JTextArea t=new JTextArea(2, 20);
						JScrollPane sp6 = new JScrollPane(t,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
						Coment.add(sp6);
						q.grid.add(Coment);
						c.dispose();
						
					}
					}
				}
			});
			c.setVisible(true);
			c.toFront();
	}
	}
	public static void main(String[] args) {
		Plan p=new Plan();

	}

}
