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
public class Member extends User {
    
    private String membership;
    private boolean konsultasiLangsung;

    /**
     * @return the membership
     */
    public String getMembership() {
        return membership;
    }

    /**
     * @param membership the membership to set
     */
    public void setMembership(String membership) {
        this.membership = membership;
        super.setPayment(65000);
    }

    /**
     * @return the konsultasiLangsung
     */
    public boolean isKonsultasiLangsung() {
        return konsultasiLangsung;
    }

    /**
     * @param konsultasiLangsung the konsultasiLangsung to set
     */
    public void setKonsultasiLangsung(boolean konsultasiLangsung) {
        this.konsultasiLangsung = konsultasiLangsung;
    }
    
}
