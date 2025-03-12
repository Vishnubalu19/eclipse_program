package java_code;

import java.util.Scanner;

abstract class Complex {
	abstract void add(int r1,int r2,int i1,int i2);
	abstract void sub(int r1,int r2,int i1,int i2);
	abstract void mul(int r1,int r2,int i1,int i2);
	abstract void div(int r1,int r2,int i1,int i2);
}

class Add extends Complex { 
	void add(int r1,int r2,int i1,int i2) {
		System.out.println((double)(r1+r2) + "+" + (double)(i1+i2));
	}
	void sub(int r1,int r2,int i1,int i2) {
		
	}
	void mul(int r1,int r2,int i1,int i2) {
		
	}
	void div(int r1,int r2,int i1,int i2) {
		
	}
}

class Sub extends Complex {
	void add(int r1,int r2,int i1,int i2) {
		
	}
	void sub(int r1,int r2,int i1,int i2) {
		System.out.println((double)(r1-r2) + "-" + (double)(i1-i2));
		
	}
	void mul(int r1,int r2,int i1,int i2) {
		
	}
	void div(int r1,int r2,int i1,int i2) {
		
	}
	
}

class Mul extends Complex {
    void add(int r1,int r2,int i1,int i2) {
		
	}
	void sub(int r1,int r2,int i1,int i2) {
		
		
	}
	void mul(int r1,int r2,int i1,int i2) {
		System.out.println((double)(r1*r2) + "*" + (double)(i1*i2));
		
	}
	void div(int r1,int r2,int i1,int i2) {
		
	}
	
}

class Div extends Complex {
void add(int r1,int r2,int i1,int i2) {
		
	}
	void sub(int r1,int r2,int i1,int i2) {
		
		
	}
	void mul(int r1,int r2,int i1,int i2) {
		
		
	}
	void div(int r1,int r2,int i1,int i2) {
		System.out.println((double)(r1/r2) + "/" + (double)(i1/i2));
		
	}
	
}
public class P5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r1=s.nextInt();
		int r2=s.nextInt();
		int i1=s.nextInt();
		int i2=s.nextInt();
		Complex c;
		c=new Add();
		c.add(r1, r2, i1, i2);
		c=new Sub();
		c.sub(r1, r2, i1, i2);
        c=new Mul();
        c.mul(r1, r2, i1, i2);
        c=new Div();
        c.div(r1, r2, i1, i2);
	}

}
