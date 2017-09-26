package calculator;

public class CalculatorPrototype implements CalculatorIF {

	@Override
	public int sum(int m, int n) {
		//if n is negative, do a subtraction
		if(n<0){
			return subtract(m,-n);
		}
		for (int i=0;i<n;i++){
			m++;
		}
		return m;
	}

	@Override
	public int divide(int m, int n) {
		if(n==0){
			throw new ArithmeticException();
		}
		//use positive values and change sign, according to initial variables, at return
		int tempM=m<0?-m:m;
		int tempN=n<0?-n:n;
		int res=0;
		while(tempM>0){
			tempM-=tempN;
			res++;
		}
		if(tempM!=0){
			res-=1;
		}
		return isSignDiscord(m,n)?-res:res;
	}
	
	@Override
	public int subtract(int m, int n) {
		//if n is negative, do a sum
		if(n<0){
			return sum(m,-n);
		}
		for (int i=0;i<n;i++){
			m--;
		}
		return m;
	}

	@Override
	public int multiply(int m, int n) {
		int res=0;
		//use positive values and change sign, according to initial variables, at return
		int tempM=m<0?-m:m;
		int tempN=n<0?-n:n;
		for(int i=0;i<tempN;i++){
			res+=tempM;
		}
		return isSignDiscord(m,n)?-res:res;
	}
	
	//Return false if m and n are either both positive or negative
	private boolean isSignDiscord(int m, int n){
		return (m<0 && n>=0) || (n<0 && m>=0);
	}
}
