import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double x=0; 
        for(int i=0;i<n;i++){
            x+=sc.nextDouble();
        }
        x=x/n;
        System.out.println(x);
    }
}
