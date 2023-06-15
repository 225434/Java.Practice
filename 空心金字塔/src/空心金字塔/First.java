package ¿ÕÐÄ½ð×ÖËþ;

import java.util.*;

public class First {
	public static void main(String[] args) {
		System.out.println("please input the height:");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.printf(" ");
			}
			if(i<n) {
				for(int k=1;k<=2*i-1;k++) {
					if(k==1||k==2*i-1)
						System.out.printf("*");
					else
						System.out.printf(" ");
				}
			}
			else {
				for(int k=1;k<=2*i-1;k++) {
					System.out.printf("*");
				}	
			}
			System.out.println();
		}
	}
}
