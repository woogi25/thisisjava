package ch06.sec8.exam04;

public class CalculatorExample {

	public static void main(String[] args) {
		//��ü ����
		Calculator myCalc = new Calculator();
		
		//���簢���� ���� ���ϱ�
		double result1 = myCalc.areaRectangle(10);

		//���簢���� ���� ���ϱ�
		double result2 = myCalc.areaRectangle(10, 20);
		
		System.out.println("���簢�� ����=" + result1);
		System.out.println("���簢�� ����=" + result2);
	}

}
