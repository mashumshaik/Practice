package basiclogics;

import java.util.Scanner;

public class ReverseNumber {
	int n = 1234;
	int r = 0;
	
	void byWhileloop() {
		while(n!=0){
		r = r * 10;
		r = r + (n % 10);
		n = n / 10;
		}
		System.out.println("the reverse number WHILE ===" + r);
	}
	
   void byForloop() {
		for (;n!=0;){
			r = r * 10;
			r = r + (n % 10);
			n = n / 10;
		}
		System.out.println("the reverse number FOR is===" + r);
    }
    
	void withInput() {
		
		System.out.println("enter the value for the calculation--->");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		while (n != 0) {
			r = r * 10;
			r = r + (n % 10);
			n = n / 10;
		}
		System.out.println("output with user input-->"+r);

	}
   
     public static void main(String[] args) {
    	ReverseNumber rn = new ReverseNumber();
//    	rn.byForloop();
//    	rn.byWhileloop();
    	rn.withInput();
	}
}