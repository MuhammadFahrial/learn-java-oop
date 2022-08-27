/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluasi.Mahasiswa;

/**
 *
 * @author Rial
 */
public class Identitas {

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStambuk() {
        return stambuk;
    }

    public void setStambuk(String stambuk) {
        this.stambuk = stambuk;
    }
    private String nama;
    private String stambuk;
    
    public static void main(String[] args) {
        Identitas i = new Identitas();
        i.setNama("A Muh Fahrial S");
        i.setStambuk("13020190027");
    }
}
