import java.util.* ;

class Book{
	private	String name;
	private	String author;
	
	Book(String name,String author) {
		
		this.name=name;
		this.author=author;
	}
	void display() {
		
		System.out.println("Author:" + author + "Name:" + name);

	}
}

	class Dhruv {
	public static void main(String[] args){
	
		Book obj = new Book("harry potter","Dhwani Jani");
		
		obj.display();
	}
}