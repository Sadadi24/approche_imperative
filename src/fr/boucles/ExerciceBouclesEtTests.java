package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
        // Afficher l’ensemble des éléments du tableau grâce à une boucle  
		for (int value : array) {
			int  i = 0;
			System.out.println("value :"  + value);
			
		}
		  // Affichage des éléments du tableau dans l'ordre inverse
        System.out.println("Les éléments du tableau d'entiers dans l'ordre inverse sont : ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(i);
	}
     // Test si l'entier est supérieur à 3 avant de l'afficher
        
        for (int i = array.length - 1; i >= 0; i--) {
        	
        	if (array[i] > 3) {
                System.out.println(array[i]);
            }
            
	}
        
}}
