package oopslab;

import java.util.Arrays;
import java.util.Scanner;
public class salarychef {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of test cases");
		int t = sc.nextInt();
		while (t > 0) {
			System.out.println("enter no of workers");
			int w = sc.nextInt();
			int arr[] = new int[w];
			int array[] = new int[w];
			System.out.println("enter salary of workers");
			for (int i = 0; i < w; i++) {
				arr[i] = sc.nextInt();
			}
			int g = arr[w - 1];
			Arrays.fill(array, g);
			if (Arrays.equals(arr, array)) {
				System.out.println(0);
			} else {
				int arr1[] = new int[w];
				int c = 0;
				while (!Arrays.equals(arr, arr1)) {
					Arrays.parallelSort(arr);
					int s = arr[w - 1];
					Arrays.fill(arr1, s);
					for (int j = 0; j < w - 1; j++) {
						arr[j] = arr[j] + 1;

					}
					c = c + 1;
				}
				System.out.println("equal salary can be");
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println("");
				System.out.println("total day required to equate salary");
				System.out.println(c);
				t--;
			}
		}
		sc.close();
	}
}
//or you can also do the following....
//or sum of all the employee's salary - no of workers*minimum salary of any employee
