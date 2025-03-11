package java_code;

import java.util.Scanner;

class Test1 {
	int n;
	
	void fun(int a,int b,int c) {
		
		System.out.println(a*b*c);
		
	}
	
	void fun(int a,int b) {
	
		System.out.println(a+b);
	
	}
	void fun(int num) {
		
		System.out.println("wromg input");
		
	}
}

public class P3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//int a=s.nextInt();
		//int b=s.nextInt();
		//int c=s.nextInt();
		int n=s.nextInt();
		Test1 t1=new Test1();
		if(n==2) {
			int a=s.nextInt();
			int b=s.nextInt();
			t1.fun(a, b);
		}
		else if(n==3) {
			int a=s.nextInt();
			int b=s.nextInt();
			int c=s.nextInt();
			t1.fun(a, b, c);
		}
		else {
			System.out.println("wromg input");
		}
		//Test1 t1=new Test1();
		
        
      

	}

}
