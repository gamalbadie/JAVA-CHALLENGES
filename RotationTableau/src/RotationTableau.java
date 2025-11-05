import java.util.Arrays;

public class RotationTableau {

    public static void rotation(int[] arr) {
        int n = arr.length;
        if (n == 0) return;

        int dernier = arr[n - 1];


        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = dernier;
    }

    public static void main(String[] args) {
            int[] tableau = {1, 2, 3, 4, 5};

            System.out.println("Tableau original : " + Arrays.toString(tableau));

            rotation(tableau);

            System.out.println("Tableau en rotation : " + Arrays.toString(tableau));
        }
}
