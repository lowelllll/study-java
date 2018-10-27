package oop;

public class ReferenceParamEx2 {

	public static void main(String[] args) {
		int[] arr = new int[] {3,2,1,6,5,4};
		
		printArr(arr);
		sortArr(arr);
		printArr(arr);
		
		System.out.println("sum(arr)="+sumArr(arr));
	}
	
	static void printArr(int[] arr) {
		System.out.print("[");
		
		for(int i:arr) {
			System.out.print(i+",");
		}
		System.out.println("]");
	}
	
	static int sumArr(int[] arr) {
		int sum = 0;
		
		for(int i:arr)
			sum+=i;
		return sum;
	}
	
	static void sortArr(int[] arr) { // arr 객체의 주소를 담고있음. reference 
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<(arr.length-1)-i; j++) {
				if(arr[j+1] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
