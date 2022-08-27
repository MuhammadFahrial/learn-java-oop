/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rial
 */
public class Utama {
    public static void main(String[] args) {
        Segitiga s3 = new Segitiga();
        s3.setBangundatar("Segitiga");
        s3.setJumlahsisi(3);
        s3.alas = 6;
        s3.tinggi = 4;
        s3.setLuas(0.5*s3.alas*s3.tinggi);
        s3.Luas();
        
        Persegi segi = new Persegi();
        segi.setBangundatar("Persegi");
        segi.sisi = 5;
        segi.setLuas(segi.sisi*segi.sisi);
        segi.setKeliling(4 * segi.sisi);
        segi.Luas();
        segi.Keliling();
    }
}
