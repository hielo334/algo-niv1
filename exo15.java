/* EXO15 : Avec PRINT & SCANNER : Me créer un convertisseur de devise, Euros , Dollars et Livres Sterling
 * 
 * Vous devriez choisir votre devise en entrée et la devise en sortie
 * 
 * Attention on ne peut pas convertir les deux même devise !
 * 
 * EUR : Euros
 * USD : Dollars
 * GBP : Livres Sterling
 * 
 * le lien ci-dessous vous donne la valeur des monnaies : https://www.boursorama.com/bourse/devises
 * 
 * ATTENTION ! : Montant doivent être décimaux , 2 chiffres après la virgule.
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * Quel est votre monnaie ?
 * 
 * EUR
 * 
 * Quel est votre montant ?
 * 
 * 100.00
 * 
 * Vous voulez la convertir en quelle devise ?
 * 
 * USD
 * 
 * Résultat : 113,82 USD
 * 
 * 
*/
import java.util.Scanner;

public class exo15 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Taux de conversion
        
        final double EUR_TO_USD = 1.1382;  // 1 EUR = 1.1382 USD
        final double EUR_TO_GBP = 0.8563;  // 1 EUR = 0.8563 GBP
        final double USD_TO_GBP = 0.7523;  // 1 USD = 0.7523 GBP
        
        // Variables pour stocker les devises et le montant
        String deviseEntree = "";
        String deviseSortie = "";
        double montant = 0.0;
        
        // Demander la devise d'entrée
        System.out.println("Quel est votre monnaie ?\n");
        System.out.println("EUR : Euros");
        System.out.println("USD : Dollars");
        System.out.println("GBP : Livres Sterling\n");
        deviseEntree = scanner.nextLine().toUpperCase();
        
        // Vérifier que la devise d'entrée est valide
        while (!deviseEntree.equals("EUR") && !deviseEntree.equals("USD") && !deviseEntree.equals("GBP")) {
            System.out.println("Devise non reconnue. Veuillez entrer EUR, USD ou GBP:");
            deviseEntree = scanner.nextLine().toUpperCase();
        }
        
        // Demander le montant à convertir
        System.out.println("\nQuel est votre montant ?\n");
        while (!scanner.hasNextDouble()) {
            System.out.println("Veuillez entrer un nombre valide avec décimales (ex: 100.00):");
            scanner.next(); 
        }
        montant = scanner.nextDouble();
        scanner.nextLine(); 
        
        // Demander la devise de sortie
        System.out.println("\nVous voulez la convertir en quelle devise ?\n");
        System.out.println("EUR : Euros");
        System.out.println("USD : Dollars");
        System.out.println("GBP : Livres Sterling\n");
        deviseSortie = scanner.nextLine().toUpperCase();
        
        // Vérifier que la devise de sortie est valide et différente de l'entrée
        while ((!deviseSortie.equals("EUR") && !deviseSortie.equals("USD") && !deviseSortie.equals("GBP")) 
                || deviseSortie.equals(deviseEntree)) {
            if (deviseSortie.equals(deviseEntree)) {
                System.out.println("Attention: Vous ne pouvez pas convertir entre la même devise!");
            } else {
                System.out.println("Devise non reconnue. Veuillez entrer EUR, USD ou GBP:");
            }
            deviseSortie = scanner.nextLine().toUpperCase();
        }
        
        // Effectuer la conversion
        double resultat = 0.0;
        
        if (deviseEntree.equals("EUR")) {
            if (deviseSortie.equals("USD")) {
                resultat = montant * EUR_TO_USD;
            } else { // GBP
                resultat = montant * EUR_TO_GBP;
            }
        } else if (deviseEntree.equals("USD")) {
            if (deviseSortie.equals("EUR")) {
                resultat = montant / EUR_TO_USD;
            } else { // GBP
                resultat = montant * USD_TO_GBP;
            }
        } else { // GBP est la devise d'entrée
            if (deviseSortie.equals("EUR")) {
                resultat = montant / EUR_TO_GBP;
            } else { // USD
                resultat = montant / USD_TO_GBP;
            }
        }
        
        // Afficher le résultat avec 2 décimales
        System.out.printf("\nRésultat : %.2f %s\n", resultat, deviseSortie);
        
        
        scanner.close();
    }
}