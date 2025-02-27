
import java.util.Scanner;

public static int InserisciElemento (int [] V =new int [] , int N,e,ie ){
    int i,N2;
    N2=N+1;
    i=N2-1;
    while (i>=ie+1){
        V[i]=V[i-1];
        i=i+1;
    }
    V[ie]=e;
    return N2;

}

public static int EliminaElemento (int [] V =new int [] , int N,ie ){
    int N2;
    N2=N-1;
    i=ie;
    while (i<=N-2){
        V[i]=V[i+1];
        i=i+1;
    }
    return N2;

    public int ricercaMassimo (int [] V=new int [],int e,int N,int iMax){
        int max,i;
        i=0;
        max=e;
        if (e<max) {
            max=e
            iMax=i;
        }
    }



    public static void  visualizzaVettore (int [] V =new int []){
        int i;
        i=0;
        while ("i<N"){
            System.out.println("V[i]");
            i=i+1;
        }
 
    }

class Esercizio {

    public static void main(String args[])
    {
        Scanner in = new Scanner( System.in );
        int A, N, M, i, j, e,ora;
        System.out.print("Inserisci il numero di pesci che saranno pescati: ");
        A = pars.Integer(in.nextLine());
        int [] V =new int [A];
        int [] O =new int [A];
        N=0;
        M=0;
        i=1;
        ora:9;
        while (i <= A){
            e=( 2+random(9) )*50,
            ora=(ora+1)%24;
            System.out.println("Pescato pesce di " +e+ " grammi. ");
            N=inserisciInVettore(V,N,e,N);
            M=inserisciInVettore(O,M,ora,M);
            j=0;
            while(j < N){
                if(V[j] < V[N-1]){
                   System.out.println(V[j]+ " scappa via. ");
                   N=inserisciInVettore(V,N,j);
                   M=inserisciInVettore(O,M,j);
                }else {
                    j=j+1;
                }
            }
            System.out.printn("Lago: ");
            visualizzaVettore(V,N);
            visualizzaVettore(O,M);
            i=i+1;
        }
        N=rimuoviDuplicati(V,N);
        System.out.println("Animali con dimensioni diverse rimaste al lago:");
        visualizzaVettore(V,N);


    }
}

