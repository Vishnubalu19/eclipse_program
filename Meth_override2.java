package java_code;

import java.util.Scanner;

class Vechile {
	void move(String str1) {
		System.out.println(str1);
	}
}
class Motor extends Vechile {
	void move(String str) {
		System.out.println(str );
	}
}
public class P4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String str1=s.nextLine();
		Motor m1=new Motor();
		Vechile v1=new Vechile();
		
		v1.move(str1);
		m1.move(str);
	}

}
