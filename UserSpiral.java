import java.util.Scanner;

public class UserSpiral {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the rows of Spiral Matrix : ");
		int row = scan.nextInt();
		int[][] arr = spiral(row);
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
	static int[][] spiral(int n) {
		int [][] arr = new int[n][n];
		int toprow = 0, bottomrow = n-1, rightcol = n - 1, leftcol = 0;
		int ele = 1;
			//Top row
		while(ele <= n * n) {
			for(int i = leftcol; i <= rightcol && ele <= n * n ;i++ ) {
				arr[toprow][i]  = ele;
				ele++;
			}
			toprow++;
			
			//Right Col
			for(int j = toprow; j <= bottomrow && ele <= n * n; j++) {
				arr[j][rightcol] = ele;
				ele++;
			}
			rightcol--;
			
			//Bottom Row
			for(int i = rightcol; i >= leftcol && ele <= n * n; i--) {
				arr[bottomrow][i]  = ele;
				ele++;
			}
			bottomrow--;
			
			//left Col
			for(int i = bottomrow; i >= toprow && ele <= n * n; i--) {
				arr[i][leftcol] = ele;
				ele++;
			}
			leftcol++;
		}
		return arr;
	}
}
