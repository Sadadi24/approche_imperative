package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		// Déclarez un tableau d’entiers contenant tous les entiers de 1 à 10
		int[] tableauEntiers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// Affichez le premier élément du tableau
		System.out.println("Le premier élement est " + tableauEntiers[0]);

		// Affichez la longueur du tableau en utilisant la propriété length
		System.out.println("la longure du tableau est de " + tableauEntiers.length);
		
		
		// Affichez le dernier élément du tableau en utilisant la propriété length
		
		System.out.println("le dérnier élement du tableau est " +tableauEntiers[tableauEntiers.length-1]);
		
		// Modifiez la valeur de l’élément d’index 4 et donnez lui la valeur 8
		tableauEntiers[4] = 8;
		System.out.println("élement modifié " + " " + tableauEntiers[4]);

	}
}