package miscelenious;

public class MainClass {
	private String model;
	private String make;
	private String year;
	private String price;
	//================================
	public MainClass() {
		
	}
	public MainClass(String model,String make,String year,String price) {
	this.model = model;
	this.make = make;
	this.year = year;
	this.price = price;
	}
	public MainClass(String[] arr) {
		this.make = arr[0];
		this.model = arr[1];
		this.year = arr[2];
		this.price = arr[3];
	}
	//======================================
	
	public static void printing() {
		System.out.println("=====================");
	}
	public String toString() {
		return model+"  "+make+" "+year+"  "+price+" ";
	}

}
