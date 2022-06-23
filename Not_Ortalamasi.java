import java.util.Scanner;

public class Not_Ortalamasi
{
    public static void main(String[] args)
    {
        float mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz => ");
        mat = input.nextFloat();

        System.out.println("Fizik notunuz => ");
        fizik = input.nextFloat();

        System.out.println("Kimya notunuz => ");
        kimya = input.nextFloat();

        System.out.println("Türkçe notunuz => ");
        turkce = input.nextFloat();

        System.out.println("Tarih notunuz => ");
        tarih = input.nextFloat();

        System.out.println("Müzik notunuz => ");
        muzik = input.nextFloat();

        float toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        float ortalama = toplam / 6;
        System.out.println("Ortalamanız = " + ortalama);
        System.out.println(ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    }
}
