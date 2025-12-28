import java.util.Scanner;

public class pro_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter a element : ");
        for(int i=0 ;i<n ;i++){
            arr[i]= sc.nextInt();
        }

        
        int ans = findsecondlargest(arr, n);
        System.out.println("ans :"+ans);

    
            
    }

    static int findsecondlargest(int arr[], int n){
       
        int large = Integer.MIN_VALUE;
        int secondlarge = Integer.MIN_VALUE;

        for(int i=0;i<n ;i++){
            if(arr[i]>large){
                secondlarge= large;
                large = arr[i];
            }
            else if(arr[i]>secondlarge && arr[i]<large){
                secondlarge = arr[i];
            }
          

        }
        if(secondlarge == Integer.MIN_VALUE){
            return -1;
        }
        else return secondlarge;
        

        
    }
}
