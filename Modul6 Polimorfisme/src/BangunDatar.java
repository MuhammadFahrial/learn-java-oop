/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rial
 */
public class BangunDatar {
    private int jumlahsisi;
    private double luas, keliling;
    private String bangundatar;    
    public void setJumlahsisi(int jumlahsisi){
        this.jumlahsisi = jumlahsisi;
    }   
    public int getJumlahsisi(){
        return jumlahsisi;
    }    
    public void setLuas(double luas){
        this.luas = luas;
    }    
    public double getLuas(){
        return luas;
    } 
    public void setKeliling(double keliling){
        this.keliling = keliling;
    }
    public double getKeliling(){
        return keliling;
    }   
    public void setBangundatar(String bangundatar){
        this.bangundatar = bangundatar;
    }   
    public String getBangundatar(){
        return bangundatar;
    }   
    void info(){
        System.out.println("Ini bangun datar");
    }   
    void Luas(){
        System.out.println("Luas Persegi : " + luas);
    }    
    void Keliling() {
        System.out.println("Luas "+bangundatar+" = "+keliling);
    }    
    void Luas(int sisi) {
        luas = sisi*sisi;
        System.out.println("Luas persegi : " + luas);
    }    
    void Luas(int a, int t){
        luas = a*t*0.5;
        System.out.println("Luas Segitiga : " + luas);
    }
}
