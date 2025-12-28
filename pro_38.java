import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class pro_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array");
        int n = sc.nextInt();

        System.out.println("Enter a element of arrya:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int ans = occurrence(arr);
        System.out.println("ans = "+ans);


    }

    static int occurrence (int arr[]){
        int count=1;
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return 0;
            }
            else if(arr[i]==arr[i+1] ){
                count++;
            }
            else if(arr[i]<arr[i+1]){
                if(count>=3){
                    count=1;
                    
                }else{
                    return 0;
                }
                
            }
           
          
        }

        if(count>=3){
            return 1;
        }
        else{
            return 0;
        }
    }
}
