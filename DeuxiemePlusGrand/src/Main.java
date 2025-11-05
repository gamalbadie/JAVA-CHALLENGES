public class Main {
    public static void main(String[] args) {
        int[] tab = {4, 9, 1, 7, 3};
        System.out.println("Deuxième plus grand : " + deuxiemePlusGrand(tab));
    }

    static int deuxiemePlusGrand(int[] t) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int n : t) {
            if (n > max) {
                second = max;
                max = n;
            } else if (n > second && n < max) {
                second = n;
            }
        }
        return second;
    }
}