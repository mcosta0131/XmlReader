package calc.client;

import a.b.c.Calculator;
import a.b.c.CalculatorPortType;

public class CalcClient {

	public static void main(String[] args) {
		int a = 10;
        int b = 12;
		
       Calculator calc = new Calculator();
       CalculatorPortType calcOp = calc.getCalculatorHttpSoap11Endpoint();
		
       System.out.println(calcOp.add(a, b));
        
	}

}
