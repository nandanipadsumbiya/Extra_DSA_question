import java.util.Scanner;

public class pro_40 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a size of first array :");
       int n1 = sc.nextInt();
       int arr1[] = new int[n1];


       System.out.println("Enter a first array element :");
       for(int i=0;i<n1;i++){
            arr1[i] =sc.nextInt(); 
       }

       System.out.println("Enter a size of second array :");
       int n2 = sc.nextInt();
       int arr2[] = new int[n2];

       System.out.println("Enter a second array element :");
       for(int i=0;i<n2;i++){
            arr2[i] =sc.nextInt(); 
       }

       int size = arr1.length+arr2.length;
       int[]  mergearray = new int[size];
       int i=0 ;
       int j=0;
       int k=0;

       while(i<n1 && j<n2){
          if(arr1[i]<arr2[j]){
               mergearray[k++]=arr1[i++];
               
          }
          else{
               mergearray[k++]= arr2[j++];
               
          } 
       }

       while (i<n1) {
          mergearray[k++]= arr1[i++];
       }

       while (j<n2) {
          mergearray[k++]= arr2[j++];
       }

        System.out.println("merge array :");
        for(i=0;i<mergearray.length;i++){
            System.out.print("merge sort:"+mergearray[i]);
        }

        if(size%2==0){
          int mid1 = mergearray[size/2-1];
          int mid2 = mergearray[size/2];
          int median = (mid1+mid2)/2;
          System.out.println("final median ="+median);
        }
        else{
          System.out.println("final median ="+mergearray[size/2]);
        }

    }
}
