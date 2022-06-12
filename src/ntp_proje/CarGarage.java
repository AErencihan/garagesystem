
package ntp_proje;


import java.util.Map;

public final class CarGarage {
    public String otopark_adi;
    public String konumu;
    public int max_arac_sayisi;
    
    public CarGarage(String otopark_adi, String konumu, int max_arac_sayisi){
        this.otopark_adi = otopark_adi;
        this.konumu = konumu;
        this.max_arac_sayisi = max_arac_sayisi;
    }

    public CarGarage() {
    }

    public void showInfos(){
        System.out.println("Otopark Adı : "+this.otopark_adi);
        System.out.println("Otopark Konumu : "+this.konumu);
        System.out.println("Otopark Max_arac_sayisi : "+this.max_arac_sayisi);
    }

    public void cikis(Map<String, CarInfo> map, String plaka){
       if (map.containsKey(plaka)){
           map.remove(plaka);
           System.out.println("Çıkış Yapıldı");

           Worker worker = new Worker();
           worker.arac_getir(plaka);
       }
    }
}
