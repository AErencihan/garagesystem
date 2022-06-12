
package ntp_proje;


public class DangerMaterial extends CarInfo {
    public int azami_yuk;
    public String tasinan_madde;

    public DangerMaterial(int arac_yasi,
                          String arac_marka,
                          String arac_model,
                          String arac_plaka,
                          float arac_uzunluk,
                          float arac_genislik,
                          float arac_yukseklik,
                          double arac_giris_zamani,
                          int azami_yuk,
                          String tasinan_madde) {
        super(arac_yasi, arac_marka, arac_model, arac_plaka, arac_uzunluk, arac_genislik, arac_yukseklik, arac_giris_zamani);
        this.azami_yuk = azami_yuk;
        this.tasinan_madde = tasinan_madde;
    }
}
