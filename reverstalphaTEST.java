import java.util.Scanner;
public class reverstalphaTEST{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ar[] = new String[n];
	
		for(int i = 0; i < n; i++){
			ar[i] = sc.next();
		}
		for(int y = 0; y <n; y++){
			for(int i = 0; i < n; i++){
				if(ar[y].compareTo(ar[i]) > 0){
					String temp = ar[i];
					ar[i] = ar[y] ;
					ar[y] = temp;
					
				}
			}
		}
		for(int i = 0; i < n; i++){
			System.out.println(ar[i]);
		}
	}
}