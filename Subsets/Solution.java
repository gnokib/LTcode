import java.util.*;


// cursion
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
	List<List<Integer>> rst = new ArrayList<>();
	List<Integer> entry = new ArrayList<>();
	if (nums == null || nums.length == 0) {
	    return rst;
	}
	Arrays.sort(nums);
	helper(rst, entry, nums, 0);
	return rst;
    }

    private void helper(List<List<Integer>> rst, List<Integer> entry, int[] nums, int pos) {
	rst.add(new ArrayList<>(entry));
	for (int i = pos; i < nums.length; i++) {
	    entry.add(nums[i]);
	    helper(rst, entry, nums, i + 1);
	    entry.remove(entry.size() - 1);
	}
    }    
}


// non-recursion
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
	List<List<Integer>> rst = new ArrayList<>();
	if (nums == null || nums.length == 0) {
	    return rst;
	}
	Arrays.sort(nums);
	int n = nums.length;
	for (int i = 0; i < (1<<n); i++) {
	    List<Integer> entry = new ArrayList<>();
	    for (int j = 0; j < n; j++) {
		if ((i & (1<<j)) != 0) {
		    entry.add(nums[j]);
		}		
	    }
	    rst.add(entry);
	}
	return rst;
    }    
}
