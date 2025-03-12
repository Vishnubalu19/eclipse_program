package java_code;

import java.util.Scanner;

abstract class Abstract {
	
	abstract void getValues();
	abstract void divisorSum(int n);
}
class Calculator extends Abstract {
	
	void getValues() {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
	}
	void divisorSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n % i == 0) {
			sum=sum+i;
		}
		
		}
		System.out.println("sum of Divisor: " + sum);
	}
}
public class P7 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Abstract ab = new Calculator();
		ab.divisorSum(num);
		
	}

}
