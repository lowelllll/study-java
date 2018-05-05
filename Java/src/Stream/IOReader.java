import java.io.*;

public class IOReader  
{
	public static String getString(){
		StringBuffer s = new StringBuffer();
		Reader reader = new InputStreamReader(System.in);
		char ch;
		try{
			while((ch=(char)reader.read()) != '\n'){
				s.append(ch);
			}
		}
		catch (Exception e){
			s = new StringBuffer("");
		}
		return s.toString().trim();
	}
	public static int getInt(){
		String s = getString();
		int n ;
		try
		{
			n = Integer.parseInt(s);
		}
		catch (Exception e)
		{
			n = 0;
			System.out.println("error:숫자 형식이 틀립니다.");
		}
		return n;
	}
	public static void main(String[] args) 
	{
		String nameStr,addStr;
		int age;
		IOReader reader = new IOReader();
		System.out.println("학생의 이름:");
		nameStr = reader.getString();
		System.out.println("학생의 주소:");
		addStr = reader.getString();
		System.out.println("학생의 나이:");
		age = reader.getInt();
		System.out.println("학생의 입력 정보를 확인합니다.");
		System.out.println("학생의 이름:"+nameStr);
		System.out.println("학생의 주소:"+addStr);
		System.out.println("학생의 나이:"+age);
	}
}
