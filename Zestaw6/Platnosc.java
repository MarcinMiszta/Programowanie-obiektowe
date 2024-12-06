public class Platnosc {
    double Kwota;
    String statusPlatnosci;

    public void zaplac(){
        this.statusPlatnosci = "Opłacone";
        this.Kwota = 0;
    }

    public Platnosc(double Kwota, String status) {
        this.Kwota = Kwota;
        this.statusPlatnosci = status;
    }
}
