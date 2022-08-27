/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rial
 */
public class method {
    public void tampilNama(){ // Non Parameter
        System.out.println("Nama : A Muh Fahrial S");
        System.out.println("NIM : 13020190027");
    }
    
    public void tampilNama(String Alamat){ // berparameter
        System.out.println("Alamat : " +Alamat);
    }
    public static void main(String[] args) {
        method m = new method();
        m.tampilNama();
        m.tampilNama("Luwu");
        m.tampilNama("Kec. Bajo");
    }
}
