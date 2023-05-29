package day06;

public class Continue {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            if (i == 3) { // 3 ü yazdırmadan devam et demek
                continue;
            }
            System.out.print(i + "");
        }
        System.out.println("");
        System.err.println("İşlem tamam"); // Kırmızı renkli yapar en sonda kulllanılabilir
    }
}