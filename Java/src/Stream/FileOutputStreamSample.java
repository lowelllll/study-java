// fileOutput

import java.io.*;

class  FileOutputStreamSample
{
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream f = new FileOutputStream(args[0]);
		// args[0] 파일 이름 ex) FileOutputStreamSample fileoutput.txt 
		for (int i=0; i<5 ;i++ )
		{
			f.write(i);
		}
		for (char c = 'A';c <='z' ; c++)
		{
			f.write(c); // 문자 c 저장
		}
		f.close();
	}
}
