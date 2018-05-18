// 입력한 문자열을 host로 지정한 서버에 출력하고 클라이언트 화면에도 출력하는 예제
import java.io.*;
import java.net.*;
class Echo_C 
{
	public static void main(String[] args) 
	{
		Socket theSocket = null;
		String host;
		InputStream is;
		BufferedReader reader,userInput;
		OutputStream os;
		BufferedWriter writer;
		String theLine;
		if (args.length>0)
		{
			host=args[0];
		}else{
			host = "localhost";
		}

		try{
			theSocket = new Socket(host,7);

			is = theSocket.getInputStream();
			reader = new BufferedReader(new InputStreamReader(is));
			userInput = new BufferedReader(new InputStreamReader(System.in));

			os = theSocket.getOutputStream(); 
			writer = new BufferedWriter(new OutputStreamWriter(os));
			System.out.println("전송할 문장을 입력하시오");

			while(true){
				theLine = userInput.readLine();
				if(theLine.equals("quit")) break;
				writer.write(theLine+'\r'+'\n');
				writer.flush();
				System.out.println(reader.readLine());
			}

		}catch(UnknownHostException e){
			System.err.println(args[0]+"호스트를 찾을 수 없습니다.");

		}catch(IOException e){
			System.err.println(e);
		}finally{
			try{
				theSocket.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
