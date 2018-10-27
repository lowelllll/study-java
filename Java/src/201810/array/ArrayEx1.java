package array;

import java.util.Arrays;

public class ArrayEx1 {

	public static void main(String[] args) {
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		// int[] arr3 = new int[] {100,90,80,70};
		int[] arr3 = {100,90,80,70};
		
		char[] chArr = {'a','b','c'};
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = i+1;
		}
		
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = (int)(Math.random() * 10) + 1;
		}
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+",");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(chArr); // 문자 배열은 출력하면 바로 나옴.
		System.out.println(arr1);
	}

}
