import java.util.Scanner;



public class Main1 {

    
    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);

        System.out.print("Ingresar numero para dar su factorial: ");
        int numero = Leer.nextInt();
        Main1 FC = new Main1 ();
        FC.Factorial(numero);

    }

    public double Factorial(int num) {

        int resultado = 1;

        if (num == 0 || num == 1) {

            System.out.println("El factorial del numero " + num + " es " + 1);

        } else {
            for (int i = 2; i <= num; i++) {
                resultado = resultado * i;
            }
            System.out.println("El factorial del numero " + num + " es " + resultado);
        }

        return 0;
    }

}