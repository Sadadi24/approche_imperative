package fr.declaration.variable;

public class DeclarationApp {

	public static void main(String[] args) {
			
		 // Déclaration des variables avec des littéraux différents
        byte valuByte = 2;
        short valueShort = -300;
        int valueInt = 50000;
        long valueLong = 1000000000L;
        float valueFloat = 3.14f;
        double valueDouble = 2.71828;
        char valueChar = 'A';
        
        boolean valueBoolean = true;
        String valueString = "Hello, World!";

        // Affichage des valeurs des variables
        System.out.println("Valeur de myByte : " + valuByte);
        System.out.println("Valeur de myShort : " + valueShort);
        System.out.println("Valeur de myInt : " + valueInt);
        System.out.println("Valeur de myLong : " + valueLong);
        System.out.println("Valeur de myFloat : " + valueFloat);
        System.out.println("Valeur de myDouble : " + valueDouble);
        System.out.println("Valeur de myChar : " + valueChar);
        System.out.println("Valeur de myBoolean : " + valueBoolean);
        System.out.println("Valeur de myString : " + valueString);
        
        String randomString = "Voici le résultat d’un calcul : 1+5=6";

        // Affichage de la chaîne de caractères initiale
        System.out.println("Chaîne de caractères initiale : ");
        System.out.println(randomString);

        // Modification de la chaîne pour inclure un saut de ligne après le caractère ":"
         randomString = "Voici le résultat d’un calcul :\n 1+5=6";

        // Affichage de la chaîne de caractères modifiée
        System.out.println("\nChaîne de caractères modifiée : ");
        System.out.println(randomString);

	}

}
