import java.util.Scanner;

public class Main {
    static void plus() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        int number = input.nextInt();
        int result = 0;
        for (int i = 1; i <= number; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int calNumber = input.nextInt();
            result += calNumber;
        }
        System.out.println("Sonuç: " + result);
    }

    static void minus() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        int number = input.nextInt();
        int result = 0;
        for (int i = 1; i <= number; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int calNumber = input.nextInt();
            if (i == 1) {
                result += calNumber;
                continue;
            }

            result -= calNumber;
        }
        System.out.println("Sonuç: " + result);
    }

    static void times() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        int number = input.nextInt();
        int result = 1;
        for (int i = 1; i <= number; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int calNumber = input.nextInt();
            result *= calNumber;
        }
        System.out.println("Sonuç: " + result);
    }

    static void divide() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        int number = input.nextInt();
        double result = 0.0;
        for (int i = 1; i <= number; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int calNumber = input.nextInt();
            if (i != 1 && calNumber == 0) {
                System.out.println("Böleni 0 giremezsiniz!");
                continue;
            }
            if (i == 1) {
                result = calNumber;
                continue;
            }
            result /= calNumber;
        }
        System.out.println("Sonuç: " + result);
    }

    static void power() {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayıyı giriniz: ");
        int number1 = input.nextInt();
        System.out.print("Üs sayıyı giriniz: ");
        int number2 = input.nextInt();
        int result = 1;
        for (int i = 1; i <= number2; i++) {
            result *= number1;
        }
        System.out.println("Sonuç: " + result);
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int number = input.nextInt();
        int result = 1;
        for (int i = number; i > 0; i--) {
            result *= i;
        }
        System.out.println("Sonuç: " + result);
    }

    static void modula() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bölünen sayıyı giriniz: ");
        int number1 = input.nextInt();
        System.out.print("Bölen sayıyı giriniz: ");
        int number2 = input.nextInt();
        int result = number1 % number2;
        System.out.println("Kalan: " + result);
    }

    static void rectangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Uzun kenarı giriniz: ");
        int number1 = input.nextInt();
        System.out.print("Kısa kenarı giriniz: ");
        int number2 = input.nextInt();
        int perimeter = 2 * (number1 + number2);
        int area = number1 * number2;
        System.out.println("Dikdörtgenin çevresi: " + perimeter);
        System.out.println("Dikdörtgenin alanı: " + area);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = """
                1-Toplama İşlemi
                2-Çıkarma İşlemi
                3-Çarpma İşlemi
                4-Bölme İşlemi
                5-Üslü Sayı Hesaplama
                6-Faktoriyel Hesaplama
                7-Mod Alma
                8-Diktörgen Alan ve Çevre Hesabı
                0-Çıkış""";
        while (true) {
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz: ");
            select = input.nextInt();
            if (select == 0) {
                break;
            }

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modula();
                    break;
                case 8:
                    rectangle();
                    break;
            }
        }
    }
}