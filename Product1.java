import java.util.*;

class Product{
	String product_name;
	String cust_name;
	int pro_sales;
	int pro_val;
	int pro_quantity;
	
	Product(String product_name,String cust_name,int pro_sales,int pro_val,int pro_quantity){
		this.product_name=product_name;
		this.cust_name=cust_name;
		this.pro_sales=pro_sales;
		this.pro_val=pro_val;
		this.pro_quantity=pro_quantity;
	}
	
	void display(){
		System.out.println("product_name:"+product_name);
		System.out.println("cust_name:"+cust_name);
		System.out.println("pro_sales:"+pro_sales);
		System.out.println("pro_val:"+pro_val);
		System.out.println("pro_quantity:"+pro_quantity);
	}
}

class Product1{
	
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		Product p1 = new Product("iphone","dhwani",12,233,3333);
		
		
		p1.display();
	}
}
		