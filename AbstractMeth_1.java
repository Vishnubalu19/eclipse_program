package java_code;

import java.util.Scanner;

abstract class Shape {
	abstract void rectArea(double l,double b);
	abstract void cirArea(double r);
	abstract void squArea(double s);
}

class Area extends Shape {
	void rectArea(double l,double b) {
		System.out.println(l * b);
	}
	void cirArea(double r) {
		System.out.println(Math.PI * r * r);
	}
	void squArea(double s) {
		System.out.println(s * s);
	}
}
public class P6 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		double r=sc.nextDouble();
		double s=sc.nextDouble();
		Shape sp;
		sp=new Area();
		sp.rectArea(l , b);
		sp.cirArea(r);
		sp.squArea(s);
	}

}
