
import java.util.*;
import javax.swing.*;


public class inputGui{
	public static void main(String [] args){

	String name , roll, deg;
	

	name = JOptionPane.showInputDialog("your name :");
	
	roll = JOptionPane.showInputDialog("yor rol: ");

	deg = JOptionPane.showInputDialog("deg :");

	JOptionPane.showInputDialog(null, "profile :" +name+roll+deg);


	
}


}