
package ntp_proje;


public class Payment {
    public double cikis_suresi;
    
    public void kaldiginsure(double giris){
        double kaldigi_saat = (giris-this.cikis_suresi);
        System.out.println("Otoparkta kaldığınız süre : "+ kaldigi_saat);
    }
}
