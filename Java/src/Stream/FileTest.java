import java.io.File;

class FileTest 
{
	public static void main(String[] args) 
	{
		File f1 = new File("FileTest.txt");
		System.out.println("f1.getPath():"+f1.getPath());
		System.out.println("f1.getAbsolutePath():"+f1.getAbsolutePath());
		System.out.println("f1.getName():"+f1.getName());
		System.out.println("f1.toString():"+f1.toString());
		try
		{
			System.out.println("f1.toURL():"+f1.toURL());	
		}
		catch (java.net.MalformedURLException e)
		{
			System.out.println("f1.toURL():"+e);
		
		}
		System.out.println("f1.canRead():"+f1.canRead());
		System.out.println("f1.canWrite():"+f1.canWrite());
		System.out.println("f1.isAbsolute():"+f1.isAbsolute());
		System.out.println("f1.isDirectory():"+f1.isDirectory());
		System.out.println("f1.isFile():"+f1.isFile());
		System.out.println("f1.isHidden():"+f1.isHidden());
		System.out.println("f1.lastModified():"+f1.lastModified());
		System.out.println("f1.length():"+f1.length());
		System.out.println("f1.exists():"+f1.exists());
	}
}
