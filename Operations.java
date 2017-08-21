/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SIL
 */
public class Operations {

    public double Potencia(double base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            if (exponente == 1) {
                return base;
            } else {
                if (exponente > 1) {
                    double result = 1;
                    for (int i = 0; i < exponente; i++) {
                        result = result * base;
                    }
                    return result;
                } else {
                    if (exponente < 0) {
                        double result = 1;
                        for (int i = 0; i < exponente; i++) {
                            result = result * base;
                        }

                        return 1 / result;
                    }
                }
            }
        }

        return 0;
    }

    public double factorial(int x) {
        if (x == 1 || x == 0) {
            return 1;
        } else {
            int result = 1;
            for (int i = 2; i <= x; i++) {
                result = result * i;
            }
            return result;
        }

    }
    
    public double GradosRadianes (int grados) {
        return Math.PI * grados /180;
    }
}
