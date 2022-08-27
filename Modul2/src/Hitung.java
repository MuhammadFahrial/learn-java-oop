/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rial
 */
public class Hitung {
    String nama, stb;
    
    public Hitung(){
        nama = "Rial";
        stb = "13020190027";
    }
    
   public float tambah (int nilai1,int nilai2){
        return nilai1+nilai2;
    }
    public float selisih (int nilai1,int nilai2){
        return nilai2-nilai1;
    }
    
    public float kali (int nilai1,int nilai2){
        return nilai1*nilai2;
    }
    
    public float bagi (int nilai1,int nilai2){
        return nilai1/nilai2;
    }
    
    public void tampilNama(){
        System.out.println("Nama : "+nama);
        System.out.println("Stb  : " +stb);
    }
    
    public static void main (String [] args){
        Hitung nilai = new Hitung();
        int nilai1,nilai2;
        nilai1=10;
        nilai2=5;
        String pilihan = "selisih"; //pilihan seperti "tambah","selisih","kali","bagi"
        if (pilihan.equals("tambah")){
            System.out.println(nilai1+ " + " +nilai2+ " = " +nilai.tambah(nilai1,nilai2));
        }else if (pilihan.equals("selisih")){
            System.out.println(nilai2+ " - " +nilai1+ " = " +nilai.selisih(nilai2,nilai1));        
        }else if (pilihan.equals("kali")){
            System.out.println(nilai1+ " * " +nilai2+ " = " + nilai.kali(nilai1,nilai2));
        }else if (pilihan.equals("bagi")){
            System.out.println(nilai1+ " / " +nilai2+ " = " +nilai.bagi(nilai1,nilai2));
        }else {
            System.out.println ("Tidak ada pilihan !");    
        }
        System.out.println ("--------------------------");
        nilai.tampilNama();
}
}