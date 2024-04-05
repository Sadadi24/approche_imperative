package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bool = false;
		int [] array ={1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, 6};
		
		    
		        if(array.length >= 1 && array[0] == 6 || array[array.length-1] == 6) {
		        	bool = true;
		        }else {
		        	bool = false;
		        }
		        System.out.println(bool);
	}

}
