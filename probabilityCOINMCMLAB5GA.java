import java.util.*;
public class probabilityCOINMCMLAB5GA{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		double tosses = sc.nextDouble();
		int target = sc.nextInt();
		
		int successes = 0;
		
		double simulations = 100000;
		
		for(int i = 0; i < simulations; i++){
			int count = 0;
			int record = 0;
			for(int j = 0; j < tosses; j++){
				if(Math.random()>0.5){
					count++;
					if(count >=target)
						record++;
			}
			else 
				count = 0;
		}
		if(record>=1)
			successes++;
	}
	int result = (int)(Math.round((successes/simulations)*100));
	System.out.println(result);
}
}