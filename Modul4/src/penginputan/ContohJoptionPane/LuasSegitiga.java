/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginputan.ContohJoptionPane;

import javax.swing.JOptionPane;

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
        String a, t;
        int alas, tinggi;
        a = JOptionPane.showInputDialog("Masukkan Alas Segitiga: ");
        t = JOptionPane.showInputDialog("Masukkan Tinggi Segitiga: ");
        alas = Integer.parseInt(a);
        tinggi = Integer.parseInt(t);
        JOptionPane.showMessageDialog(null, ls.luas(alas, tinggi));
    }

}
