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
public class Manusia {

    private String nama;
    private String alamat;
    private String kelamin;
    private int tglLahir;
    private int blnLahir;
    private int thnLahir;
    private boolean sudahMenikah;
    private boolean keadaanMenganggur;

    public void setTTL(int tgl, int bln, int thn) {
        tglLahir = tgl;
        blnLahir = bln;
        setThnLahir(thn);
    }


    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the tglLahir
     */
    public int getTglLahir() {
        return tglLahir;
    }

    /**
     * @param tglLahir the tglLahir to set
     */
    public void setTglLahir(int tglLahir) {
        this.tglLahir = tglLahir;
    }

    /**
     * @return the blnLahir
     */
    public int getBlnLahir() {
        return blnLahir;
    }

    /**
     * @param blnLahir the blnLahir to set
     */
    public void setBlnLahir(int blnLahir) {
        this.blnLahir = blnLahir;
    }

    /**
     * @return the sudahMenikah
     */
    public boolean isSudahMenikah() {
        return sudahMenikah;
    }

    /**
     * @param sudahMenikah the sudahMenikah to set
     */
    public void setSudahMenikah(boolean sudahMenikah) {
        this.sudahMenikah = sudahMenikah;
    }

    /**
     * @return the keadaanMenganggur
     */
    public boolean isKeadaanMenganggur() {
        return keadaanMenganggur;
    }

    /**
     * @param keadaanMenganggur the keadaanMenganggur to set
     */
    public void setKeadaanMenganggur(boolean keadaanMenganggur) {
        this.keadaanMenganggur = keadaanMenganggur;
    }

    /**
     * @return the thnLahir
     */
    public int getThnLahir() {
        return thnLahir;
    }

    /**
     * @param thnLahir the thnLahir to set
     */
    public void setThnLahir(int thnLahir) {
        this.thnLahir = thnLahir;
    }

    /**
     * @return the kelamin
     */
    public String getKelamin() {
        return kelamin;
    }

    /**
     * @param kelamin the kelamin to set
     */
    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }

}
