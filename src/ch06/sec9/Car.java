package ch06.sec9;

public class Car {
	//�ʵ� ����
	String model;
	int speed;
	
	//������ ����
	Car(String model) {
		this.model = model;	//�Ű������� �ʵ忡 ����(this ���� �Ұ�)
	}
	
	//�޼ҵ� ����
	void setSpeed(int speed) {
		this.speed = speed;	//�Ű������� �ʵ忡 ����(this ���� �Ұ�)
	}
	
	void run() {
		this.setSpeed(100);
		System.out.println(this.model + "�� �޸��ϴ�.(�ü�:" + this.speed + "km/h)");
	}
}
