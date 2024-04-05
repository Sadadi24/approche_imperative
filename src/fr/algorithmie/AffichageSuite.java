package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {
		// une boucle for pour afficher tous les nombres de 1 à 10 inclus
		for (int i = 1; i <= 10; i++) {
			System.out.println("Nombre:" + i);
		}
		System.out.println("\n");
		// une boucle for pour afficher tous les nombres pairs entre 0 et 10 inclus
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("Nombre paire:" + i);
			}
		}
		System.out.println("\n");
		// une boucle for pour afficher tous les nombres impairs entre 0 et 9 inclus
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println("Nombre impaire:" + i);
			}
		}
		System.out.println("\n");
		// une boucle while pour afficher tous les nombres de 1 à 10 inclus
		int i = 1;
		while (i <= 10) {
			System.out.println("Nombre:" + i);
			i++;

		}
		System.out.println("\n");
		// une boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus
		i = -1;
		while (i <= 10) {
			i++;
			if (i % 2 == 0) {
				System.out.println("Nombre paire:" + i);

			}

		}
		System.out.println("\n");
		//  une boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus
		i = 0;
		while (i <= 9) {
			i++;
			if (i % 2 != 0) {
				System.out.println("Nombre impaire:" + i);

			}

		}

	}
}
