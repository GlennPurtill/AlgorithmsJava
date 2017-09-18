import java.util.*;
public class SOEclosestprimeLAB4GA{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int size = n*n;
		
		boolean sieve[] = new boolean[size];
		sieve[0] = false;
		sieve[1]= false;
		for(int i = 2; i<size; i++){
			sieve[i]= true;
		}
		int record = n, answer = 0;

		for(int i = 2; i < size; i++){
			if(sieve[i] == true){
				if(Math.abs(n - i) < record){ 
					record = Math.abs(n - i); 
					answer = i;
				}
			else
				break;

			for(int j = i+i; j < size; j+=i) 
				sieve[j] = false;
			}
		}
		System.out.println(answer);
		
	}
}