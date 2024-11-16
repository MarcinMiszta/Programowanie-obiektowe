public class kolokwium {
    public static void main(String[] args) {}
    public static boolean dokladnosc(double x, double y, double k) {
        double roznica = x - y;
        if (roznica < 0) {
            roznica *= -1;
        }
        return roznica <= Math.pow(10, -k);
    }

    public static double pierwiastek(double S,double n, double k) {
        double x = S + 1;
        double roznica;
        double xnplusjeden;
        do {
            xnplusjeden = (x*(n-1) + (S / Math.pow(x,n-1))) / n;
            roznica = x - xnplusjeden;
            if (roznica < 0) {
                roznica *= -1;
            }
            x = xnplusjeden;
        } while (roznica >= Math.pow(10, -k));
        return x;

    }
    public static int podciag(int[] tab){
        int dlugosc=0;
        int l=0;
        for(int i=0;i<tab.length-1;i++){
            if(tab[i]>tab[i+1]){
                if(l==0){
                    l+=2;
                }else {
                    l++;
                }
            }else {
                if(l>dlugosc) dlugosc=l;
                l=0;
            }
            if(l>dlugosc) dlugosc=l;
        }
        return dlugosc;
    }
    public static int podciag(int[] tab, int r){
        int dlugosc=0;
        int l=0;
        for(int i=0;i<tab.length-1;i++){
            if(tab[i]>tab[i+1]){
                if (tab[i]-tab[i+1] == r) {
                    if(l==0){
                        l+=2;
                    }
                    else l++;
                }else{
                    if(l>dlugosc) dlugosc=l;
                    l=0;
                }
                if(l>dlugosc) dlugosc=l;
            }
        }
        return dlugosc;
    }
    public static boolean czyPalindrom(int n){
        boolean palindrome = true;
        int a = n;
        int b=0;
        while(n>0){
            int cyfra = n%10;
            b=b*10+cyfra;
            n /=10;
        }
        if(a != b) palindrome = false;
        return palindrome;
    }
    public static void palindromLiczbowy(int m){
        int min = (int) (0.1*Math.pow(10,m));
        int max = (int) Math.pow(10,m)-1;
        for(int i=min;i<=max;i++){
            for(int j=min;j<=max;j++){
                int liczba = i*j;
                boolean palindrome = true;
                int a = liczba;
                int b=0;
                while(liczba>0){
                    int cyfra = liczba%10;
                    b=b*10+cyfra;
                    liczba /=10;
                }
                if(a != b) palindrome = false;
                if(palindrome) System.out.printf("%d x %d = %d \n", i, j, a);

            }
        }
    }
}
