/*
* Author : stephanerheaume
* Date : Jun. 9, 2021
* Description : 
*/


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Exemple1 {
	
	
	public static void main(String[] args)
	{
		FileReader ficALire;
		BufferedReader entree;
		char c;
		
		try {
			ficALire=new FileReader("monFichier.txt");
			entree = new BufferedReader(ficALire);
			c=(char) entree.read();
			System.out.print(c);
			entree.close();
			ficALire.close();
			
		}catch (FileNotFoundException e) {
			System.out.print("le fichier ne peut pas etre lu");
		
		}catch(IOException ioe)
		
	}

}
