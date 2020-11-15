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
public class Latihan2 {
    public static void main(String[] args) {
        System.out.println("============== System Dapur =================");
        System.out.println("Mencoba untuk logging...");
        
        User orang1 = new User();
        orang1.setData("admin", "", "akhi@gmail.com");
        orang1.setPayment(65000);
        
        Latihan2 mesin = new Latihan2();
        mesin.logging(orang1);
        
        User orang2 = new User();
        orang2.setData("general", "", "ikhwan@gmail.com");
        
        mesin.logging(orang2);
        
        Member orangLama = new Member();
        orangLama.setData("berry", "b2912", "berry@hotmail.com");
        orangLama.setMembership("3 bulan");
        orangLama.setKonsultasiLangsung(true);
        
        mesin.logging(orangLama);
        
    }
    
    public boolean logging(User user){
        
        System.out.println("---------------------");
        System.out.println("Mencoba logging untuk " + user.getUsername());
        System.out.println("loading....");
        
        boolean bolehMasuk = false;
        if(user.getPayment()==65000){
            System.out.println("Payment berhasil... boleh logging in!");
            bolehMasuk = true;
        }else{
            System.out.println("Payment tidak ditemukan... logging in batal!");
        }
        
        return bolehMasuk;
    }
}
