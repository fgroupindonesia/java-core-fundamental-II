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
public class Restaurant extends KonsepToko implements Setoran {

    int bonusTunjangan = 100;

    @Override
    public void printoutSummary() {
        System.out.println("============================================");
        System.out.println("Ringkasan:");
        System.out.println("Saat ini Restaurant berlokasi di " + super.getLokasi());
        System.out.println("============================================");

        int totalGajiKaryawan = super.getGajiKaryawan() * super.getDaftarKaryawan().length;
        totalGajiKaryawan += (bonusTunjangan * super.getDaftarKaryawan().length);

        System.out.println("Jumlah Karyawan : " + super.getDaftarKaryawan().length);
        System.out.println("Gaji : " + super.getGajiKaryawan());
        System.out.println("Bonus : " + bonusTunjangan);
        System.out.println("============================================");
        System.out.println("Total Gaji Karyawan : " + totalGajiKaryawan);
        System.out.println("");

    }

    @Override
    public void prepare(int jumlahKaryawan, int gajiKaryawan, int jumlahHariBuka) {
        System.out.println("Persiapan....Restaurant");
        System.out.println("data karyawan " + jumlahKaryawan);
        System.out.println("gaji karyawan " + gajiKaryawan);

        super.siapkanKaryawan(jumlahKaryawan);
        super.setGajiKaryawan(gajiKaryawan);
        super.siapkanHariBuka(jumlahHariBuka);

        super.addHariBuka("senin");
        super.addHariBuka("selasa");
        super.addHariBuka("rabu");
        super.addHariBuka("kamis");
        super.addHariBuka("jumat");
        
    }

}
