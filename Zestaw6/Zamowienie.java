import java.util.Objects;

public class Zamowienie {
    KoszykZakupowy koszykZakupowy;
    public enum statusy{
        Przyjete,
        Realizacja,
        GotoweDoWysyłki,
        Wyslane,
        Dostarczone
    }
    statusy status;
    Platnosc platnosc;

    public void ustawStatusZamowienia(statusy status){
        this.status = status;
    }
    public void wyswietlZamowienie(){
        koszykZakupowy.wyswietlZawartosckoszyka();
        System.out.println("Status: " + status);
    }
    public void finalizujZamowienie(){
        if(Objects.equals(platnosc.statusPlatnosci, "Opłacone")) this.ustawStatusZamowienia(statusy.GotoweDoWysyłki);
    }
    public void zwrocProdukt(Produkt produkt, int ilosc){
        produkt.dodajDoMagazynu(ilosc);
        koszykZakupowy.usunProdukt(produkt.nazwa);
        System.out.println(koszykZakupowy.obliczCalkowitaWartosc());
    }

    public Zamowienie(KoszykZakupowy kps, statusy status, Platnosc platnosc) {
        this.koszykZakupowy = kps;
        this.status = status;
        this.platnosc=platnosc;
    }
}
