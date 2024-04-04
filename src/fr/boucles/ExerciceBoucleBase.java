package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		// Affichez tous les nombres de 1 à 10
		for (int i = 1; i <= 10; i++) {
			System.out.println("Nombre :" + i);
		}
		// Affichez 20 fois votre nom et votre prénom
		for (int i = 1; i <= 20; i++) {
			System.out.println("Assani Sadadi :" + i);
		}

		System.out.println("\n");
		// Affichez les éléments pairs de 2 à 100
		for (int i = 2; i <= 100; i++) {

			if (i % 2 == 0) {
				System.out.println("Element paire :" + i);
			}
		}

		// Affichez les éléments impairs de 1 à 99
		System.out.println("\n");
		for (int i = 1; i <= 99; i++) {

			if (i % 2 != 0) {
				System.out.println("Element impaire :" + i);
			}
		}
	}

}
