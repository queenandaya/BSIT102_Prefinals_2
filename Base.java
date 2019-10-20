import java.util.*;
import java.io.*;

public class baseEncrypt
{
	public static void main(String[] args) throws IOException
	{
		ArrayList<String> words = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		boolean con = false;
		
		while(!con)
		{
			String input = scan.nextLine();
			
			if(!input.equals(":q"))
			{
				Base64.Encoder encode = Base64.getEncoder();
				String encoded = encode.encodeToString(input.getBytes());
				words.add(encoded);
			}
			else
			{
				con = true;
			}
		}
		
		System.out.println("Save or discard?");
		String save = scan.next();
		
		if(save.equals("save"))
		{
			System.out.println("Enter your file name: ");
			String filename = scan.next();
			
			Writer fw = new FileWriter(filename + ".qoa");
			
			for(String a: words)
			{
				fw.write(a);
			}
			fw.close();
		}
		else
		{
			System.out.println("Not saved");
		}
		}
	}
