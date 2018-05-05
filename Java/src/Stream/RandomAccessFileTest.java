import java.io.*;
class  RandomAccessFileTest
{
	static String s = "I Like you!";
	static String q  = "love";
	public static void main(String[] args) throws Exception
	{
		RandomAccessFile rf = new RandomAccessFile("RandomAccessTest.txt","rw");
		rf.writeChars(s);
		rf.close();
		rf = new RandomAccessFile("RandomAccessTest.txt","rw");
		System.out.println("before:"+rf.readLine());
		rf.seek(4);
		rf.writeChars(q);
		rf.close();
		rf = new RandomAccessFile("RandomAccessTest.txt","r");
		System.out.println("after:"+rf.readLine());
		rf.close();
		}
}
