/* EXO5 : A l'aide de Scanner et Print, créer une équation  A multiplier par B diviser C (tous types entiers) , récupérer le résultat et vérifier si elle inférieur ou supérieur à 10
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * equation = (EQUATION)
 * 
 * equation = 15
 * 
 * 
 * equation est superieur
 * 
*/
import java.util.Scanner;

public class exo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lecture des entiers
        System.out.println("A = ");
        int A = scanner.nextInt();

        System.out.println("B = ");
        int B = scanner.nextInt();

        System.out.println("C = ");
        int C = scanner.nextInt();

        // Calcul de l'équation (A * B) / C
        int equation = (A * B) / C;

        // Affichage de l'équation et du résultat
        System.out.println("\nequation = (A * B) / C");
        System.out.println("equation = " + equation);

        // Vérification si le résultat est inférieur ou supérieur à 10
        if (equation > 10) {
            System.out.println("equation est superieur");
        } else if (equation < 10) {
            System.out.println("equation est inferieur");
        } else {
            System.out.println("equation est egal à 10");
        }

        scanner.close();
    }
}