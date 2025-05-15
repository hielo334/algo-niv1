/* EXO16 : Avec PRINT & SCANNER : 
 * 
 * 
 * Me faire un algo qui change le prix d'un vol selon les paramètres suivants :
 * 
 * Réduction de 20% si le passager est mineur
 * 
 * Réduction de 40% si le passager est senior de plus 60 ans
 * 
 * Réduction de 20% si il y a plus de 60 places disponibles
 * 
 * Augmentation de 20% si il y a moins de 20 places disponibles
 * 
 * Augmentation de 20% si le passager a choisit la classe business 
 * 
 * -----Vous définisserez vous même le prix initial du vol, le nombre de place disponible, l'âge du voyageur
 * 
 * Si le voyageur a choisi une classe business
 * 
 * 
 *  * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Quel est l'âge de votre passager ?
 * 
 * 15
 * 
 * Le passager veut-il une classe business (oui/non) ?
 * 
 * oui
 * 
 * Le prix du vol :
 * 
 * 1200
 * 
 * Nombre de places disponibles :
 * 
 * 50
 * 
 * Le prix du vol est de 1200 euros
 * 
 * 
*/
import java.util.Scanner;

public class exo16 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Prix initial du vol 
        double prixInitial = 1200.0;
        
        // Nombre de places disponibles 
        int placesDisponibles = 50;
        
        // Demander l'âge du passager
        System.out.println("Quel est l'âge de votre passager ?");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        
        // Demander si le passager veut une classe business
        System.out.println("Le passager veut-il une classe business (oui/non) ?");
        String choixBusiness = scanner.nextLine();
        boolean isBusiness = choixBusiness.equalsIgnoreCase("oui");
        
        // Afficher les informations de base
        System.out.println("Le prix du vol :");
        System.out.println(prixInitial);
        System.out.println("Nombre de places disponibles :");
        System.out.println(placesDisponibles);
        
        // Calcul du prix final en fonction des paramètres
        double prixFinal = prixInitial;
        
        // Appliquer les réductions ou augmentations en fonction des conditions
        if (age < 18) {
            // Réduction de 20% si le passager est mineur
            prixFinal *= 0.8;
        } else if (age >= 60) {
            // Réduction de 40% si le passager est senior 
            prixFinal *= 0.6;
        }
        
        if (placesDisponibles > 60) {
            // Réduction de 20% si plus de 60 places disponibles
            prixFinal *= 0.8;
        } else if (placesDisponibles < 20) {
            // Augmentation de 20% si moins de 20 places disponibles
            prixFinal *= 1.2;
        }
        
        if (isBusiness) {
            // Augmentation de 20% si classe business choisie
            prixFinal *= 1.2;
        }
        
        // Afficher le prix final
        System.out.println("Le prix du vol est de " + prixFinal + " euros");
        
        
        scanner.close();
    }
}

