import java.util.Scanner;

public class pro_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // first array
        System.out.print("Enter a n1:");
        int n1 = sc.nextInt();

        System.out.print("Enter a m1:");
        int m1 = sc.nextInt();

        int[][] arr1 = new int[n1][m1];

        // second array
        System.out.print("Enter a n2:");
        int n2 = sc.nextInt();

        System.out.print("Enter a m2:");
        int m2 = sc.nextInt();

        int[][] arr2 = new int[n2][m2];

        //3rd array
        int[][] arr3 = new int[n1][m2];


        if (m1!=n2) {
            System.out.println("this is not possible");
        } else {

            System.out.println("Enter a element:");
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m1; j++) {
                    arr1[i][j] = sc.nextInt(
                    );
                }
            }

            System.out.println("Enter a element:");
            for (int i = 0; i < n2; i++) {
                for (int j = 0; j < m2; j++) {
                    arr2[i][j] = sc.nextInt();
                }
            }

            for(int i=0;i<n1;i++){
                for(int j=0;j<m1;j++){
                    for(int k=0 ;k<m1;k++){
                        arr3[i][j]+=arr1[i][k]* arr2[k][j];
                    }
                }

            }
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m2; j++) {
                    System.out.print(arr3[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
