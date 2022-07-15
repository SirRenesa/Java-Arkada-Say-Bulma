import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sayilari Giriniz");

        Scanner sayi1 = new Scanner(System.in);
        Scanner sayi2 = new Scanner(System.in);

        int insayi1 = sayi1.nextInt();
        int insayi2 = sayi2.nextInt();

        int bolenSayi1 = 0;
        int bolenSayi2 = 0;

        for (int i = insayi1 - 1; i > 0; i--) {

            if (insayi1 % i == 0) {
                bolenSayi1 = bolenSayi1 + i;
            }
        }

        for (int i = insayi2 - 1; i > 0; i--) {

            if (insayi2 % i == 0) {
                bolenSayi2 = bolenSayi2 + i;
            }
        }

        if (bolenSayi1 == insayi2 && bolenSayi2 == insayi1) {
            System.out.println("Sayilar Arkadastir.");
        } else {
            System.out.println("Sayilar Arkadas Degildir");
        }
    }
}