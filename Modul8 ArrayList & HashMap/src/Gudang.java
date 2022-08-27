
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rial
 */
public class Gudang {
    public static void main(String[] args) {
        ArrayList barang = new ArrayList();
        barang.add("Monitor");
        barang.add("Keyboard");
        barang.add("Meja");
        barang.remove("Meja");
        System.out.println(barang);
        System.out.println("Isi Gudang Sebanyak " + barang.size() + "item");
    }
}
