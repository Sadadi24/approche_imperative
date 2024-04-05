package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 ={-1, 12, 17, 14, 5, -9, 0, 18 };
		
	int tailleMAx  = 0;
	int tailleMin = 0;
		
		if(array1.length< array2.length) {
			tailleMAx = array2.length;
			tailleMin = array1.length;
		}else {
			tailleMAx = array1.length;
			tailleMin = array2.length;
		}
		
		int [] sommeTableaux = new int [tailleMAx];
		
		for (int i = 0; i< tailleMin; i++) {
			
			sommeTableaux[i] = array1[i]+array2[i];
		}
		
		System.out.println(" la somme des 2 précédents tableaux");
		for(int element : sommeTableaux) {
			System.out.print(element+",");

		}
	}

}
