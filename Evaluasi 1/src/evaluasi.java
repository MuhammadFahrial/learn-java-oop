/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rial
 */
public class evaluasi {
    String nama;
    String nim;
    public evaluasi(String inputNama, String inputNim ){
        nama = inputNama;
        nim = inputNim;        
    }
    public static void main(String[] args) {
        evaluasi e = new evaluasi("A Muh Fahrial S", "13020190027");
        System.out.println("Nama\t\t: " +e.nama);
        System.out.println("NIM\t\t: " +e.nim);
    }
}
