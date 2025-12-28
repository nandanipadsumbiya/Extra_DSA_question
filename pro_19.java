import java.util.Scanner;

public class pro_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number n:");
        int n = sc.nextInt();

        int num = 0;
        int x = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                x = num + n;
                for (int j = 1; j <= n; j++) {
                    System.out.print(x + "");
                    x--;

                }
                num = num + n;
            }

            for (int j = 1; j <= n; j++) {
                if (i % 2 != 0) {
                    num++;
                    System.out.print(num + "");
                }
            }

            System.out.println();

        }
    }
}
