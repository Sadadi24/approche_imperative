package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		// Déclaration d'un tableau
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
		 //Afficher l’ensemble des éléments du tableau grâce à une boucle
		 System.out.println("L’ensemble des éléments du tableau");
		 for(int item : array) {
			 System.out.println(item);
		 }
		 System.out.println("\n");
		 System.out.println("L’ordre inverse du tableau");
		// Afficher l’ensemble des éléments dans l’ordre inverse du tableau
		for(int i = array.length-1 ; i >0; i--) {
			
			System.out.println(array[i]);
		}
		// Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy
		int [] arrayCopy = new int [array.length];
		
		 System.arraycopy(array, 0, arrayCopy, 0, array.length);
		 System.out.println("Elements de arrayCopy :");
	        for (int num : arrayCopy) {
	            System.out.println(num + " ");
	        }
		 
		 
	}

}
