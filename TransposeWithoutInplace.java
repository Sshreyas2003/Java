import java.util.Scanner;

public class TransposeWithoutInplace {
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
		Transpose(arr,r,c);
		
	}
	static void Transpose(int[][] a, int r1, int c1) {
		for(int i = 0; i < a.length; i++) {
			for(int j = i; j < a[i].length;j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
		print2d(a);
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
