/*
 *  This is a Supplemental File from the Main Project used
 *  in Java Programming Core Fundamental II
 *  with FGroupIndonesia team.
 */
package sesi06;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author ASUS
 */
public class PraktekThread extends Thread {

    JProgressBar jprog;
    JLabel jtext;
    int n;
    int tahap;
    int time;

    public PraktekThread(int no, JLabel jl, JProgressBar jbar) {
        jtext = jl;
        jprog = jbar;
        n = no;
    }

    public void setJeda(int nilai) {
        time = nilai * 1000;
    }

    synchronized public void update(int nilai) {
        jprog.setValue(nilai);
        jtext.setText("Thread " + n + " : " + nilai);
    }

    public void run() {

        try {

            for (tahap = 0; tahap < 100; tahap++) {
                update(tahap);
                Thread.sleep(time);

                if (n == 2 && tahap == 5) {
                    Thread.sleep(time * 5);
                }

            }

        } catch (Exception e) {
            jtext.setText("Thread " + n + " terbangunkan...!");
            jprog.setValue(0);
        }

    }

}
