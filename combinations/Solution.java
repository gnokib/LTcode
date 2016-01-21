import java.util.*;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
	List<List<Integer>> rst = new ArrayList<>();
	List<Integer> entry = new ArrayList<>();
	if (k > n) {
	    return rst;
	}
	helper(rst, entry, n, k, 1);
	return rst;
    }

    private void helper(List<List<Integer>> rst, List<Integer> entry, int n, int k, int pos) {
	if (entry.size() == k) {
	    rst.add(new ArrayList<>(entry));
	    return;
	}
	for (int i = pos; i <= n; i++) {
	    entry.add(i);
	    helper(rst, entry, n, k, i + 1);
	    entry.remove(entry.size() - 1);
	}
	return rst;
    }    
}
