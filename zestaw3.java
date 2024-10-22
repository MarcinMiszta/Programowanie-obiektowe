import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class zestaw3 {
    public static void main(String[] args) {
        cw7();
    }

    public static void cw1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = scan.nextInt();
        for(int i = 1;i<=n;i++){
            int kwadrat1 = i*i;
            for (int j=i+1;j<n;j++){
                int kwadrat2=j*j;
                for(int k=j+1;k<n;k++)
                {
                    int kwadrat3=k*k;
                    if(kwadrat1+kwadrat2==kwadrat3){
                        System.out.printf("Liczby %d, %d, %d to trójki pitagorejskie\n",i,j,k);
                    }
                }
            }
        }


    }
    public static void cw2(){
        //delta=b^2-4ac
        //ax^2+bx+c
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = scan.nextInt();
        for(int i = 1;i<=n;i++){
            for (int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++)
                {
                    int bkwadrat = j*j;
                    int ac4 = i*k*4;
                    if(bkwadrat-ac4>=1){
                        System.out.printf("Funkcja %d x^2+ %d x+ %d ma rozwiazanie\n",i,j,k);
                    }
                }
            }
        }
    }
    public static void cw3(){
        //delta=b^2-4ac
        //ax^2+bx+c
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = scan.nextInt();
        for(int i = 1;i<=n;i++){
            for (int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++)
                {
                    int bkwadrat = j*j;
                    int ac4 = i*k*4;
                    int delta = bkwadrat-ac4;
                    double pdelta = sqrt(delta);
                    if(sqrt(pdelta)%2==0){
                        System.out.printf("%d, %d, %d\n",i,j,k);
                    }
                }
            }
        }
    }
    public static void cw4(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = scan.nextInt();
        for(int i = 2; i<n;i++){
            boolean liczbaPierwsza = true;
            for(int j = 2; j<=sqrt(i);j++){
                if(i%j == 0){
                    liczbaPierwsza = false;
                    break;
                }
            }
            if(liczbaPierwsza){
                System.out.println(i);
            }
        }

    }
    public static void cw5(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = scan.nextInt();
        System.out.println("Podaj m: ");
        int m = scan.nextInt();
        int max= (int) (pow(10, m));
        int min= (int) pow(10,m-1);
        for(int i=min;i<max;i++){
            if(i%n==0){
                System.out.printf("%d jest podzielne przez %d\n",i,n);
            }
        }

    }
    public static void cw6(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wysokość: ");
        int n = scan.nextInt();
        System.out.println("Podaj wariant (normalna - 1, odwrócona - 2): ");
        int wariant = scan.nextInt();
        switch (wariant){
            case 1:
                for(int i = 0; i < n; i++ ){
                    if(i!=0) System.out.println();
                    for(int j = n-i; j > 1; j--){
                        System.out.print(" ");
                    }
                    for (int k = 0; k <= i; k++ ){
                        System.out.print("* ");
                    }

                }
                break;
                case 2:
                    for(int i = n; i > 0; i-- ){
                        System.out.println();
                        for(int j = n-i; j > 0; j--){
                            System.out.print(" ");
                        }
                        for (int k = 0; k < i; k++ ){
                            System.out.print("* ");
                        }

                    }
            }

    }
    public static void cw7(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = scan.nextInt();
        int wynik = 1;
        for(int i=1;i<=n;i++){
            wynik *= i;
        }
        System.out.printf("Silnia z %d to %d ",n,wynik);

    }
    public static void cw14(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = scan.nextInt();
        int[][] trojkat = new int[n][n];
        trojkat[0][0] = 1;
        for(int i =0;i<n;i++){
            trojkat[i][0] = 1;
            for (int j=0;j<i;j++){
                trojkat[i][j]=trojkat[i-1][j]+trojkat[i-1][j];
            }
            trojkat[i][i]=1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(trojkat[i][j]+" ");
            }
            System.out.println();
        }
    }
}

