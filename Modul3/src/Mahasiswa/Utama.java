/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mahasiswa;

/**
 *
 * @author Rial
 */
public class Utama {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setStb("13020190027");
        mhs.setNama("Rial");
        System.out.println("Stb : " + mhs.getStb());
        System.out.println("Nama : " + mhs.getNama());
    }
}
