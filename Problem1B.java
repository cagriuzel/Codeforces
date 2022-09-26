import java.util.Scanner;


/*
 * Spreadsheets
 * https://codeforces.com/problemset/problem/1/B
 */
public class Problem1B {
		
	public static void main(String args[])
	{
		
		try (Scanner sr = new Scanner(System.in)) {
			int n = sr.nextInt();
			StringBuilder result = new StringBuilder();
			while(n-- > 0){
				String input = sr.next();
				int cIndex = input.indexOf('C');
				if(input.startsWith("R") && cIndex != -1 && Character.isDigit(input.charAt(cIndex - 1))){
					int row = Integer.parseInt(input.substring(1, cIndex));
					int column = Integer.parseInt(input.substring(cIndex + 1));
					StringBuilder sb = new StringBuilder();
					while(column > 0){
						sb.insert(0, (char)((column - 1) % 26 + 'A'));
						column = (column - 1) / 26;
					}
					result.append(sb.toString()).append(row).append("\n");
				} else {
					int split = 1;
					while (!Character.isDigit(input.charAt(split)))
						split++;

					String column = input.substring(0, split);
					int row = Integer.parseInt(input.substring(split));
					int col = 0;
					for (int i = 0; i < column.length(); i++) {
						col *= 26;
						col += column.charAt(i) - 'A' + 1;
					}
					result.append("R" + row + "C" + col).append("\n");
				}
				
			}
			System.out.println(result.toString());
		} 
	}
}