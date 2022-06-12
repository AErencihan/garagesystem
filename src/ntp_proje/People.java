
package ntp_proje;


public class People {
    public String adi;
    public String soyadi;
    public String bulundugu_otopark;
     
    public People(String adi, String soyadi, String bulundugu_otopark){
        this.adi = adi;
        this.soyadi = soyadi;
        this.bulundugu_otopark = bulundugu_otopark;
    }

    public People() {
    }

    public void showInfos(){
        System.out.println("Adı : "+this.adi);
        System.out.println("Soyadı : "+this.soyadi);
        System.out.println("Bulunduğu Otopark : "+this.bulundugu_otopark);
    }
    public void selamver(){
        System.out.println("Selam !");
    }
}
