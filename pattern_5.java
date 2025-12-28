import java.util.Scanner;

public class pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n= sc.nextInt();

        for(int i=n ;i>=1 ;i--){
            for(int j=n-i ;i>=1;j--){
                System.out.print(" ");
            }
            for(int j=2*i-1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
