import java.util.*;

public class Solution {
    public static List<List<Integer>> permutation(int[] nums) {
	List<List<Integer>> rst = new ArrayList<>();
	if (nums == null || nums.length == 0) {
	    return rst;
	}
	List<Integer> entry = new ArrayList<>();
	Arrays.sort(nums);
	helper(rst, entry, nums);
	return rst;
    }

    private static void helper(List<List<Integer>> rst, List<Integer> entry, int[] nums) {
	if (entry.size() == nums.length) {
	    rst.add(new ArrayList<>(entry));
	}	
	for (int i = 0; i < nums.length; i++) {
	    if (entry.contains(nums[i])) {
		continue;
	    }
	    entry.add(nums[i]);
	    helper(rst, entry, nums);
	    entry.remove(entry.size() - 1);
	}
    }

    public static void main(String[] args) {
	int[] nums = {1,2,3};
	System.out.println(permutation(nums));
    }
}
 
