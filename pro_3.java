import java.util.Scanner;

class pro_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sq = n * n;
        String s = "" + sq;
        int mid = s.length() / 2;

        int left = Integer.parseInt(s.substring(0, mid));
        int right = Integer.parseInt(s.substring(mid));

        if (left + right == n)
            System.out.println("Kaprekar Number");
        else
            System.out.println("Not Kaprekar");
    }
}
