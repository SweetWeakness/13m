import java.util.Scanner;

public class B {

    static boolean isprime(int n){
        // перебираем возможные делители от 2 до sqrt(n)
        for(int d=2; d*d<=n; d++){
            // если разделилось нацело, то составное
            if(n%d==0)
                return false;
        }
        // если нет нетривиальных делителей, то простое
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<n;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
