import java.io.*;

public class StringInput
{
	public static void main(String[] args) throws IOException  
	{
		if(args.length < 1){
			System.out.println("Usage:Java StringInput file");
			return ;
		}
		String inputString;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // System.in으로부터 입력 받은 바이트 정보를 InputStreamReader을 통해 캐릭터 
		// 스트림으로 바꿔줌
		// BufferedReader를 사용해 입력의 효율성을 증대
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[0])));
		
		while ((inputString = br.readLine())!=null) // 한줄 단위로 읽어 들여 BufferedWriter에 한줄씩 기록함. 줄바꿈 문자 더함.
		{ // outputStreamWriter를 통해 BufferedWriter에 쓰여진 캐릭터 스트림을 바이트 스트림으로 바꿈.
			bw.write(inputString + "\n");
			// FileOututStream으로 실행시 주었던 인자의 args[0] 파일 이름으로 저장함.
		}
		bw.close();
		br.close();
	}
}
