import java.io.*;

public class BufferedIOTest
{
	public static void main(String[] args) 
	{
		int i,len = 0;
		byte[] buffer = new byte[256];
		BufferedInputStream in = null;
		BufferedOutputStream out = null;

		String sourceFile = "src\\BufferedIOTest.java";
		String destFile = "output.txt";
		System.out.println("Source File Name :"+sourceFile);
		System.out.println("Destination File Name:"+destFile);

		try{
			in = new BufferedInputStream(new FileInputStream(new File(sourceFile))); // 입력을 받는 처리를 하는 소스?
			FileOutputStream file_out = new FileOutputStream(destFile); // 출력할 파일
			out = new BufferedOutputStream(file_out,256);
		}
		catch (FileNotFoundException e)
		{
			System.out.println(e);
		}

		try{
			while((i=in.read(buffer))!=-1){ //256 만큼 읽어들임.
				out.write(buffer);
				len += i;
				System.out.println("현재 읽은 데이터 ["+i+","+len+"], 나머지 데이터 ["+in.available()+"]");
			}
			in.close();
			out.close();
			System.out.println(len+"바이트 데이터를 복사 완료...");
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
}
