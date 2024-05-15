import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos caracteres se deben mostrar?:");
        n = sc.nextInt();

        while (n <= 0) {
            System.out.println("Debe ingresar un numero valido, no sea Krostye XD");
            System.out.println("Cuantos caracteres se deben mostrar?:");
            n = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            if (i%2 != 0) {
                System.out.print("*");
            } else {
                System.out.print(".");
            }
        }
        System.out.println(" ");
        for (int i = 1; i <= n; i++) {

                System.out.print(i);
        }
        for (int i = 1; i <= n; i++) {

            System.out.print(i);
        }
        System.out.println(" ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print("*");
            } else {
                System.out.print("||");

            }
        }
    }



}