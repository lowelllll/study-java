package array;

public class ArrayEx9 {

	public static void main(String[] args) {
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		
		int ko = 0;
		int eng = 0;
		int math = 0;
		
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("======================");
		
		for(int i=0; i<score.length; i++) {
			int sum = 0; 
			float avg = 0.0f;
			
			ko += score[i][0];
			eng += score[i][1];
			math += score[i][2];
			
			System.out.printf("%3d ",i+1);
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%3d ", score[i][j]);
			}
			
			System.out.printf("%3d ",sum);
			System.out.printf("%5.2f\n ",sum/(float)score[i].length);
		}
		
		System.out.printf("총점 : 국어 %d , 영어 %d, 수학 %d", ko,eng,math);
		
	}

}
