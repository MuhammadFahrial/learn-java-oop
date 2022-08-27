/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author Rial
 */
public abstract class InputNilai {
   public int acc1, acc2, acc3, acc4, mid, uas;
   public abstract void inputNilaiAcc();
   public abstract void inputNilaiUjian();
   public void tampilNilai() {
   System.out.println("Nilai Acc1 : " + acc1);
   System.out.println("Nilai Acc2 : " + acc2);
   System.out.println("Nilai Acc3 : " + acc3);
   System.out.println("Nilai Acc4 : " + acc4);
   System.out.println("Nilai MID : " + mid);
   System.out.println("Nilai Final : " + uas);
 }
}
