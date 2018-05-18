import java.io.*;
import java.net.*;

class Echo_S 
{
	public static void main(String[] args) 
	{
		ServerSocket theServer;
		Socket theSocket = null;
		InputStream is;
		BufferedReader reader;
		OutputStream os;
		BufferedWriter writer;
		String theLine;
		
		try{
			theServer = new ServerSocket(7);
			System.out.println("클라이언트와의 접속을 기다리는 중..");
			
			theSocket = theServer.accept(); // 소켓 생성
			System.out.println("접속 완료");

			is = theSocket.getInputStream();
			reader = new BufferedReader(new InputStreamReader(is));
			
			os = theSocket.getOutputStream();
			writer = new BufferedWriter(new OutputStreamWriter(os));
			
			while((theLine = reader.readLine()) != null){
				System.out.println(theLine); // 받은 데이터를 화면에 출력함.
				writer.write(theLine+"\r\n");
				writer.flush(); // 클라이언트에 데이터를 재전송
			}
		}catch(UnknownHostException e){
			System.out.println(e);
		}catch(IOException e){
			System.out.println(e);
		}finally{
			if(theSocket!=null){
				try{
					theSocket.close();
				}catch(IOException e){
					System.out.println(e);
				}
			}
		}
	}
}
