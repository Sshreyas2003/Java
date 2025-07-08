import java.util.Scanner;

public class Add {
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
		System.out.println("Enter the No of Rows and Columns : ");
		int r1 = scan.nextInt();
		int c1 = scan.nextInt();
		int[][] arr1 = new int[r1][c1];
		System.out.println("You can Start entering the values : enter r*c no of elements: ");
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = scan.nextInt();
			}
		}
		add(arr,r,c,arr1,r1,c1);
	}
	static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
		if(r1 != r2 || c1 != c2) {
			System.out.println("Array Dimensions must be Same");
			return;
		}
		int [][] sum = new int [r1][c1];
		for(int i = 0; i < sum.length; i++) {
			for(int j = 0; j < sum[i].length; j++) {
				sum[i][j] = a[i][j] + a[i][j];
			}
		}
		print2d(sum);
		
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

