
package ntp_proje;


public class Customer extends People {
    private String aracinin_plakasi;
    
    public Customer(String adi, String soyadi, String bulundugu_otopark, String arac_plaka){
        super(adi,soyadi,bulundugu_otopark);
        this.aracinin_plakasi = arac_plaka;
    }

    public Customer() {
        super();
    }

    public void arac_ver(String arac_plaka){
        System.out.println(arac_plaka + "Plakalı aracı getirin");
    }

    public void setAracinin_plakasi(String aracinin_plakasi) {
        this.aracinin_plakasi = aracinin_plakasi;
    }
}
