/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginputan.ContohScanner;

import java.util.Scanner;

/**
 *
 * @author Rial
 */
public class LuasSegitiga {

    public double luas(int alas, int tinggi) {
        return (0.5 * alas * tinggi);
    }

    public static void main(String[] args) {
        LuasSegitiga ls = new LuasSegitiga();
        int alas, tinggi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Alas Segitiga: ");
        alas = sc.nextInt();
        System.out.print("Masukkan Tinggi Segitiga: ");
        tinggi = sc.nextInt();
        System.out.println("Luas Segitiga : "+ls.luas(alas, tinggi));
    }
}
