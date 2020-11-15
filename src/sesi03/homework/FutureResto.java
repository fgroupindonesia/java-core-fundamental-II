/*
 *  This is a Supplemental File from the Main Project used
 *  in Java Programming Core Fundamental II
 *  with FGroupIndonesia team.
 */
package sesi03.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class FutureResto {

    static String namaFolder;

    public static void buatFolder(String nama) throws Exception {
        File obj = new File(nama);
        obj.mkdir();

        namaFolder = nama;
    }

    public static void tulisData(String dataNya) throws Exception {
        File objF = new File(namaFolder + "/resep-masakan.log");
        FileWriter penulis = new FileWriter(objF, true);
        BufferedWriter buff = new BufferedWriter(penulis);

        buff.write(dataNya);
        buff.newLine();
        buff.close();

    }

    public static void main(String[] args) throws Exception {

        Scanner bacaan = new Scanner(System.in);

        System.out.println("==================== +-- START --+ ====================");
        System.out.print("Nama Masakan : ");
        String masukkan = bacaan.nextLine();

        buatFolder(masukkan);

        boolean tetepBaca = true;
        System.out.println("Input Resep Masakan : ");

        while (tetepBaca) {

            masukkan = bacaan.nextLine();

            if (masukkan.equalsIgnoreCase("q")) {
                tetepBaca = false;
            } else {
                tulisData(masukkan);
            }

        }

        System.out.println("\nWriting Data usai!");
        System.out.println("==================== +-- END --+ ====================");

    }

}
