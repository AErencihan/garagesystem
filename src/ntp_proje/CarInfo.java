
package ntp_proje;


public class CarInfo {
    private int arac_yasi;
    public String arac_marka;
    private String arac_model;
    public String arac_plaka;
    private float arac_uzunluk;
    private float arac_genislik;
    private float arac_yukseklik;
    private double arac_giris_zamani;
    
    public CarInfo(int arac_yasi, String arac_marka, String arac_model,
                   String arac_plaka, float arac_uzunluk,
                   float arac_genislik, float arac_yukseklik, double arac_giris_zamani){
        this.arac_yasi = arac_yasi;
        this.arac_marka = arac_marka;
        this.arac_model = arac_model;
        this.arac_plaka = arac_plaka;
        this.arac_uzunluk = arac_uzunluk;
        this.arac_genislik = arac_genislik;
        this.arac_yukseklik = arac_yukseklik;
        this.arac_giris_zamani = arac_giris_zamani;
    }
    public void showInfos(){
        System.out.println("Arabanın Yaşı : "+this.arac_yasi);
        System.out.println("Arabanın Markası : "+this.arac_marka);
        System.out.println("Arabanın Modeli : "+this.arac_model);
        System.out.println("Arabanın Plakası : "+this.arac_plaka);
        System.out.println("Arabanın Uzunluğu : "+this.arac_uzunluk);
        System.out.println("Arabanın Genişliği : "+this.arac_genislik);
        System.out.println("Arabanın Yüksekliği : "+this.arac_yukseklik);
        System.out.println("Arabanın Giriş Zamanı : "+this.arac_giris_zamani);
    }
    public void start(String arac_plaka){
        System.out.println(arac_plaka + "Plakalı araç çalıştı ! ");
    }
    public void stop(String arac_plaka){
        System.out.println(arac_plaka + "Plakalı araç Durdu ! ");
    }


    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        public int arac_yasi;
        public String arac_marka;
        public String arac_model;
        public String arac_plaka;
        public float arac_uzunluk;
        public float arac_genislik;
        public float arac_yukseklik;
        public double arac_giris_zamani;

        private Builder() {
        }

        public Builder withArac_yasi(int arac_yasi) {
            this.arac_yasi = arac_yasi;
            return this;
        }

        public Builder withArac_marka(String arac_marka) {
            this.arac_marka = arac_marka;
            return this;
        }

        public Builder withArac_model(String arac_model) {
            this.arac_model = arac_model;
            return this;
        }

        public Builder withArac_plaka(String arac_plaka) {
            this.arac_plaka = arac_plaka;
            return this;
        }

        public Builder withArac_uzunluk(float arac_uzunluk) {
            this.arac_uzunluk = arac_uzunluk;
            return this;
        }

        public Builder withArac_genislik(float arac_genislik) {
            this.arac_genislik = arac_genislik;
            return this;
        }

        public Builder withArac_yukseklik(float arac_yukseklik) {
            this.arac_yukseklik = arac_yukseklik;
            return this;
        }

        public Builder withArac_giris_zamani(double arac_giris_zamani) {
            this.arac_giris_zamani = arac_giris_zamani;
            return this;
        }

        public CarInfo build() {
            return new CarInfo(arac_yasi, arac_marka, arac_model, arac_plaka, arac_uzunluk, arac_genislik, arac_yukseklik, arac_giris_zamani);
        }
    }
}
