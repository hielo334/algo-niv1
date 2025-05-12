/* EXO13 : Avec PRINT & SCANNER : Convertir du centimètre (Entier) au mètre (Double)
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Donner une taille en centimètre ?
 * 
 * 170
 * 
 * 170 cm vaut 1.70 m
 * 
 * 
 * 
 * 
 * 
 * 
*/
import java.util.Scanner;                                   

public class exo13 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);                       // Création d'un objet Scanner pour lire l'entrée de l'utilisateur
        
        
        System.out.println("Donner une taille en centimètre ?");     // Demander à l'utilisateur de donner une taille en centimètre
                                                  
        
        
        int centimetres = scanner.nextInt();                           // Lire la valeur entière en centimètres
        
        
        double metres = centimetres / 100.0;                           // Convertir les centimètres en mètres (1 m = 100 cm)
        
        System.out.println();                                          
        
        
        System.out.println(centimetres + " cm vaut " + metres + " m");// Afficher le résultat de la conversion
        
        
        scanner.close();                                              
    }
}


