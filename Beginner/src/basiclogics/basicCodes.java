package basiclogics;

import java.util.Scanner;

public class basicCodes {

	void area() {
		System.out.println("enter the radius of the circle to calculate the area-->");
		Scanner s = new Scanner(System.in);
		double r = s.nextDouble();
		double a = Math.PI * r * r;
		System.out.println("Area of the circle is-->" + a);
	}

	void arraySum() {
		int[] array = { 1, 2, 3 };
		int s = 0;
		for (int a : array) {
			s = s + a;
		}
		System.out.println("sum-->" + s);
	}

	void arrayWithInput() {
		Scanner s = new Scanner(System.in);
		int[] array = new int[10];
		int i = 0, sum = 0;

		System.out.println("enter the inputs 10-->");
		for (; i < 10; i++) {

			array[i] = s.nextInt();
		}
		for (int x : array) {
			sum = sum + x;
		}
		System.out.println("the sum is -->" + sum);
	}

	void prime(){
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number-->");
		int n= s.nextInt();
		int x=0;
		for (int i=2;i<n/2;i++){
			x = n%i;
		}
		if(x==0){
			System.out.println("this is not a prime number");
		}else{
			System.out.println("this is a prime number");
		}
	}
	
	void linearSearch(){
		Scanner input = new Scanner(System.in);
		int i=0;
		System.out.println("Enter the number of elements");
		int count = input.nextInt();
		int [] search = new int[count];
		System.out.println("Enter the "+count+" elements for the array");
		for(i=0;i<count;i++){
			search[i] = input.nextInt();
		}
		System.out.println("Enter the element to be searched");
		int searchElement=input.nextInt();
		for(i=0; i < count; i++){
			if(search[i]==searchElement){
				System.out.println("the element is found at the position-->"+(i+1));
				break;
			}
			if(i == count-1){
				System.out.println("the element is not found!");
			}
		}
 			
	}

	public static void main(String[] args) {
		basicCodes a = new basicCodes();
//		a.area();
//		a.arraySum();
//		a.arrayWithInput();
//		a.prime();
		a.linearSearch();
	}

}
