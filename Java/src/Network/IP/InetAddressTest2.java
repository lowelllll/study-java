import java.net.*;

class InetAddressTest2 
{
	public static void main(String[] args) 
	{
		InetAddress myIP = null , myIPs[] = null;
		try{
			myIP = InetAddress.getByName("125.209.222.142");
			System.out.println("getHostName:"+myIP.getHostName());
			System.out.println("getHostAddr:"+myIP.getHostAddress());
			System.out.println("toString:"+myIP);
			System.out.println();
		}catch(UnknownHostException e){
			System.out.println(e);
		}

		try{
			myIP = InetAddress.getByName("www.naver.com");
			System.out.println("getHostName:"+myIP.getHostName());
			System.out.println("getHostAddr:"+myIP.getHostAddress());
			System.out.println("toString:"+myIP);
			System.out.println();
		}catch(UnknownHostException e){
			System.out.println(e);
		}

		try{
			myIP = InetAddress.getLocalHost();
			System.out.println("getHostName:"+myIP.getHostName());
			System.out.println("getHostAddr:"+myIP.getHostAddress());
			System.out.println();
		}catch(UnknownHostException e){
			System.out.println(e);
		}

		byte inet[] = myIP.getAddress();
		System.out.print("getHostAddr:");
		
		for(int i=0;i<inet.length;i++){
			System.out.print(inet[i]+".");
		} // 바이트 배열로 반환
		
		System.out.println();
		System.out.println("getHostAddr:");

		for(int i=0; i<inet.length;i++){
			System.out.print(((inet[i]<0) ? (inet[i]+256) : inet[i])+".");
		}

		System.out.println();
		try{
			myIPs = InetAddress.getAllByName("www.naver.com");  // host에 대응하는 InetAddress 배열 반환
			for(int i=0; i<myIPs.length;i++){
				System.out.println("getHostName:" + myIPs[i].getHostName());
				System.out.println("getHostAddr:"+ myIPs[i].getHostAddress());
			}
		}catch(UnknownHostException e){
			System.out.println(e);
		}

	}
}
