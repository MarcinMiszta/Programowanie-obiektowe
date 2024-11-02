import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

public class zestaw3 {
    public static void main(String[] args) {
        trojkiPitagorejskie(40);
        //funKwaRozwiazania(40);
        //funKwaDelta(40);
        //liczbyPierwsze(20);
        //liczbyPodzielne(4,6);
        //piramida(5,1);
        //silnia(6);
        //silniaPodwojna(4);
        //silnia(4,5);
        //dwumianNewtona(5,3);
        //ciagFibonacciego(6);
        //cw12();
        //czyPalindrom("kamilslimak");
        //trojkatPascala(4);
        //czyPalindrom(4004);
        //czyDoskonala(8128);
        //czyPierwsza(793697231);
        //NWD(60,45);
        //wczytajTablice();
        int[] tab={1,3,45,6,34,23,5};
        //podzbiory(tab);
    }

    public static void trojkiPitagorejskie(int n)
    {
        for (int i = 1; i <= n; i++) {
            int kwadrat1 = i * i;
            for (int j = i + 1; j < n; j++) {
                int kwadrat2 = j * j;
                for (int k = j + 1; k < n; k++) {
                    int kwadrat3 = k * k;
                    if (kwadrat1 + kwadrat2 == kwadrat3) {
                        System.out.printf("Liczby %d, %d, %d to trójki pitagorejskie\n", i, j, k);
                    }
                }
            }
        }


    }

    public static void funKwaRozwiazania(int n)
    {
        //delta=b^2-4ac
        //ax^2+bx+c
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int bkwadrat = j * j;
                    int ac4 = i * k * 4;
                    if (bkwadrat - ac4 >= 1) {
                        System.out.printf("Funkcja %d x^2+ %d x+ %d ma rozwiazanie\n", i, j, k);
                    }
                }
            }
        }
    }

    public static void funKwaDelta(int n) {
        //delta=b^2-4ac
        //ax^2+bx+c
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int bkwadrat = j * j;
                    int ac4 = i * k * 4;
                    int delta = bkwadrat - ac4;
                    double pdelta = sqrt(delta);
                    if (sqrt(pdelta) % 2 == 0) {
                        System.out.printf("%d, %d, %d\n", i, j, k);
                    }
                }
            }
        }
    }

    public static void liczbyPierwsze(int n) {
        for (int i = 2; i < n; i++) {
            boolean liczbaPierwsza = true;
            for (int j = 2; j <= sqrt(i); j++) {
                if (i % j == 0) {
                    liczbaPierwsza = false;
                    break;
                }
            }
            if (liczbaPierwsza) {
                System.out.println(i);
            }
        }

    }

    public static void liczbyPodzielne(int m,int n) {
        int max = (int) (pow(10, m));
        int min = (int) pow(10, m - 1);
        for (int i = min; i < max; i++) {
            if (i % n == 0) {
                System.out.printf("%d jest podzielne przez %d\n", i, n);
            }
        }

    }

    public static void piramida(int n,int variant) {
        switch (variant) {
            case 1:
                for (int i = 0; i < n; i++) {
                    if (i != 0) System.out.println();
                    for (int j = n - i; j > 1; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k <= i; k++) {
                        System.out.print("* ");
                    }

                }
                break;
            case 2:
                for (int i = n; i > 0; i--) {
                    System.out.println();
                    for (int j = n - i; j > 0; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < i; k++) {
                        System.out.print("* ");
                    }

                }
        }

    }

    public static void silnia(int n) {
        int wynik = 1;
        for (int i = 1; i <= n; i++) {
            wynik *= i;
        }
        System.out.printf("Silnia z %d to %d ", n, wynik);

    }

    public static void silniaPodwojna(int n) {
        int wynik = 1;
        if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) {
                wynik *= i;
            }
        } else {
            for (int i = 1; i <= n; i += 2) {
                wynik *= i;
            }
        }
        System.out.printf("Podwójna silnia z %d to %d ", n, wynik);

    }

    public static void silnia(int m,int n) {
        int wynik = 1;
        if (n % m == 0) {
            for (int i = m; i <= n; i += m) {
                wynik *= i;
            }
        }
        if (n % m != 0) {
            for (int i = n % m; i <= n; i += m) {
                if (i < m) continue;
                wynik *= i;
            }
        }
        System.out.printf("Silnia stopnia %d z %d to %d ", m, n, wynik);

    }

    public static void dwumianNewtona(int n,int k) {
        class silnia {
            public static long oblicz(int x) {
                long wynik = 1;
                for (int i = 1; i <= x; i++) {
                    wynik *= i;
                }
                return wynik;
            }
        }
        long wynik = silnia.oblicz(n) / (silnia.oblicz(k) * (silnia.oblicz(n - k)));

        System.out.printf("Dwumian Newtona k=%d z n=%d to %d ", k, n, wynik);

    }

    public static void ciagFibonacciego(int n)
    {
        int wynik = 0;
        int number = 1;
        for (int i = 0; i < n; i++) {
            int previousNumber = wynik;
            wynik += number;
            number = previousNumber;
        }
        System.out.printf("n=%d wyraz ciągu Fibonacciego to %d.", n, wynik);

    }

    public static void cw12() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = scan.nextInt();
        class obliczenia {
            public static int sumaNaturalnych(int n) {
                int suma = 0;
                for (int i = 1; i <= n; i++) {
                    suma += i;
                }
                return suma;
            }


            public static int sumaParzystych(int n) {
                int suma = 0;
                for (int i = 1; i <= n; i++) {
                    suma += 2 * i;
                }
                return suma;
            }


            public static int sumaNieparzystych(int n) {
                int suma = 0;
                for (int i = 0; i < n; i++) {
                    suma += 2 * i + 1;
                }
                return suma;
            }


            public static int sumaKwaNaturalnych(int n) {
                int suma = 0;
                for (int i = 1; i <= n; i++) {
                    suma += i * i;
                }
                return suma;
            }


            public static int sumaSzeNaturalnych(int n) {
                int suma = 0;
                for (int i = 1; i <= n; i++) {
                    suma += i * i * i;
                }
                return suma;
            }


            public static double sumaOdwNaturalnych(int n) {
                double suma = 0.0;
                for (int i = 1; i <= n; i++) {
                    suma += 1.0 / i;
                }
                return suma;
            }
        }
        System.out.printf("Suma %d liczb naturalnych: %d%n", n, obliczenia.sumaNaturalnych(n));
        System.out.printf("Suma %d liczb parzystych: %d%n", n, obliczenia.sumaParzystych(n));
        System.out.printf("Suma %d liczb nieparzystych: %d%n", n, obliczenia.sumaNieparzystych(n));
        System.out.printf("Suma %d kwadratów liczb naturalnych: %d%n", n, obliczenia.sumaKwaNaturalnych(n));
        System.out.printf("Suma %d sześcianów liczb naturalnych: %d%n", n, obliczenia.sumaSzeNaturalnych(n));
        System.out.printf("Suma %d odwrotności liczb naturalnych: %.4f%n", n, obliczenia.sumaOdwNaturalnych(n));
    }

    public static boolean czyPalindrom(String wyraz) {
        int wyrazL = wyraz.length();
        boolean palindrome = true;
        for (int i = 0; i < wyrazL / 2; i++) {
            if (wyraz.charAt(i) != wyraz.charAt(wyrazL - i - 1)) {
                palindrome = false;
            }
        }
        System.out.println(palindrome);
        return palindrome;
    }

    public static void trojkatPascala(int n) {
        int[][] trojkat = new int[n][n];

        for (int i = 0; i < n; i++) {
            trojkat[i][0] = 1;
            trojkat[i][i] = 1;
            for (int j = 1; j < i; j++) {
                trojkat[i][j] = trojkat[i - 1][j - 1] + trojkat[i - 1][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(trojkat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean czyPalindrom(int n) {
        boolean palindrome = true;
        int l1 = n;
        int l2 = 0;

        while (n > 0) {
            int cyfra = n % 10;
            l2 = l2 * 10 + cyfra;
            n /= 10;
        }
        if (l1 != l2) palindrome = false;
        System.out.println(palindrome);
        return palindrome;
    }

    public static boolean czyDoskonala(int n) {
        boolean doskonala = true;
        int[] dzielniki = new int[n];
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                dzielniki[i] = i;
            }
        }
        int suma = 0;
        for (int j : dzielniki) {
            suma += dzielniki[j];
        }
        if (suma != n) doskonala = false;
        System.out.println(doskonala);
        return doskonala;
    }

    public static boolean czyPierwsza(int n) {
        boolean pierwsza = true;
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                pierwsza = false;
                break;
            }
        }
        System.out.println(pierwsza);
        return pierwsza;
    }

    public static void NWD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }

    public static int[] wczytajTablice() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = scan.nextInt();
        int[] tablica = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj liczbe: ");
            tablica[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(tablica));
        return tablica;
    }

    public static void podzbiory(int[] tab) {
        int n = tab.length;
        int liczbaPodzbiorow = 1 << n;

        System.out.println("Podzbiory tablicy " + Arrays.toString(tab) + ":");
        for (int i = 0; i < liczbaPodzbiorow; i++) {
            System.out.print("{ ");
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    System.out.print(tab[j] + " ");
                }
            }
            System.out.println("}");
        }
    }


}