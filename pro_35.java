import java.util.*;

public class pro_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array :");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter a element in size :");
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }

        boolean flag = isNondecresing(nums);
        System.out.println("ans is :"+flag);

    }

    static boolean isNondecresing(int[] nums){
        int count = 0;
        int n= nums.length;

        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                count++;

                if(count>1){
                    return false;
                }
                if(i>0 && nums[i-1]>nums[i+1]){
                    System.out.println(i);
                    nums[i+1]=nums[i];
                }
                else{
                    System.out.println(i);
                    nums[i]= nums[i+1];
                }
                System.out.println(Arrays.toString(nums));
            }
        }

        return true;
    }
}
