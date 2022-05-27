import java.util.HashMap;
import java.util.List;

public class twoSum2 {
    public static void main(String[] args) {
        Test();
    }
    
    // Superior Solution - Use caching to save past sums.
    public static int[] twoSum(int[] nums, int target) {
        // Superior solution
        // Cache past entries and match based on cached entries
        // O(N) since checking the cache for the desired number is O(1)
        Map<Integer, Integer> cache = new HashMap<Integer, Integer>();
        for (int index = 0; index < nums.length; index++) {
            int number = nums[index];
            int leftover = target - number;
            if (cache.containsKey(leftover)) {
                return new int[]{cache.get(leftover), index}; 
            }
            cache.put(number, index);
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
}