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
public class KonsepToko {

    private Staff daftarKaryawan[];
    private String hariBuka[];
    private int saldoKeseluruhan;
    private int gajiKaryawan;
    private int totalPengeluaran;
    private int hariKe=0;
    private String lokasi;

    public void addHariBuka(String hari){
        hariBuka[hariKe] = hari;
        hariKe++;
    }
    
    public void siapkanHariBuka(int jumlah){
        hariBuka = new String[jumlah];
    }
    
    public void siapkanKaryawan(int jumlah){
        daftarKaryawan = new Staff[jumlah];
    }
    
    /**
     * @return the daftarKaryawan
     */
    public Staff[] getDaftarKaryawan() {
        return daftarKaryawan;
    }

    /**
     * @param daftarKaryawan the daftarKaryawan to set
     */
    public void setDaftarKaryawan(Staff[] daftarKaryawan) {
        this.daftarKaryawan = daftarKaryawan;
    }

    /**
     * @return the saldoKeseluruhan
     */
    public int getSaldoKeseluruhan() {
        return saldoKeseluruhan;
    }

    /**
     * @param saldoKeseluruhan the saldoKeseluruhan to set
     */
    public void setSaldoKeseluruhan(int saldoKeseluruhan) {
        this.saldoKeseluruhan = saldoKeseluruhan;
    }

    /**
     * @return the gajiKaryawan
     */
    public int getGajiKaryawan() {
        return gajiKaryawan;
    }

    /**
     * @param gajiKaryawan the gajiKaryawan to set
     */
    public void setGajiKaryawan(int gajiKaryawan) {
        this.gajiKaryawan = gajiKaryawan;
    }

    /**
     * @return the totalPengeluaran
     */
    public int getTotalPengeluaran() {
        return totalPengeluaran;
    }

    /**
     * @param totalPengeluaran the totalPengeluaran to set
     */
    public void setTotalPengeluaran(int totalPengeluaran) {
        this.totalPengeluaran = totalPengeluaran;
    }

    /**
     * @return the lokasi
     */
    public String getLokasi() {
        return lokasi;
    }

    /**
     * @param lokasi the lokasi to set
     */
    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    
    
    
}
