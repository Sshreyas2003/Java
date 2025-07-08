import java.util.Scanner;

public class PascalsTriangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the rows of pascals triangle : ");
		int row = scan.nextInt();
		int[][] arr = pascal(row);
		print2d(arr);
	}
	static void print2d(int [][] arr2) {
		for(int i = 0; i < arr2.length;i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
}
	static int[][] pascal(int n){
		int [][] ans = new int[n][];
		for(int i = 0; i < ans.length;i++) {
			ans[i] = new int[i + 1];
			ans[i][0] = ans[i][i] = 1;
			
			for(int j = 1; j < ans[i].length -  1; j++) {
				ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
			}
		}
		return ans;
	}
}
