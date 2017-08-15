
import java.util.Scanner;

public class Nombre {


    public static void main(String[] args) {
        
        
        Scanner Leer = new Scanner (System.in);
        System.out.print("como te llamas: ");
        String Nombre = Leer.nextLine();
        System.out.println("Hola " + Nombre);
    }
    
}
