/* EXO14 : Avec PRINT & SCANNER : Tester l'expression algèbrique booléenne A OU B ET NON C
 * 
 * A , B ou C sont des booléens et ne peuvent être qu'égale à TRUE ou FALSE.
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Donner une valeur A OU B ET NON C
 * 
 * FALSE
 * TRUE
 * FALSE
 * 
 * Résultat : TRUE
 * 
 * 
 * 
 * 
 * 
*/
import java.util.Scanner; // Import de la classe Scanner pour la saisie

public class exo14 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Donner une valeur A OU B ET NON C");// Afficher le message d'introduction
        System.out.println(); 
        
       
        System.out.println("Entrez la valeur de A (true/false):"); // Lire les trois valeurs booléennes A, B et C
        boolean A = scanner.nextBoolean();
        
        System.out.println("Entrez la valeur de B (true/false):");
        boolean B = scanner.nextBoolean();
        
        System.out.println("Entrez la valeur de C (true/false):");
        boolean C = scanner.nextBoolean();
        
        System.out.println(); // Ligne vide
        
        // Calculer l'expression booléenne A OU B ET NON C
        // Note: L'opérateur ET (&&) a une priorité plus élevée que OU (||)
        boolean resultat = A || (B && !C);
        
        
        System.out.println("Résultat : " + resultat);// Afficher le résultat
        
        
        scanner.close();// Fermer le scanner 
    }
}


