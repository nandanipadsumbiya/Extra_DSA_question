    import java.util.Scanner;

    public class pro_12 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number n: ");
            int n = sc.nextInt();

            for(int i=1;i<=n;i++){
                int num =1;
            
            for(int j=1 ;j<=2*i-1;j++){
                if(j<i){
                    if(j%2==0){
                        System.out.print('*');
                    }
                    else{
                        System.out.print(num);
                    }
                    num++;
                }
                else{
                    if(j % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(num);
                    }
                    num--;
                    
                }
            
            }
             System.out.println(); 
        }

        }
    }
