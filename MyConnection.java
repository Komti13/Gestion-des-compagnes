package Pack3;
import java.sql.*;
import java.util.ArrayList;

import javax.swing.JTable;

import Pack4.Compagne;
public class MyConnection {
	Connection conn=null;
	Statement st=null;
	public MyConnection() {
		//1ere etape : chargmnt de driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("ERR DRIVE "+e.getMessage());
		}	
	}
	public void connect() {
		//2eme etape : connexion
		try {
			conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/tpjava", "root", "");
			st=conn.createStatement();
			System.out.println("connexion etablit");
		} catch (SQLException e) {
			System.out.println("Err connexion "+e.getMessage());
		}
		
	}
	//edit profile
	int edit(String ch,String ch1) {
		int n=0;
		try {
			n=st.executeUpdate("UPDATE profile" + 
					" SET Pseudo='"+ch+"' "+" WHERE Nom='"+ch1+"';");
		} catch (SQLException e) {
			System.out.println("Err modification "+e.getMessage());
		}
		return n;
	}
	//select compagne
	public ArrayList<String> selectComp() {
		ResultSet res;
		ArrayList<String> t = new ArrayList<String>();
		try {
			res=st.executeQuery("SELECT * FROM compagne");
			
			while(res.next()) {
				t.add(res.getString("Numero"));
				t.add(res.getString("Produit"));
				t.add(res.getString("Type"));
				t.add(res.getString("Objectif"));
				t.add(res.getString("Periode"));
				t.add(res.getString("Lieu"));
				t.add(res.getString("Type_Client"));
				t.add(res.getString("Promotion"));
				t.add(res.getString("Equipe_Commerciale"));
				t.add(res.getString("Message_a_Transmettre"));
				t.add(res.getString("Forme_Annonce"));
			}
		} catch (SQLException e) {
			System.out.println("Err SelectComp "+e.getMessage());
		}
		return t;
	
	}
	//Ajout commercial
	public int ajoutComm(String a,String b,String c) {
		int n=0;
		try {
			n=st.executeUpdate("insert into commerciale values('"+a+"','"+b+"','"+c+"')");
		} catch (SQLException e) {
			System.out.println("Err ajoutComm "+e.getMessage());
		}
		return n;
	}
	//Ajout equipe commercial
		public int ajoutEquipe(String a,String b) {
			int n=0;
			try {
				n=st.executeUpdate("insert into equipe_commerciale values('"+a+"','"+b+"')");
			} catch (SQLException e) {
				System.out.println("Err ajoutEquipe "+e.getMessage());
			}
			return n;
		}
	//nombre de colones dans profiles
	int Count() {
		int n=0;
		try {
			n=st.executeUpdate("SELECT COUNT(*) FROM profile");
		} catch (SQLException e) {
			System.out.println("Err count "+e.getMessage());
		}
		return n;
	}
	//edit compagne
	public int editComp(String n,String a,String b,String c,String d,String e,String f,String g,String h,String i,String j) {
		int p=0;
		try {
			p=st.executeUpdate("UPDATE Compagne" + 
					" SET Numero='"+n+"' ,produit='"+a+"' ,Type='"+b+"' ,Objectif='"+c+"' ,Objectif='"+d+"',Lieu='"+e+"' ,Type_Client='"+f+"' ,Promotion='"+g+"' ,Equipe_Commerciale='"+h+"' ,Message_a_Transmettre='"+i+"'  ,Forme_Annonce" + 
							"='"+j+"' "
					+" WHERE Numero='"+n+"';");
		} catch (SQLException e1) {
			System.out.println("Err modification comp "+e1.getMessage());
		}
		return p;
	}
	//ajout profile
	int ajout(String a,String b,String c) {
		int n=0;
		try {
			n=st.executeUpdate("insert into profile values('"+a+"','"+b+"','"+c+"')");
		} catch (SQLException e) {
			System.out.println("Err ajout "+e.getMessage());
		}
		return n;
	}
	//ajout Produit
	public int ajoutP(String a,String b,String c) {
		int n=0;
		try {
			n=st.executeUpdate("insert into produit values('"+a+"','"+b+"','"+c+"')");
		} catch (SQLException e) {
			System.out.println("Err ajoutP "+e.getMessage());
		}
		return n;
	}
	
	//ajout compagne
	public int ajoutCompagne(String n,String a,String b,String c,String d,String e,String f,String g,String h,String i,String j) {
		int p=0;
		try {
			p=st.executeUpdate("insert into Compagne values('"+n+"','"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"')");
		if(Compagne.cpt>1)
			Compagne.cpt--;
		} catch (SQLException e1) {
			System.out.println("Err ajoutComp "+e1.getMessage());
		}
		return p;
	}
	//ajout quest id besoins
	public int ajoutQid(String n,String a,String b,String c,String d,String e,String f,String g) {
		int p=0;
		try {
			p=st.executeUpdate("insert into questionnaire_id_besoins values('"+n+"','"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"')");
		} catch (SQLException e1) {
			System.out.println("Err ajoutComp "+e1.getMessage());
		}
		return p;
	}
	//ajout quest evaluation specifique
	public int ajoutQevalS(String n,String a,String b,String c,String d) {
		int p=0;
		try {
			p=st.executeUpdate("insert into questionnaire_eval_specifique values('"+n+"','"+a+"','"+b+"','"+c+"','"+d+"')");
		} catch (SQLException e1) {
			System.out.println("Err ajoutComp "+e1.getMessage());
		}
		return p;
	}
	//ajout quest evaluation globale
	public int ajoutQevalG(String n,String a,String b,String c) {
		int p=0;
		try {
			p=st.executeUpdate("insert into questionnaire_eval_global values('"+n+"','"+a+"','"+b+"','"+c+"')");
		} catch (SQLException e1) {
			System.out.println("Err ajoutComp "+e1.getMessage());
		}
		return p;
	}
	//delete * profile
	int delete() {
		int n=0;
		try {
			n=st.executeUpdate("delete from profile");
		} catch (SQLException e) {
			System.out.println("Err supresssion "+e.getMessage());
		}
		return n;
	}
	//delete * compagne
	public int deleteComp() {
		int n=0;
		try {
			n=st.executeUpdate("delete from Compagne");
		} catch (SQLException e) {
			System.out.println("Err supresssion "+e.getMessage());
		}
		return n;
	}
	//delete profile à condition
	int delete(String ch) {
		int n=0;
		try {
			n=st.executeUpdate("delete from profile where Pseudo='"+ch+"';");
		} catch (SQLException e) {
			System.out.println("Err supresssion "+e.getMessage());
		}
		return n;
	}
	//delete compagne à condition
	public int deleteComp(String ch) {
		int n=0;
		try {
			n=st.executeUpdate("delete from Compagne where Numero='"+ch+"';");
			Compagne.cpt++;
		} catch (SQLException e) {
			System.out.println("Err supresssion "+e.getMessage());
		}
		return n;
	}
	ResultSet selection(String req){
		ResultSet rs=null;
		try {
			rs=st.executeQuery(req);
		} catch (SQLException e) {
			
			System.out.println("Err selection "+e.getMessage());
		}
		return rs;
	}
	void affiche(ResultSet rs) {
		try {
			while(rs.next()) {
				System.out.println(rs.getString(1)+"  "+"  "+rs.getString(2)+"  "+"  "+rs.getString(3));
			}
		} catch (SQLException e) {
			System.out.println("Err affichaage "+e.getMessage());
		}
	}
	void affichdyn(ResultSet rs) {
		int nbligne=0;
		ResultSetMetaData rsmd;
		try {
			rsmd = rs.getMetaData();
			int nbcol=rsmd.getColumnCount();
			String[]titre=new String[nbcol];
			for(int i=0;i<titre.length;i++)
				titre[i]=rsmd.getColumnName(i+1);
			while(rs.next()) {
				nbligne++;
				for(int i=0;i<nbcol;i++)
					System.out.println(rs.getObject(i+1));
			}
		} catch (SQLException e) {
			System.out.println("Err affichage dynamiq "+e.getMessage());
		}
		
		
	}
	/*public static void main(String[] args) {
		MyConnection c=new MyConnection();
		c.connect();
		c.ajout("sahbi","tbarkalla","chlam");
		c.ajout("ayoub","shili","jaa");
		c.delete();
		c.affiche(c.selection("select * from profile"));
		c.affichdyn(c.selection("select Nom from profile"));
		System.out.print(c.selectComp());
	}*/

}
