/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utama;

import Abstract.InputNilai;
import Interface.InputDataPraktikan;
import Interface.ProsesNilaiPraktikum;
import java.util.Scanner;

/**
 *
 * @author Rial
 */
public class Utama extends InputNilai implements InputDataPraktikan, ProsesNilaiPraktikum {
    String nama, stb, praktikum;
    Scanner sc = new Scanner(System.in);

public Utama(){
    //Scanner sc = new Scanner();
}
//BUAT KONSTRUKTOR CLASS UTAMA YANG BERISI PEMBUATAN OBJEK DARI Scanner sc.
 
@Override
public void inputNilaiAcc(){
    System.out.println("Masukkan Nilai acc1 = ");
    acc1 = sc.nextInt();
    System.out.println("Masukkan Nilai acc2 = ");
    acc2 = sc.nextInt();
    System.out.println("Masukkan Nilai acc3 = ");
    acc3 = sc.nextInt();
    System.out.println("Masukkan Nilai acc4 = ");
    acc4 = sc.nextInt();    
}
 
@Override
public void inputNilaiUjian() {
    System.out.println("Masukkan Nilai MID = ");
    mid = sc.nextInt();
    System.out.println("Masukkan Nilai UAS = ");
    uas = sc.nextInt();
}
 
@Override
public void InputNamaStb() {
    System.out.println("Masukkan Nama = ");
    nama = sc.next();
    System.out.println("Masukkan Stambuk = ");
    stb = sc.next();
}
 
@Override
public void InputPraktikum() {
    System.out.println("Masukkan Nilai Praktikum = ");
    praktikum = sc.next();
}
 
@Override
public float nilaiTugas1() {
return (acc1 + acc2)/2;
}
 
@Override
public float nilaiTugas2() {
return (acc3 + acc4)/3;
}
 
@Override
public float nilaiAkhir(float tugas1, float tugas2, float mid, float uas) {
return (((tugas1 + tugas2)/2)*0.3f)+(mid*0.3f)+(uas*0.4f);
}
 
public static void main(String[] args) {
   Utama u = new Utama();
   u.InputNamaStb();
   u.InputPraktikum();
   u.inputNilaiAcc();
   u.inputNilaiUjian();
   float tugas1 = u.nilaiTugas1();
   float tugas2 = u.nilaiTugas2();
   float na = u.nilaiAkhir(tugas1, tugas2, u.mid, u.uas);
   System.out.println("Nilai Akhir : " + na);
}
}
