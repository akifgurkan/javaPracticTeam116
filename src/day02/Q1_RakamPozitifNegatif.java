package day02;

import java.util.Scanner;

public class Q1_RakamPozitifNegatif {
    public static void main(String[] args) {
        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.


        Scanner cicek = new Scanner(System.in);
        System.out.println("Lütfen bir sati giriniz");
        int sayi = cicek.nextInt();

        if (sayi>=0) {

            if (sayi < 10) System.out.println("Rakam");
            else System.out.println("Pozitif Sayi");

        }
            else System.out.println("Negatif sayi");


        System.out.println("**************  2.  Çözüm  Yöntemi   *************************");

        if (sayi>=0);


            else System.out.println("Pozitif Sayi");


         // Yukarısı wksik  *************************************

        System.out.println("***************   Ternary Cözümü   **************");

        boolean sart1 = sayi>=0;
        boolean sart2 = sayi<10;

        String sonuc = (sart1) ? ( sart2 )  ? "-Rakam" : "-Pozitif sayi: " : "-Negatif Sayi" ;

        System.out.println(sonuc);


    }
}
