package medium;

public class twosum {
//	Input: nums = [2,7,11,15], target = 9
//			Output: [0,1]
	class Solution {
	    public int[] twoSum(int[] nums, int target) {
	        for (int i = 0; i < nums.length; i++) {
	            for (int j = 0; j < nums.length; j++) {
	                if (nums[i] + nums[j] == target) {
	                    return new int[] {i, j};
	                }
	            }
	        }

	        return new int[] {};
	    }
	}
	
}



//
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//
//            if (map.containsKey(complement)) {
//                return new int[] { map.get(complement), i };
//            }
//
//            map.put(nums[i], i);
//        }
//
//        return new int[] {}; // This line is never reached because one solution is guaranteed.
//    }
//}
        