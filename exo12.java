/* EXO12 : Avec PRINT & Scanner , vous allez me créer un algo 
 * qui applique une réduction (en pourcentage %) sur un prix (en décimal) donnée :
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Votre prix ?
 * 
 * 100.00
 * 
 * Votre réduction (en pourcentage %) ?
 * 
 * 20
 * 
 * 
 * Prix après réduction de 20% :
 * 
 * 80.00
 * 
 * 
 * 
*/

import java.util.Scanner;

public class exo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Votre prix ?");                                    // Demander le prix
        double prix = scanner.nextDouble();
        
        
        System.out.println("\nVotre réduction (en pourcentage %) ?");         // Demander la réduction
        double reduction = scanner.nextDouble();
        
        
        double prixReduit = prix * (1 - reduction / 100);                       // Calculer le prix après réduction
        
        
        System.out.println("\nPrix après réduction de " + reduction + "% :");   // Afficher le résultat
        System.out.printf("\n%.2f", prixReduit);
        
        scanner.close();
    }
}
