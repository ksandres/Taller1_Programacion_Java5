import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int año = scanner.nextInt();

        boolean bisiesto = false;

        if (año % 4 == 0) {
            if (año % 100 == 0) {
                if (año % 400 == 0) {
                    bisiesto = true;
                }
            } else {
                bisiesto = true;
            }
        }

        if (bisiesto) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
    }
}

