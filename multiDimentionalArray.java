public class multiDimentionalArray {
    public static void main(String[] args) {
        int nums[][] = new int[3][4];
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
            System.out.println();
        }


<<<<<<< HEAD
        // for(int i = 0; i < 3; i++) {
        //     for(int j = 0; j < 4; j++) {
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        for(int arr[] : nums) {
            for(int n : arr) {
                System.out.print(n + " ");
=======
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
>>>>>>> fe53adb7b52ee290f88fec6f0e46f0031cb6b12a
            }
            System.out.println();
        }

    }
}
