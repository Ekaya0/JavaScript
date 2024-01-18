import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler oluşturuldu
        int matematik, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfı tanımlandı
        Scanner input = new Scanner(System.in);

        //Kullanıcı değerleri alındı
        System.out.print("Matematik Notunuz :");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuzuz :");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz :");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz :");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz :");
        muzik = input.nextInt();

        // Sonuç kısmı yapıldı
        double sonuc = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Ortalamanız :" + sonuc);

        String gecer = (sonuc >= 60) ? "Sınıfı Geçti": "Sınıfta Kaldı";
        System.out.println(gecer);

    }
}