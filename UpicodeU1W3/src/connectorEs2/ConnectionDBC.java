package connectorEs2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDBC {

	private String url = "jdbc:postgresql://localhost:5432/";
	private String dbName = "u1w3d1Es2";
	private String username ="postgres";
	private String password ="root";
	Statement stm;
	
	
	
	public void DBConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url+dbName, username, password);
		stm = conn.createStatement();
		creaTabStudenti();
	}

//creazione tabella studenti
	public void creaTabStudenti() throws SQLException {
		String sql = "CREATE TABLE IF NOT EXISTS Students ("
				+ "id_student SERIAL PRIMARY KEY,"
				+ "name VARCHAR NOT NULL,"
				+ "lastname VARCHAR NOT NULL,"
				+ "gender VARCHAR, "
				+ "birthdate DATE NOT NULL,"
				+ "min_vote INT2 NOT NULL,"
				+ "max_vote INT3 NOT NULL )";
		System.out.println("Tabella creata correttamente");
		this.stm.executeUpdate(sql);		
		
	}

	//METODI PERSONALIZZATI

	//inserire nuovo studente

//	public void insertStudent(Student s) throws SQLException {
//		Student student = null;
//		String sql = "INSERT INTO Students (name, lastname, gender,birthday,avg, min_vote, max_vote)"
//				+"VALUES(' " + s.getName()+ " ' , "
//						+ "' " + s.getLastname() + " ,"
//								+ "' " + s.getGender() + " ,"
//										+ " ' " + s.getBirthdate() + ","
//												+ " ' " + s.getAvg() + " ,"
//														+ " ' " + s.getMin_vote() + " , "
//																+ "' " + s.getMax_vote() + " ')";
//		this.stm.executeUpdate(sql);
//		System.out.println("Aggiunti nuovo studente" + student);
//		
//	}
	
	
	// update Studente
	
//	public void updatetudent(int id, HashMap <String, Object> s) throws SQLException {
//	
//		String sql = "UPDATE Students"
//				+ "SET name = ' " + s.getName() + " ,  
//				lastname = + "' " + s.getLastname() + " ,"
//				+ gender = + "' " + s.getGender() + " ,"
//				+ birthday = + " ' " + s.getBirthdate() + ","
//				+ avg = + " ' " + s.getMin_vote() + " , "
//				+ min_vote = + " ' " + s.getMin_vote() + " , "
//				+ max_vote = + "' " + s.getMax_vote() + " ')" '
//				"WHERE id_student =" + s.getId();
//		this.stm.executeUpdate(sql);
//		System.out.println("Studente modificato");
//		
//		
//	}
	
	
	}
	

