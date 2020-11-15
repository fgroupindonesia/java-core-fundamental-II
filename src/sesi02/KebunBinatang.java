/*
 *  This is a Supplemental File from the Main Project used
 *  in Java Programming Core Fundamental II
 *  with FGroupIndonesia team.
 */
package sesi02;

/**
 *
 * @author ASUS
 */
public class KebunBinatang {

    public KebunBinatang(String nama){
        System.out.println("Kebun binatang kota " + nama);
    }
    
    public KebunBinatang(String nama, int jumlahMaxPenunjung){
        System.out.println("Kebun Binatang kota " + nama + " dengan kapasitas " + jumlahMaxPenunjung);
    }
    
    public static void main(String[] args) {

        Mamalia hewan = new Mamalia();
        hewan.bergerak();
        hewan.makan();
        
        Mamalia hewanAnyar = new Mamalia();
        hewanAnyar.bergerak();
        
        // ok pemanggilan static
        hewanAnyar.jenisMamalia = "LIAR";
        hewan.jenisMamalia = "JINAK";
        
        // tidak boleh
        //Binatang.JENIS = "JINAK";
        //hewan.JENIS = "JINAK";
        
        System.out.println(hewanAnyar.jenisMamalia);

    }

}
