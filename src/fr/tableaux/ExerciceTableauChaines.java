package fr.tableaux;

public class ExerciceTableauChaines {

	public static void main(String[] args) {

		String[] villes = { "Paris", "Londres", "New York", "Tokyo", "Berlin" };

		System.out.println("Les elements du tableau :");

		for (String ville : villes) {
			System.out.println(ville);
		}
		// Affichez la longueur du tableaul
		System.out.println("\n " + "la Taiile du tableau est de " + villes.length);

		// Modifiez l’élément d’index 3 du tableau avec la valeur de ville "Reims"
		villes[3] = "Reims";

		// Affichez les 5 éléments du tableau après modification
		for (String ville : villes) {
			System.out.println(ville);
		}

	}

}
