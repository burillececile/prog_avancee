import java.util.Scanner;

public class TD1 {

    public static void main(String[] args) {
        System.out.println("Choisir n");

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        //System.out.println(factorielle(n));
        //boolean result = pair(n);
        ///System.out.println(result);
        System.out.println(sommeImpairs(n));
    }


    /*---Exercice1---*/
    public static int factorielle(int n){
        int resultat = 1;
        if(n ==0){ return 0;}
        if (n ==1){ return 1;}
        resultat = factorielle(n-1);
        return resultat*n;
    }

    /*---Exercice2---*/
    public static boolean pair(int n){

        if(n ==0){ return  true;}
        if (n ==1){ return false;}
        return pair(n-2);
    }

    /*---Exercice3---*/

    public static int sommeImpairs(int n){

        int result = 0;

        if (n ==1){ return result + n;}

            result =+ n;

        return result + sommeImpairs(n-2);
    }

    /*---Exercice4---*/

    public static int puiss(int x, int n){
        int result = 0;

        return 1;

    }
}
