import java.util.*;
import java.util.Arrays;
public class secondlargestLAB2GB{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[]= new int[n];
		for(int i = 0; i<n ; i++){
			ar[i]=sc.nextInt();
		}
		Arrays.sort(ar);
		System.out.println(ar[n-2]);
	}
}