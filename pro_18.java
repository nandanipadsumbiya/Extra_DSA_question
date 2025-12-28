import java.util.*;

class pro_18 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int b[] = {2, 2, 4};

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                System.out.print(a[i] + " ");
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
    }
}

