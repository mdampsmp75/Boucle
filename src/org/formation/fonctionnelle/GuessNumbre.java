package org.formation.fonctionnelle;

import java.util.Scanner;

public class GuessNumbre {

	public static void main(String[] args) {
	
		int nombre = (int) (Math.random()*10);
		//System.out.println(Math.random());
		int nbresaisie=0;
		
		System.out.println("Choisissez un chiffre entre 0 et 9 (compris)");
		Scanner input = new Scanner(System.in);
		
		
		do {
			
			int choix = input.nextInt();
	
		if (choix < nombre ) {
			System.out.println(" Plus hhhh ");
			nbresaisie++;
			
		}
		
		if (choix > nombre ) {
			System.out.println(" Moins ");
			nbresaisie++;
		}
		
		if (choix == nombre ) {
			System.out.println(" Bravo ");
			nbresaisie++;
			System.out.println("vous avez tenté "+nbresaisie + " fois ");
		}
		
		}
		while (nbresaisie != nombre);
	}

}
