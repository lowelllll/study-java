package array;

import java.util.Arrays;

public class ArrayEx3 {

	public static void main(String[] args) {
		// 배열 섞기 shuffle
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<10; i++) {
			int n = (int)(Math.random() * 10); // 0 ~ 9
			int tmp = arr[0];
			arr[0] = arr[n];
			arr[n] = tmp;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
