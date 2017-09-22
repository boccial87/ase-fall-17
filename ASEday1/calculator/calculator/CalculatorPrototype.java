package calculator;

public class CalculatorPrototype implements CalculatorIF {

	@Override
	public int sum(int m, int n) {
		for (int i=0;i<n;i++){
			m++;
		}
		return m;
	}

	@Override
	public int divide(int m, int n) {
		int res=0;
		while(m>0){
			m-=n;
			res++;
		}
		if(m!=0){
			res-=1;
		}
		return res;
	}
	
	@Override
	public int mult(int m, int n){
		for(int i=1;i<n;i++){
			m+=m;
		}
		return m;
	}
}
