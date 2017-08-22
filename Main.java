/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        Operations op = new Operations();
        System.out.print("Ingrese los grados: ");
        int grados = Leer.nextInt();
        System.out.print("ingrese el limite: ");
        int limite = Leer.nextInt();
        System.out.println("arcsinX =  " + op.arcsinX(grados, limite));;
    }   

}
