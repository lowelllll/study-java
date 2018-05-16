import java.net.*;
import java.io.*; // UnsupportedEncodingException 예외클래스를 사용해야하기 때문에.

public class URLEnDecoder
{
	public static void main(String[] args) throws UnsupportedEncodingException // encode(), decode() 메소드를 사용하기 위해선 이 예외처리를 해줘야함.
	{
		String strData = URLEncoder.encode("인터넷 소프트웨어학과 = www.naver.com","utf-8");
		String strDeData = URLDecoder.decode(strData,"utf-8");
		System.out.println("Encoding된 문자열 :"+strData);
		System.out.println("Decoding된 문자열 :"+strDeData);
	}
}
