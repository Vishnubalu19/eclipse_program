package java_code;
import java.util.*;

class Bicycle {
	int gear;
	int speed;
	
	Bicycle(int gear,int speed) {
	
		this.gear=gear;
		this.speed=speed;
	}
	void show() {
		System.out.println("gear: " + gear);
		System.out.println("speed: " + speed);
	}
	
}
class MountainBike extends Bicycle {
	int seatHeight;
	
	MountainBike(int gear,int speed,int seatHeight) {
		super(gear,speed);
		this.seatHeight=seatHeight;
	}
	void display() {
		show();
		System.out.println("seatheight: " + seatHeight);
	}
	
}

public class demo {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		int gear=s.nextInt();
		int speed=s.nextInt();
		int seatHeight=s.nextInt();
		
		MountainBike m = new MountainBike(gear,speed,seatHeight);
		m.display();
		
		
		
	}

}
