// check if a number is even or odd

import java.util.*;

class EvenOdd{
	void check(int num){
		if(num % 2 == 0){
			System.out.println("Number is Even");
		}
		else{
			System.out.println("Number is odd");
		}
	}
	
}

class DemoEvenOdd{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		EvenOdd ed = new EvenOdd();
		
		System.out.print("Enter a number: ");
		int a = obj.nextInt();
		
		ed.check(a);
	}
}

