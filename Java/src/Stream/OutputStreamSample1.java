import java.io.*;

public class OutputStreamSample1
{
	public static void main(String[] args) throws java.io.IOException 
	{
		for(byte cnt = 32; cnt<127; cnt++){
			System.out.write(cnt);
			if(cnt % 8 == 7)
				System.out.write('\n');
			else 
				System.out.write('\t');
		}
		System.out.write('\n');
	}
}
