import java.util.*;

class LargestDivBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        int sum = 0;

        System.out.println("Enter digits:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }

        // sort in descending order
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // if sum not divisible by 3, remove one digit
        int rem = sum % 3;
        if (rem != 0) {
            for (int i = n - 1; i >= 0; i--) {
                if (a[i] % 3 == rem) {
                    a[i] = -1;   // remove digit
                    break;
                }
            }
        }

        System.out.print("Answer: ");
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (a[i] != -1) {
                System.out.print(a[i]);
                flag = true;
            }
        }

        if (!flag)
            System.out.println("Not possible");
    }
}
