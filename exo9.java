/* EXO9 : La suite de l'EXO 8, une fois l'inscription terminé, essayez de vous connecter en donnant l'email et le mot de passe correspondant.
 * 
 * Si l'email ou le mot de passe n'est pas vous afficher "connexion refusée"
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Votre prénom ?
 * 
 * Eudes
 * 
 * Votre nom ?
 * 
 * Konda
 * 
 * Votre adresse ?
 * 
 * ekonda@arfp.asso.fr
 * 
 * votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * confirmer votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * Merci Eudes KONDA , votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : ekonda@arfp.asso.fr
 * 
 * Pour vous connecter, renseignez votre email ?
 * 
 * ekonda@arfp.asso.fr
 * 
 * Renseignez votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * 
 * 
*/
import java.util.Scanner;

public class exo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Votre prénom ? ");
        String prenom = scanner.nextLine();

        System.out.print("Votre nom ? ");
        String nom = scanner.nextLine();

        System.out.print("Votre adresse ? ");
        String email = scanner.nextLine();

        System.out.print("Votre mot de passe ? ");
        String motDePasse = scanner.nextLine();

        System.out.print("Confirmer votre mot de passe ? ");
        String confirmationMotDePasse = scanner.nextLine();

        if (!motDePasse.equals(confirmationMotDePasse)) {
            System.out.println("Inscription annulée");
        } else {
            System.out.println("Merci " + prenom + " " + nom.toUpperCase() + 
                ", votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : " + email);
            
            
            System.out.println("\n Connexion ");
            System.out.print("Adresse email : ");
            String emailConnexion = scanner.nextLine();

            System.out.print("Mot de passe : ");
            String motDePasseConnexion = scanner.nextLine();

            if (email.equals(emailConnexion) && motDePasse.equals(motDePasseConnexion)) {
                System.out.println("Connexion réussie. Bienvenue " + prenom + " !");
            } else {
                System.out.println("Connexion refusée");
            }
        }

        scanner.close();
    
    }
}