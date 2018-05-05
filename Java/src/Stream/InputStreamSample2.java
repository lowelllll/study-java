import java.io.*; 

class InputStreamSample2
{
	public static void main(String[] args) 
	{
		try{
			int bufferCapacity = 10;
			int size = 0;
			int dataRead;
			byte buffer[] = new byte[bufferCapacity];
			while ((dataRead = System.in.read(buffer,size,bufferCapacity-size)) >= 0) // 반환이 -1일경우 버퍼가 꽉참.
			{
				size += dataRead;
			}
			System.out.write(buffer,0,size);
			// size만큼 출력
		}catch(IOException e){
			System.err.println("스트림으로부터 데이터를 읽을 수 없습니다.");
		}
	}
}
