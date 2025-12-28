import java.util.Arrays;
import java.util.Scanner;

public class pro_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter a elements :");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter a search element :");
        int m = sc.nextInt();

        int ans = isInArray(a, m);
        if (ans == 1) {
            System.out.println("The given number is present");
        } else {
            System.out.println("The given number is not present");
        }

    }

    static int i=0;
    static int isInArray(int a[], int m) {
        if (a[i] == m){
            System.out.println("index :"+i);
             return 1;
        }
        i++;
        if(i==a.length){
            return 0;
        }
        return isInArray(a, m);
     
           

    

    }

}
