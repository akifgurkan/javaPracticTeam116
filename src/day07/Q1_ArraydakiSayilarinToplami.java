package day07;

import java.io.OptionalDataException;

public class Q1_ArraydakiSayilarinToplami {
    //Create an array of 5 floats and calculate their sum.
    // 5 değişkenlik bir dizi oluşturun ve toplamlarını hesaplayın.
    public static void main(String[] args) {

        // float [] numbers = new float[5];
        float[] numbers = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        float toplam = 0;

        System.out.println("****************** For Loop Cozumu *********************");
        for (int i = 0; i < numbers.length; i++) {
            toplam += numbers[i];
        }
        System.out.println("Toplam for loop :" + toplam);

        System.out.println("****************** While Loop Cozumu 1 *********************");
        toplam = 0;
        int i = 0;
        while (i < numbers.length) {
            toplam += numbers[i];
            i++;
        }
        System.out.println("Toplam while loop :" + toplam);

        System.out.println("****************** While Loop Cozumu 2 *********************");
        toplam = 0;
        int ind = numbers.length;// 5 yazdırır

        while (ind >0) {
            toplam += numbers[ind-1];
            ind--;
        }
        System.out.println("Toplam while loop :" + toplam);

        System.out.println("****************** While Loop Cozumu 3  *********************");
        toplam = 0;
        int index = numbers.length - 1;// 4 yazdırır

        while (index >= 0) {
            toplam += numbers[index];
            index--;
        }
        System.out.println("Toplam while loop :" + toplam);
    }//Main
}




