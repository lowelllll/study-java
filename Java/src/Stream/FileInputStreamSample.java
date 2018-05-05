import java.io.*;

class  FileInputStreamSample 
{
	public static void main(String[] args) throws java.io.IOException
	{
		FileOutputStream f = new FileOutputStream(args[0]);
		// fileoutputstream 객체 반환
		
		for (int i=0;i<5 ;i++ )
		{
			f.write(i);
		}
		f.close();

		File file = new File("C:\\Users\\lowel\\Documents\\java\\fileinput.txt");
		FileInputStream input = null;
		try{
			input = new FileInputStream(file);
			int i=0;
			while((i = input.read()) != -1){ // 읽기 
				System.out.write(i);
			}
		}	
		catch (IOException e)
		{
			System.out.println(e);
		}finally {
			input.close();
			f.close();
		}
	}
}
