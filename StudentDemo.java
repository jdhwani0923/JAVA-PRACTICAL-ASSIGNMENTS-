import java.util.*;

//7. Student Class with Marks and Average
//o Accept marks of 3 subjects using constructor, calculate average using method.

class Student{
	int roll_no;
	String name;
	int sub1, sub2 ,sub3;
	
	double average;
	
	Student(int roll_no, String name, int sub1, int sub2, int sub3){
		this.roll_no = roll_no;
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
	void toCalculateAverage(){
		average = (sub1+sub2+sub3)/3;
		//return average;
	}
	
	void display(){
		System.out.println("Student:: "+ roll_no + " " + name + " " + average);
	}
	
}

class StudentDemo{
	public static void main(String []args){
		Student d = new Student(68, "Dutt Dhruv", 77, 85, 70);
		//d.toCalculateAverage();
		d.display();
	}
}