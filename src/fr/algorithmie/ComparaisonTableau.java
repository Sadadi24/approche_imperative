package fr.algorithmie;

import java.util.HashSet;

public class ComparaisonTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		
		HashSet<Integer> set = new HashSet<>();
        for (int i : array1) {
            set.add(i);
        }

        // Compter les éléments en commun
        int count = 0;
        for (int element: array2) {
            if (set.contains(element)) {
                count++;
            }
        }
        System.out.println("Nombre d'élement en commun :"+ count);

	}

}
