/* EXO19 : Avec PRINT & SCANNER : 
 * 
 * 
 * Me créer un convertisseur de secondes au format heures : minutes : secontes
 * 
 * 
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
* Combien de secondes ?
 * 
 * 156000
 * 
 * 156 000 secondes correspond à 43 heures, 20 minutes et 0 seconde
 * 
 * 
 * 
*/
import java.util.Scanner;

public class exo19 {
    public static void main(String[] args) {
        // On crée un scanner pour lire ce que l'utilisateur tape
        Scanner Scanner = new Scanner(System.in);
        
        // On demande les secondes à l'utilisateur
        System.out.println("Combien de secondes ?");
        System.out.println(); // Une ligne vide
        
        // On lit le nombre de secondes 
        int secondesTotales = Scanner.nextInt();
        
        // Calcul des heures (1 heure = 3600 secondes)
        int heures = secondesTotales / 3600; // Division entière!
        int reste = secondesTotales % 3600; // Ce qui reste après les heures
        
        // Calcul des minutes avec ce qui reste (1 minute = 60 secondes)
        int minutes = reste / 60; // Encore une division
        int secondes = reste % 60; // Le reste c'est les secondes
        
        // On affiche le résultat 
        System.out.println();
        System.out.println(secondesTotales + " secondes correspond à " + 
                           heures + " heures, " + 
                           minutes + " minutes et " + 
                           secondes + " seconde");
        
        
        Scanner.close();
        
        
    }
}
