import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		int [][] arr2 = {{1,5,6},{2,3,4},{7,8,9}};
		print2d(arr2);
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
		System.out.println("Your entered elements are : ");
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
	}

