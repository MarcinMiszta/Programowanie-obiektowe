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

    }
}
