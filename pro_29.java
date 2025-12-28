import java.util.Scanner;

public class pro_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a n:");
        int n = sc.nextInt();

        int sum= 0;

        for(int i=1 ;i*i<=n ;i++){
            System.out.println(i+" ");
        }
    }
}
