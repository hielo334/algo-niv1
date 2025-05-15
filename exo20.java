/* EXO20 : Avec PRINT & SCANNER : 
 * 
 * Vous allez créer un algo de sondage pour des élections, 
 * la candidate Joseline Inutile et le candidat Vincent Escreau pour la mairie de Mulhouse.
 * Vous avez 150 000 votants, donnez le nombre de votant pour Escreau et pour Inutile, et le nombre de vote blanc
 * Si le total des votes n'est pas atteint, les votes manquants seront comptés blanc
 * Si le total de vote est supérieur aux nombres de votants alors il y a une erreur
 * Puis calculez en pourcentage en fonction du nombres de votants ( ceux qui n'ont pas voter blanc)
 * Le score en pourcentage, le gagnant doit avoir plus de 60% sinon il devra y avoir un second tour :
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
* Combien de gens ont voté pour Joseline Inutile ?
 * 
 * 100 000
 * 
* Combien de gens ont voté pour Vincent Escreau ?
 * 
 * 20 000
 * 
* Vous avez 30 000 d'abstentions, ils seront compté nul
 * 
 * 
 * Joseline Inutile : 66.7%
 * 
 * Vincent Escreau : 33.3%
 * 
 * 
 * Joseline Inutile est la nouvelle maire de Mulhouse
 * 
 * 
*/
import java.util.Scanner; 

public class exo20 {
    public static void main(String[] args) {
        // variables importantes
        final int VOTANTS_TOTAL = 150000; 
        int votesInutile = 0;
        int votesEscreau = 0;
        int votesBlanc = 0;
        
        Scanner scanner = new Scanner(System.in); 
        
        // Demander les votes pour Inutile
        System.out.println("Combien de gens ont voté pour Joseline Inutile ?");
        
        votesInutile = scanner.nextInt();
        
        // Demander les votes pour Escreau
        System.out.println("Combien de gens ont voté pour Vincent Escreau ?");
        
        votesEscreau = scanner.nextInt();
        
        // Calculer les votes blancs
        votesBlanc = VOTANTS_TOTAL - (votesInutile + votesEscreau);
        
        // Afficher les abstentions (qui sont comptées nulles)
        System.out.println("Vous avez " + votesBlanc + " d'abstentions, ils seront compté nul");
        System.out.println(); // encore un saut de ligne
        
        // Vérifier si y a pas trop de votes
        if ((votesInutile + votesEscreau) > VOTANTS_TOTAL) {
            System.out.println("Erreur ! Trop de votes !");
            return; // on arrête tout
        }
        
        // Calculer les pourcentages
        int totalVotesExprimes = votesInutile + votesEscreau;
        double pourcentInutile = 0;
        double pourcentEscreau = 0;
        
        // Faire les calculs seulement s il y a des votes exprimés
        if (totalVotesExprimes > 0) {
            pourcentInutile = (votesInutile * 100.0) / totalVotesExprimes;
            pourcentEscreau = (votesEscreau * 100.0) / totalVotesExprimes;
        }
        
        // Afficher les résultats
        System.out.println("Joseline Inutile : " + String.format("%.1f", pourcentInutile) + "%");
        System.out.println("Vincent Escreau : " + String.format("%.1f", pourcentEscreau) + "%");
        System.out.println(); // saut de ligne
        
        // Déterminer le gagnant
        if (pourcentInutile > 60) {
            System.out.println("Joseline Inutile est la nouvelle maire de Mulhouse");
        } else if (pourcentEscreau > 60) {
            System.out.println("Vincent Escreau est le nouveau maire de Mulhouse");
        } else {
            System.out.println("Il y aura un second tour !");
        }
        
        scanner.close(); // fermer le scanner
    }
}

