package java_code;

import java.util.Scanner;

class Emply {
	int a;
	int b;
	Emply(int a,int b) {
		this.a=a;
		this.b=b;
	}
	void show() {
		System.out.println(" employee id: " + a);
		System.out.println("emplyee hours: " + b);
	}
}

class Salary extends Emply {
	
	
	Salary(int a,int b) {
		super(a,b);
		
	}
	void mul() {
		
		
		System.out.println("total salary: " + b*50);
	}
}

 

public class Inherits {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		Salary s = new Salary(a,b);
		s.show();
		s.mul();
		
	}

}
