package cui.deloitte.questionone;

public class Division extends Arithmetic {

	
	public Division(int num1, int num2) {
		  super(num1, num2);

		 }
	@Override
	public int calculate() {
		if(num1!=0 && num2 !=0)
			return (int)num1/num2;
		else {
			
			throw new ArithmeticException();
		}
		}
		
	}
