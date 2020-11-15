/*
 *  This is a Supplemental File from the Main Project used
 *  in Java Programming Core Fundamental II
 *  with FGroupIndonesia team.
 */
package sesi01;

/**
 *
 * @author ASUS
 */
public class Implementasi {
    public static void main(String[] args) {
        Laptop mesinPertama = new Laptop();
        mesinPertama.hidup();
        mesinPertama.setModel("Asus");
        
        Laptop mesinKedua =  new Laptop();
        mesinKedua.hidup();
        mesinKedua.setModel("Acer");
        
        Laptop mesinBaru2021 = new Laptop();
        mesinBaru2021.hidup();
        //mesinBaru2021.setModel("Sony");
        
        System.out.println("======================");
        System.out.println("Didapat 3 buah model ");
        System.out.println(mesinPertama.getModel());
        System.out.println(mesinKedua.getModel());
        System.out.println(mesinBaru2021.getModel());
    }
}
