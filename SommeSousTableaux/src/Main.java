public class Main {
    public static void main(String[] args) {
        int[] tableau = {2, 6, 1, 4, 5};
        int cible = 6;

        trouverSousTableaux(tableau, cible);
    }

    public static void trouverSousTableaux(int[] tableau, int cible) {

        for (int i = 0; i < tableau.length; i++) {
            int somme = 0;

            for (int j = i; j < tableau.length; j++) {
                somme += tableau[j];

                if (somme == cible) {
                    System.out.print("[");
                    for (int k = i; k <= j; k++) {
                        System.out.print(tableau[k]);
                        if (k < j) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println("]");
                }
            }
        }
    }
}
