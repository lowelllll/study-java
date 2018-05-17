import java.io.*;
import java.net.*;

class DayTime_C
{
	public static void main(String[] args) 
	{
		Socket theSocket;
		String host;
		InputStream is;
		BufferedReader reader;

		if(args.length > 0){
			host = args[0];
		}else{
			host = "localhost";
		}

		try{
			theSocket = new Socket(host,13); // daytime 서버에 접속함.
			is = theSocket.getInputStream();
			reader = new BufferedReader(new InputStreamReader(is)); // 성능 증진 목적
			String theTime = reader.readLine();
			System.out.println("호스트의 시간은"+theTime+"입니다");
		}catch(UnknownHostException e){
			System.err.println(args[0]+"의 호스트를 찾을 수 없습니다.");
		}catch(IOException e){
			 System.err.println(e);
		}
	}
}
