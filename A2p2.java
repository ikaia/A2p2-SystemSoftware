import java.util.Random;
import java.util.Scanner;

public class A2p2 {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int num= Integer.parseInt(args[0]); //COMMAND LINE
		
		char arr []=new char[num]; //Array
		for(int i=0;i<num;i++) {
			int m = (int)( 65+Math.random()*26);
			arr[i]=(char)m; //covert number to characters then store in array
		}
		int m = (char) Math.random();// Generate a string of m random upper case English characters 
			
		
		
		System.out.print("Generated a string of " + num + " chars.\n"
				+ "Original random upper case string:\n"); 
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		
		System.out.print("\nReverse-offset lower case string:");
		
		System.out.println();
		MethodOne(arr); //Call Method One
		MethodTwo(arr); //Call Method Two
		MethodThree(arr); //Call Method Three
}
	
	
public static void  MethodOne (char arr []) { //0-19
		
 for (int i = 0; i < arr.length/3; i++) { //One-third of the task 
		int m = (int) arr[i]+31; //Add numbers
		if((int) arr[i]==65) {
			System.out.print("z");
		}else {
			arr[i]= (char) m; //Change to characters
			System.out.print(arr[i]);
		}
  }
}
	public static void  MethodTwo (char arr []) { //20-39
		
for (int i = arr.length/3; i < (arr.length/3)*2; i++) {  //Two-third of the task  
		int m = (int) arr[i]+31; //Add numbers
		if((int) arr[i]==65) {
			System.out.print("z");
		}else {
			arr[i]= (char) m; //Change to characters
			System.out.print(arr[i]);
		}
  }

			
}
		
	
	public static void  MethodThree (char arr []) { //40-59
		
for (int i = (arr.length/3)*2; i < arr.length; i++) {  //Last-third of the task 
	
		int m = (int) arr[i]+31; //Add numbers
		if((int) arr[i]==65) {
			System.out.print("z");
		}else {
			arr[i]= (char) m; //Change to characters
			System.out.print(arr[i]);
		}
  }
	}
	
			
			}
	


	



