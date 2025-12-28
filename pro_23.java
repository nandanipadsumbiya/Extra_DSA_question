public class pro_23 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int k = 67;
        int mod = k % n;
        reverseArray(arr, 0, arr.length-1);
        System.out.println();
        reverseArray(arr, 0, mod-1);
        System.out.println();
        reverseArray(arr, mod, n-1);
    }

    static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

