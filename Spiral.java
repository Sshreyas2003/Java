import java.util.Scanner;

public class Spiral {
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
		print2d(arr);
		spiral(arr,r,c);

	}
	//static void 
	static void print2d(int [][] arr2) {
		for(int i = 0; i < arr2.length;i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
}
	static void spiral(int[][] arr, int r, int c) {
		int toprow = 0, bottomrow = r-1, rightcol = c - 1, leftcol = 0;
		int totalelements = 0;
			//Top row
		while(totalelements < r * c) {
			for(int i = leftcol; i <= rightcol && totalelements < r * c ;i++ ) {
				System.out.print(arr[toprow][i] + " ");
				totalelements++;
			}
			toprow++;
			
			//Right Col
			for(int j = toprow; j <= bottomrow && totalelements < r * c; j++) {
				System.out.print(arr[j][rightcol] + " ");
				totalelements++;
			}
			rightcol--;
			
			//Bottom Row
			for(int i = rightcol; i >= leftcol && totalelements < r * c; i--) {
				System.out.print(arr[bottomrow][i] + " ");
				totalelements++;
			}
			bottomrow--;
			
			//left Col
			for(int i = bottomrow; i >= toprow && totalelements < r * c; i--) {
				System.out.print(arr[i][leftcol] + " ");
				totalelements++;
			}
			leftcol++;
		}
		
	}
	
}
