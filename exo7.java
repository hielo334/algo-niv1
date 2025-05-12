/* EXO7 : A l'aide de Scanner et Print, créer un questionnaire, "Do you speak english ?", répondre yes ou no, puis retourner le messages suivants 
 * 
 * si FALSE "So learn english !"
 * 
 * Si TRUE "Nice to meet you"
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Do you speak english (Y/N)?
 * 
 * Y (Tapez Y)
 * 
 * "Nice to meet you"
 * 
 * 
 * 
*/
import java.util.Scanner;

public class exo7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Création d'un objet Scanner pour récupérer l'entrée de l'utilisateur
        
        
        System.out.print("Do you speak English? (yes/no): "); // Poser la question
        String reponse = scanner.nextLine();
        
        
        if (reponse.equalsIgnoreCase("yes")) { // Vérifier la réponse et afficher le message correspondant
            System.out.println("Nice to meet you");
        } else if (reponse.equalsIgnoreCase("no")) {
            System.out.println("So learn English!");
        }

            
        
        
        
        scanner.close();
    }
}