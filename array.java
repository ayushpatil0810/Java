public class array {
    public static void main(String[] args) {
        int nums[] = {3, 7 , 2, 4};
        System.out.println(nums[1]); // 7

        int arr[] = new int[5]; // array of size 5 initialized with 0 
        arr[2] = 5;
        System.out.println(arr[4]);
        System.out.println(arr[2]);

        for(int i =0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }
}
