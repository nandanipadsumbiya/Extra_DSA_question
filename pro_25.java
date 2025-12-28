import java.util.Scanner;

public class pro_25 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a n:");
        int n = sc.nextInt();

        System.out.println("enter a m:");
        int m = sc.nextInt();

        System.out.println("enter a k:");
        int k = sc.nextInt();

        int totalchocolate = n/m;
        int wreapper = totalchocolate;

        while(wreapper>=k){
            totalchocolate++;
            wreapper = wreapper-k+1;
        }

        System.out.println("total number of chocolate:"+totalchocolate);


    }
}
