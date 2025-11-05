import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] liste1 = {1, 2, 3, 4, 8, 6};
        int[] liste2 = {3, 4, 5, 6, 9, 0};

        List<Integer> communs = new ArrayList<>();

        for (int i : liste1) {
            for (int j : liste2) {
                if (i == j && !communs.contains(i)) {
                    communs.add(i);
                }
            }
        }

        System.out.println(communs);
    }
}
