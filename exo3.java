/* EXO3 : A l'aide de Scanner et Print, me faire afficher le résultat d'une addition (types entiers) et vérifier si elle est pair ou impaire     
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a + b
 * 
 * resultat = 5
 * 
 * resultat est impaire
 * 
 * 
 * 
*/
import java.util.Scanner;

public class exo3 {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire les entrées
        Scanner scanner = new Scanner(System.in);

        // Lire les valeurs de a et b
        System.out.print("a = ");
        int a = scanner.nextInt();

        System.out.print("b = ");
        int b = scanner.nextInt();

        // Calculer l'addition
        int resultat = a + b;

        // Afficher l'équation et le résultat
        System.out.println("\nresultat = a + b");
        System.out.println("resultat = " + resultat);

        // Vérifier si le résultat est pair ou impair
        if (resultat % 2 == 0) {
            System.out.println("resultat est pair");
        } else {
            System.out.println("resultat est impaire");
        }

        // Fermer le scanner
        scanner.close();
    }
}