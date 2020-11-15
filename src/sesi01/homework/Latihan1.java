/*
 *  This is a Supplemental File from the Main Project used
 *  in Java Programming Core Fundamental II
 *  with FGroupIndonesia team.
 */
package sesi01.homework;

/**
 *
 * @author ASUS
 */
public class Latihan1 {

    public void memasak(Masakan objectMasak, Manusia chef) {

        System.out.println(chef.getNama() + " mulai akan memasak...");
        System.out.println("Checking dulu...");
        
        String status = null;

        if (objectMasak.getHargaBahan() <= 10000) {
            status = "aman";
            System.out.println("Tarif under 10.000 " + status + "!");
        } else {
            status = "bahaya";
            System.out.println("Tarif melebihi budget 10.000 " + status + "!");
        }

        String pesan = chef.getNama() + " akan mulai memasak " + objectMasak.getNama()
                + "\ndengan ..." + status;

        System.out.println(pesan);

    }

    public void bertemu(Manusia pria, Manusia wanita) {

        System.out.println("Setelah bertemu...");
        System.out.println("Antara " + pria.getNama() + " dan " + wanita.getNama());
        System.out.println("Apakah akan membuka bisnis katering bersama...?");

        if (pria.getKelamin().equalsIgnoreCase("pria") && wanita.getKelamin().equalsIgnoreCase("wanita")) {
            System.out.println("Sedang di check....");

            if (pria.getThnLahir() >= wanita.getThnLahir()) {
                System.out.println("Mungkin bisa dikomunikasikan...");
            } else {
                System.out.println("Tidak dulu...");
            }

        }else{
            System.out.println("Tidak perlu dipertimbangkan...");
        }

    }

    public static void main(String[] args) {
        System.out.println("======================");
        System.out.println("Persiapan 2orang siap!");
        
        Manusia orang1 = new Manusia();
        orang1.setKelamin("pria");
        orang1.setNama("udin");
        orang1.setAlamat("jakarta");
        orang1.setTglLahir(01);
        orang1.setBlnLahir(11);
        orang1.setThnLahir(1988);
        orang1.setKeadaanMenganggur(false);
        orang1.setSudahMenikah(true);

        Manusia orang2 = new Manusia();
        orang2.setKelamin("wanita");
        orang2.setNama("mirna");
        orang2.setAlamat("tangerang");
        orang2.setTTL(20, 10, 1987);
        orang2.setKeadaanMenganggur(false);
        orang2.setSudahMenikah(false);

        Masakan menu1 = new Masakan();
        menu1.setData("ikan bakar", 15000, "pedas");
        menu1.setWajibMasukKulkas(true);

        Masakan menu2 = new Masakan();
        menu2.setData("bala-bala", 6000, "asin");
        menu2.setBisaTahan1Hari(true);

        System.out.println("Dan 2Menu makanan siap!");
        System.out.println("=========================");
        
        Latihan1 eksekusi = new Latihan1();
        eksekusi.bertemu(orang1, orang2);
        
        System.out.println("======================");

        eksekusi.memasak(menu1, orang1);
        System.out.println("======================");
        eksekusi.memasak(menu2, orang2);
        System.out.println("=========== System done! =========");
    }
}
