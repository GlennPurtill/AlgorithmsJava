import java.util.*;
public class randomNUMARRAY{
	public static void main(String args[]){
		
		int ar[] = new int[5], random = 0, i = 0;
		
		for(int y = 0; y < ar.length; y++){
			ar[y] = -1;
		}
		while(!(isFull(ar))){
			random = (int)Math.random() * 100;
			if(!(in(ar, random))){
				ar[i] = random;
				i++;
			}
		}
	}
	public static boolean isFull(int ar[]){
		for(int i = 0; i < ar.length; i++){
			if(ar[i]==-1)
				return false;
			
		}return true;
	}
	public static boolean in(int ar[],int r){
		for(int i = 0; i < ar.length; i++){
			if(ar[i]==r)
				return true;
			
		}return false;
	}
}