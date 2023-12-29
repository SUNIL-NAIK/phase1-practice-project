package LongestIncreasingSubsequence;



	import java.util.Arrays;

	public class LongestIncreasingSubsequence {

	    public static int longestIncreasingSubsequence(int[] nums) {
	        int n = nums.length;
	        if (n == 0) {
	            return 0;
	        }

	        int[] lis = new int[n];
	        Arrays.fill(lis, 1);

	        for (int i = 1; i < n; i++) {
	            for (int j = 0; j < i; j++) {
	                if (nums[i] > nums[j] && lis[i] < lis[j] + 1) {
	                    lis[i] = lis[j] + 1;
	                }
	            }
	        }

	        int maxLIS = 0;
	        for (int i = 0; i < n; i++) {
	            if (lis[i] > maxLIS) {
	                maxLIS = lis[i];
	            }
	        }

	        return maxLIS;
	    }

	    public static void main(String[] args) {
	        int[] nums = {10, 22, 9, 33, 21, 50, 41, 60, 80};
	        int result = longestIncreasingSubsequence(nums);
	        System.out.println("Length of Longest Increasing Subsequence: " + result);
	    }
	}

