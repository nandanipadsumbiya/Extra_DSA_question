import java.util.Scanner;

public class simple_pattern {
    public static void main(String[] args) {
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();

    for(int i =1 ;i<=n ;i++){
        for(int j=1 ;j<=i ;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    }
}
