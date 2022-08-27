/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluasi.HitungNilai;

/**
 *
 * @author Rial
 */
public class HitungNilaiAkhir {
    double nilaiTugas(int tugas1,int tugas2){
        return tugas1+tugas2;
    }
    
    double nilaiAkhir(double tugas, int mid, int uas){
        return (tugas*0.4+mid*0.3+uas*0.3);
    }
}
