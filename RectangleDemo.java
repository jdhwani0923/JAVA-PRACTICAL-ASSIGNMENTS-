//Class with Method to Calculate Area
//o Create a Rectangle class with length and width, and a method
//calculateArea().
import java.util.*;

class Rectangle{
	int length, width;
	
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	int calculateArea(){
		return length*width;
	}
}

class RectangleDemo{
	public static void main(String []args){
		Rectangle obj1 = new Rectangle(5,8);
		
		int area = obj1.calculateArea();
		
		System.out.println("Area is: "+ area);
		
	}
}