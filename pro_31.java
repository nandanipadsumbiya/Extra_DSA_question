import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class pro_31 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String s:");
        String s = sc.nextLine();
        int occ=Integer.MAX_VALUE;
        boolean found =false;

        for(int i=0 ;i<s.length()-1 ;i++){
            for(int j=i+1 ;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    if(j<occ){
                        occ=j;
                        found = true;
                    }
                }
               
            }
                
        }
         if(found){
             System.out.println(s.charAt(occ));
         }
         else{
            System.out.println("not repeted character::");
         }   
       
    }
}
