import java.util.Scanner;

public class Rotateby90Degrees {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the No of Rows of Square Matrix: ");
		int r = scan.nextInt();
		int[][] arr = new int[r][r];
		System.out.println("You can Start entering the values : enter" + " " + r*r + "no of elements: ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		makerotationof90(arr, r);
		
	}
	static void makerotationof90(int [][] arr, int r) {
		Transpose(arr,r,r);
		for(int i = 0; i < r;i++) {
			reverse(arr[i]); 
		}
		print2d(arr);
	}
	static void Transpose(int[][] a, int r1, int c1) {
		for(int i = 0; i < a.length; i++) {
			for(int j = i; j < a[i].length;j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
	
	}
	static void print2d(int [][] arr2) {
		for(int i = 0; i < arr2.length;i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
}
	static void reverse(int [] arr) {
		int low = 0;
		int high = arr.length - 1;
		while(low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}
}
