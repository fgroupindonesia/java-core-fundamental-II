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
public class Masakan {
    private int hargaBahan;
    private boolean bisaTahan1Hari;
    private boolean wajibMasukKulkas;
    private String rasa;
    private String nama;

    public void setData(String namaNa, int hargaNa, String rasaNa){
        nama = namaNa;
        rasa = rasaNa;
        hargaBahan = hargaNa;
    }
    
    /**
     * @return the hargaBahan
     */
    public int getHargaBahan() {
        return hargaBahan;
    }

    /**
     * @param hargaBahan the hargaBahan to set
     */
    public void setHargaBahan(int hargaBahan) {
        this.hargaBahan = hargaBahan;
    }

    /**
     * @return the bisaTahan1Hari
     */
    public boolean isBisaTahan1Hari() {
        return bisaTahan1Hari;
    }

    /**
     * @param bisaTahan1Hari the bisaTahan1Hari to set
     */
    public void setBisaTahan1Hari(boolean bisaTahan1Hari) {
        this.bisaTahan1Hari = bisaTahan1Hari;
    }

    /**
     * @return the wajibMasukKulkas
     */
    public boolean isWajibMasukKulkas() {
        return wajibMasukKulkas;
    }

    /**
     * @param wajibMasukKulkas the wajibMasukKulkas to set
     */
    public void setWajibMasukKulkas(boolean wajibMasukKulkas) {
        this.wajibMasukKulkas = wajibMasukKulkas;
        if(wajibMasukKulkas==true)
        this.bisaTahan1Hari = wajibMasukKulkas;
    }

    /**
     * @return the rasa
     */
    public String getRasa() {
        return rasa;
    }

    /**
     * @param rasa the rasa to set
     */
    public void setRasa(String rasa) {
        this.rasa = rasa;
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
    
}
