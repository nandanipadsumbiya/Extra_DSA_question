import java.util.Scanner;
public class power_without_using_multiplication {
    public static void main(String[] args) {
    int ans = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number n1: ");
    int n1 = sc.nextInt();

    System.out.println("Enter a number n2: ");
    int n2 = sc.nextInt();

    ans = power(n1, n2);
    System.out.println("final answer :"+ans);
    }

    static int power(int x , int y){
        int p = x;
        int increment = x;

        if(y==0){
            return 1;
        }
        for(int i=1 ;i<y ;i++){
            for(int j=1 ;j<x ;j++){
                p+=increment;
            }
            increment=p;
        }
        return p;
    }
}
