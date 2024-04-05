package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
		// Créer un tableau qui contient la somme des 2 précédents tableaux
		
		int [] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
		int [] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ; 
		
		int taille  = 0;
		
		
		if(array1.length< array2.length) {
			taille = array2.length;
		}else {
			taille = array1.length;
		}
		
		int [] sommeTableaux = new int [taille];
		
		for (int i = 0; i< taille; i++) {
			
			sommeTableaux[i] = array1[i]+array2[i];
		}
		
		System.out.println(" la somme des 2 précédents tableaux");
		for(int element : sommeTableaux) {
			System.out.print(element+",");

		}
		
	}

}
