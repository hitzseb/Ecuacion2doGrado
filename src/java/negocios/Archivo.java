/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocios;

import java.io.*;

/**
 *
 * @author Sebastian
 */
public class Archivo {

    File archivo;
    FileWriter fw;
    PrintWriter pw;

    public boolean guardarResultado(String a, String b, String c, String s1, String s2,
            String path) throws IOException {
        try
        {
            archivo = new File(path);
            fw = new FileWriter(archivo, true);
            pw = new PrintWriter(fw);
            pw.println("Resultado para a = " + a + ", b = " + b + ", c = " + c + " ==> Raiz 1: " + s1 + " Raiz 2:" + s2);
            return true;
        } catch (IOException e)
        {
            return false;
        } finally
        {
            fw.close();
        }
    }
}
