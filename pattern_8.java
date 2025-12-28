import java.util.Scanner;

public class pattern_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        for(int i=0;i<=n ;i++){
            for(int j=i ;j>=1 ;j--){
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
}
