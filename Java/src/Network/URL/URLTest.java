import java.net.*;
import java.io.*;

public class URLTest 
{
	public static void main(String[] args) 
	{
		try{
			URL home = new URL("http://www.google.com");
			BufferedReader br;
			String line;
				
			// host 정보 출력
			System.out.println("Port:"+home.getPort());
			System.out.println("Protocol:"+home.getProtocol());
			System.out.println("HostName:"+home.getHost());
			System.out.println("File:"+home.getFile());
			System.out.println("Ref:"+home.getRef());

			// URL 객체로의 스트림을 열어 받는 스트림을 버퍼에 저장함.
			br = new BufferedReader(new InputStreamReader(home.openStream()));
			while((line = br.readLine())!= null){
				System.out.println(line);
			}
			br.close();
		}catch(Exception e){
			System.out.println("Exception:"+e);
		}
	}
}
