package array;

public class ArrayEx5 {

	public static void main(String[] args) {
		// 버블정렬
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10);
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0; i<arr.length-1; i++) {
			boolean flag = false;
			
			for(int j=0; j<(arr.length-1)-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					flag = true;
				}
			}
			
			if(!flag) break; // 자리없음이 발생하면 반복문을 벗어남.
			
			for(int k=0; k<arr.length; k++) {
				System.out.print(arr[k]+" ");
			}
			
			System.out.println();
			
		}
		
		
		
	}

}
