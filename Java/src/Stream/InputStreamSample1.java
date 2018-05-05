import java.io.*;

public class InputStreamSample1 
{
	public static void main(String[] args) throws java.io.IOException	 
	{
		byte[] buf = new byte[80];
		int numberR;
		while((numberR = System.in.read(buf))>=0){
			System.out.write(buf,0,numberR);
		}
	}
}
