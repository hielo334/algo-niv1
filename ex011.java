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

public class ex011 {
    public static void main(String[] args) {
        // Montant initial sur le compte
        int solde = 3000;
        
        // Création d'un objet Scanner pour lire l'entrée
        Scanner scanner = new Scanner(System.in);
        
        // Affichage du message de bienvenue
        System.out.println("Bonjour, combien voulez-vous retirer ?");
        
        
        // Lecture du montant saisi par l'utilisateur
        int montantDemande = scanner.nextInt();
        
        // Vérification si le retrait est possible
        if (montantDemande > solde) {
            // Message solde insuffisant
            System.out.println();
            System.out.println("Opération refusée, fond insuffisant !");
        } else {
            // Calcul du nouveau solde si le retrait est accepté
            solde = solde - montantDemande;
            System.out.println("Retrait effectué. Nouveau solde : " + solde + "€");
        }
        
        scanner.close();
    }
}

