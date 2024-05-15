import java.util.Scanner;

public class PatronesAnidados {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos caracteres se deben mostrar?:");
        n=sc.nextInt();
        while (n <= 0) {
            System.out.println("Debe ingresar un numero valido, no sea Tony caluga XD");
            System.out.println("Cuantos caracteres se deben mostrar?:");
            n = sc.nextInt();
        }
        Patron1(n);
        Patron2(n);
        Patron3(n);
        Patron4(n);

    }

    static void Patron1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    static void Patron2(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    static void Patron3(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || j == n - 1 - i) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    static void Patron4(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (i>=0) {
                    System.out.print("Para esta me falta tiempo :(");
                } else {
                    System.out.print(" Na que hacerle punto menos :'(");
                }
            }
            System.out.println();
        }

    }
}
