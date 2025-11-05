import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier mot : ");
        String s1 = scanner.nextLine().replaceAll("\\s", "").toLowerCase();

        System.out.print("Entrez le deuxième mot : ");
        String s2 = scanner.nextLine().replaceAll("\\s", "").toLowerCase();


        if (s1.length() == s2.length() && Arrays.equals(s1.chars().sorted().toArray(), s2.chars().sorted().toArray())) {
            System.out.println("Les deux mots sont des anagrammes.");
        } else {
            System.out.println("Les deux mots ne sont pas des anagrammes.");
        }
    }
}
