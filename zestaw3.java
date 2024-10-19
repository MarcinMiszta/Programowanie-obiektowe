import java.util.Scanner;

import static java.lang.Math.sqrt;

public class zestaw3 {
    public static void main(String[] args) {
        cw4();
    }
    Scanner scan = new Scanner(System.in);
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
            for(int j = 2; j<((i+1)/2);j++){
                if(i%j!=0){
                    System.out.println(i);
                }
            }
        }
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

