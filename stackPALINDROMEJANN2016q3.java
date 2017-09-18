import java.util.*;
public class stackPALINDROMEJANN2016q3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String fs = sc.nextLine(), reverse = new String();
		fs = fs.toLowerCase();
		fs = fs.replace(" ","");
		
		
		stackPALINDROMEJANN2016q3 theStack = new stackPALINDROMEJANN2016q3(fs.length());
		for(int i = 0; i<fs.length();i++){
			theStack.push(fs.charAt(i));
		}
		for(int i = 1; i<=fs.length();i++){
			reverse += theStack.pop();
		}
		if(fs.equals(reverse))
			System.out.println("TRUE");
		else
			System.out.println("False");
		
		
	}
	
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public stackPALINDROMEJANN2016q3(int s){
		
		maxSize = s;
		stackArray = new char[maxSize];
		top=-1;
	}
	
	public void push(char j){
		top++;
		stackArray[top]=j;
	}
	public char pop(){
		return stackArray[top--];
	}
	
}