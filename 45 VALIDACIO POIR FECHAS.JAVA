import java.util.Scanner;

public class ValidacionFechas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dia, mes, anio;
        int diasMes = 0;

        System.out.print("Ingrese el dia: ");
        dia = sc.nextInt();

        System.out.print("Ingrese el mes: ");
        mes = sc.nextInt();

        System.out.print("Ingrese el anio: ");
        anio = sc.nextInt();

        if (mes >= 1 && mes <= 12 && anio > 0) {

            switch (mes) {
                case 1: case 3: case 5: case 7:
                case 8: case 10: case 12:
                    diasMes = 31;
                    break;

                case 4: case 6: case 9: case 11:
                    diasMes = 30;
                    break;

                case 2:
                    if (anio % 400 == 0 ||
                       (anio % 4 == 0 && anio % 100 != 0)) {
                        diasMes = 29;
                    } else {
                        diasMes = 28;
                    }
                    break;
            }

            if (dia >= 1 && dia <= diasMes) {
                System.out.println("Fecha valida");
            } else {
                System.out.println("Fecha no valida");
            }

        } else {
            System.out.println("Fecha no valida");
        }

        sc.close();
    }
}
