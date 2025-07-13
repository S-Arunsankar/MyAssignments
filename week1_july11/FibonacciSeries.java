package week1_july11;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		
		int x=0;
		int y=1;
		
		for(int i=0; i<n; i++) {
			System.out.println(x);
			int z=x+y;
			x=y; 
			y=z; 
		}

	}

}
