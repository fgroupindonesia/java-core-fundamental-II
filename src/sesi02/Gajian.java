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
public class Gajian extends Karyawan {

    private double gaji;
    
    @Override
    public double hitungGaji() {
        double cash;
        
        cash = gaji/52;
        // code process spesifik untuk kelas ini saja
        
        
        return cash;
    }
    
    
    
}
