/* EXO10 : Créer un quizz de 5 questions, chaque question à deux réponses au choix VRAI OU FAUX, à chaque fois que vous répondez juste à une question vous gagnez un point
 * 
 * Après avoir répondez à vos 5 questions, vous avez le résultat final sur 5.
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Question 1 : 
 * 
 * 
*/import java.util.Scanner;

public class exo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int score = 0; // Variable pour le score

        
        String[] questions = {
            "Le cheval blanc d'henry IV est rouge. VRAI ou FAUX ?",
            "La terre est une planète. VRAI ou FAUX ?",                          // Tableau des questions et des réponses correctes
            "LONDRES est la capitale de la Grande Bretagne. VRAI ou FAUX ?",
            "2 + 2 = 5. VRAI ou FAUX ?",
            "L'eau gèle à 0°C. VRAI ou FAUX ?"
        };
        
         
        String[] bonnesReponses = {"FAUX", "VRAI", "VRAI", "FAUX", "VRAI"};    // Tableau des réponses correctes
        
        
        for (int i = 0; i < 5; i++) {                                          // Boucle pour poser les 5 questions
            System.out.println(questions[i]);
            System.out.print("Votre réponse (VRAI ou FAUX) : ");
            String reponse = scanner.nextLine();                              // Met la réponse

              
            if (reponse.equals(bonnesReponses[i])) {                          // Vérifier si la réponse est correcte
                System.out.println("Bonne réponse !");
                score++;                                                      // Augmenter le score
            } else {
                System.out.println("Mauvaise réponse.");
            }
            System.out.println();                                             // Laisser une ligne vide pour la lisibilité
        }

        
        System.out.println("Votre score final est : " + score + " sur 5.");  // Afficher le score final

        scanner.close();                                                     // Fermer le scanner
    }
}