package ch06.sec8.exam01;

public class Calculator {
	//���� ���� ���� �޼ҵ� ����
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	//���� ���� ���� �޼ҵ� ����
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	//ȣ�� �� �� ���� ���� ���޹ް�,
	//ȣ���� ������ ����� int�� �����ϴ� �޼ҵ� ����
	int plus(int x, int y) {
		int result = x + y;
		return result;	//���� �� ����;
		
	}
	
	//ȣ�� �� �� ���� ���� ���޹ް�,
	//ȣ���� ������ ����� double�� �����ϴ� �޼ҵ� ����
	double divide(int x, int y) {
		double result = (double)x / (double) y;
		return result; //���ϰ� ����;
	}
}
