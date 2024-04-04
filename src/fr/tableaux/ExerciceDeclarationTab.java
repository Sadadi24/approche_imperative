package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        // Déclaration et initialisation du tableau d'entiers
        int[] tableauEntiers = {8, -7, 12, 1, -2, 14, 17, 9};

        // Affichage de l'élément du tableau d'index 0
        System.out.println("Element à l'index 0 : " + tableauEntiers[0]);

        // Affichage de la longueur du tableau
        System.out.println("Longueur du tableau : " + tableauEntiers.length);

        // Affichage de l'entier positionné au dernier index du tableau
        System.out.println("Dernier élément du tableau : " + tableauEntiers[tableauEntiers.length - 1]);

        // Tentative d'accéder à un index en dehors des limites du tableau (index 10)
        // Cela échoue car l'index 10 est en dehors des limites du tableau
        // Le tableau contient des éléments de l'index 0 à l'index 7 inclus
        // Donc, l'index 10 est invalide
        System.out.println("Tentative d'accès à l'index 10 : ");
        try {
            System.out.println(tableauEntiers[10]); // Tentative d'accéder à l'index 10
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cette instruction échoue car l'index 10 est en dehors des limites du tableau.");
        }
    }
}
