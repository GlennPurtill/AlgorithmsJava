import java.util.*;
public class Stack{
	public static void main(String args[]){
		
			Scanner sc = new Scanner(System.in);
			int length = sc.nextInt();
			Stack theStack = new Stack(length);
			for(int i =0; i <= length-1; i++){
				theStack.push(sc.next().charAt(0));
			}
		//	while(!theStack.isEmpty()){
		//	System.out.println(theStack.pop());
			
		//	}
			System.out.println(theStack.peek());
			System.out.println(theStack.isEmpty());
			theStack.makeEmpty();
			System.out.println(theStack.isFull());
			
		}
		 private int maxSize; // size of stack array
		 private char[] stackArray;
		 private int top; // top of stack
		 
	public Stack(int s) { // constructor

		 maxSize = s; // set array size
		 stackArray = new char[maxSize]; // create array
		 top = -1; // no items yet
	} 
	public void push(char j) { // put item on top of stack
			top++;
         stackArray[top] = j; // increment top, insert item
	}
	public char pop() { // take item from top of stack

		 return stackArray[top--]; //access item, decrement top
	}
	public char peek() { // peek at top of stack

	 return stackArray[top];
	} 
	public boolean isEmpty() { // true if stack is empty

	 return (top == -1);
	}
	public boolean isFull() { // true if stack is full

 		return (top == maxSize-1);
	}
	public void makeEmpty() { // empty stack

	top=-1;

	}
	
}