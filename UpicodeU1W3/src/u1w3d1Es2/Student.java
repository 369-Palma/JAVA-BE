package u1w3d1Es2;

//import java.sql.Date;
import java.sql.SQLException;

import connectorEs2.ConnectionDBC;

public class Student {
private Integer id;
private String name;
private String lastname;
private String gender;
private String birthdate;
private static double avg;
private int min_vote;
private int max_vote;

public Integer getId() {
	return id;
}


//costruttore senza id

public Student(String name, String lastname, String gender, String date, int min_vote, int max_vote) {
	super();
	this.name = name;
	this.lastname= lastname;
	this.gender = gender;
	this.birthdate = date;
	this.min_vote = min_vote;
	this.max_vote = max_vote;
}

//costruttore con tutti i parametri (incluso id)

public Student(Integer id, String name, String lastname, String gender, String birthdate, int min_vote, int max_vote) {
	super();
	this.id = id;
	this.name = name;
	this.lastname= lastname;
	this.gender = gender;
	this.birthdate = birthdate;
	this.min_vote = min_vote;
	this.max_vote = max_vote;
}




@Override
public String toString() {
	return "Studenti [id=" + id + ", name=" + name + ", gender=" + gender + ", birthdate=" + birthdate + ", min_vote="
			+ min_vote + ", max_vote=" + max_vote + ", getId()=" + getId() + ", getName()=" + getName()
			+ ", getGender()=" + getGender() + ", getBirthdate()=" + getBirthdate() + ", getMin_vote()=" + getMin_vote()
			+ ", getMax_vote()=" + getMax_vote() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}



public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getBirthdate() {
	return birthdate;
}
public void setBirthdate(String birthdate) {
	this.birthdate = birthdate;
}
public double getAvg() {
	return avg;
}
public static void setAvg(double avg) {
	Student.avg = avg;
}
public int getMin_vote() {
	return min_vote;
}
public void setMin_vote(int min_vote) {
	this.min_vote = min_vote;
}
public int getMax_vote() {
	return max_vote;
}
public void setMax_vote(int max_vote) {
	this.max_vote = max_vote;
}

//METODI PERSONALIZZATI

//inserire nuovo studente

//public void insertStudent(Student s) throws SQLException {
//	Student student = null;
//	String sql = "INSERT INTO Students (name, lastname, gender,birthday,avg, min_vote, max_vote)"
//			+"VALUES(' " + s.getName()+ " ' , "
//					+ "' " + s.getLastname() + " ,"
//							+ "' " + s.getGender() + " ,"
//									+ " ' " + s.getBirthdate() + ","
//											+ " ' " + s.getAvg() + " ,"
//													+ " ' " + s.getMin_vote() + " , "
//															+ "' " + s.getMax_vote() + " ')";
//	ConnectionDBC.stm.executeUpdate(sql);
//	System.out.print("Aggiunti nuovo studente" + student);
//	
//}



}
