import java.util.Arrays;
import java.util.Scanner;

public class pro_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number of n:");
        int n= sc.nextInt();
        int arr[]= new int[n];

        System.out.println("enter a number of element");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        

        int large = arr[0];
        int secondlarge = arr[0];
     
        for(int i = 0; i < n; i++) {
            if(arr[i] > large) {
                secondlarge = large;
                large = arr[i];    
            }
            else if(arr[i]>secondlarge && arr[i]<large){
                secondlarge=arr[i];
            }
            
        }
        System.out.println("secondlarge :"+secondlarge);

        
        int smallest = arr[0];
        int secondsmallest = arr[0];
        for(int i = 0; i < n; i++) {
            if(arr[i] < smallest) {
                secondsmallest = smallest;
                smallest = arr[i];
                
            }
            else if(arr[i]<secondsmallest && arr[i]>smallest){
                secondsmallest=arr[i];
            }
        }
        System.out.println("secondsmallest :"+secondsmallest);



        int difference = secondlarge - secondsmallest;
        System.out.println("dllfrence btw secondsmallest to secondlargest :"+ difference);
    }
}
