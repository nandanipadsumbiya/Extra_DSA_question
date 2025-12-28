import java.util.Scanner;

public class pro_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number n:");
        int n = sc.nextInt();
        int val;
        int size = 2*n-1;

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                val =n;
            

                for(int k = 1; k < n; k++) {
                if(i >= k && j >= k && i < size-k && j < size-k) {
                    val = n - k;
                }
            }

            System.out.print(val+" ");
            
        }
        System.out.println();
        }
    }
}
