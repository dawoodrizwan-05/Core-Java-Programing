
import java.util.*;
import java.swing.*;


public class inputGui{
	public static void main(String [] args){

	String name , roll, deg;
	

	name = jOptionPane.showInputDialog("your name :");
	
	roll = jOptionPane.showInputDialog("yor rol: ");

	deg = jOptionPane.showInputDialog("deg :");

	jOptionPane.showInputDialog(null, "profile :" +name+roll+deg);


	
}


}