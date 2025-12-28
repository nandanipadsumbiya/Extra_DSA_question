import java.util.Scanner;

public class pro_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String s1:");
        String s1 = sc.next();

        System.out.println("Enter a String s2: ");
        String s2 = sc.next();

       

        if(s1.length()!=s2.length()){
            System.out.println("::: two string length is not same ::");
        }
        else{
           int[] count1 = frequencycount(s1);
           int[] count2 =frequencycount(s2);

           if(isAnagram(count1,count2)){
            System.out.println("::Anagram::");
           }
           else{
            System.out.println("::Not Anagram::");
           }
        }
        
        
    }
    static int[] frequencycount(String s1){
        int count[] = new int[256];
        for(int i=0 ;i<s1.length();i++){
                char ch = s1.charAt(i);
                count[ch]++;
               
                
        }
        return count;
    }

    static boolean isAnagram(int[] count1 , int[] count2){
        for(int  i=0 ;i<256 ;i++){
            if(count1[i] != count2[i]){
                return false;
            }
        }
        return true;
    }
}
