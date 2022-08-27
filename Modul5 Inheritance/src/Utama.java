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
    public static void main (String[] args) {
        BangunDatar bangun = new BangunDatar();
        bangun.Info();
        
        Segitiga s3 = new Segitiga();
        s3.bangundatar = "Segitiga";
        s3.jumlahsisi = 3;
        s3.alas=6;
        s3.tinggi=4;
        s3.luas=(0.5*s3.alas*s3.tinggi);
        s3.Luas();
        s3.Info();
        
        Persegi segi = new Persegi();
        segi.bangundatar = "Persegi";
        segi.sisi=4;
        segi.luas=segi.sisi*segi.sisi;
        segi.keliling=4*segi.sisi;
        segi.Luas();
        segi.Keliling();
        segi.Info();

    } 
}
