import java.util.Scanner;

class pro_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 0) {
            System.out.print(n % 8);
            n = n / 8;
        }
    }
}
