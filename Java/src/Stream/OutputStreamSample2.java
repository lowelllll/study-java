import java.io.*;
class  OutputStreamSample2
{
	public static void main(String[] args) throws IOException
	{
		byte number[] = new byte[7];
		int j = 270;
		for (int cnt=0;cnt<7 ;cnt ++ )
		{
			number[cnt] = 0;
		}
		System.out.println("7개의 문자를 입력하시오.");
		System.in.read(number);// 입력 받음
		System.out.write(number,2,5);// 일정한 부분만 출력, number[2]부터 5글자
		System.out.println();
		System.out.write(j); // 270에 해당하는 문자 출력
		System.out.println();
		System.out.write(number); 
		System.out.println();
	}
}
