package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		 
		// Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3 
		 System.out.println("élement superieur à 3 sont :");
		 for(int element : array) {
			 if(element>3) {
				 System.out.print( element + ",");
			 }
		 }
		 System.out.println("\n");
		 //Combiner une boucle et un test de manière à n’afficher que les entiers pairs
		 System.out.println(" les entiers pairs sont :");
		 for(int element : array) {
			 if(element%2 == 0) {
				 System.out.print( element + ",");
				 
			 }
		 }
		 //Combiner une boucle et un test de manière à n’afficher que les valeurs correspondant aux index pairs 
		 System.out.println("\n");
		 System.out.println(" les valeurs des  index pairs sont :");
		 for(int i = 0 ;i < array.length; i ++) {
			 if(i%2 == 0) {
				 System.out.print( array[i] + ",");
				 
			 }
		 }
		 //Combiner une boucle et un test de manière à n’afficher que les entiers impairs
		 System.out.println("\n");
		 System.out.println(" les entiers impairs sont :");
		 for(int i = 0 ;i < array.length; i ++) {
			 if(array[i]%2 != 0) {
				 System.out.print( array[i] + ",");
				 
			 }
		 }
		 

	}

}
