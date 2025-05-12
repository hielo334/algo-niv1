/* EXO11 : Avec PRINT & Scanner , vous allez simuler un distributeur de banque :
 * 
 * Vous avez 3000€ sur votre compte, créer un algo qui retire un montant sur votre compte banquaire
 * votre solde ne peut pas être négatif
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bonjour, combien voulez-vous retirer ?
 * 
 * 3500
 * 
 * Opération refusée, fond insuffissant !
 * 
 * 
*/
import java.util.Scanner;

public class exo11 {
    public static void main(String[] args) {
        int solde = 3000;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Combien voulez-vous retirer ?");
        int montant = scanner.nextInt();

        if (montant > solde) {
            System.out.println("\nOpération refusée, fond insuffisant !");
        } else {
            solde -= montant;
            System.out.println("\nOpération acceptée. Nouveau solde : " + solde + " EUR ");
        }

        scanner.close();
    }
}


