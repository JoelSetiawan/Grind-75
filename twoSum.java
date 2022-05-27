// TwoSum - First try
// I'm doing the inferior n^2 solution first.

public class twoSum {
    public static void main(String[] args) { 
        Test();
    }

    public static int[] twoSum(int[] nums, int target) {

        // Inferior Solution - Traverse until target sum has been reached, set indexes inside
        // for loop and return at the end.
        int max_idx = nums.length;
        for (int first_idx = 0; first_idx < max_idx - 1; first_idx++) {
            for (int second_idx = first_idx + 1; second_idx < max_idx; second_idx++) {
                if (nums[first_idx] + nums[second_idx] == target)
                    return new int[]{first_idx, second_idx};
            }
        }
        return new int[2];
    }
    
    private static void Test() {

        if (twoSum(new int[]{2,7,11,15}, 9) == new int[]{0, 1}) { 
            System.out.printf("Passed TEST 1");
            
        }
        else { 
            System.out.printf("Failed TEST 1");
        }
    }
    // Inputs: Random length of array, and range of numbers
    // Output: Array with target value.
    // private int[] rand_array_generator(int arr_length, int number_range) {
	
    // }
}
