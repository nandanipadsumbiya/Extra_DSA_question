import java.util.Scanner;

public class pro_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();

        int number = 0;
        for (int i = 0; i < str.length(); i++) {

            Character ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                number = number * 10 + ch - '0';
                

            } else {
                if(number==0) System.out.print(ch);
                for (int j = 0; j < number; j++) {
                    System.out.print(ch);
                }
                number=0;

            }

        }
    }
}
