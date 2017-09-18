
public class selectionSort{
	public static void main(String args[]){
		String ar[]={"n","x","c","b","t","f","d","i","a"};
		String temp;
		int min;
		for(int outer = 0; outer < ar.length; outer++){
			min = outer;
			for(int x = outer + 1; x < ar.length; x++){
				if(ar[x].compareTo(ar[min]) < 0)
					min = x;
				//	System.out.println(ar[outer].compareTo(ar[x]) + ar[outer] + " compare to " + ar[x]);
			        //	System.out.println("\nSwapping " + ar[outer] + " with  " + ar[x]);
			}
			temp = ar[outer];
			ar[outer] = ar[min];
			ar[min] = temp;	
		}
		for(int i = 0; i < ar.length; i++){
			System.out.print(ar[i] + " ");		
		}
	}
}

