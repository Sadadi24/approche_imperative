package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int [] array = {2,5,6,9,0,1};
   int lastElement = array[array.length - 1];
   for(int i = array.length ; i< array.length; i--) {
	   array[i] = array[i - 1];
	   
   }
   array[0] = lastElement;
	}

}
