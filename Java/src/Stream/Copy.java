import java.io.*;

public class Copy
{
	public static void main(String args[]){
		try{
			FileReader input = new FileReader(args[0]); // 들어온 파일로부터 입력을 받음
			FileWriter output = new FileWriter(args[1]);
			int charsRead;
			while((charsRead = input.read())!=-1){ // 2바이트씩 읽어들여 writer를 통해 args[1] 파일에 2바이트씩 기록함.
				output.write(charsRead);
			}
			input.close(); // 열려있는 스트림을 close()를 통해 닫음.
			output.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}