import java.util.Scanner;

public class pro_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal Number: ");
        int num = sc.nextInt();

        char hexdegits[] = {'0','1','2','3','4','5','6','7','8','9',
                            'A','B','C','D','E','F'};

        String hexa = "";

        int n = num;

        while (n > 0) {
            int rem = n % 16;           
            hexa = hexdegits[rem] + hexa; 
            n = n / 16;                 
        }

        System.out.println("Hexadecimal = " + hexa);
    }
}
