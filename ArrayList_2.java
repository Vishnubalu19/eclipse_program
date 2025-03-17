package java_code;
import java.util.*;
public class Al {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> al=new ArrayList<>();
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
			al.add(sc.nextLine());
		}
		Collections.sort(al);
		System.out.println(al);
		
	}

}
