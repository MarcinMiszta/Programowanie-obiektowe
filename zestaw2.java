import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class zestaw2 {
    public static void main(String[] args){
        System.out.println("1)");
        Object wynik1 = 23.0+76;
        Object wynik2 = 41*2.0+3;
        Object wynik3 = 5-33;
        Object wynik4 = 109%3;
        Object wynik5 = 50/2;
        Object wynik6 = 4|2;
        Object wynik7 = 3^5;
        Object wynik8 = 7&9;
        System.out.println(wynik1.getClass().getSimpleName());
        System.out.println(wynik2.getClass().getSimpleName());
        System.out.println(wynik3.getClass().getSimpleName());
        System.out.println(wynik4.getClass().getSimpleName());
        System.out.println(wynik5.getClass().getSimpleName());
        System.out.println(wynik6.getClass().getSimpleName());
        System.out.println(wynik7.getClass().getSimpleName());
        System.out.println(wynik8.getClass().getSimpleName());
        System.out.println("2)");
        double wynikDziałania = ((sqrt(7)-1)/2) + (pow(3,3))%2;
        int wynikDziałania2 = (int) wynikDziałania;
        System.out.println(wynikDziałania2);
        double wynikDziałania3 = 1999/(25*9);
        int wynikDziałania4 = (int) wynikDziałania3;
        System.out.println(wynikDziałania4);
        double wynikDziałania5 = (3+sqrt(3)/((sqrt(5)/2)/3))+1;
        int wynikDziałania6 = (int) wynikDziałania5;
        System.out.println(wynikDziałania6);
        double wynikDziałania7 = 130%100%16;
        int wynikDziałania8 = (int) wynikDziałania7;
        System.out.println(wynikDziałania8);
        String imie = "Marcin";
        String nazwisko = "Miszta";
        double wynikDziałania9 = (imie.length()%nazwisko.length()+1)/sqrt(2);
        int wynikDziałania10 = (int) wynikDziałania9;
        System.out.println(wynikDziałania10);
        System.out.println("3)");
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwsze słowo: ");
        String s1 = scan.nextLine();
        System.out.println("Podaj drugie słowo: ");
        String s2 = scan.nextLine();
        System.out.println(s1+" "+s2);
        System.out.println("4)");
        System.out.println("Podaj 1 liczbę: ");
        int l1 = scan.nextInt();
        System.out.println("Podaj 2 liczbę: ");
        int l2 = scan.nextInt();
        int suma = l1+l2;
        int roznica = l1-l2;
        int iloczyn = l1*l2;
        int iloraz = l1/l2;
        System.out.println("Suma: "+suma);
        System.out.println("Roznica: "+roznica);
        System.out.println("Iloczyn: "+iloczyn);
        System.out.println("Iloraz: "+iloraz);
        System.out.println("5)");
        int l3 = scan.nextInt();
        int l4 = l3+140;
        int l5 = l3-31;
        int l6 = l3*7;
        int l7 = l3/13;
        int l8 = l3%7;
        int l9 = l3/4;
        double l10 = pow(l3,45);







    }
}
