import java.util.Scanner;

class pro_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sq = n * n;

        if (sq % 10 == n || sq % 100 == n || sq % 1000 == n) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not Automorphic Number");
        }
    }
}
