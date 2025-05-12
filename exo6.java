/* EXO6 : A l'aide de Scanner et Print, donnez moi votre prénom et votre âge, pour l'affichage sous la forme d'une phrase dynamique
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * prenom = "Eudes"
 * 
 * age = 32
 * 
 * Je m'appelle Eudes , j'ai 32 ans
 * 
 * 
 * 
*/
import java.util.Scanner;

public class exo6 {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour récupérer l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Demander le prénom à l'utilisateur
        System.out.println("Quel est votre prénom ? ");
        String prenom = scanner.nextLine();
        
        // Demander l'âge à l'utilisateur
        System.out.println("Quel est votre âge ? ");
        int age = scanner.nextInt();
        
        // Afficher une phrase dynamique avec les informations obtenues
        System.out.println("Je m'apelle " + prenom + " , J'ai " + age + " ans.");
        
        // Fermer le scanner
        scanner.close();
    }
}
