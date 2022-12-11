package ch06.sec7.exam04;

public class Car {
	//琶球 識情
	String company = "薄企切疑託";
	String model;
	String color;
	int maxSpeed;
	
	//持失切 識情
	Car() {}	//1.持失切
	
	Car(String model) {
		this.model = model;
	}			//2.持失切
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}			//3.持失切
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}			//4.持失切
}
