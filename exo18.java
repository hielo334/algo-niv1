/* EXO18 : Avec PRINT & SCANNER : 
 * 
 * 
 * Vous souvenez de l'exercice d'algèbre de Boole de la banque ? Une banque vous accorde un prêt immobilier 
 * si vous répondez aux critères suivants :
 * 
 * condition 1 : Avoir un CDI avec un salaire de plus 3000€
 * 
 * condition 2 : Avoir un apport de 25% de la somme demandé
 * 
 * condition 3 (Si la condition 1 n'est pas rempli ) : Avoir une autre propriété 
 * valant minimum 75% du prêt demandé
 * 
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
    * Quel est le montant de votre prêt ?
 * 
 * 150000
 * 
 * Êtes-vous en CDI ?
 * 
 * TRUE
 * 
 * Combien avez-vous d'abord ?
 * 
 * 1500
 * 
 * Vous ne pouvez pas hélas obtenir de prêt !

 * 
*/
import java.util.Scanner;

public class exo18 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Demande du montant du prêt
        System.out.println("Quel est le montant de votre prêt ?\n");
        double montantPret = scanner.nextDouble();
        
        // Demande si l'utilisateur est en CDI
        System.out.println("Êtes-vous en CDI ?\n");
        boolean estEnCDI = scanner.nextBoolean();
        
        // Demande de l'apport personnel
        System.out.println("Combien avez-vous d'apport ?\n");
        double apport = scanner.nextDouble();
        
        // Variable pour stocker si le prêt est accordé
        boolean pretAccorde = false;
        
        // Vérification des conditions d'obtention du prêt
        if (estEnCDI) {
            // Condition 1 : CDI avec salaire > 3000€
            System.out.println("Quel est votre salaire mensuel ?\n");
            double salaire = scanner.nextDouble();
            
            if (salaire > 3000 && apport >= (montantPret * 0.25)) {
                pretAccorde = true;
            }
        } else {
            // Condition 3 : Avoir une autre propriété valant 75% du prêt
            System.out.println("Avez-vous une autre propriété ? (true/false)\n");
            boolean aUnePropriete = scanner.nextBoolean();
            
            if (aUnePropriete) {
                System.out.println("Quelle est la valeur de cette propriété ?\n");
                double valeurPropriete = scanner.nextDouble();
                
                if (valeurPropriete >= (montantPret * 0.75) && apport >= (montantPret * 0.25)) {
                    pretAccorde = true;
                }
            }
        }
        
        // Affichage du résultat
        if (pretAccorde) {
            System.out.println("\nFélicitations ! Votre prêt est accordé.");
        } else {
            System.out.println("\nVous ne pouvez pas hélas obtenir de prêt !");
        }
        
        
        scanner.close();
    }
   }

