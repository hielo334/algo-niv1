/* EXO1 : A l'aide de Scanner et Print, me faire afficher le résultat d'une addition de deux entiers        
 * 
 * 
* **********************AFFICHAGE ATTENDU ****************:
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a + b
 * 
 * resulat vaut 5
 * 
 * 
 * 
*/

import java.util.Scanner; // Importe le scanner par java
 
    public class exo1 {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in); // Déclaration du scanner
 
        System.out.println("Donner deux nombres et la machine va aditionner : ");
 
        int a = sc.nextInt(); // Déclaration d'une variable de type entier donné par l'utilisateur
        int b = sc.nextInt();
 
        int result = a + b; // La machine calcul les deux variables
 
        System.out.println("le résultat vaut " + result); // Affiche le résultat
 
        sc.close(); // Ferme le scanner
       
    }
} 

