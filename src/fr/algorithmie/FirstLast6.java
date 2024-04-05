package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bool = false;
		int [] array ={1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, 1};
		
		    
		        if(array.length >= 1 && array[0] == array[array.length-1]) {
		        	bool = true;
		        }else {
		        	bool = false;
		        }
		        System.out.println(bool);
	}

}
