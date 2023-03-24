package prova;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Prova {
	
	public static void main(String[] args) {

File f = new File("text.txt");

try {
FileUtils.writeStringToFile(f, "Badoglio!", "UTF-8"); //scrivo qualcosa nel file (prima di leggerlo!)
//String s = FileUtils.readFileToString(f, "UTF-8");   //leggo il file

FileUtils.writeStringToFile(f, "Evviva me!", true); //deprecato ma funziona --> append (aggiunge nuovo testo al file)
String s = FileUtils.readFileToString(f, "UTF-8");
System.out.println(s);

}
catch(IOException e) {
	e.printStackTrace();
}

}
}
	

