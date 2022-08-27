
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rial
 */
public class Mahasiswa {
    //HashMap
    public static void main(String[] args) {
        HashMap<Integer, String> name = new HashMap<>();
        name.put(1, "Rial");
        name.put(2, "Gilang");
        System.out.println("Isi Objek name = " + name);
        System.out.println("Asisten urut ke-2 " + name.get(2));
    }
}
