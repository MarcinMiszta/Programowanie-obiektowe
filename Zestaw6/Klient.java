import java.util.ArrayList;

public class Klient
{
    String imie;
    String nazwisko;
    ArrayList<Zamowienie> listaZamowien = new ArrayList<>();

    public void dodajZamowienie(Zamowienie zamowienie){
        this.listaZamowien.add(zamowienie);
    }
    public void wyswietlHistorieZamowien(){
        for(int i = 0; i < listaZamowien.size(); i++){
            System.out.println(i);
            listaZamowien.get(i).wyswietlZamowienie();
        }
    }
    public void wyswietlLacznyKosztZamowien(){
        double suma = 0;
        for(Zamowienie z : listaZamowien){
            suma += z.koszykZakupowy.obliczCalkowitaWartosc();
        }
        System.out.println("Łączny koszt zamówień: "+suma);
    }

    public Klient(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
}
