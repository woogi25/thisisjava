package ch06.sec7.exam04;

public class Car {
	//�ʵ� ����
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������ ����
	Car() {}	//1.������
	
	Car(String model) {
		this.model = model;
	}			//2.������
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}			//3.������
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}			//4.������
}
