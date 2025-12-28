import java.util.Scanner;

public class pro_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array :");
        int n= sc.nextInt();
        int count =0;
        int[] arr = new int[n];

        System.out.println("Enter a element:");
        for(int i=0;i<n ;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a k :");
        int k= sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=i+1 ;j<n;j++){
                if(arr[i]+arr[j]==k){
                    count++;
                }
            }
        }
        System.out.println("number of pair is equle of k:"+count);
        
    
    }
}
