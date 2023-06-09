package day07;

public class Q3_TopZiplatma {
    //Bir top belirli yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do
    // while code blogu create ediniz.
    public static void main(String[] args) {
        double yukseklik = 2.00; // Topun atıldığı yükseklik

        topuZiplat(yukseklik);

    }

    private static void topuZiplat(double yukseklik) {


        double topunToplamYolu = 0; // Topun toplam aldığı yol
        int yereVurmaSayisi = 0; // Topun yere vurma sayısı

        do {
            topunToplamYolu+=yukseklik;
            yereVurmaSayisi++;
            yukseklik*=0.75;
            topunToplamYolu+=yukseklik;

        }while (yukseklik>=1);
        System.out.println("Topun aldığı toplam yol ="+topunToplamYolu+"\nYere vurma sayısı= "+yereVurmaSayisi);

    }

}
