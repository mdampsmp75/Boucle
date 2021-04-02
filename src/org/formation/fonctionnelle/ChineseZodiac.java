package org.formation.fonctionnelle;

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {

		
		//int nombre = (int) (Math.random()*10); // cela permet de definr un plage entre 0 et 10 sans virgule
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("entrer l'année");
		int annee = input.nextInt();
		System.out.println("ta fait entrer : " + annee);

		
		int x = annee%12;
		switch (x) {

			case 0:
			System.out.println("monkey");
			break;
	
			case 1:
				System.out.println("rooster");
				break;
	
			case 2:
				System.out.println("dog");
				break;
	
			case 3:
				System.out.println("pig");
				break;
	
			case 4:
				System.out.println("rat");
				break;
			case 5:
				System.out.println("ox");
				break;
	
			case 6:
				System.out.println("tigerr");
				break;
	
			case 7:
				System.out.println("rabit");
				break;
	
			case 8:
				System.out.println("dragon");
				break;
	
			case 9:
				System.out.println("snake");
				break;
			case 10:
				System.out.println("horse");
				break;
			case 11:
				System.out.println("sheep");
				break;
				
			default:
				System.out.println("y a pas de cas à cela");
		}
		input.close();
	}

}
