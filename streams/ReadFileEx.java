import java.io.*;


public class ReadFileEx{
	
	public static void main(String[] args){
		
	FileReader fr = null;
	BufferedReader br = null;
try{
	fr = new FileReader("input.txt");
	br = new BufferedReader(fr);

	String line = br.readLine();

	while(line!=null)
	{
	
		System.out.println(line);
		line= br.readLine();
	}

	
	br.close();
	fr.close();

}catch(IOException ioex){
System.out.println(ioex);
}





}
	
}