/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginputan.ContohBufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Rial
 */
public class LuasSegitiga {

    public double luas(int alas, int tinggi) {
        return (0.5 * alas * tinggi);
    }

    public static void main(String[] args) throws IOException {
        LuasSegitiga ls = new LuasSegitiga();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a, t;
        int alas, tinggi;
        System.out.print("Masukkan Alas Segitiga: ");
        a = bf.readLine();
        System.out.print("Masukkan Tinggi Segitiga: ");
        t = bf.readLine();
        alas = Integer.parseInt(a);
        tinggi = Integer.parseInt(t);
        System.out.println("Luas Segitiga : " + ls.luas(alas, tinggi));
    }
}
