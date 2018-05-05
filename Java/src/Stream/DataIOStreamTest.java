// DataInput/OutputStream 

import java.io.*;
public class DataIOStreamTest
{
	public static void main(String[] args) 
	{
		char in_ch = 'a',out_ch = (char)0;
		int in_iNum = 1234567,out_iNum = 0;
		long in_lNum = 1234512,out_lNum = 0;
		float in_fNum = 0.12345f,out_fNum= 0.0f;
		String in_str = "Data Input Output StreamTest!!!",out_str="";
		DataInputStream in = null;
		DataOutputStream out = null;

		try{
			FileOutputStream file_out = new FileOutputStream("output.txt");
			out = new DataOutputStream(file_out); // data 출력 객체 생성
		}catch(FileNotFoundException e){
			System.out.println(e);
		}

		try{
			out.writeChar(in_ch); // 파일 객체에 출력
			out.writeInt(in_iNum);
			out.writeLong(in_lNum);
			out.writeFloat(in_fNum);
			out.writeUTF(in_str);
			out.close();
		}catch(IOException e){
			System.out.println(e);
		}
		// 파일로부터 데이터를 가져옴
		try{
			FileInputStream file_in = new FileInputStream("output.txt");
			in = new DataInputStream(file_in);
		}catch(FileNotFoundException e){
			System.out.println(e);
		}
		try
		{
			out_ch = in.readChar(); // 스트림에서 읽은 문자를 반환함.
			out_iNum = in.readInt(); // 파일로부터 데이터를 읽어들임 (input)
			out_lNum = in.readLong();
			out_fNum = in.readFloat();
			out_str = in.readUTF();
		}
		catch (IOException e)
		{
			System.out.println(e);
		}

		System.out.println(out_ch);
		System.out.println(out_iNum);
		System.out.println(out_lNum);
		System.out.println(out_fNum);
		System.out.println(out_str);
	}
}
