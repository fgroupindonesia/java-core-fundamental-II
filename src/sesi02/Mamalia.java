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
public class Mamalia implements Binatang{

    static String jenisMamalia;
    
    @Override
    public void bergerak() {
        System.out.println("mamalia mulai bergerak...");
    }

    @Override
    public void makan() {
        System.out.println("mamalia mulai memakan sesuatu...");
    }
    
}
