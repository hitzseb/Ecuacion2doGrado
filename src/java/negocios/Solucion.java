/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

/**
 *
 * @author Sebastian
 */
public class Solucion {

    private Double a;
    private Double b;
    private Double c;
    private Double dis;

    public Solucion(String a1, String b1, String c1) {
        a = Double.parseDouble(a1);
        b = Double.parseDouble(b1);
        c = Double.parseDouble(c1);
        dis = (Math.pow(b, 2) - (4 * a * c));
    }

    public String raiz1() {
        Double raiz;
        Double real, imaginaria;
        if (dis >= 0)
        {
            raiz = (-b + Math.sqrt(dis)) / (2 * a);
            return String.valueOf(raiz);
        } else
        {
            real = b / (2 * a);
            imaginaria = (Math.sqrt(-dis)) / (2 * a);
            return (real + " + " + imaginaria + "i");
        }
    }

    public String raiz2() {
        Double raiz;
        Double real, imaginaria;
        if (dis >= 0)
        {
            raiz = (-b - Math.sqrt(dis)) / (2 * a);
            return String.valueOf(raiz);
        } else
        {
            real = b / (2 * a);
            imaginaria = (Math.sqrt(-dis)) / (2 * a);
            return (real + " - " + imaginaria + "i");
        }
    }
}
