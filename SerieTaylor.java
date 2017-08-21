/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SIL
 */
public class SerieTaylor {

    public double SenoX(int lim, int grados) {
        int termino = 0, sumaseno = 0;
        Operations op = new Operations();
        int Signo = (int) op.Potencia(-1, lim);
        double rad = op.GradosRadianes(grados);
        for (int n = 0; n <= lim; n++) {
            termino = (int) ((Signo / op.factorial(2 * n + 1)) * op.Potencia(rad, 2 * n + 1));
            sumaseno = sumaseno + termino;
        }
        return sumaseno;
    }

    public double cosenoX(int lim, int grados) {
        int termino = 0, sumacoseno = 0;
        Operations op = new Operations();
        int Signo = (int) op.Potencia(-1, lim);
        double rad = op.GradosRadianes(grados);
        for (int n = 0; n <= lim; n++) {
            termino = (int) ((Signo / op.factorial(2 * n )) * op.Potencia(rad, 2 * n ));
            sumacoseno = sumacoseno + termino;
        }
        return sumacoseno;
    }
}

