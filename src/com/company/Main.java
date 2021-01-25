package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int niewiadomo;
            int ilePracyWykonales;
            int stanKonta;
            int efektyPracyWBiurze;
            int efektyPracyWDomu;
            int efektyPorady;
            int kontynulowac = 0;

            Random random = new Random();
            niewiadomo = random.nextInt(10) +1;
            stanKonta = random.nextInt(250) + 1;
            ilePracyWykonales = niewiadomo;

            while (kontynulowac < 100) {

                System.out.println("Wybierz opcje!");
                System.out.println("1. Rozpocznij nowy dzień.");
                System.out.println("2. Rozpocznij prace w biurze.");
                System.out.println("3. Rozpocznij pracę w domu.");
                System.out.println("4. Skorzystaj z płatnej porady.");
                System.out.println("5. Sprawdź ile % zadania już wykonałeś.");
                System.out.println("6. Zobacz stan konta.");
                System.out.println("7. Sprawdź jaką dostałeś wypłatę za zadanie.");
                System.out.println("8. Rozpocznij kolejny dzień.");
                System.out.println("9. Zamknij program.");

                int opcja = scanner.nextInt();

                switch (opcja) {
                    case 1:
                        System.out.println("Rozpoczołeś kolejny dzień w pracy. Powodzenia!");
                        ilePracyWykonales = 0;
                        break;
                    case 2:
                        efektyPracyWBiurze = random.nextInt(100) +1;
                        System.out.println("W biurze zrobiłeś " + efektyPracyWBiurze + "% zadań.");
                        ilePracyWykonales += efektyPracyWBiurze;
                        break;
                    case 3:
                        efektyPracyWDomu = random.nextInt(40) + 1;
                        System.out.println("W domu zrobiłeś dodatkowe " + efektyPracyWDomu + "%");
                        ilePracyWykonales += efektyPracyWDomu;
                        break;
                    case 4:
                        if (stanKonta > 40) {
                            efektyPorady = random.nextInt(20) + 1;
                            System.out.println("Dzięki poradzie udało Ci się wykonać " + efektyPorady + "% zadania.");
                            ilePracyWykonales += efektyPorady;
                            stanKonta -= 40;
                        } else {
                            System.out.println("Nie stać ciebie na tą poradę");
                        }
                        break;
                    case 5:
                        System.out.println("Aktualnie wykonałeś " + ilePracyWykonales + "% zadania.");
                        break;
                    case 6:
                        System.out.println("Twój stan konta to: " + stanKonta + "zł.");
                        break;
                    case 7:
                        if (ilePracyWykonales <= 20) {
                            stanKonta -= 40;
                            System.out.println(stanKonta);
                            break;
                        } else if (ilePracyWykonales <= 40) {
                            stanKonta -= 20;
                            System.out.println(stanKonta);
                            break;
                        } else if (ilePracyWykonales <= 60) {
                            stanKonta += 10;
                            System.out.println(stanKonta);
                            break;
                        } else if (ilePracyWykonales <= 80) {
                            stanKonta += 30;
                            System.out.println(stanKonta);
                            break;
                        } else if (ilePracyWykonales <= 100) {
                            stanKonta += 50;
                            System.out.println(stanKonta);
                            break;
                        } else {
                            stanKonta += 100;
                            System.out.println(stanKonta);
                            break;
                        }
                    case 8:
                        kontynulowac = 150;
                        break;
                    default:
                        System.out.println("Wybierz poprawną liczbę!");
                }
            }
    }
}
