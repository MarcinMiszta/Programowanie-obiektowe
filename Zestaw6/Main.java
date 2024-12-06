
public class Main {
    public static void main(String[] args) {

        Produkt a = new Produkt("telefon",1000,42);
        Produkt ac = new Produkt("telefon 2",2000,2);
        Produkt b = new Produkt("laptop",9000,4);
        KoszykZakupowy k = new KoszykZakupowy();
        k.dodajProdukt(a,5);
        k.dodajProdukt(ac,1);
        k.dodajProdukt(b,2);
        KoszykZakupowy k2 = new KoszykZakupowy();
        k2.dodajProdukt(a,1);

        Zamowienie z = new Zamowienie(k, Zamowienie.statusy.Przyjete, new Platnosc(k.obliczCalkowitaWartosc(), "Nieopacone"));
        z.wyswietlZamowienie();
        z.wyswietlZamowienie();

        Zamowienie z2 = new Zamowienie(k2, Zamowienie.statusy.Przyjete, new Platnosc(k2.obliczCalkowitaWartosc(), "Nieopacone"));

        Klient klient = new Klient("Ferdek", "Kiepski");
        klient.dodajZamowienie(z);
        klient.dodajZamowienie(z2);
        klient.wyswietlHistorieZamowien();
        klient.wyswietlLacznyKosztZamowien();
        Sklep s = new Sklep();
        s.dodajProdukt(a);
        s.dodajProdukt(b);
        s.wyswietlOferty();
        s.dodajProdukt(ac);
        s.wyswietlOferty();
        s.zakupy(k2,b,21);
        System.out.println(s.wyszukajProduktu("laptop").nazwa);
        k2.wyswietlZawartosckoszyka();
        z.platnosc.zaplac();
        z.finalizujZamowienie();
        z.wyswietlZamowienie();
        z.zwrocProdukt(a,6);
    }
}