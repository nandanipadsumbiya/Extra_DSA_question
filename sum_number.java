import  java.util.Scanner;
public class sum_number {
    public static void main(String[] args) {
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = sc.nextInt();

    for(int i=1 ;i<=n ;i++){
        sum+=(i*(i+1))/2;
    }
    System.out.println("sum : "+sum);
    }
}
