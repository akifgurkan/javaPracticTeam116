package day07;

import java.util.Arrays;

public class Q2_Menü {
    // create 2D array of food:
    // print all the foods sorted
        /*
        steak
        hot dog
        cheeseburger
        -----------------------
        pizza
        pasta
        canoli
        -----------------------
        sushi
        ramen
        fried rice
        dumplings
        -----------------------
        kebab
        manto
        -----------------------
        beriyani
        masal
        curry
        chicken tikka masala
        -----------------------
        */
    public static void main(String[] args) {

        String[][] food = {{"steak", "hot dog", "cheeseburger" }, {"pizza", "pasta", "canoli" },
                {"sushi", "ramen", "fried rice", "dumplings" }, {"kebab", "manto" },
                {"beriyani", "masal", "curry", "chicken tikka masala" }};

        for (String[] ulkeler : food) {
            for (String yemek : ulkeler) {
                System.out.println(yemek);
            }
            System.out.println("--------------------------------------");
        }
        for (int i = 0; i < food.length; i++) {
            for (int j = 0; j < food[i].length; j++) {
                System.out.println(food[i][j]);
            }
            System.out.println("---------------------------------------");
        }

    }//main
}
