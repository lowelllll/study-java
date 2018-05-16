import java.net.*;
class  InetAddressTest1
{
	public static void main(String[] args) throws UnknownHostException // InetAddress class의 static 메소드는 UnknownHostException 예외를 발생시키기 때문에 예외처리를 해줘야함.
	{
		InetAddress address = InetAddress.getLocalHost(); // 로컬호스트의 InetAddress 객체 반환
		System.out.println("로컬 컴퓨터의 이름:"+address.getHostName()); // 호스트 이름을 문자열로 반환
		System.out.println("로컬 컴퓨터의 IP 주소:"+address.getHostAddress()); // 호스트 IP 주소
		address = InetAddress.getByName("www.naver.com"); // host에 대응하는 InetAddress 객체 반환
		// 호스트를 찾을 수 없을 시 UnknownHostException 발생	
		System.out.println("www.naver.com 컴퓨터 이름과 IP 주소:"+address);
		// toString() 호스트이름/IP 주소 반환

		InetAddress sw[] = InetAddress.getAllByName("papago.naver.com"); // host에 대응하는 InetAddress 배열 반환
		for(int i=0; i<sw.length; i++){
			System.out.print(sw[i]);
		}
		
	}
}
