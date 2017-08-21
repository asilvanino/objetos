/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SIL
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SerieTaylor ST = new SerieTaylor () ;
        Scanner Sc = new Scanner (System.in);
        System.out.print("Ingrese el limite (n): ");
        int lim = Sc.nextInt();
        System.out.print("Ingrese los grados: ");
        int grados = Sc.nextInt();
        System.out.println("Seno: " + ST.SenoX(lim, grados));
        System.out.println("Coseno: " + ST.cosenoX(lim, grados));

    }
    
}
