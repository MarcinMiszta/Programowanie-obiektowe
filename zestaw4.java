import java.util.Arrays;
import java.util.Random;

public class zestaw4
{
    public static void main(String[] args) {
        //zadanie1
        //System.out.println(Arrays.toString(generujTablice(7,1,13)));
        //zadanie2
        //wypisztablice(generujTablice(5,1,5), 3,3);
        //zadanie3
        int[] tab=generujTablice(8,-2,5);
        int[] tab2=generujZakres(8,-2,5);
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(tab2));
        //ileNieparzystych(tab);
        //ileNieparzystych(tab);
        //ileParzystych(tab);
        //ileDodatnich(tab);
        //ileUjemnych(tab);
        //ileZerowych(tab);
        //ileMaksymalnych(tab);
        //ileMinimalnych(tab);
        //ileUnikalnych(tab);
        //sumaDodatnich(tab);
        //sumaUjemnych(tab);
        //sumaOdwrotnosci(tab);
        //sredniaArytmetyczna(tab);
        //sredniaGeometryczna(tab);
        //sredniaHarmoniczna(tab);
        //funkcjaLiniowa(tab,2,1);
        //funkcjaKwadratowa(tab,2,1,5);
        //funkcjaWykladnicza(tab,2);
        //funkcjaSignum(tab);
        //najdluzszyCiagDodatnich(tab);
        //najdluzszyCiagUjemnych(tab);
        //odwrocTablice(tab);
        //odwrocTablice2(tab,2,6);

    }

    public static int[] generujTablice(int n, int minWartosc, int maxWartosc){
        int[] tab = new  int[n];
        Random rand = new Random();
        for(int i=0;i<n;i++){
            tab[i]=rand.nextInt(maxWartosc-minWartosc+1)+minWartosc;
        }

        return tab;
    }
    public static void wypisztablice(int[] tab,int n,int m){
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                int index= i*m+j;
                if(index<tab.length){
                    System.out.printf("%5d",tab[index]);
                }else {
                    System.out.printf("%5d",0);
                }
            }
            System.out.println();
        }

    }
    public static void ileNieparzystych(int[] tab){
        int count=0;
        for(int i : tab){
            if(i%2!=0) count++;
        }
        System.out.printf("Liczba nieparzystych: %d", count);
    }
    public static void ileParzystych(int[] tab){
        int count=0;
        for(int i : tab){
            if(i%2==0) count++;
        }
        System.out.printf("Liczba parzystych: %d", count);
    }
    public static void ileDodatnich(int[] tab){
        int count=0;
        for(int i : tab){
            if(i>0) count++;
        }
        System.out.printf("Liczba dodatnich: %d", count);
    }
    public static void ileUjemnych(int[] tab){
        int count=0;
        for(int i : tab){
            if(i<0) count++;
        }
        System.out.printf("Liczba ujemnych: %d", count);
    }
    public static void ileZerowych(int[] tab){
        int count=0;
        for(int i : tab){
            if(i==0) count++;
        }
        System.out.printf("Liczba zerowych: %d", count);
    }
    public static void ileMaksymalnych(int[] tab){
        int count=0;
        int max=tab[0];
        for(int i : tab){
            if(i>max) max=i;
        }
        for(int j :tab){
            if(j==max) count++;
        }
        System.out.printf("Liczba maksymalnych: %d", count);
    }
    public static void ileMinimalnych(int[] tab){
        int count=0;
        int min=tab[0];
        for(int i : tab){
            if(i<min) min=i;
        }
        for(int j :tab){
            if(j==min) count++;
        }
        System.out.printf("Liczba minimalnych: %d", count);
    }
    public static void ileUnikalnych(int[] tab){
        int count=0;
        for(int i : tab){
            int check=0;
            for(int j :tab){
                if(i==j) check++;
            }
            if(check==1) count++;
        }

        System.out.printf("Liczba unikalnych: %d", count);
    }
    public static void sumaDodatnich(int[] tab){
        int sum=0;
        for(int i:tab){
            if (i>0) sum+=i;
        }
        System.out.printf("Suma dodatnich: %d", sum);
    }
    public static void sumaUjemnych(int[] tab){
        int sum=0;
        for(int i:tab){
            if (i<0) sum+=i;
        }
        System.out.printf("Suma ujemnych: %d", sum);
    }
    public static void sumaOdwrotnosci(int[] tab){
        double sum=0;
        for(double i:tab){
            sum+=1/i;
        }
        System.out.printf("Suma odwrotnosci: %f", sum);
    }
    public static void sredniaArytmetyczna(int[] tab){
        double sum=0;
        double srednia=0;
        for(double i:tab){
            sum+=i;
        }
        srednia=sum/tab.length;
        System.out.printf("Srednia arytmetyczna: %f", srednia);
    }
    public static void sredniaGeometryczna(int[] tab){
        double a=1;
        double srednia=0;
        for(double i:tab){
            a*=i;
        }
        srednia=Math.pow(a, (double) 1/tab.length);
        System.out.printf("Srednia geometryczna: %f", srednia);
    }
    public static void sredniaHarmoniczna(int[] tab){
        double sum=0;
        double srednia=0;
        for(double i:tab){
            sum+=1/i;
        }
        srednia=tab.length/sum;
        System.out.printf("Srednia harmoniczna: %f", srednia);
    }
    public static int[] funkcjaLiniowa(int[] tab, int a, int b){
        int[] tablica = new int[tab.length];
        for(int i=0;i<tab.length;i++){
            tablica[i]=a*tab[i]+b;
        }
        System.out.println(Arrays.toString(tablica));
        return tablica;
    }
    public static int[] funkcjaKwadratowa(int[] tab, int a, int b, int c){
        int[] tablica = new int[tab.length];
        for(int i=0;i<tab.length;i++){
            tablica[i]=a*tab[i]*tab[i]+b*tab[i]+c;
        }
        System.out.println(Arrays.toString(tablica));
        return tablica;
    }
    public static int[] funkcjaWykladnicza(int[] tab, int a){
        int[] tablica = new int[tab.length];
        for(int i=0;i<tab.length;i++){
            tablica[i]= (int) Math.pow(a,tab[i]);
        }
        System.out.println(Arrays.toString(tablica));
        return tablica;
    }
    public static int[] funkcjaSignum(int[] tab){
        int[] tablica = new int[tab.length];
        for(int i=0;i<tab.length;i++){
            if (tab[i]<0) tablica[i]=-1;
            if (tab[i]==0) tablica[i]=0;
            if (tab[i]>0) tablica[i]=1;
        }
        System.out.println(Arrays.toString(tablica));
        return tablica;
    }
    public static void najdluzszyCiagDodatnich(int[] tab){
        int count=0;
        int l=0;
        for(int i :tab){
            if(i>0){
                l++;
            }else{
                if(l>count) count=l;
                l=0;
            }
        }
        System.out.printf("Najdluzszy ciag dodatnich: %d", count);

    }
    public static void najdluzszyCiagUjemnych(int[] tab){
        int count=0;
        int l=0;
        for(int i :tab){
            if(i<0){
                l++;
            }else{
                if(l>count) count=l;
                l=0;
            }
        }
        System.out.printf("Najdluzszy ciag ujemnych: %d", count);

    }
    public static void odwrocTablice(int[] tab){
        for(int i=0;i<tab.length/2;i++){
                int temp=tab[i];
                tab[i]=tab[tab.length-i-1];
                tab[tab.length-i-1]=temp;

        }
        System.out.printf(Arrays.toString(tab));

    } public static void odwrocTablice2(int[] tab, int indexStart, int indexStop){
        for(int i=indexStart;i<=indexStop;i++){
                int temp=tab[i];
                tab[i]=tab[indexStop];
                tab[indexStop]=temp;
                indexStop--;

        }
        System.out.printf(Arrays.toString(tab));

    }
    public static int[] generujZakres(int n, int minWartosc, int maxWartosc){
        int[] tab = new  int[n];
        Random rand = new Random();
        int skok = rand.nextInt(maxWartosc-minWartosc)+minWartosc;
        for(int i=0;i<n;i++){
            tab[i]=skok*i;
        }

        return tab;
    }
}