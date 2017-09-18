import java.util.Scanner;
public class Queue{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
     	        Queue1 theQ = new Queue1(20);
                int length = 0;
               String temp1 = new String();
               while(sc.hasNext()){
                 String temp = sc.next();
              if(temp.equals("INSERT")){
                  theQ.insert(sc.next());  
              }
              else if(temp.equals("REMOVE")){
                  if(!theQ.isEmpty())
                 	 theQ.remove();
              }
              }
if(theQ.isEmpty()){
System.out.println("empty");
}
else{
    System.out.println(theQ.remove());
}
    }
}

class Queue1{
    
    private int maxSize;
    private String[] queArray;
    private int front;
    private int rear;
    private int nItems;
    
    public Queue1(int s){
        maxSize = s;
        queArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    
    public boolean insert(String item){ 
    if(isFull())
        return false;
    if(rear == maxSize-1) 
        rear = -1;
      rear++;
      queArray[rear] = item; 
      nItems++; 
      return true; 
    
    }
      
    public String remove(){
    if(isEmpty())
        return null;
       String temp = queArray[front];
       front++;
      if(front==maxSize)
           front = 0;
       nItems--;
       return temp;
    
    } 

    public boolean isEmpty(){ 
        return (nItems==0);
    }
        
    public boolean isFull(){
        return (nItems==maxSize);
    }
        
    public int size(){ 
        return nItems;
    } 
}