import java.net.*;
import java.io.*;

class URLConnectionOutput 
{
	public static void main(String[] args) 
	{
		try{
			URL url = new URL("https://www.naver.com");
			URLConnection conn = url.openConnection(); // connect 메소드에 의해 실제 연결
			conn.setDoOutput(true); // 출력용으로 사용하기 위해 설정
			OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream()); // 출력 스트림 염
			wr.write("/search.naver?query="+URLEncoder.encode("자바"));

			wr.flush();
			wr.close();

			String line = null;
			BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			while((line=rd.readLine()) != null){
				System.out.println(line);
			}
			rd.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
