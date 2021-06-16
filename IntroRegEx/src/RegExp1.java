import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* Author : stephanerheaume
* Date : Jun. 16, 2021
* Description : Introduction sur les expressions regulieres
*/

public class RegExp1 {

	public static void main(String[] args)
	{
		Scanner crayon=new Scanner (System.in);
		
		System.out.println("Inscrire le texte pour la recherche");
		String input = crayon.nextLine();
				System.out.println("Inscrire le texte rechercher");
		String regEx = crayon.nextLine();
		
		Pattern pattern = Pattern.compile(regEx,Pattern.CASE_INSENSITIVE);
		
		Matcher matcher = pattern.matcher(input);
		
		
		
		while (matcher.find())
		{
			System.out.println("Le(s) mot(s) \"" + matcher.group()
			+ "\" débute a l'indice " + matcher.start()
			+ " et finit a l'indice " + matcher.end());
		}
		
		
		if (matcher.lookingAt())
		{
			System.out.println("On a trouvé\"" + 
		matcher.group() + "\" commencant a l'indice" + matcher.start() +
		" et finit a l'indice" + matcher.end()) ;}
			
			else
			{
				System.out.println (" Le texte ne se trouve pas au debut");
			}
		}
		
		
		
		
	}
	
	

