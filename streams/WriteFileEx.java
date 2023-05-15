import java.io.*;

public class WriteFileEx{

	public static void main(String[] args){

	FileWriter fw = null;
	PrintWriter pw = null;


	try{
		fw = new FileWriter("output.txt");

		pw = new PrintWriter(fw);


	String s1 = "Hllo Don!....";

	String s2 = "BITF20m505.....";

	pw.println(s1);
	pw.println(s2);

	pw.flush();
	
	pw.close();
	fw.close();


	


}catch(IOException ioex){
	System.out.println(ioex);
}

}


}