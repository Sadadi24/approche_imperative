package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		//  la moyenne des éléments du tableau 
					int  somme = 0;
					for(int i = 0 ; i<array.length; i++) {
						 somme += array[i];
					}
					int moyenne = somme / array.length;
					
					System.out.println("La moyyenne des élement du  du tableau est :"+moyenne);
	}

}
