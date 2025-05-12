import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println(" quantité de lait en centilitres : ");
        int briqueDeLait = scanner.nextInt();
        
        
        System.out.println(" quantité de céréales en grammes : ");
        int paquetDeCereales = scanner.nextInt();
        
        
        System.out.println(" capacité du bol en centilitres : ");
        int bol = scanner.nextInt();
        
        
        if (briqueDeLait == 0 || paquetDeCereales == 0 || bol == 0) {
            
            System.out.println("Je ne peux pas prendre mon petit déjeuner."); // Si un des éléments est vide
        } else {
           
            System.out.println("Je peux prendre mon petit déjeuner."); // Sinon, le petit déjeuner peut être préparé
            
            
            System.out.println("J'ajoute le lait et les céréales dans le bol."); // Ajouter le lait et les céréales dans le bol
            
            
            System.out.println("Mon petit déjeuner est prêt."); // Afficher que le petit déjeuner est prêt
        }
    
        
        scanner.close();
    }
}