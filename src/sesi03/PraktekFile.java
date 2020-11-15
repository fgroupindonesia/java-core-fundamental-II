/*
 *  This is a Supplemental File from the Main Project used
 *  in Java Programming Core Fundamental II
 *  with FGroupIndonesia team.
 */
package sesi03;

import java.io.File;
import sesi02.KebunBinatang;


/**
 *
 * @author ASUS
 */
public class PraktekFile {
    public static void main(String[] args) {
        
        File target = new File("xxasdasdasd");
        
        try{
        String satuan[] = target.list();
        
        for(String isi: satuan){
            System.out.println(isi);
        }
        
        } catch(Exception ex){
            System.out.println("folder tidak ditemukan...");
            System.out.println("Proses tetap berjalan.");
            
        }
        
        
    }        
        
        
    
}
