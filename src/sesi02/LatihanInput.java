/*
 *  This is a Supplemental File from the Main Project used
 *  in Java Programming Core Fundamental II
 *  with FGroupIndonesia team.
 */
package sesi02;

import java.util.*;

/**
 *
 * @author ASUS
 */
public class LatihanInput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Namamu?  : ");
        String name = in.nextLine();
        
        System.out.print("Kode ?  : ");
        int nilaiAnda = in.nextInt();
        
        System.out.println("=================");
        
        System.out.println("Selamat datang " + name);
        System.out.println("Kode Anda " + nilaiAnda);
        in.close();

    }
}