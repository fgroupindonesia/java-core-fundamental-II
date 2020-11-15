/*
 *  This is a Supplemental File from the Main Project used
 *  in Java Programming Core Fundamental II
 *  with FGroupIndonesia team.
 */
package sesi03.homework;

import java.io.File;
import java.util.Scanner;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

/**
 *
 * @author ASUS
 */
public class FutureRestoInteraktif {

    public void play(String mode) throws Exception {

        String filename = "src/sesi03/homework/audio/";

        if (mode.equalsIgnoreCase("selamat datang")) {
            System.out.println("Selamat Datang ke Sistem Informasi Future Resto");
            filename += "selamat-datang.wav";
        } else if (mode.equalsIgnoreCase("login")) {
            System.out.println("Silahkan Login");
            filename += "silahkan-login.wav";
        } else if (mode.equalsIgnoreCase("sukses")) {
            System.out.println("Login Berhasil");
            filename += "login-berhasil.wav";
        } else if (mode.equalsIgnoreCase("menu utama")) {
            System.out.println("Menu Utama");
            filename += "menu-utama.wav";
        } else if (mode.equalsIgnoreCase("salah")) {
            System.out.println("Maaf username & password anda salah!");
            filename += "maaf-username-password-anda-salah.wav";
        } else if (mode.equalsIgnoreCase("exit")) {
            System.out.println("System Exit");
            filename += "system-exit.wav";
        }

        File audioFile = new File(filename);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
        AudioFormat format = audioStream.getFormat();
        DataLine.Info info = new DataLine.Info(Clip.class, format);
        Clip audioClip = (Clip) AudioSystem.getLine(info);
        audioClip.open(audioStream);
        audioClip.start();
        Thread.sleep(3000);
        audioClip.close();

    }

    public boolean terimaInput() {
        boolean valid = false;

        Scanner bacaan = new Scanner(System.in);

        System.out.print(" - username : ");
        String masukan = bacaan.nextLine();

        System.out.print(" - password : ");
        String masukanLagi = bacaan.nextLine();

        if (masukan.equalsIgnoreCase("admin") && masukanLagi.equalsIgnoreCase("admin")) {
            valid = true;
        }

        return valid;

    }

    public static void main(String[] args) throws Exception {
        FutureRestoInteraktif latihan2 = new FutureRestoInteraktif();

        System.out.println("===========================");
        latihan2.play("selamat datang");
        latihan2.play("login");

        boolean akses = latihan2.terimaInput();

        if (akses) {
            latihan2.play("sukses");
            latihan2.play("menu utama");
        } else {
            latihan2.play("salah");
            latihan2.play("exit");
        }

        System.out.println("===========================");

    }
}
