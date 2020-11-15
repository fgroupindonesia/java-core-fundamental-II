/*
 *  This is a Supplemental File from the Main Project used
 *  in Java Programming Core Fundamental II
 *  with FGroupIndonesia team.
 */
package sesi02.homework;

/**
 *
 * @author ASUS
 */
public class StandPameran extends KonsepToko implements Setoran {

    
    @Override
    public void printoutSummary() {
        
        int totalGajiKaryawan = super.getGajiKaryawan() *super.getDaftarKaryawan().length;
        
        System.out.println("============================================");
        System.out.println("Ringkasan:");
        System.out.println("Saat ini Stand Pameran berlokasi di " + super.getLokasi());      
        System.out.println("============================================");
        System.out.println("Jumlah Karyawan : " + super.getDaftarKaryawan().length);
        System.out.println("Gaji Tiap Karyawan : " + super.getGajiKaryawan());
        System.out.println("============================================");
        System.out.println("Total Gaji Karyawan : " + totalGajiKaryawan);
        System.out.println("");
        
    }

    @Override
    public void prepare(int jumlahKaryawan, int gajiKaryawan, int jumlahHariBuka) {
        
        System.out.println("Persiapan....StandPameran");
        System.out.println("data karyawan " + jumlahKaryawan);
        System.out.println("gaji karyawan " + gajiKaryawan);
        
       super.siapkanKaryawan(jumlahKaryawan);
       super.setGajiKaryawan(gajiKaryawan);
       super.siapkanHariBuka(jumlahHariBuka);
       
       super.addHariBuka("sabtu");
       super.addHariBuka("ahad");
       
       
    }
    
}
