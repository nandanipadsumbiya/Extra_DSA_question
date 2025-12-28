import java.util.Scanner;

public class pro_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of disk:");
        int n = sc.nextInt();

        if(n<0){
            System.out.println("number is not negative");
        }
        else{
            int ans =1;
            for(int i=0;i<n;i++){
                ans = ans*2;
            }
            int output = ans-1;
            System.out.println("answer is:"+output);
        }
    }
}
