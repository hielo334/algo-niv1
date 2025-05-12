/* EXO4 : A l'aide de Scanner et Print, tester si une valeur(type entier) est divisible par 2   
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * a = 14
 * 
 * 
 * a est bien divisible par 2
 * 
 * 
*/
import java.util.Scanner;

public class exo4 {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Lire la valeur de a
        System.out.print("a = ");
        int a = scanner.nextInt();

        // Tester si a est divisible par 2
        if (a % 2 == 0) {
            System.out.println("\na est bien divisible par 2");
        } else {
            System.out.println("\na n'est pas divisible par 2");
        }

        // Fermer le scanner
        scanner.close();
    }
}