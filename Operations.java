/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class Operations {

    public int factorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = 2; i <= x; i++) {
                result = result * i;
            }
            return result;
        }

    }

    public int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente == 1) {
            return base;
        } else if (exponente > 1) {
            int result = 1;
            for (int i = 0; i < exponente; i++) {
                result = result * base;
            }
            return result;
        } else if (exponente < 0) {
            int result = 1;
            for (int i = 0; i < exponente; i++) {
                result = result * base;
            }
            return 1 / result;
        }
        return 0;
    }
    
    public double GradosArad (double grados) {
        return Math.PI * grados / 180;
    }
    
    public double arcsinX(double grados, int lim){
        Operations op = new Operations();
        double sumarcsin = 0, rad; 
        int termino = 0, sig;
        double radianes = GradosArad(45);
        
    /*    for (int n = 0; n <= lim; n++) {
            sig = factorial(2*n);
            termino = potencia(4, n) * potencia(factorial(n), 2) * 2 * n + 1;
            rad = potencia((int)op.GradosArad(grados),2 * n + 1);
            sumarcsin = sig / termino * rad;
        }
         return sumarcsin;  
    }*/ 
        for (int i = 0; i < 10; i++) {
            termino = (factorial(2*i)) / (potencia(4,i) * factorial(potencia(i),2) * (2*i+1)) * potencia(radianes,2*i+1);
            sumatoria = sumatoria + termino; 
        }
        return sumatoria;
}
 