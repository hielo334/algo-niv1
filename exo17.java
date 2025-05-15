/* EXO17 : Avec PRINT & SCANNER : 
 * 
 * Créer un algo qui calcule les dépenses moyenne (en euros, en France) en carburant d'une voiture en fonction 
 * du type de carburant sur une distance en km. 
 * 
 * On consomme 6.5l / 100km pour l'essence
 * On consomme 5.5l / 100km pour le gazole
 * 
 * Les prix des carburants sont sur ce lien : https://carbu.com/france/prixmoyens
 * 
 * carburant par id
 * 
 * Gazole (B7) = 0
 * 
 * Sans Plomb 95 = 1
 * 
 * Sans Plomb 98 (E5) = 2
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Quel est le type de votre carburant ?
 * 
 * 0
 * 
 * Vous avez choisi : Gazole 
 * Quel est la distance à parcourir (en km) ?
 * 
 * 150
 * 
 * Pour 150 km, vous allez dépenser en moyenne 13.99€
 * 
 * /!\ ATTENTION : Le résultat doit être en décimal 2 chiffres après la virgules
 * 
*/
import java.util.Scanner;

public class exo17 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        // Affichage du menu de sélection du carburant
        System.out.println("Quel est le type de votre carburant ?\n");
        System.out.println("Gazole (B7) = 0");
        System.out.println("Sans Plomb 95 = 1");
        System.out.println("Sans Plomb 98 (E5) = 2\n");
        
        // Lecture du type de carburant
        int typeCarburant = scanner.nextInt();
        
        // Variables pour stocker le nom et le prix du carburant
        String nomCarburant = "";
        double prixCarburant = 0.0;
        
        // Détermination du nom et du prix selon le type de carburant
        switch (typeCarburant) {
            case 0:
                nomCarburant = "Gazole";
                prixCarburant = 1.697; // Prix moyen en euros/litre 
                break;
            case 1:
                nomCarburant = "Sans Plomb 95";
                prixCarburant = 1.807; // Prix moyen en euros/litre 
                break;
            case 2:
                nomCarburant = "Sans Plomb 98 (E5)";
                prixCarburant = 1.867; // Prix moyen en euros/litre 
                break;
            default:
                System.out.println("Type de carburant invalide !");
                System.exit(0); // Quitte le programme si le type est invalide
        }
        
        // Affichage du carburant choisi
        System.out.println("\nVous avez choisi : " + nomCarburant);
        
        // Demande de la distance à parcourir
        System.out.println("Quel est la distance à parcourir (en km) ?\n");
        double distance = scanner.nextDouble();
        
        // Calcul de la consommation en litres selon le type de carburant
        double consommation;
        if (typeCarburant == 0) {
            consommation = 5.5; // 5.5l/100km pour le gazole
        } else {
            consommation = 6.5; // 6.5l/100km pour l'essence (SP95 et SP98)
        }
        
        // Calcul du coût total
        double litresConsommes = (consommation * distance) / 100;
        double coutTotal = litresConsommes * prixCarburant;
        
        // Affichage du résultat avec 2 décimales
        System.out.printf("\nPour %.0f km, vous allez dépenser en moyenne %.2f€\n", distance, coutTotal);
        
        
        scanner.close();
    }

}
