import java.util.*;

class Student{
	private String name;
	private int roll_no;
	
	Student (String name, int roll_no){
		this.name = name;
		this.roll_no = roll_no;
	}
	
	void display(){
		System.out.println("Name: "+ name + " RollNo: " + roll_no);
	}
	
	String getName(){
		return name;
	}
	
	int getRollNo(){
		return roll_no;
	}
	
	
}

class Demo{
	public static void main(String[] args){
		Student obj = new Student("Dhwani",70);
		
		//obj.name="Dhruv";
		//obj.roll_no=68;
		
		//obj.display();
		
		System.out.println("Name: " + obj.getName()+ " RollNo: " + obj.getRollNo());
		
	}
}