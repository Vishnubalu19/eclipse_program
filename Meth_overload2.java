package java_code;

import java.util.Scanner;

class Hello {
	void sayHello() {
		System.out.println("Hello");
	}
	void sayHello(String a) {
		System.out.println("hello  " + a);
	}
}
public class P2 { 
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		Hello h1=new Hello();
		h1.sayHello();
		h1.sayHello(a);
	}

}
