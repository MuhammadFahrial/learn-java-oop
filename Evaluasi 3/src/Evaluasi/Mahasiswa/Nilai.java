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
public class Nilai {

    public int getTugas1() {
        return tugas1;
    }

    public void setTugas1(int tugas1) {
        this.tugas1 = tugas1;
    }

    public int getTugas2() {
        return tugas2;
    }

    public void setTugas2(int tugas2) {
        this.tugas2 = tugas2;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getUas() {
        return uas;
    }

    public void setUas(int uas) {
        this.uas = uas;
    }
    private int tugas1, tugas2, mid, uas;
    
    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        
        nilai.setTugas1(40);
        nilai.setTugas2(60);
        nilai.setMid(70);
        nilai.setUas(80);
    }
}
