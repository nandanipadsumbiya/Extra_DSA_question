import java.util.Scanner;

public class pro_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("emter a number n:");
        int n = sc.nextInt();
        int arr[]= new int[n];

        System.out.println("Enter a element");
        for(int i=0 ;i<n;i++){
            arr[i]= sc.nextInt();
        }


        for(int i=1 ;i<n;i++){
            int key = arr[i];//arr[1]
            int j= i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]= key;
        }

        System.out.println("::::sorted array :::::");
        for(int i=0 ; i<n ;i++){
            System.out.println(arr[i]+"");
        }
    }
}
