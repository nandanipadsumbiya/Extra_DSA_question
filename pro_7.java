import java.util.Scanner;

class pro_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        
        double hAngle = (hour * 30) + (minute * 0.5);
        double mAngle = minute * 6;


        double angle = Math.abs(hAngle - mAngle);

   
        if (angle > 180)
            angle = 360 - angle;

        System.out.println("Angle = " + angle);
    }
}


// 12 hours hoi full day ma aema thi 1 hours mate 1 hour = 360 /12 thai aetle 30 aave te thi h*30 kariyu 
// 60 min hoi aema thi 1 min mate 1 min = 360 /60 thai aetle 6 aave te thi m*6 kariyu
// 1 hour ma 60 min aave 30/60 aetle 0.5 hours na add kariyu