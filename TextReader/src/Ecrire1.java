/*
* Author : stephanerheaume
* Date : Jun. 11, 2021
* Description : 
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;





public class Ecrire1 {
	
	public static void main(String[] args) {
		String Fichier="Ecrire.txt";
		final String s1="Voici ce que je voudrais";
		final String s2="écrire";
		
		
		FileWriter ficAEcrire;
		PrintWriter sortie;
		try {
			
			ficAEcrire=new FileWriter(Fichier);
			sortie=new PrintWriter(ficAEcrire);
			sortie.print(s1);
			sortie.print(s2);
			sortie.close();
		}catch(IOException ioe) {
			System.out.println("Erreur entree/sotie");
		}
	}
	

}
