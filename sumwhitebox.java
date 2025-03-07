
package practice_java;
import java.util.*;

public class main {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int a[][]=new int[n][n];
		int k=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=s.nextInt();
				if(a[i][j] < 11) {
					k += a[i][j];
				}
			}
		}
		System.out.println(k);
		
	}

}
