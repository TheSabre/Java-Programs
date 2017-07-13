import java.util.Scanner;

public class PrimeCompo {
	private static Scanner scan;
	
	public static void main(String args[]){
		int count = 0,n,i,j;
		scan = new Scanner(System.in);
		
		System.out.println("Until what number do you want the prime numbers to show up?");
		
		n = scan.nextInt();
		
		System.out.println("1 is neither prime nor composite");
		
		for(i=2;i<=n;i++){
			for(j=2;j<i;j++){
				if((i%j)==0){
					++count;
				}
				if(count>0){
					break;
				}
			}
			if(count==0){
				System.out.println(i);
			}
			else if(count > 0){
				count = 0;
			}
		}
		
		
	}
}
