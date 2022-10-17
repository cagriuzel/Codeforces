import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/*
 * TwoSum
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
		
	public static void main(String args[])
	{ 
		int[] nums = new int[] {2,7,11,15};
		Integer target = 9;

		int[] result = twoSum(nums, target);
		System.out.println(Arrays.toString(result));
	}

	public static int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(target - numbers[i])) {
				result[1] = i;
				result[0] = map.get(target - numbers[i]);
				return result;
			}
			map.put(numbers[i], i);
		}
		return result;
	}
}