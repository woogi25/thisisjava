package ch06.sec6.exam02;

public class CarExample {

	public static void main(String[] args) {
		//Car ��ü ����
		Car myCar = new Car();
		
		//Car ��ü �ʵ��� �� �б�
		System.out.println("����ȸ��: " + myCar.company);
		System.out.println("�𵨸�: " + myCar.model);
		System.out.println("����: " + myCar.color);
		System.out.println("�ְ�ӵ�: " + myCar.maxSpeed);
		System.out.println("����ӵ�: " + myCar.speed);
		
		//Car ��ü�� �ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ �ӵ�: " + myCar.speed);
	}

}
