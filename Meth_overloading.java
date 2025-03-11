package java_code;

import java.util.Scanner;

class Test {
	void mul(int a,int b) {
		System.out.println(a*b);
	}
	void mul(int c,int d,int e) {
		System.out.println(c*d*e);
	}
}
public class P1 {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		int e=s.nextInt();
		
		Test t1=new Test();
		t1.mul(a, b);
		t1.mul(c,d,e);
	}

}
