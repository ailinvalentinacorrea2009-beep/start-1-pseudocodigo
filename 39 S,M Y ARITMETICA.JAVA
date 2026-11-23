import java.util.Scanner;

public class SumaMedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, suma, media;

        System.out.print("Ingrese el primer numero: ");
        n1 = sc.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        n2 = sc.nextDouble();

        System.out.print("Ingrese el tercer numero: ");
        n3 = sc.nextDouble();

        suma = n1 + n2 + n3;
        media = suma / 3;

        System.out.println("Suma: " + suma);
        System.out.println("Media aritmetica: " + media);

        sc.close();
    }
}
