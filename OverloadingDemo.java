import java.util.*;

//Calculator class with multiple add() methods:
// add(int, int), add(double, double), add(int, int, int)



class Overloading{
	int add(int a, int b){
		return a+b;
	}
	
	double add(double a, double b){
		return a+b;
	}
	
	int add(int a, int b, int c){
		return a+b+c;
	}
}

class OverloadingDemo{
		public static void main(String []args){
			Overloading obj1 = new Overloading();
			Overloading obj2 = new Overloading();
			Overloading obj3 = new Overloading();
			
			int sum1 = obj1.add(10,20);
			double sum2 = obj2.add(10.20, 20.10);
			int sum3 = obj3.add(10,20,30);
			
			System.out.println("Sum of 2num in int: "+sum1);
			System.out.println("Sum of 2num in double: "+sum2);
			System.out.println("Sum of 3num in int: "+sum3);
		}
}

