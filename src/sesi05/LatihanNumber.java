/*
 *  This is a Supplemental File from the Main Project used
 *  in Java Programming Core Fundamental II
 *  with FGroupIndonesia team.
 */
package sesi05;

/**
 *
 * @author ASUS
 */
public class LatihanNumber {

    public static void main(String[] args) {

        short angka3DObject = 134;
        boolean statusAktif = true;

        float nilaiCash = 1234567f;

        double robot = 3e2;

        System.out.println("Test Nilai 3x10^2=" + robot);
        System.out.println("nilai Cash " + nilaiCash);

        double y = 9.78;
        int x = (int) y;

        Integer xx = x;
        short pendekX = xx.shortValue();

        boolean statusHidup = true;

        System.out.println("Nilai X ialah " + x);

        int angkaAwal = 9;
        int jawabAdik = (int) Math.pow(angkaAwal, 3);

        System.out.println(" Hasil \"pangkat\" 9^3=" + jawabAdik);
        System.out.println("\tHasil pangkat 9^3=" + jawabAdik);

        char simb = 's';
        
        System.out.println("Membesarkan " + Character.toUpperCase(simb));
        
    }
}
