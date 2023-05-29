package day05;

import java.util.Scanner;

public class Q3_KelimeyiTersineCevir {
    // SORU:kullanıcıdan bir cümle veya kelime girmesini isteyip
    // girilen değeri tersine  yazdıran bir method oluşturun
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle ya da kelime girin");
        String kelime = scan.nextLine();
        System.out.println(terscevir(kelime));

    }//Main
    public static String terscevir(String word){
        String bosKova ="";

        for (int i = word.length(); i>=1; i--) {

            bosKova+=word.charAt(i-1);

        }

String reverseWord= bosKova;

        return reverseWord ;
    }

}
