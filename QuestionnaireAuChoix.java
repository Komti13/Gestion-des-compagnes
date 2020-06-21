package Pack4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class QuestionnaireAuChoix extends JInternalFrame{

	JLabel titre,q1,q2,nom,email,ncin,numtel,nbenfant,ddn;
	JPanel grid,val,pt;
	JTextField tnom,tmail,tncin,tnumtel,tnb;
	JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11;
	ButtonGroup g1,g2;
	JButton valider;
	public QuestionnaireAuChoix(String ch) {
		setTitle(ch);
		setSize(810,550);
		setVisible(true);
		setLocation(5, 5);
		setIconifiable(true);
		setResizable(true);
		setClosable(true);
		setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
		setLayout(new BorderLayout());
		grid=new JPanel();
		grid.setPreferredSize(new Dimension(300, 900));
		grid.setBackground(Color.white);
		JScrollPane sp = new JScrollPane(this.getContentPane(),JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);	
		this.getContentPane().setBackground(Color.white);
		
		pt=new JPanel();
		pt.setBackground(Color.blue);
		add(pt,BorderLayout.NORTH);
	
		
		val=new JPanel();
		valider=new JButton("VALIDER");
		valider.setBackground(Color.CYAN);
		add(grid);
		val.add(valider);
		add(val,BorderLayout.SOUTH);
		setContentPane(sp);
	
	}
	
}