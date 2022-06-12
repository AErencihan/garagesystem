
package ntp_proje;


public class Worker extends People {
    
    public long tc_no;
    public char ehliyet_siniflari;
    public int sorumlu_oldugu_kat;
    
    public Worker(String adi, String soyadi, String bulundugu_otopark, long tc, char ehliyet, int sorumlu_old_kat){
        super(adi,soyadi,bulundugu_otopark);
        this.tc_no = tc;
        this.ehliyet_siniflari = ehliyet;
        this.sorumlu_oldugu_kat = sorumlu_old_kat;
    }

    public Worker() {
        super();
    }

    public void arac_park_et(String arac_plaka){
        System.out.println(arac_plaka + "Plakalı araç park ediliyor !");
    }
    public void arac_getir(String arac_plaka){
        System.out.println(arac_plaka + "Plakalı araç sahibine teslim ediliyor !");
    }
}
