import java.util.Scanner;

        public class CompteRebours {
             public static void main(String[] args) {
                 Scanner scanner = new Scanner(System.in);

                 System.out.print("Entre a number : ");
                 int n = scanner.nextInt();

                 for (int i = n; i >= 0; i--) {
                     System.out.print(i + " ");
                 }
             }
        }