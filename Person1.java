//person student teacher 
import java.util.*;

class Person{
	String name;
	int age;
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	Person(String name){
		this.name=name;
		this.age=18;
	}
	
		void display(){
			System.out.println("Name:"+name+ " Age:"+age);
		}
		
}
class Student extends Person{
	int rollno;
	String sub1,sub2;
	
	Student(String name,int age,int rollno,String sub1,String sub2){
		super (name,age);
		this.rollno=rollno;
		this.sub1=sub1;
		this.sub2=sub2;
	}
	
	Student(int rollno,String sub1){
		super("unknown");
		this.rollno=rollno;
		this.sub1=sub1;
		this.sub2="DBMS";
	}
	
	Student(int rollno){
		super("mahi");
		this.rollno=rollno;
		this.sub1="JAVA";
		this.sub2="DBMS";
	}
	
	void display(){
		super.display();
		System.out.println(" rollno:"+ rollno+ " sub1:"+ sub1+" sub2:"+sub2);
	}
}	
class Person1{
	public static void main(String[] args){
		
		Scanner obj = new Scanner(System.in);
		Person p1 = new Person("Dhruv", 20);
		
		Student s1 = new Student("Dhwani", 12, 70, "IKS", "ENV");
		//so if we write super fuction that means its describe the parent values in child class 
		//also it has default value of names
		
		p1.display();
		s1.display();
	}
}