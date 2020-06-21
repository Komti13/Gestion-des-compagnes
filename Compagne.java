package Pack4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import Pack3.MyConnection;


public class Compagne extends JInternalFrame {
	public static int cpt=0;
	JPanel buttons,btnr;
	JButton add,delete,edit,reset;
	JComboBox<String> Trier;
	JTable table;
	JScrollPane sp;
	DefaultTableModel tableau ;
	

    public Compagne(String ch) {
    	//connection à la base
    	MyConnection c=new MyConnection();
		c.connect();
        setTitle(ch);
        setLocation(5, 5);
		setVisible(true);
		setIconifiable(true);
		setResizable(true);
		setClosable(true);
		setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(1400, 400);
        buttons=new JPanel(new GridLayout(1, 3));
        add=new JButton("Add");
        delete=new JButton("Delete");
        edit=new JButton("Edit");
        reset=new JButton("Reset");
        Trier=new JComboBox<String>();
      
		btnr=new JPanel(new FlowLayout());
        buttons.add(add);
        buttons.add(delete);
        buttons.add(edit);
        buttons.add(Trier);
        add(buttons,BorderLayout.NORTH);
        reset.setBackground(Color.red);
        btnr.setBackground(Color.white);
        btnr.add(reset);
        add(btnr,BorderLayout.SOUTH);
     
       Trier.addItem("Tous");
       for(int i=0;i<CRM.listProduits.getSize();i++)
    	   Trier.addItem(CRM.listProduits.elementAt(i));
 
       
        String[] entetes = {"numero","Produit","Type", "Objectif","Période", "Lieu", "Type Client", "Promotion","Equipe Commerciale", "Message è Transmettre","Forme d'annonce"};
       ArrayList<String> donnee=new ArrayList<String>();
       donnee=c.selectComp();
         tableau =  new DefaultTableModel(entetes, 0);
         table=new JTable(tableau);
         Object row[]=new Object[11];
         int i=0;
        	 while(i<donnee.size()) {
        	 row[0]=donnee.get(i);
        	 i++;
        	 row[1]=donnee.get(i);
        	 i++;
        	 row[2]=donnee.get(i);
        	 i++;
        	 row[3]=donnee.get(i);
        	 i++;
        	 row[4]=donnee.get(i);
        	 i++;
        	 row[5]=donnee.get(i);
        	 i++;
        	 row[6]=donnee.get(i);
        	 i++;
        	 row[7]=donnee.get(i);
        	 i++;
        	 row[8]=donnee.get(i);
        	 i++;
        	 row[9]=donnee.get(i);
        	 i++;
        	 row[10]=donnee.get(i);
        	 i++;
        	 tableau.addRow(row);
         }
         
         TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableau);
         table.setRowSorter(sorter);
         sp=new JScrollPane(table);
        sp.setPreferredSize(new Dimension(900, 300));
        getContentPane().add(sp, BorderLayout.CENTER);
        //pack();
        add.setBackground(Color.cyan);
        edit.setBackground(Color.cyan);
        delete.setBackground(Color.cyan);
        Trier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Trier.getItemCount()>0) {
				if(Trier.getSelectedItem()!="Tous")
				sorter.setRowFilter(RowFilter.regexFilter(Trier.getSelectedItem().toString()));
				else sorter.setRowFilter(RowFilter.regexFilter(""));
				}}
		});
        add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FormAjout f=new FormAjout("ajouter");
				f.setVisible(true);
				f.Reg.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						FormajoutREG f1=new FormajoutREG("Compagne Réguliére");
						f1.setVisible(true);
						f.dispose();
						f1.add.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
						tableau.addRow(new String[]{String.valueOf( table.getRowCount()+cpt+1),f1.liste.getSelectedItem().toString(),"Reguliere",f1.o.getText(), f1.per.getText(),f1.L.getText(),f1.tc.getText(),f1.pro.getText(),f1.e.getText(),f1.m.getText(),f1.f.getText()});
						c.ajoutCompagne(String.valueOf( tableau.getRowCount()+cpt),f1.liste.getSelectedItem().toString(),"Reguliere",f1.o.getText(), f1.per.getText(),f1.L.getText(),f1.tc.getText(),f1.pro.getText(),f1.e.getText(),f1.m.getText(),f1.f.getText());
						c.ajoutEquipe((f1.e.getText()),(f1.e.getText()) );
						f1.dispose();
					}
				});
			}
		
	});
						f.Occ.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								FormAjoutOcc f2=new FormAjoutOcc("Compagne Occasionelle");
								f2.setVisible(true);
								f.dispose();
								f2.add.addActionListener(new ActionListener() {
									
									@Override
									public void actionPerformed(ActionEvent e) {
										String date=f2.spinner.getValue()+"/"+f2.spinner1.getValue()+"/"+f2.spinner2.getValue()+"-->"+f2.spinner3.getValue()+"/"+f2.spinner4.getValue()+"/"+f2.spinner5.getValue();									
										tableau.addRow(new String[]{String.valueOf( tableau.getRowCount()+1),f2.liste.getSelectedItem().toString(),"Occasionelle",f2.o.getText(),date, f2.L.getText(),f2.tc.getText(),f2.pro.getText(),f2.e.getText(),f2.m.getText(),f2.f.getText()});
										c.ajoutCompagne(String.valueOf( tableau.getRowCount()),f2.liste.getSelectedItem().toString(),"Occasionelle",f2.o.getText(),date,f2.L.getText(),f2.tc.getText(),f2.pro.getText(),f2.e.getText(),f2.m.getText(),f2.f.getText());
										c.ajoutEquipe((f2.e.getText()),(f2.e.getText()) );
										f2.dispose();
									}
								});
								
							}
						});
						
						
				}
			
		});
        delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRowCount()==0)
					JOptionPane.showMessageDialog(null, "merci de selectionner la ligne è supprimer");
				else {
				c.deleteComp(table.getValueAt(table.getSelectedRow(),0).toString());
				tableau.removeRow(table.getSelectedRow());
				}
				
				
			}
		});
        edit.addActionListener(new ActionListener() {
			
    			@Override
    			public void actionPerformed(ActionEvent e) {
    				if(table.getSelectedRowCount()==0)
    					JOptionPane.showMessageDialog(null, "merci de selectionner la ligne è Editer");
    				else {
    				c.editComp(table.getValueAt(table.getSelectedRow(),0).toString(),table.getValueAt(table.getSelectedRow(),1).toString(),table.getValueAt(table.getSelectedRow(),2).toString(),table.getValueAt(table.getSelectedRow(),3).toString(),table.getValueAt(table.getSelectedRow(),4).toString(),table.getValueAt(table.getSelectedRow(),5).toString(),table.getValueAt(table.getSelectedRow(),6).toString(),table.getValueAt(table.getSelectedRow(),7).toString(),table.getValueAt(table.getSelectedRow(),8).toString(),table.getValueAt(table.getSelectedRow(),9).toString(),table.getValueAt(table.getSelectedRow(),10).toString());
    				}
    				
    				
    			}
    		});
        reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				c.deleteComp();
				for (int i = tableau.getRowCount()-1; i >=0; i--) {
				    tableau.removeRow(i);
				}
			    Trier.removeAllItems();
			    Trier.addItem("Tous");
			}
		});
    add.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		
    			add.setForeground(Color.red);
    			add.setBackground(Color.yellow);
    		}
    	@Override
    	public void mouseExited(MouseEvent e) {
    		
    			add.setForeground(Color.black);
    			add.setBackground(Color.cyan);
    		}
	});
    edit.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		
    			edit.setForeground(Color.red);
    			edit.setBackground(Color.yellow);
    		}
    	@Override
    	public void mouseExited(MouseEvent e) {
    		
    			edit.setForeground(Color.black);
    			edit.setBackground(Color.cyan);
    		}
	});
    delete.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		
    		delete.setForeground(Color.red);
    		delete.setBackground(Color.yellow);
    		}
    	@Override
    	public void mouseExited(MouseEvent e) {
    		
    		delete.setForeground(Color.black);
    		delete.setBackground(Color.cyan);
    		}
	});
    reset.addMouseListener(new MouseAdapter() {
    	@Override
    	public void mouseEntered(MouseEvent e) {
    		
    		reset.setForeground(Color.black);
    		reset.setBackground(Color.green);
    		}
    	@Override
    	public void mouseExited(MouseEvent e) {
    		
    		reset.setForeground(Color.black);
    		reset.setBackground(Color.red);
    		}
	});
	//});

	}
    public static void main(String[] args) {
		Compagne c=new Compagne("Table des Compagnes");
		c.setVisible(true);
	}
    }
        
        
        
        