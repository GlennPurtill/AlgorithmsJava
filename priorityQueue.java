import java.util.Scanner;
public class priorityQueue{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		priorityQueue q = new priorityQueue(n);
		for(int i =0; i<n;i++){
			String temp = sc.next();
			if(temp.equals("INS")){
				q.insert(sc.nextInt());
			}
		    else{
		    
		    	System.out.println(q.remove());
		    	break;
		   }
		   
		   
		
		}
	//	while(!q.isEmpty()){
	//		System.out.println("Start" + q.remove());
	//	}
	
	}
	 private int maxSize;
	 private int[] queArray;
	 private int front;
	 private int rear;
	 private int nItems;

public priorityQueue(int s){
     maxSize = s;
	 queArray = new int[maxSize];
	 front = 0;
	 rear = -1;
	 nItems = 0;
}
public void insert(int item){
	if(nItems==0)
		queArray[0]= item;
	else{
		int j = nItems;
		while(j>0&&queArray[j-1]>item){
			queArray[j]=queArray[j-1];
			j--;
		}
		queArray[j]=item;
	}
	nItems++;
}
public int remove(){
	if(nItems==0)
		return 0;
	    int temp = queArray[front];
	    front++;
	    if(front == maxSize)
	    	front =0;
	    nItems--;
	    return temp;
}
public boolean isEmpty(){
	return (nItems==0);
}

}
