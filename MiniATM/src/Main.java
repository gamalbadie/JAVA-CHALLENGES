import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double solde = 500.0;
        int choix;

        do {
            System.out.println("====MENU DU ATM====");
            System.out.println("1. Consulter le solde");
            System.out.println("2. Dépot");
            System.out.println("3. Retrait");
            System.out.println("4. Quitter");
            System.out.print("Entrez votre choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Votre solde actuel est " + solde );
                    break;

                    case 2:
                        System.out.print("Entrez un montant : ");
                        double depot = scanner.nextDouble();
                        if (depot > 0) {
                            solde += depot;
                            System.out.println("Dépot de " + depot + " effectué avec succés");
                        } else {
                            System.out.println("Montant invalide");
                        }
                        break;

                case 3:
                    System.out.print("Entrez un montant : ");
                    double retrait = scanner.nextDouble();
                    if (retrait > 0 && retrait <= solde) {
                        solde -= retrait;
                        System.out.println("Retrait de "+ retrait +" effectué avec succés");
                    } else if (retrait > solde) {
                        System.out.println("Retrait insuffisant");
                } else {
                        System.out.println("Montant invalide");
                    }
                    break;

                case 4:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide");
            }
            System.out.println();
        }
        while (choix != 4);
    }
}