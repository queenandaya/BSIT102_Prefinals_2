import java.io.*;
import java.util.*;

public class baseDecrypt
{
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		Base64.Decoder decodes = Base64.getDecoder();
				
		System.out.println("Enter your file name:");
		File file = new File(scan.nextLine() + ".qoa");
		scan = new Scanner(file);
		
		String name = scan.next();
		
		String decoded = new String(decodes.decode(name));
		
		System.out.println(decoded);
		
	}
}