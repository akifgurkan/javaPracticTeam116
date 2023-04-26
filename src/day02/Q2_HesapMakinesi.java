package day02;

import java.util.Scanner;

public class Q2_HesapMakinesi {

    /*
     * Kullanicidan iki tamsayi sayi ve islem cinsini alin
     * ve sayilari kullanicinin belirledigi isleme tabi tutup sonucu yazdirin.
     *
     * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
     *
     * Ornek : Inputs : sayilar : 18 , 10  islem : 3
     *         Output : 18 X 10 = 180
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Matematiksel işleme sokmak için iki tam sayı giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("İşlem Türünü Seciniz : \n \t1 : Toplama\n\t2 : Cıkarma \n \t3 : Carpma \n \t4 : Bolme");



        System.out.println("****************************** if Cozumu  ************************");

        int islem = scan.nextInt();

        if (islem==1) System.out.println("a+b");
        else if (islem==2) System.out.println("a-b");
        else if (islem==3) System.out.println("a*b");
        else if (islem==4) {
            if (b==0) System.out.println("0 a bölüm tanımsızdır");
           else System.out.println("a/b");
        }
        else System.out.println("Yanlış giriş yaptınız, Lütfen tekrar deneyiniz");

        System.out.println("*********************** if Cozumu  **********************");

        switch (islem){
            case 1: System.out.println("a+b"); break;

            case 2: System.out.println("a-b"); break;

            case 3: System.out.println("a*b"); break;

            case 4:  if (b==0) System.out.println("0 a bölüm tanımsızdır");

                     else System.out.println("a/b");
                     break;

            default: System.out.println("Yanlış giriş yaptınız, Lütfen tekrar deneyiniz");
        }




        }//Main
    }


