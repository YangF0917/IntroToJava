package Class10;
import java.util.*;
public class Class10_SearchAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int [] t1 = {1,2,3,4,5,6,7,8,9,10};
		int [] t2 = {5,6,-9,12,356,2,35,4,7,2345,5};
		System.out.println(binarySearch(t1, 9));
		System.out.println(binarySearch(t1, 10));
		System.out.println(binarySearch(t1, 1));
		System.out.println(binarySearch(t1, 100));
		insertionSort(t2);
		System.out.println(Arrays.toString(t2));
	}
	public static int linearSearch(int [] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) return i;
		}
		return -1;
	}
	public static int binarySearch(int [] arr, int value) {
		Arrays.sort(arr);
		int min = 0;
		int max = arr.length;
		int av = (min + max) / 2;
		while (min < max) {
			if (arr[av] == value) return av;
			else if (value > arr[av]) {min = av + 1; av = (min + max) / 2;}
			else {max = av - 1;av = (min + max) / 2;}
		}
		return -1;
	}
	public static void bubbleSort(int [] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j]; arr[j] = arr[j+1]; arr[j+1] = temp;
				}
			}
		}
	}
	public static void printArray(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void selectionSort(int [] a) {
		int count = a.length-1;
		for (int j = count; j > 0 ; j--) {
			int max = a[0];
			int maxI = 0;
			for (int i = 0; i <= count; i++) {
				if (a[i] > max) {
					max = a[i];
					maxI = i;
				}
			}
			int temp = a[count];
			a[count] = max;
			a[maxI] = temp;
			count--;
		}
	}
	public static void insertionSort(int [] a) {
		for (int top = 1; top < a.length; top++) {
			int item = a[top];
			int i = top;
			while (i > 0 && item < a[i-1]) {
				a[i] = a[i-1];
				i--;
			}
			a[i] = item;
		}
	}
	
}
