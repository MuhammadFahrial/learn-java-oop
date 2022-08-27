/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rial
 */
public class evaluasiII {
    String varGlobal = "Ini Variable Global";
    static public String varStatic;
    
    public evaluasiII(){
        System.out.println(this.varGlobal);
    }

    public static void main(String[] args) {
        String varLocal;
        varLocal = "Ini Variable Local";
        varStatic = "Ini variable Static";
        
        System.out.println(varLocal);
        evaluasiII e = new evaluasiII();
        System.out.println(varStatic);
        
    }
}
