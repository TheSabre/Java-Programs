
public class UsingFinal {
	public static void main(String args[]){
		UsingFinal obj = new UsingFinal();
		obj.VarArgs(5,4,2,3,4,5,6,1,2,3,5);
	}
	public void VarArgs(int ... v){
		for(int x : v){
			System.out.println(x);
		}
	}
}
