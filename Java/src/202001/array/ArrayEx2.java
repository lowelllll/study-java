package array;

import java.util.Arrays;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 선언 생성
		int[] arr;
		int arr2[];
		
		int[] arr3 = new int[10];
//		int[] arr4 = new int[10]{1,2,3,4,5,6,7,8,9};
		int[] arr4 = {1,2,3,4,5,6,7,8,9,10};
		char[] char_arr = {'a', 'b', 'c', 'd'};

		for (int i=0; i<arr3.length; i++) {
			arr3[i] = i+1;
		}
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(char_arr));
		System.out.println(char_arr);
	}

}
