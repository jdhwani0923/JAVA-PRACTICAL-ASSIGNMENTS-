import java.util.*;

//name , name id, name id salary

class Employee{
	int id;
	String name;
	double salary;
	
	Employee(String name){
		this.name = name;
		this.id = 100;
		this.salary = 10000.00;
	}
	
	Employee(String name, int id){
		this.name = name;
		this.id = id;
		this.salary = 10000.00;
	}
	
	Employee(String name, int id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	void display(){
		System.out.println("Name:" + name + " Id: " + id + " Salary " + salary);
	}
	
}

class EmployeeDemo{
	public static void main(String [] args){
		Employee e1 = new Employee("Kevin");
		Employee e2 = new Employee("Mayank", 101);
		Employee e3 = new Employee("Dhwani", 68, 10000000);
		
		e1.display();
		e2.display();
		e3.display();
		
	}
}