import java.io.*;
import java.net.*;
import java.util.Date;

class DayTime_S 
{
	public final static int daytimeport = 13;
	// 상수
	public static void main(String[] args) 
	{
		ServerSocket theServer;
		Socket theSocket = null;
		BufferedWriter writer;
		try{
			theServer = new ServerSocket(daytimeport);
			while(true){
				try{
					theSocket = theServer.accept();
					// 클라이언트의 소켓 접속을 기다리다가 접속되면 소켓을 생성해 반환함.
					System.out.println("접속 완료");
					
					// date 출력 
					OutputStream os = theSocket.getOutputStream();
					writer = new BufferedWriter(new OutputStreamWriter(os));
					Date now = new Date(); // 날짜를 구함
					writer.write(now.toString()+"\r\n");
					writer.flush(); // stream에 남아있는 데이터를 강제로 내보내는 역할.
					theSocket.close();

				}catch(IOException e){
				
				}finally{
					try{
						if(theSocket!=null) theSocket.close();
					}catch(IOException e){
						System.out.println(e);
					}
				}
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
