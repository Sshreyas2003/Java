import java.util.Scanner;

public class TwiDimensional {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the No of Rows and Columns : ");
		int r = scan.nextInt();
		int c = scan.nextInt();
		int[][] arr = new int[r][c];
		System.out.println("You can Start entering the values : enter r*c no of elements: ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		int [][] ans = Transpose(arr,r,c);
		print2d(ans);
	}
	static int[][] Transpose(int[][] a, int r1, int c1) {
		int [][] ans = new int[c1][r1];
		for(int i = 0; i < ans.length;i++) {
			for(int j = 0; j < ans[i].length;j++) {
					ans[i][j] = a[j][i];
				
			}
		}
		return ans;
	}
	static void print2d(int [][] arr2) {
		for(int i = 0; i < arr2.length;i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
}
}
