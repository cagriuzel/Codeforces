import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/*
 * Winner
 * https://codeforces.com/problemset/problem/2/A
 */
public class Problem2A {
		
	public static void main(String args[])
	{ 
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			Map<String, Integer> map = new HashMap<String, Integer>();
			String str[] = new String[n];
			int sum[] = new int[n];
			for (int i = 0; i < n; i++) {
				final int index = i;
				str[index] = s.next();
				sum[index] = s.nextInt();

				map.computeIfPresent(str[index], (k,v) ->  sum[index] +=v);
				map.put(str[index], sum[index]);
			}
			int max = Collections.max(map.values());
			for (int i = 0; i < n; i++) {
				if (map.get(str[i]) == max && sum[i] >= max) {
					System.out.println(str[i]);
					break;
				}
			}
		}
	}
}