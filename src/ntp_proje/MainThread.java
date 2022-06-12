
package ntp_proje;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class MainThread {
    public CarInfo arac;
    Map<String, CarInfo> aracBilgileriMap = new HashMap<>();


    public void aracGirisi(Scanner input) {


        System.out.println("Araç Ekleme İşlemi Seçildi ! ");

        System.out.println("Ekleyeceğiniz Aracın Markasını Giriniz : ");
        String arac_marka = input.next();

        System.out.println("Ekleyeceğiniz Aracın Modelini Giriniz : ");
        String arac_model = input.next();

        System.out.println("Ekleyeceğiniz Aracın Yaşını Giriniz : ");
        int arac_yasi = input.nextInt();

        System.out.println("Ekleyeceğiniz Aracın Plakasını Giriniz : ");
        String arac_plaka = input.next();

        customerKayıt(arac_plaka);

        System.out.println("Ekleyeceğiniz Aracın Uzunluğunu Giriniz : ");
        float arac_uzunluk = input.nextFloat();

        System.out.println("Ekleyeceğiniz Aracın Genişliğini Giriniz : ");
        float arac_genislik = input.nextFloat();

        System.out.println("Ekleyeceğiniz Aracın Yüksekliğini Giriniz : ");
        float arac_yukseklik = input.nextFloat();

        System.out.println("Ekleyeceğiniz Aracın Otoparka Giriş Zamanını Giriniz : ");
        double arac_giris_zamani = input.nextDouble();


        arac = CarInfo.builder()
                .withArac_genislik(arac_genislik)
                .withArac_yukseklik(arac_yukseklik)
                .withArac_marka(arac_marka)
                .withArac_giris_zamani(arac_giris_zamani)
                .withArac_model(arac_model)
                .withArac_yasi(arac_yasi)
                .withArac_plaka(arac_plaka)
                .withArac_uzunluk(arac_uzunluk)
                .build();

        //arac.showInfos();
        aracKayıt(arac);
        menuGoster();
    }

    public void customerKayıt(String plaka) {
        Customer customer = new Customer();
        customer.setAracinin_plakasi(plaka);
    }

    public void aracKayıt(CarInfo arac) {
        aracBilgileriMap.put(arac.arac_plaka, arac);
        ;
    }

    public void aracBilgileri() {
        Map<String, CarInfo> map = this.aracBilgileriMap;
        map.forEach((key, value) -> {
            System.out.println("Araç Plaka : " + key);
            System.out.println("Araç Marka : " + value.arac_marka);
        });
        menuGoster();
    }

    public void sil(Map<String, CarInfo> aracBilgileriMap, String plaka) {
        if (aracBilgileriMap.containsKey(plaka)) {
            aracBilgileriMap.remove(plaka);
            System.out.println("Araç Silindi !");
            this.aracBilgileriMap.forEach((key, value) -> {
                System.out.println("Araç Plaka : " + key);
                System.out.println("Araç Marka : " + value.arac_marka);
            });
            return;
        }
        System.out.println("Araç Bulunamadı !");
        menuGoster();
    }

    public void menuGoster() {
        System.out.println("1-Araç Ekle\n"
                + "2-Araç Sil\n"
                + "4-Araç Bilgileri\n"
                + "11-Çıkış"
        );

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int islem;
        System.out.println("Lütfen Yapmak İstediğiniz İşlemin numarasını seçiniz : ");
        islem = input.nextInt();

        if (islem == 1) {
            aracGirisi(input);
        } else if (islem == 2) {
            System.out.println("Silmek İstediğiniz Araç Plakasını Giriniz : ");
            String plaka = input.next();
            sil(this.aracBilgileriMap, plaka);
        } else if (islem == 4) {
            aracBilgileri();
        } else if (islem == 11) {
            String plaka = input.nextLine();
            CarGarage carGarage = new CarGarage();
            carGarage.cikis(this.aracBilgileriMap, plaka);
            menuGoster();
        }
    }

    public static void main(String[] args) {
        MainThread mainThread = new MainThread();
        mainThread.menuGoster();
    }

}
